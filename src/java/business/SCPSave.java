/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author hambo
 */
public class SCPSave {
        private int saveID, userID, gameState, dayCount;

    public SCPSave() {
    }

    public SCPSave(int saveID, int userID, int gameState, int dayCount) {
        this.saveID = saveID;
        this.userID = userID;
        this.gameState = gameState;
        this.dayCount = dayCount;
    }

    public int getSaveID() {
        return saveID;
    }

    public void setSaveID(int saveID) {
        this.saveID = saveID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getGameState() {
        return gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }
        
        
}
