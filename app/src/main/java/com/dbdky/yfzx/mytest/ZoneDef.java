package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class ZoneDef implements Serializable {
    private String PT_ID;
    private String CPU_CODE;
    private String ZONE_ID;
    private String NAME;
    private String CODE_NAME;
    private String sz103GROUP;   //103GROUP
    private String sz103ITEM;    //103ITEM
    private String MINVALUE;
    private String MAXVALUE;
    private String STEPVALUE;
    private String S_PRECISION;
    private String DATATYPE;
    private String ZONE_VALUE;
    private String RESERVE1;
    private String RESERVE2;
    private String RESERVE3;
    private String RESERVE4;
    private String sz61850REF;  //61850REF
    private String PSRTYPE;
    private String BASEVALUE;
    private String BASEVALUETM;
    private String sz101INF;    //101INF
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
    public String getZONE_ID() {
        return ZONE_ID;
    }
    public void setZONE_ID(String zONEID) {
        ZONE_ID = zONEID;
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
    public String getZONE_VALUE() {
        return ZONE_VALUE;
    }
    public void setZONE_VALUE(String zONEVALUE) {
        ZONE_VALUE = zONEVALUE;
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
    public String getPSRTYPE() {
        return PSRTYPE;
    }
    public void setPSRTYPE(String pSRTYPE) {
        PSRTYPE = pSRTYPE;
    }
    public String getBASEVALUE() {
        return BASEVALUE;
    }
    public void setBASEVALUE(String bASEVALUE) {
        BASEVALUE = bASEVALUE;
    }
    public String getBASEVALUETM() {
        return BASEVALUETM;
    }
    public void setBASEVALUETM(String bASEVALUETM) {
        BASEVALUETM = bASEVALUETM;
    }
    public String getSz101INF() {
        return sz101INF;
    }
    public void setSz101INF(String sz101inf) {
        sz101INF = sz101inf;
    }
    @Override
    public String toString() {
        return "ZoneDef [toString()=" + super.toString() + "]";
    }
}
