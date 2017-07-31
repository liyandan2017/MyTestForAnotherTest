package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class PtAction implements Serializable {

    private String ID;
    private String MSG;
    private String PT_ID;
    private String IS_ACK;
    private String CURTIME;
    private String MS;
    private String MS2;
    private String RELATIVE_TIME;
    private String RECVTIME;
    private String FAN;
    private String FAULTTYPE;
    private String ISDEBUG;
    private String PROPERTY;
    private String REVERSE1;
    private String REVERSE2;
    private String REVERSE3;
    private String REVERSE4;
    private String sz61850REF;//61850REF
    private String PSRDATATYPE;
    private String CURVALUE;
    private String MSGID;
    private String SIGNALTIME;
    private String RECORDTIME;
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getMSG() {
        return MSG;
    }
    public void setMSG(String mSG) {
        MSG = mSG;
    }
    public String getPT_ID() {
        return PT_ID;
    }
    public void setPT_ID(String pTID) {
        PT_ID = pTID;
    }
    public String getIS_ACK() {
        return IS_ACK;
    }
    public void setIS_ACK(String iSACK) {
        IS_ACK = iSACK;
    }
    public String getCURTIME() {
        return CURTIME;
    }
    public void setCURTIME(String cURTIME) {
        CURTIME = cURTIME;
    }
    public String getMS() {
        return MS;
    }
    public void setMS(String mS) {
        MS = mS;
    }
    public String getMS2() {
        return MS2;
    }
    public void setMS2(String mS2) {
        MS2 = mS2;
    }
    public String getRELATIVE_TIME() {
        return RELATIVE_TIME;
    }
    public void setRELATIVE_TIME(String rELATIVETIME) {
        RELATIVE_TIME = rELATIVETIME;
    }
    public String getRECVTIME() {
        return RECVTIME;
    }
    public void setRECVTIME(String rECVTIME) {
        RECVTIME = rECVTIME;
    }
    public String getFAN() {
        return FAN;
    }
    public void setFAN(String fAN) {
        FAN = fAN;
    }
    public String getFAULTTYPE() {
        return FAULTTYPE;
    }
    public void setFAULTTYPE(String fAULTTYPE) {
        FAULTTYPE = fAULTTYPE;
    }
    public String getISDEBUG() {
        return ISDEBUG;
    }
    public void setISDEBUG(String iSDEBUG) {
        ISDEBUG = iSDEBUG;
    }
    public String getPROPERTY() {
        return PROPERTY;
    }
    public void setPROPERTY(String pROPERTY) {
        PROPERTY = pROPERTY;
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
    public String getSz61850REF() {
        return sz61850REF;
    }
    public void setSz61850REF(String sz61850ref) {
        sz61850REF = sz61850ref;
    }
    public String getPSRDATATYPE() {
        return PSRDATATYPE;
    }
    public void setPSRDATATYPE(String pSRDATATYPE) {
        PSRDATATYPE = pSRDATATYPE;
    }
    public String getCURVALUE() {
        return CURVALUE;
    }
    public void setCURVALUE(String cURVALUE) {
        CURVALUE = cURVALUE;
    }
    public String getMSGID() {
        return MSGID;
    }
    public void setMSGID(String mSGID) {
        MSGID = mSGID;
    }
    public String getSIGNALTIME() {
        return SIGNALTIME;
    }
    public void setSIGNALTIME(String sIGNALTIME) {
        SIGNALTIME = sIGNALTIME;
    }
    public String getRECORDTIME() {
        return RECORDTIME;
    }
    public void setRECORDTIME(String rECORDTIME) {
        RECORDTIME = rECORDTIME;
    }
    @Override
    public String toString() {
        return "PtAction [toString()=" + super.toString() + "]";
    }

}
