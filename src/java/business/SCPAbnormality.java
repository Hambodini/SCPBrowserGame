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
public class SCPAbnormality implements Serializable{
        private int abnormalityId, attackDamage, goodEBoxesAmount, normEBoxesAmount, badEBoxesAmount, qliphothCounter;
        private int goodRangeLow, goodRangeHigh, normRangeLow, normRangeHigh, badRangeLow, badRangeHigh, riskLevel;
        private int Instinct1Rate, Instinct2Rate, Instinct3Rate, Instinct4Rate, Instinct5Rate, Instinct6Rate;
        private int Insight1Rate, Insight2Rate, Insight3Rate, Insight4Rate, Insight5Rate, Insight6Rate;
        private int Attachment1Rate, Attachment2Rate, Attachment3Rate, Attachment4Rate, Attachment5Rate, Attachment6Rate;
        private int Repression1Rate, Repression2Rate, Repression3Rate, Repression4Rate, Repression5Rate, Repression6Rate;
        private int tipsCost, generalInfoCost, treatmentCost;
        private String imgUrl, name, subjectNumber, position;
        private String story1, story2, story3, story4;
        private String tip1, tip2, tip3, tip4, tip5;

    public SCPAbnormality() {
    }

    public SCPAbnormality(int abnormalityId, int attackDamage, int goodEBoxesAmount, int normEBoxesAmount, int badEBoxesAmount, int qliphothCounter, int goodRangeLow, int goodRangeHigh, int normRangeLow, int normRangeHigh, int badRangeLow, int badRangeHigh, int riskLevel, int Instinct1Rate, int Instinct2Rate, int Instinct3Rate, int Instinct4Rate, int Instinct5Rate, int Instinct6Rate, int Insight1Rate, int Insight2Rate, int Insight3Rate, int Insight4Rate, int Insight5Rate, int Insight6Rate, int Attachment1Rate, int Attachment2Rate, int Attachment3Rate, int Attachment4Rate, int Attachment5Rate, int Attachment6Rate, int Repression1Rate, int Repression2Rate, int Repression3Rate, int Repression4Rate, int Repression5Rate, int Repression6Rate, int tipsCost, int generalInfoCost, int treatmentCost, String imgUrl, String name, String subjectNumber, String position, String story1, String story2, String story3, String story4, String tip1, String tip2, String tip3, String tip4, String tip5) {
        this.abnormalityId = abnormalityId;
        this.attackDamage = attackDamage;
        this.goodEBoxesAmount = goodEBoxesAmount;
        this.normEBoxesAmount = normEBoxesAmount;
        this.badEBoxesAmount = badEBoxesAmount;
        this.qliphothCounter = qliphothCounter;
        this.goodRangeLow = goodRangeLow;
        this.goodRangeHigh = goodRangeHigh;
        this.normRangeLow = normRangeLow;
        this.normRangeHigh = normRangeHigh;
        this.badRangeLow = badRangeLow;
        this.badRangeHigh = badRangeHigh;
        this.riskLevel = riskLevel;
        this.Instinct1Rate = Instinct1Rate;
        this.Instinct2Rate = Instinct2Rate;
        this.Instinct3Rate = Instinct3Rate;
        this.Instinct4Rate = Instinct4Rate;
        this.Instinct5Rate = Instinct5Rate;
        this.Instinct6Rate = Instinct6Rate;
        this.Insight1Rate = Insight1Rate;
        this.Insight2Rate = Insight2Rate;
        this.Insight3Rate = Insight3Rate;
        this.Insight4Rate = Insight4Rate;
        this.Insight5Rate = Insight5Rate;
        this.Insight6Rate = Insight6Rate;
        this.Attachment1Rate = Attachment1Rate;
        this.Attachment2Rate = Attachment2Rate;
        this.Attachment3Rate = Attachment3Rate;
        this.Attachment4Rate = Attachment4Rate;
        this.Attachment5Rate = Attachment5Rate;
        this.Attachment6Rate = Attachment6Rate;
        this.Repression1Rate = Repression1Rate;
        this.Repression2Rate = Repression2Rate;
        this.Repression3Rate = Repression3Rate;
        this.Repression4Rate = Repression4Rate;
        this.Repression5Rate = Repression5Rate;
        this.Repression6Rate = Repression6Rate;
        this.tipsCost = tipsCost;
        this.generalInfoCost = generalInfoCost;
        this.treatmentCost = treatmentCost;
        this.imgUrl = imgUrl;
        this.name = name;
        this.subjectNumber = subjectNumber;
        this.position = position;
        this.story1 = story1;
        this.story2 = story2;
        this.story3 = story3;
        this.story4 = story4;
        this.tip1 = tip1;
        this.tip2 = tip2;
        this.tip3 = tip3;
        this.tip4 = tip4;
        this.tip5 = tip5;
    }

