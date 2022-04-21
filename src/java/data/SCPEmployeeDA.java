/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import business.SCPEmployee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joebe
 */
public class SCPEmployeeDA {

    private static final Logger LOG = Logger.getLogger(SCPEmployeeDA.class.getName());

    public static void insert(SCPEmployee employee) throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO `scpemployees` ( `employeeID`, `saveID`, `firstName`, `lastName`, `fortitudeLevel`, `prudenceLevel`, `temperanceLevel`, `justiceLevel`, `fearLevel`, `imgUrl`)"
                + " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            //set all ? placeholders
            ps.setInt(1, employee.getEmployeeID());
            ps.setInt(2, employee.getSaveID());
            ps.setString(3, employee.getFirstName());
            ps.setString(4, employee.getLastName());
            ps.setInt(5, employee.getFortitudeLevel());
            ps.setInt(6, employee.getPrudenceLevel());
            ps.setInt(7, employee.getTemperanceLevel());
            ps.setInt(8, employee.getJusticeLevel());
            ps.setInt(9, employee.getFearLevel());
            ps.setString(10, employee.getImgUrl());
            ps.executeUpdate();
        } catch (SQLException e) {
            //Log the exception and then throw it up to the servlet
            LOG.log(Level.SEVERE, "*** Insert has failed", e);
            throw e;
        } finally {
            //Finally always happens, regardless of try/catch
            try {
                ps.close();
                pool.freeConnection(connection);
            } catch (Exception e) {
                LOG.log(Level.SEVERE, "*** insert null pointer??", e);
                throw e;
            }
        }
    }

    public static LinkedHashMap<Integer, SCPEmployee> selectAll() throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM employee";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            SCPEmployee employee = null;

            LinkedHashMap<Integer, SCPEmployee> employees = new LinkedHashMap();

            while (rs.next()) {
                int employeeID = rs.getInt("employeeID");
                int SaveID = rs.getInt("SaveID");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                int fortitudeLevel = rs.getInt("fortitudeLevel");
                int prudenceLevel = rs.getInt("prudenceLevel");
                int temperanceLevel = rs.getInt("temperanceLevel");
                int justiceLevel = rs.getInt("justiceLevel");
                int fearLevel = rs.getInt("fearLevel");
                String imgUrl = rs.getString("imgUrl");

                employee = new SCPEmployee(employeeID, SaveID, fortitudeLevel, prudenceLevel, temperanceLevel, justiceLevel, fearLevel, firstName, lastName, imgUrl);
                employees.put(employeeID, employee);
            }
            return employees;
        } catch (SQLException e) {
            LOG.log(Level.SEVERE, "*** select all sql", e);
            throw e;
        } finally {
            try {
                rs.close();
                ps.close();
                pool.freeConnection(connection);
            } catch (Exception e) {
                LOG.log(Level.SEVERE, "*** select all null pointer??", e);
                throw e;
            }

        }
    }

    public static void update( int fortitudeLevel, int prudenceLevel, int temperanceLevel, int justiceLevel, int fearLevel ) throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "UPDATE `scpemployees`"
                + " SET `fortitudeLevel` = ?, `prudenceLevel` = ?, `temperanceLevel` = ?, `justiceLevel` = ?, `fearLevel` = ?"
                + " WHERE `scpemployees`.`employeeID` = ?";
        try {
            ps = connection.prepareStatement(query);
            //set all ? placeholders
            ps.setInt(1, fortitudeLevel);
            ps.setInt(2, prudenceLevel);
            ps.setInt(3, temperanceLevel);
            ps.setInt(4, justiceLevel);
            ps.setInt(5, fearLevel);
            ps.executeUpdate();
        } catch (SQLException e) {
            //Log the exception and then throw it up to the servlet
            LOG.log(Level.SEVERE, "*** update has failed", e);
            throw e;
        } finally {
            //Finally always happens, regardless of try/catch
            try {
                ps.close();
                pool.freeConnection(connection);
            } catch (Exception e) {
                LOG.log(Level.SEVERE, "*** update null pointer??", e);
                throw e;
            }
        }
    }
    
}
