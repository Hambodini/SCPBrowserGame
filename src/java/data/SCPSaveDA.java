/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import business.SCPSave;
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
public class SCPSaveDA {

    private static final Logger LOG = Logger.getLogger(SCPSaveDA.class.getName());

    public static void insert(SCPSave save) throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "INSERT INTO `scpsaves` ( `saveID`, `gameState`, `dayCount`)"
                + " VALUES ( ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query);
            //set all ? placeholders
            ps.setInt(1, save.getSaveID());
            ps.setInt(2, save.getGameState());
            ps.setInt(3, save.getDayCount());
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

    public static LinkedHashMap<Integer, SCPSave> selectAll() throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM save";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            SCPSave save = null;

            LinkedHashMap<Integer, SCPSave> saves = new LinkedHashMap();

            while (rs.next()) {
                int saveID = rs.getInt("saveID");
                int userID = rs.getInt("userID");
                int gameState = rs.getInt("gameState");
                int dayCount = rs.getInt("dayCount");

                save = new SCPSave(saveID, userID, gameState, dayCount);
                saves.put(saveID, save);
            }
            return saves;
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

    public static void update( int saveID, int gameState, int dayCount) throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "UPDATE `scpsaves`"
                + " SET `gameState` = ?, `dayCount` = ?"
                + " WHERE `scpsaves`.`saveID` = ?";
        try {
            ps = connection.prepareStatement(query);
            //set all ? placeholders
            ps.setInt(1, gameState);
            ps.setInt(2, dayCount);
            ps.setInt(3, saveID);
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

    public static Boolean SaveExists(int userID) throws SQLException {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;

        String query
                = "SELECT saveID FROM scpsaves"
                + " WHERE userID = ?";
        try {
            ps = connection.prepareStatement(query);
            //set all ? placeholders
            ps.setInt(1, userID);
            ResultSet rs = ps.executeQuery();

            return rs.next();
        } catch (SQLException e) {
            //Log the exception and then throw it up to the servlet
            LOG.log(Level.SEVERE, "*** select savename has failed", e);
            throw e;
        } finally {
            //Finally always happens, regardless of try/catch
            try {
                ps.close();
                pool.freeConnection(connection);
            } catch (Exception e) {
                LOG.log(Level.SEVERE, "*** savename null pointer??", e);
                throw e;
            }
        }
    }
    
}
