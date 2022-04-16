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
public class SCPAbnormalitySaveData implements Serializable{
        private int saveID, abnormalityID, egoLevel, peBoxes;
        private boolean tip1, tip2, tip3, tip4, tip5, repression, insight, instinct, attachment, generalInfo;

    public SCPAbnormalitySaveData() {
    }

    public SCPAbnormalitySaveData(int saveID, int abnormalityID, int egoLevel, int peBoxes, boolean tip1, boolean tip2, boolean tip3, boolean tip4, boolean tip5, boolean repression, boolean insight, boolean instinct, boolean attachment, boolean generalInfo) {
        this.saveID = saveID;
        this.abnormalityID = abnormalityID;
        this.egoLevel = egoLevel;
        this.peBoxes = peBoxes;
        this.tip1 = tip1;
        this.tip2 = tip2;
        this.tip3 = tip3;
        this.tip4 = tip4;
        this.tip5 = tip5;
        this.repression = repression;
        this.insight = insight;
        this.instinct = instinct;
        this.attachment = attachment;
        this.generalInfo = generalInfo;
    }

    public SCPAbnormalitySaveData(int abnormalityID, int egoLevel, int peBoxes, boolean tip1, boolean tip2, boolean tip3, boolean tip4, boolean tip5, boolean repression, boolean insight, boolean instinct, boolean attachment, boolean generalInfo) {
        this.abnormalityID = abnormalityID;
        this.egoLevel = egoLevel;
        this.peBoxes = peBoxes;
        this.tip1 = tip1;
        this.tip2 = tip2;
        this.tip3 = tip3;
        this.tip4 = tip4;
        this.tip5 = tip5;
        this.repression = repression;
        this.insight = insight;
        this.instinct = instinct;
        this.attachment = attachment;
        this.generalInfo = generalInfo;
    }

    public int getSaveID() {
        return saveID;
    }

    public void setSaveID(int saveID) {
        this.saveID = saveID;
    }

    public int getAbnormalityID() {
        return abnormalityID;
    }

    public void setAbnormalityID(int abnormalityID) {
        this.abnormalityID = abnormalityID;
    }

    public int getEgoLevel() {
        return egoLevel;
    }

    public void setEgoLevel(int egoLevel) {
        this.egoLevel = egoLevel;
    }

    public int getPeBoxes() {
        return peBoxes;
    }

    public void setPeBoxes(int peBoxes) {
        this.peBoxes = peBoxes;
    }

    public boolean isTip1() {
        return tip1;
    }

    public void setTip1(boolean tip1) {
        this.tip1 = tip1;
    }

    public boolean isTip2() {
        return tip2;
    }

    public void setTip2(boolean tip2) {
        this.tip2 = tip2;
    }

    public boolean isTip3() {
        return tip3;
    }

    public void setTip3(boolean tip3) {
        this.tip3 = tip3;
    }

    public boolean isTip4() {
        return tip4;
    }

    public void setTip4(boolean tip4) {
        this.tip4 = tip4;
    }

    public boolean isTip5() {
        return tip5;
    }

    public void setTip5(boolean tip5) {
        this.tip5 = tip5;
    }

    public boolean isRepression() {
        return repression;
    }

    public void setRepression(boolean repression) {
        this.repression = repression;
    }

    public boolean isInsight() {
        return insight;
    }

    public void setInsight(boolean insight) {
        this.insight = insight;
    }

    public boolean isInstinct() {
        return instinct;
    }

    public void setInstinct(boolean instinct) {
        this.instinct = instinct;
    }

    public boolean isAttachment() {
        return attachment;
    }

    public void setAttachment(boolean attachment) {
        this.attachment = attachment;
    }

    public boolean isGeneralInfo() {
        return generalInfo;
    }

    public void setGeneralInfo(boolean generalInfo) {
        this.generalInfo = generalInfo;
    }
    
    
        
}
