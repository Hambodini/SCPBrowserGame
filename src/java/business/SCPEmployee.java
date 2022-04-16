/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.io.Serializable;


/**
 *
 * @author hambo
 */
public class SCPEmployee implements Serializable{
    private int employeeID, saveID, fortitudeLevel, prudenceLevel, temperanceLevel, justiceLevel, fearLevel;
    private String firstName, lastName, imgUrl;

    public SCPEmployee() {
    }

    public SCPEmployee(int employeeID, int saveID, int fortitudeLevel, int prudenceLevel, int temperanceLevel, int justiceLevel, int fearLevel, String firstName, String lastName, String imgUrl) {
        this.employeeID = employeeID;
        this.saveID = saveID;
        this.fortitudeLevel = fortitudeLevel;
        this.prudenceLevel = prudenceLevel;
        this.temperanceLevel = temperanceLevel;
        this.justiceLevel = justiceLevel;
        this.fearLevel = fearLevel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.imgUrl = imgUrl;
    }

    public SCPEmployee(int saveID, int fortitudeLevel, int prudenceLevel, int temperanceLevel, int justiceLevel, int fearLevel, String firstName, String lastName, String imgUrl) {
        this.saveID = saveID;
        this.fortitudeLevel = fortitudeLevel;
        this.prudenceLevel = prudenceLevel;
        this.temperanceLevel = temperanceLevel;
        this.justiceLevel = justiceLevel;
        this.fearLevel = fearLevel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.imgUrl = imgUrl;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSaveID() {
        return saveID;
    }

    public void setSaveID(int saveID) {
        this.saveID = saveID;
    }

    public int getFortitudeLevel() {
        return fortitudeLevel;
    }

    public void setFortitudeLevel(int fortitudeLevel) {
        this.fortitudeLevel = fortitudeLevel;
    }

    public int getPrudenceLevel() {
        return prudenceLevel;
    }

    public void setPrudenceLevel(int prudenceLevel) {
        this.prudenceLevel = prudenceLevel;
    }

    public int getTemperanceLevel() {
        return temperanceLevel;
    }

    public void setTemperanceLevel(int temperanceLevel) {
        this.temperanceLevel = temperanceLevel;
    }

    public int getJusticeLevel() {
        return justiceLevel;
    }

    public void setJusticeLevel(int justiceLevel) {
        this.justiceLevel = justiceLevel;
    }

    public int getFearLevel() {
        return fearLevel;
    }

    public void setFearLevel(int fearLevel) {
        this.fearLevel = fearLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    
    
}
