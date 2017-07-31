package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class DevStation implements Serializable {

    private String NAME;
    private String AREA_ID;
    private String RUN_STATUS;
    private String RUNSTATUSTIME;
    private String CH0_COMMU_REASON;
    private String CH1_COMMU_REASON;
    private String MANUFACTURER;
    private String DEV_NUMTOTAL;
    private String DEV_NUMDISC;

    public String getNAME() {
        return NAME;
    }
    public void setNAME(String nAME) {
        NAME = nAME;
    }
    public String getAREA_ID() {
        return AREA_ID;
    }
    public void setAREA_ID(String aREAID) {
        AREA_ID = aREAID;
    }
    public String getRUN_STATUS() {
        return RUN_STATUS;
    }
    public void setRUN_STATUS(String rUNSTATUS) {
        RUN_STATUS = rUNSTATUS;
    }
    public String getRUNSTATUSTIME() {
        return RUNSTATUSTIME;
    }
    public void setRUNSTATUSTIME(String rUNSTATUSTIME) {
        RUNSTATUSTIME = rUNSTATUSTIME;
    }
    public String getCH0_COMMU_REASON() {
        return CH0_COMMU_REASON;
    }
    public void setCH0_COMMU_REASON(String cH0COMMUREASON) {
        CH0_COMMU_REASON = cH0COMMUREASON;
    }
    public String getCH1_COMMU_REASON() {
        return CH1_COMMU_REASON;
    }
    public void setCH1_COMMU_REASON(String cH1COMMUREASON) {
        CH1_COMMU_REASON = cH1COMMUREASON;
    }
    public String getMANUFACTURER() {
        return MANUFACTURER;
    }
    public void setMANUFACTURER(String mANUFACTURER) {
        MANUFACTURER = mANUFACTURER;
    }
    public String getDEV_NUMTOTAL() {
        return DEV_NUMTOTAL;
    }
    public void setDEV_NUMTOTAL(String dEVNUMTOTAL) {
        DEV_NUMTOTAL = dEVNUMTOTAL;
    }
    public String getDEV_NUMDISC() {
        return DEV_NUMDISC;
    }
    public void setDEV_NUMDISC(String dEVNUMDISC) {
        DEV_NUMDISC = dEVNUMDISC;
    }

    @Override
    public String toString() {
        return "{NAME:" +  NAME + ",AREA_ID：" + AREA_ID + ",RUN_STATUS：" + RUN_STATUS +  ",RUNSTATUSTIME：" + RUNSTATUSTIME + ",CH0_COMMU_REASON：" + CH0_COMMU_REASON +
                ",CH1_COMMU_REASON：" + CH1_COMMU_REASON + ",MANUFACTURER：" + MANUFACTURER+  ",DEV_NUMTOTAL：" + DEV_NUMTOTAL +",DEV_NUMDISC：" + DEV_NUMDISC + "}";
    }

}