    public int getAbnormalityId() {
        return abnormalityId;
    }

    public void setAbnormalityId(int abnormalityId) {
        this.abnormalityId = abnormalityId;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getGoodEBoxesAmount() {
        return goodEBoxesAmount;
    }

    public void setGoodEBoxesAmount(int goodEBoxesAmount) {
        this.goodEBoxesAmount = goodEBoxesAmount;
    }

    public int getNormEBoxesAmount() {
        return normEBoxesAmount;
    }

    public void setNormEBoxesAmount(int normEBoxesAmount) {
        this.normEBoxesAmount = normEBoxesAmount;
    }

    public int getBadEBoxesAmount() {
        return badEBoxesAmount;
    }

    public void setBadEBoxesAmount(int badEBoxesAmount) {
        this.badEBoxesAmount = badEBoxesAmount;
    }

    public int getQliphothCounter() {
        return qliphothCounter;
    }

    public void setQliphothCounter(int qliphothCounter) {
        this.qliphothCounter = qliphothCounter;
    }

    public int getGoodRangeLow() {
        return goodRangeLow;
    }

    public void setGoodRangeLow(int goodRangeLow) {
        this.goodRangeLow = goodRangeLow;
    }

    public int getGoodRangeHigh() {
        return goodRangeHigh;
    }

    public void setGoodRangeHigh(int goodRangeHigh) {
        this.goodRangeHigh = goodRangeHigh;
    }

    public int getNormRangeLow() {
        return normRangeLow;
    }

    public void setNormRangeLow(int normRangeLow) {
        this.normRangeLow = normRangeLow;
    }

    public int getNormRangeHigh() {
        return normRangeHigh;
    }

    public void setNormRangeHigh(int normRangeHigh) {
        this.normRangeHigh = normRangeHigh;
    }

    public int getBadRangeLow() {
        return badRangeLow;
    }

    public void setBadRangeLow(int badRangeLow) {
        this.badRangeLow = badRangeLow;
    }

    public int getBadRangeHigh() {
        return badRangeHigh;
    }

    public void setBadRangeHigh(int badRangeHigh) {
        this.badRangeHigh = badRangeHigh;
    }

    public int getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(int riskLevel) {
        this.riskLevel = riskLevel;
    }

    public int getInstinct1Rate() {
        return Instinct1Rate;
    }

    public void setInstinct1Rate(int Instinct1Rate) {
        this.Instinct1Rate = Instinct1Rate;
    }

    public int getInstinct2Rate() {
        return Instinct2Rate;
    }

    public void setInstinct2Rate(int Instinct2Rate) {
        this.Instinct2Rate = Instinct2Rate;
    }

    public int getInstinct3Rate() {
        return Instinct3Rate;
    }

    public void setInstinct3Rate(int Instinct3Rate) {
        this.Instinct3Rate = Instinct3Rate;
    }

    public int getInstinct4Rate() {
        return Instinct4Rate;
    }

    public void setInstinct4Rate(int Instinct4Rate) {
        this.Instinct4Rate = Instinct4Rate;
    }

    public int getInstinct5Rate() {
        return Instinct5Rate;
    }

    public void setInstinct5Rate(int Instinct5Rate) {
        this.Instinct5Rate = Instinct5Rate;
    }

    public int getInstinct6Rate() {
        return Instinct6Rate;
    }

    public void setInstinct6Rate(int Instinct6Rate) {
        this.Instinct6Rate = Instinct6Rate;
    }

    public int getInsight1Rate() {
        return Insight1Rate;
    }

    public void setInsight1Rate(int Insight1Rate) {
        this.Insight1Rate = Insight1Rate;
    }

    public int getInsight2Rate() {
        return Insight2Rate;
    }

    public void setInsight2Rate(int Insight2Rate) {
        this.Insight2Rate = Insight2Rate;
    }

    public int getInsight3Rate() {
        return Insight3Rate;
    }

    public void setInsight3Rate(int Insight3Rate) {
        this.Insight3Rate = Insight3Rate;
    }

    public int getInsight4Rate() {
        return Insight4Rate;
    }

    public void setInsight4Rate(int Insight4Rate) {
        this.Insight4Rate = Insight4Rate;
    }

    public int getInsight5Rate() {
        return Insight5Rate;
    }

    public void setInsight5Rate(int Insight5Rate) {
        this.Insight5Rate = Insight5Rate;
    }

    public int getInsight6Rate() {
        return Insight6Rate;
    }

    public void setInsight6Rate(int Insight6Rate) {
        this.Insight6Rate = Insight6Rate;
    }

    public int getAttachment1Rate() {
        return Attachment1Rate;
    }

    public void setAttachment1Rate(int Attachment1Rate) {
        this.Attachment1Rate = Attachment1Rate;
    }

    public int getAttachment2Rate() {
        return Attachment2Rate;
    }

    public void setAttachment2Rate(int Attachment2Rate) {
        this.Attachment2Rate = Attachment2Rate;
    }

    public int getAttachment3Rate() {
        return Attachment3Rate;
    }

    public void setAttachment3Rate(int Attachment3Rate) {
        this.Attachment3Rate = Attachment3Rate;
    }

    public int getAttachment4Rate() {
        return Attachment4Rate;
    }

    public void setAttachment4Rate(int Attachment4Rate) {
        this.Attachment4Rate = Attachment4Rate;
    }

    public int getAttachment5Rate() {
        return Attachment5Rate;
    }

    public void setAttachment5Rate(int Attachment5Rate) {
        this.Attachment5Rate = Attachment5Rate;
    }

    public int getAttachment6Rate() {
        return Attachment6Rate;
    }

    public void setAttachment6Rate(int Attachment6Rate) {
        this.Attachment6Rate = Attachment6Rate;
    }

    public int getRepression1Rate() {
        return Repression1Rate;
    }

    public void setRepression1Rate(int Repression1Rate) {
        this.Repression1Rate = Repression1Rate;
    }

    public int getRepression2Rate() {
        return Repression2Rate;
    }

    public void setRepression2Rate(int Repression2Rate) {
        this.Repression2Rate = Repression2Rate;
    }

    public int getRepression3Rate() {
        return Repression3Rate;
    }

    public void setRepression3Rate(int Repression3Rate) {
        this.Repression3Rate = Repression3Rate;
    }

    public int getRepression4Rate() {
        return Repression4Rate;
    }

    public void setRepression4Rate(int Repression4Rate) {
        this.Repression4Rate = Repression4Rate;
    }

    public int getRepression5Rate() {
        return Repression5Rate;
    }

    public void setRepression5Rate(int Repression5Rate) {
        this.Repression5Rate = Repression5Rate;
    }

    public int getRepression6Rate() {
        return Repression6Rate;
    }

    public void setRepression6Rate(int Repression6Rate) {
        this.Repression6Rate = Repression6Rate;
    }

    public int getTipsCost() {
        return tipsCost;
    }

    public void setTipsCost(int tipsCost) {
        this.tipsCost = tipsCost;
    }

    public int getGeneralInfoCost() {
        return generalInfoCost;
    }

    public void setGeneralInfoCost(int generalInfoCost) {
        this.generalInfoCost = generalInfoCost;
    }

    public int getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(int treatmentCost) {
        this.treatmentCost = treatmentCost;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStory1() {
        return story1;
    }

    public void setStory1(String story1) {
        this.story1 = story1;
    }

    public String getStory2() {
        return story2;
    }

    public void setStory2(String story2) {
        this.story2 = story2;
    }

    public String getStory3() {
        return story3;
    }

    public void setStory3(String story3) {
        this.story3 = story3;
    }

    public String getStory4() {
        return story4;
    }

    public void setStory4(String story4) {
        this.story4 = story4;
    }

    public String getTip1() {
        return tip1;
    }

    public void setTip1(String tip1) {
        this.tip1 = tip1;
    }

    public String getTip2() {
        return tip2;
    }

    public void setTip2(String tip2) {
        this.tip2 = tip2;
    }

    public String getTip3() {
        return tip3;
    }

    public void setTip3(String tip3) {
        this.tip3 = tip3;
    }

    public String getTip4() {
        return tip4;
    }

    public void setTip4(String tip4) {
        this.tip4 = tip4;
    }

    public String getTip5() {
        return tip5;
    }

    public void setTip5(String tip5) {
        this.tip5 = tip5;
    }

}
