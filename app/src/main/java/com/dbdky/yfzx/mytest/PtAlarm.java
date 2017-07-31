package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class PtAlarm implements Serializable {
    private String ID;
    private String MSG;
    private String PT_ID;
    private String CPU;
    private String DI_ID;
    private String IS_ACK;
    private String VALUE;
    private String TIME;
    private String MS;
    private String ISDEBUG;
    private String VAL_SRC_TYPE;
    private String STRBACKUP1;
    private String STRBACKUP2;
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
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String cPU) {
        CPU = cPU;
    }
    public String getDI_ID() {
        return DI_ID;
    }
    public void setDI_ID(String dIID) {
        DI_ID = dIID;
    }
    public String getIS_ACK() {
        return IS_ACK;
    }
    public void setIS_ACK(String iSACK) {
        IS_ACK = iSACK;
    }
    public String getVALUE() {
        return VALUE;
    }
    public void setVALUE(String vALUE) {
        VALUE = vALUE;
    }
    public String getTIME() {
        return TIME;
    }
    public void setTIME(String tIME) {
        TIME = tIME;
    }
    public String getMS() {
        return MS;
    }
    public void setMS(String mS) {
        MS = mS;
    }
    public String getISDEBUG() {
        return ISDEBUG;
    }
    public void setISDEBUG(String iSDEBUG) {
        ISDEBUG = iSDEBUG;
    }
    public String getVAL_SRC_TYPE() {
        return VAL_SRC_TYPE;
    }
    public void setVAL_SRC_TYPE(String vALSRCTYPE) {
        VAL_SRC_TYPE = vALSRCTYPE;
    }
    public String getSTRBACKUP1() {
        return STRBACKUP1;
    }
    public void setSTRBACKUP1(String sTRBACKUP1) {
        STRBACKUP1 = sTRBACKUP1;
    }
    public String getSTRBACKUP2() {
        return STRBACKUP2;
    }
    public void setSTRBACKUP2(String sTRBACKUP2) {
        STRBACKUP2 = sTRBACKUP2;
    }
    public String getRECORDTIME() {
        return RECORDTIME;
    }
    public void setRECORDTIME(String rECORDTIME) {
        RECORDTIME = rECORDTIME;
    }
    @Override
    public String toString() {
        return "PtAlarm [toString()=" + super.toString() + "]";
    }


}
