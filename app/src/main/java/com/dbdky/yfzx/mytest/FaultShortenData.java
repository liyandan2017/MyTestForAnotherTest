package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class FaultShortenData implements Serializable {
//"1":"ID","2":"CASENAME","3":"PRIDEVICEID","4":"FAULTTIME","5":"FAULTLOCATION","6":"FAULTTYPE",
    //"7":"STATION1_ID","8":"STATION2_ID","9":"EVENTLEVEL","10":"REVERSE1","11":"REVERSE2","12":"REVERSE3",
    //"13":"REVERSE4","14":"FAULTMSTIME","15":"TYPICALCASE","16":"FIS_PATH","17":"OVERHAUL_FLAG",
    //"18":"REVERSE5","19":"REVERSE6","20":"REVERSE7","21":"ISACT_CORRECTLY","22":"PRMDEV_TYPE",
    //"23":"FAULT_REASON","24":"PACKEG_TIME","25":"REPORTFILE","26":"KEY_PTID","27":"KEY_RECVTIME",
    //"28":"REALFAULT_BASE","29":"PRIDEVICEID2","30":"RECORDTIME","31":"COMPLETED","32":"VOLTAGE"


    private String  ID;
    private String  CASENAME;
    private String  PRIDEVICEID;
    private String  FAULTTIME;
    private String  FAULTLOCATION;
    private String  FAULTTYPE;
    private String  STATION1_ID;
    private String  STATION2_ID;
    private String  EVENTLEVEL;
    private String  REVERSE1;
    private String  REVERSE2;
    private String  REVERSE3;
    private String  REVERSE4;
    private String  FAULTMSTIME;
    private String  TYPICALCASE;
    private String  FIS_PATH;
    private String  OVERHAUL_FLAG;
    private String  REVERSE5;
    private String  REVERSE6;
    private String  REVERSE7;
    private String  ISACT_CORRECTLY;
    private String  PRMDEV_TYPE;
    private String  FAULT_REASON  ;
    private String  PACKEG_TIME  ;
    private String  REPORTFILE  ;
    private String  KEY_PTID  ;
    private String  KEY_RECVTIME  ;
    private String  REALFAULT_BASE  ;
    private String  PRIDEVICEID2  ;
    private String  RECORDTIME  ;
    private String  COMPLETED  ;
    private String  VOLTAGE  ;


    public String getID() {
        return ID;
    }


    public void setID(String iD) {
        ID = iD;
    }


    public String getCASENAME() {
        return CASENAME;
    }


    public void setCASENAME(String cASENAME) {
        CASENAME = cASENAME;
    }


    public String getPRIDEVICEID() {
        return PRIDEVICEID;
    }


    public void setPRIDEVICEID(String pRIDEVICEID) {
        PRIDEVICEID = pRIDEVICEID;
    }


    public String getFAULTTIME() {
        return FAULTTIME;
    }


    public void setFAULTTIME(String fAULTTIME) {
        FAULTTIME = fAULTTIME;
    }


    public String getFAULTLOCATION() {
        return FAULTLOCATION;
    }


    public void setFAULTLOCATION(String fAULTLOCATION) {
        FAULTLOCATION = fAULTLOCATION;
    }


    public String getFAULTTYPE() {
        return FAULTTYPE;
    }


    public void setFAULTTYPE(String fAULTTYPE) {
        FAULTTYPE = fAULTTYPE;
    }


    public String getSTATION1_ID() {
        return STATION1_ID;
    }


    public void setSTATION1_ID(String sTATION1ID) {
        STATION1_ID = sTATION1ID;
    }


    public String getSTATION2_ID() {
        return STATION2_ID;
    }


    public void setSTATION2_ID(String sTATION2ID) {
        STATION2_ID = sTATION2ID;
    }


    public String getEVENTLEVEL() {
        return EVENTLEVEL;
    }


    public void setEVENTLEVEL(String eVENTLEVEL) {
        EVENTLEVEL = eVENTLEVEL;
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


    public String getREVERSE4() {
        return REVERSE4;
    }


    public void setREVERSE4(String rEVERSE4) {
        REVERSE4 = rEVERSE4;
    }


    public String getFAULTMSTIME() {
        return FAULTMSTIME;
    }


    public void setFAULTMSTIME(String fAULTMSTIME) {
        FAULTMSTIME = fAULTMSTIME;
    }


    public String getTYPICALCASE() {
        return TYPICALCASE;
    }


    public void setTYPICALCASE(String tYPICALCASE) {
        TYPICALCASE = tYPICALCASE;
    }


    public String getFIS_PATH() {
        return FIS_PATH;
    }


    public void setFIS_PATH(String fISPATH) {
        FIS_PATH = fISPATH;
    }


    public String getOVERHAUL_FLAG() {
        return OVERHAUL_FLAG;
    }


    public void setOVERHAUL_FLAG(String oVERHAULFLAG) {
        OVERHAUL_FLAG = oVERHAULFLAG;
    }


    public String getREVERSE5() {
        return REVERSE5;
    }


    public void setREVERSE5(String rEVERSE5) {
        REVERSE5 = rEVERSE5;
    }


    public String getREVERSE6() {
        return REVERSE6;
    }


    public void setREVERSE6(String rEVERSE6) {
        REVERSE6 = rEVERSE6;
    }


    public String getREVERSE7() {
        return REVERSE7;
    }


    public void setREVERSE7(String rEVERSE7) {
        REVERSE7 = rEVERSE7;
    }


    public String getISACT_CORRECTLY() {
        return ISACT_CORRECTLY;
    }


    public void setISACT_CORRECTLY(String iSACTCORRECTLY) {
        ISACT_CORRECTLY = iSACTCORRECTLY;
    }


    public String getPRMDEV_TYPE() {
        return PRMDEV_TYPE;
    }


    public void setPRMDEV_TYPE(String pRMDEVTYPE) {
        PRMDEV_TYPE = pRMDEVTYPE;
    }


    public String getFAULT_REASON() {
        return FAULT_REASON;
    }


    public void setFAULT_REASON(String fAULTREASON) {
        FAULT_REASON = fAULTREASON;
    }


    public String getPACKEG_TIME() {
        return PACKEG_TIME;
    }


    public void setPACKEG_TIME(String pACKEGTIME) {
        PACKEG_TIME = pACKEGTIME;
    }


    public String getREPORTFILE() {
        return REPORTFILE;
    }


    public void setREPORTFILE(String rEPORTFILE) {
        REPORTFILE = rEPORTFILE;
    }


    public String getKEY_PTID() {
        return KEY_PTID;
    }


    public void setKEY_PTID(String kEYPTID) {
        KEY_PTID = kEYPTID;
    }


    public String getKEY_RECVTIME() {
        return KEY_RECVTIME;
    }


    public void setKEY_RECVTIME(String kEYRECVTIME) {
        KEY_RECVTIME = kEYRECVTIME;
    }


    public String getREALFAULT_BASE() {
        return REALFAULT_BASE;
    }


    public void setREALFAULT_BASE(String rEALFAULTBASE) {
        REALFAULT_BASE = rEALFAULTBASE;
    }


    public String getPRIDEVICEID2() {
        return PRIDEVICEID2;
    }


    public void setPRIDEVICEID2(String pRIDEVICEID2) {
        PRIDEVICEID2 = pRIDEVICEID2;
    }


    public String getRECORDTIME() {
        return RECORDTIME;
    }


    public void setRECORDTIME(String rECORDTIME) {
        RECORDTIME = rECORDTIME;
    }


    public String getCOMPLETED() {
        return COMPLETED;
    }


    public void setCOMPLETED(String cOMPLETED) {
        COMPLETED = cOMPLETED;
    }


    public String getVOLTAGE() {
        return VOLTAGE;
    }


    public void setVOLTAGE(String vOLTAGE) {
        VOLTAGE = vOLTAGE;
    }

    //"1":"ID","2":"CASENAME","3":"PRIDEVICEID","4":"FAULTTIME","5":"FAULTLOCATION","6":"FAULTTYPE",
    //"7":"STATION1_ID","8":"STATION2_ID","9":"EVENTLEVEL","10":"REVERSE1","11":"REVERSE2","12":"REVERSE3",
    //"13":"REVERSE4","14":"FAULTMSTIME","15":"TYPICALCASE","16":"FIS_PATH","17":"OVERHAUL_FLAG",
    //"18":"REVERSE5","19":"REVERSE6","20":"REVERSE7","21":"ISACT_CORRECTLY","22":"PRMDEV_TYPE",
    //"23":"FAULT_REASON","24":"PACKEG_TIME","25":"REPORTFILE","26":"KEY_PTID","27":"KEY_RECVTIME",
    //"28":"REALFAULT_BASE","29":"PRIDEVICEID2","30":"RECORDTIME","31":"COMPLETED","32":"VOLTAGE"
    @Override
    public String toString() {
        return "{ID:" + ID + ",CASENAME:" + CASENAME +  ",PRIDEVICEID:" + PRIDEVICEID +  ",FAULTTIME:" + FAULTTIME + ",FAULTLOCATION:"+ FAULTLOCATION + ",FAULTTYPE:"+ FAULTTYPE+ ",STATION1_ID:"+ STATION1_ID +
                ",STATION2_ID:"+ STATION2_ID + ",EVENTLEVEL:"+ EVENTLEVEL + ",REVERSE1:" + REVERSE1
                + ",REVERSE2:"+ REVERSE2 + ",REVERSE3:"+ REVERSE3+",REVERSE4:"+ REVERSE4 + ",FAULTMSTIME:"+ FAULTMSTIME + ",TYPICALCASE:"+ TYPICALCASE + ",FIS_PATH:"+ FIS_PATH + ",OVERHAUL_FLAG:"+ OVERHAUL_FLAG + ",REVERSE5:"
                + REVERSE5 + ",REVERSE6:"+ REVERSE6 + ",REVERSE7:"+  REVERSE7 + ",ISACT_CORRECTLY:"+ ISACT_CORRECTLY + ",PRMDEV_TYPE:"+ PRMDEV_TYPE + ",FAULT_REASON:"+ FAULT_REASON + ",PACKEG_TIME:"+ PACKEG_TIME + ",REPORTFILE:"+ REPORTFILE + ",KEY_PTID:" + KEY_PTID
                + ",KEY_RECVTIME:"+ KEY_RECVTIME +  ",REALFAULT_BASE:"+ REALFAULT_BASE + ",PRIDEVICEID2:"+ PRIDEVICEID2 + ",RECORDTIME:"+ RECORDTIME + ",COMPLETED:"+ COMPLETED + ",VOLTAGE:" + VOLTAGE + "}";
    }


}
