/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import business.SCPAbnormalitySaveData;
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
public class SCPAbnormalitySaveDataDA {

    private static final Logger LOG = Logger.getLogger(SCPAbnormalitySaveData.class.getName());

    public static void insert(SCPAbnormalitySaveData saveState) throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO `scpabssavestate` ( `abnormalityID`, `egoLevel`, `peBoxes`, `tip1`, `tip2`, `tip3`, `tip4`, `tip5`, `repression`, `insight`, `instinct`, `attachment`)"
                + " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            //set all ? placeholders
            ps.setInt(1, saveState.getEmployeeID());
            ps.setInt(2, saveState.getSaveID());
            ps.setString(3, saveState.getFirstName());
            ps.setString(4, saveState.getLastName());
            ps.setInt(5, saveState.getFortitudeLevel());
            ps.setInt(6, saveState.getPrudenceLevel());
            ps.setInt(7, saveState.getTemperanceLevel());
            ps.setInt(8, saveState.getJusticeLevel());
            ps.setInt(9, saveState.getFearLevel());
            ps.setString(10, saveState.getImgUrl());
            ps.setString(10, saveState.getImgUrl());
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

    public static LinkedHashMap<Integer, SCPAbnormalitySaveData> selectAll() throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM saveState";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            SCPAbnormalitySaveData saveState = null;

            LinkedHashMap<Integer, SCPAbnormalitySaveData> saveStates = new LinkedHashMap();

            while (rs.next()) {
                int saveStateID = rs.getInt("saveStateID");
                int SaveID = rs.getInt("SaveID");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                int fortitudeLevel = rs.getInt("fortitudeLevel");
                int prudenceLevel = rs.getInt("prudenceLevel");
                int temperanceLevel = rs.getInt("temperanceLevel");
                int justiceLevel = rs.getInt("justiceLevel");
                int fearLevel = rs.getInt("fearLevel");
                String imgUrl = rs.getString("imgUrl");

                saveState = new SCPAbnormalitySaveData(saveStateID, SaveID, fortitudeLevel, prudenceLevel, temperanceLevel, justiceLevel, fearLevel, firstName, lastName, imgUrl);
                saveStates.put(saveStateID, saveState);
            }
            return saveStates;
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
                = "UPDATE `scpsaveStates`"
                + " SET `fortitudeLevel` = ?, `prudenceLevel` = ?, `temperanceLevel` = ?, `justiceLevel` = ?, `fearLevel` = ?"
                + " WHERE `scpsaveStates`.`saveStateID` = ?";
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
