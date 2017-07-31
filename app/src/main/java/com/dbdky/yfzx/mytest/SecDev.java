package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class SecDev implements Serializable {

    private String PT_ID;
    private String URI;
    private String NAME;
    private String TYPE;
    private String KIND;
    private String MODEL;
    private String SYSVERSION;
    private String DEV_TIME;
    private String CRC;
    private String RUN_STATUS;
    private String STATION_ID;
    private String PRIMDEV_ID;
    private String PRIMDEV_TYPE;
    private String sz101ADDR;  //101ADDR;
    private String sz103ADDR;  //103ADDR;
    private String sz103GROUP; //103GROUP
    private String sz103ITEM;  //103ITEM
    private String REVERSE1;
    private String REVERSE2;
    private String REVERSE3;
    private String COMMU_STATUS;
    private String COMMSTATUSTIME;
    private String RUNSTATUSTIME;
    private String COMMU_TYPE;
    private String sz61850SERVER_NAME; //61850SERVER_NAME
    private String MRID;
    private String SUSPENDSTATUS;
    private String SUSPENDREASON;
    private String ALARMBAYNAME;
    private String ALARMDEVNAME;
    private String KINDSEQ;
    private String VOLTAGE_GRADE;
    private String CTRLENABLE;
    private String DOMAIN_FLAG;
    private String LOCK_FLAG;
    private String ABNORMAL_FLAG;
    private String EVENT_FLAG;
    private String TM_LASTACT;
    private String TM_LASTOSC;
    private String TM_LASTEVENT;
    private String TM_LASTDIGIT;
    private String ALARM_OVERLMT;
    private String ACTION_OVERLMT;
    private String DICHANGE_OVERLMT;
    private String OSC_OVERLMT;
    private String TM_LASTSETTING;
    private String TM_LASTSOFT;
    private String TM_LASTANALOG;


    public String getPT_ID() {
        return PT_ID;
    }
    public void setPT_ID(String pTID) {
        PT_ID = pTID;
    }
    public String getURI() {
        return URI;
    }
    public void setURI(String uRI) {
        URI = uRI;
    }
    public String getNAME() {
        return NAME;
    }
    public void setNAME(String nAME) {
        NAME = nAME;
    }
    public String getTYPE() {
        return TYPE;
    }
    public void setTYPE(String tYPE) {
        TYPE = tYPE;
    }
    public String getKIND() {
        return KIND;
    }
    public void setKIND(String kIND) {
        KIND = kIND;
    }
    public String getMODEL() {
        return MODEL;
    }
    public void setMODEL(String mODEL) {
        MODEL = mODEL;
    }
    public String getSYSVERSION() {
        return SYSVERSION;
    }
    public void setSYSVERSION(String sYSVERSION) {
        SYSVERSION = sYSVERSION;
    }
    public String getDEV_TIME() {
        return DEV_TIME;
    }
    public void setDEV_TIME(String dEVTIME) {
        DEV_TIME = dEVTIME;
    }
    public String getCRC() {
        return CRC;
    }
    public void setCRC(String cRC) {
        CRC = cRC;
    }
    public String getRUN_STATUS() {
        return RUN_STATUS;
    }
    public void setRUN_STATUS(String rUNSTATUS) {
        RUN_STATUS = rUNSTATUS;
    }
    public String getSTATION_ID() {
        return STATION_ID;
    }
    public void setSTATION_ID(String sTATIONID) {
        STATION_ID = sTATIONID;
    }
    public String getPRIMDEV_ID() {
        return PRIMDEV_ID;
    }
    public void setPRIMDEV_ID(String pRIMDEVID) {
        PRIMDEV_ID = pRIMDEVID;
    }
    public String getPRIMDEV_TYPE() {
        return PRIMDEV_TYPE;
    }
    public void setPRIMDEV_TYPE(String pRIMDEVTYPE) {
        PRIMDEV_TYPE = pRIMDEVTYPE;
    }
    public String getSz101ADDR() {
        return sz101ADDR;
    }
    public void setSz101ADDR(String sz101addr) {
        sz101ADDR = sz101addr;
    }
    public String getSz103ADDR() {
        return sz103ADDR;
    }
    public void setSz103ADDR(String sz103addr) {
        sz103ADDR = sz103addr;
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
    public String getREVERSE1() {
        return REVERSE1;
    }
    public void setREVERSE1(String rEVERSE1) {
        REVERSE1 = rEVERSE1;
    }
    public String getREVERSE2() {
        return REVERSE2;
    }
    public void setREVERSE2(String rEVERSE2) {
        REVERSE2 = rEVERSE2;
    }
    public String getREVERSE3() {
        return REVERSE3;
    }
    public void setREVERSE3(String rEVERSE3) {
        REVERSE3 = rEVERSE3;
    }
    public String getCOMMU_STATUS() {
        return COMMU_STATUS;
    }
    public void setCOMMU_STATUS(String cOMMUSTATUS) {
        COMMU_STATUS = cOMMUSTATUS;
    }
    public String getCOMMSTATUSTIME() {
        return COMMSTATUSTIME;
    }
    public void setCOMMSTATUSTIME(String cOMMSTATUSTIME) {
        COMMSTATUSTIME = cOMMSTATUSTIME;
    }
    public String getRUNSTATUSTIME() {
        return RUNSTATUSTIME;
    }
    public void setRUNSTATUSTIME(String rUNSTATUSTIME) {
        RUNSTATUSTIME = rUNSTATUSTIME;
    }
    public String getCOMMU_TYPE() {
        return COMMU_TYPE;
    }
    public void setCOMMU_TYPE(String cOMMUTYPE) {
        COMMU_TYPE = cOMMUTYPE;
    }
    public String getSz61850SERVER_NAME() {
        return sz61850SERVER_NAME;
    }
    public void setSz61850SERVER_NAME(String sz61850serverNAME) {
        sz61850SERVER_NAME = sz61850serverNAME;
    }
    public String getMRID() {
        return MRID;
    }
    public void setMRID(String mRID) {
        MRID = mRID;
    }
    public String getSUSPENDSTATUS() {
        return SUSPENDSTATUS;
    }
    public void setSUSPENDSTATUS(String sUSPENDSTATUS) {
        SUSPENDSTATUS = sUSPENDSTATUS;
    }
    public String getSUSPENDREASON() {
        return SUSPENDREASON;
    }
    public void setSUSPENDREASON(String sUSPENDREASON) {
        SUSPENDREASON = sUSPENDREASON;
    }
    public String getALARMBAYNAME() {
        return ALARMBAYNAME;
    }
    public void setALARMBAYNAME(String aLARMBAYNAME) {
        ALARMBAYNAME = aLARMBAYNAME;
    }
    public String getALARMDEVNAME() {
        return ALARMDEVNAME;
    }
    public void setALARMDEVNAME(String aLARMDEVNAME) {
        ALARMDEVNAME = aLARMDEVNAME;
    }
    public String getKINDSEQ() {
        return KINDSEQ;
    }
    public void setKINDSEQ(String kINDSEQ) {
        KINDSEQ = kINDSEQ;
    }
    public String getVOLTAGE_GRADE() {
        return VOLTAGE_GRADE;
    }
    public void setVOLTAGE_GRADE(String vOLTAGEGRADE) {
        VOLTAGE_GRADE = vOLTAGEGRADE;
    }
    public String getCTRLENABLE() {
        return CTRLENABLE;
    }
    public void setCTRLENABLE(String cTRLENABLE) {
        CTRLENABLE = cTRLENABLE;
    }
    public String getDOMAIN_FLAG() {
        return DOMAIN_FLAG;
    }
    public void setDOMAIN_FLAG(String dOMAINFLAG) {
        DOMAIN_FLAG = dOMAINFLAG;
    }
    public String getLOCK_FLAG() {
        return LOCK_FLAG;
    }
    public void setLOCK_FLAG(String lOCKFLAG) {
        LOCK_FLAG = lOCKFLAG;
    }
    public String getABNORMAL_FLAG() {
        return ABNORMAL_FLAG;
    }
    public void setABNORMAL_FLAG(String aBNORMALFLAG) {
        ABNORMAL_FLAG = aBNORMALFLAG;
    }
    public String getEVENT_FLAG() {
        return EVENT_FLAG;
    }
    public void setEVENT_FLAG(String eVENTFLAG) {
        EVENT_FLAG = eVENTFLAG;
    }
    public String getTM_LASTACT() {
        return TM_LASTACT;
    }
    public void setTM_LASTACT(String tMLASTACT) {
        TM_LASTACT = tMLASTACT;
    }
    public String getTM_LASTOSC() {
        return TM_LASTOSC;
    }
    public void setTM_LASTOSC(String tMLASTOSC) {
        TM_LASTOSC = tMLASTOSC;
    }
    public String getTM_LASTEVENT() {
        return TM_LASTEVENT;
    }
    public void setTM_LASTEVENT(String tMLASTEVENT) {
        TM_LASTEVENT = tMLASTEVENT;
    }
    public String getTM_LASTDIGIT() {
        return TM_LASTDIGIT;
    }
    public void setTM_LASTDIGIT(String tMLASTDIGIT) {
        TM_LASTDIGIT = tMLASTDIGIT;
    }
    public String getALARM_OVERLMT() {
        return ALARM_OVERLMT;
    }
    public void setALARM_OVERLMT(String aLARMOVERLMT) {
        ALARM_OVERLMT = aLARMOVERLMT;
    }
    public String getACTION_OVERLMT() {
        return ACTION_OVERLMT;
    }
    public void setACTION_OVERLMT(String aCTIONOVERLMT) {
        ACTION_OVERLMT = aCTIONOVERLMT;
    }
    public String getDICHANGE_OVERLMT() {
        return DICHANGE_OVERLMT;
    }
    public void setDICHANGE_OVERLMT(String dICHANGEOVERLMT) {
        DICHANGE_OVERLMT = dICHANGEOVERLMT;
    }
    public String getOSC_OVERLMT() {
        return OSC_OVERLMT;
    }
    public void setOSC_OVERLMT(String oSCOVERLMT) {
        OSC_OVERLMT = oSCOVERLMT;
    }
    public String getTM_LASTSETTING() {
        return TM_LASTSETTING;
    }
    public void setTM_LASTSETTING(String tMLASTSETTING) {
        TM_LASTSETTING = tMLASTSETTING;
    }
    public String getTM_LASTSOFT() {
        return TM_LASTSOFT;
    }
    public void setTM_LASTSOFT(String tMLASTSOFT) {
        TM_LASTSOFT = tMLASTSOFT;
    }
    public String getTM_LASTANALOG() {
        return TM_LASTANALOG;
    }
    public void setTM_LASTANALOG(String tMLASTANALOG) {
        TM_LASTANALOG = tMLASTANALOG;
    }
    @Override
    public String toString() {
        return "SecDev [toString()=" + super.toString() + "]";
    }
}
