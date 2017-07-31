package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class SettingDef implements Serializable {

    private String PT_ID;
    private String CPU_CODE;
    private String SETTING_ID;
    private String ZONE;
    private String sz103GROUP;  		//103GROUP
    private String sz103ITEM;    		//103ITEM
    private String NAME;
    private String CODE_NAME;
    private String PROPERTY;
    private String MINVALUE;
    private String MAXVALUE;
    private String STEPVALUE;
    private String RATIO;
    private String VPICKLIST;
    private String UNIT;
    private String S_PRECISION;
    private String DATATYPE;
    private String STATION_LIST;
    private String RESERVE1;
    private String RESERVE2;
    private String RESERVE3;
    private String RESERVE4;
    private String sz61850REF;  		//61850REF
    private String MRID;
    private String sz101INF;    		//101INF

    public String getPT_ID() {
        return PT_ID;
    }
    public void setPT_ID(String pTID) {
        PT_ID = pTID;
    }
    public String getCPU_CODE() {
        return CPU_CODE;
    }
    public void setCPU_CODE(String cPUCODE) {
        CPU_CODE = cPUCODE;
    }
    public String getSETTING_ID() {
        return SETTING_ID;
    }
    public void setSETTING_ID(String sETTINGID) {
        SETTING_ID = sETTINGID;
    }
    public String getZONE() {
        return ZONE;
    }
    public void setZONE(String zONE) {
        ZONE = zONE;
    }
    public String getSz103GROUP() {
        return sz103GROUP;
    }
    public void setSz103GROUP(String sz103group) {
        sz103GROUP = sz103group;
    }
    public String getSz103ITEM() {
        return sz103ITEM;
    }
    public void setSz103ITEM(String sz103item) {
        sz103ITEM = sz103item;
    }
    public String getNAME() {
        return NAME;
    }
    public void setNAME(String nAME) {
        NAME = nAME;
    }
    public String getCODE_NAME() {
        return CODE_NAME;
    }
    public void setCODE_NAME(String cODENAME) {
        CODE_NAME = cODENAME;
    }
    public String getPROPERTY() {
        return PROPERTY;
    }
    public void setPROPERTY(String pROPERTY) {
        PROPERTY = pROPERTY;
    }
    public String getMINVALUE() {
        return MINVALUE;
    }
    public void setMINVALUE(String mINVALUE) {
        MINVALUE = mINVALUE;
    }
    public String getMAXVALUE() {
        return MAXVALUE;
    }
    public void setMAXVALUE(String mAXVALUE) {
        MAXVALUE = mAXVALUE;
    }
    public String getSTEPVALUE() {
        return STEPVALUE;
    }
    public void setSTEPVALUE(String sTEPVALUE) {
        STEPVALUE = sTEPVALUE;
    }
    public String getRATIO() {
        return RATIO;
    }
    public void setRATIO(String rATIO) {
        RATIO = rATIO;
    }
    public String getVPICKLIST() {
        return VPICKLIST;
    }
    public void setVPICKLIST(String vPICKLIST) {
        VPICKLIST = vPICKLIST;
    }
    public String getUNIT() {
        return UNIT;
    }
    public void setUNIT(String uNIT) {
        UNIT = uNIT;
    }
    public String getS_PRECISION() {
        return S_PRECISION;
    }
    public void setS_PRECISION(String sPRECISION) {
        S_PRECISION = sPRECISION;
    }
    public String getDATATYPE() {
        return DATATYPE;
    }
    public void setDATATYPE(String dATATYPE) {
        DATATYPE = dATATYPE;
    }
    public String getSTATION_LIST() {
        return STATION_LIST;
    }
    public void setSTATION_LIST(String sTATIONLIST) {
        STATION_LIST = sTATIONLIST;
    }
    public String getRESERVE1() {
        return RESERVE1;
    }
    public void setRESERVE1(String rESERVE1) {
        RESERVE1 = rESERVE1;
    }
    public String getRESERVE2() {
        return RESERVE2;
    }
    public void setRESERVE2(String rESERVE2) {
        RESERVE2 = rESERVE2;
    }
    public String getRESERVE3() {
        return RESERVE3;
    }
    public void setRESERVE3(String rESERVE3) {
        RESERVE3 = rESERVE3;
    }
    public String getRESERVE4() {
        return RESERVE4;
    }
    public void setRESERVE4(String rESERVE4) {
        RESERVE4 = rESERVE4;
    }
    public String getSz61850REF() {
        return sz61850REF;
    }
    public void setSz61850REF(String sz61850ref) {
        sz61850REF = sz61850ref;
    }
    public String getMRID() {
        return MRID;
    }
    public void setMRID(String mRID) {
        MRID = mRID;
    }
    public String getSz101INF() {
        return sz101INF;
    }
    public void setSz101INF(String sz101inf) {
        sz101INF = sz101inf;
    }

    @Override
    public String toString() {
        return "{PT_ID:" + PT_ID + ",CPU_CODE:" + CPU_CODE + ",SETTING_ID:" + SETTING_ID + ",ZONE:" +  ZONE + ",103GROUP:" + sz103GROUP + ",103ITEM:" + sz103ITEM + ",NAME:" + NAME + ",CODE_NAME:" + CODE_NAME + ",PROPERTY:" + PROPERTY + ",MINVALUE:" + MINVALUE +
                ",MAXVALUE:" + MAXVALUE + ",STEPVALUE:" + STEPVALUE + ",RATIO:" + RATIO + ",VPICKLIST:" + VPICKLIST + ",UNIT:" + UNIT + ",S_PRECISION:" + S_PRECISION + ",DATATYPE:" + DATATYPE + ",STATION_LIST:" + STATION_LIST +
                ",RESERVE1:" + RESERVE1 + ",RESERVE2:" + RESERVE2 +  ",RESERVE3:" + RESERVE3 +  ",RESERVE4:" + RESERVE4 +  ",61850REF:" + sz61850REF + ",MRID:" + MRID + ",101INF:" + sz101INF + "}";
    }
}
