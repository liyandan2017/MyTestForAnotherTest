package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class TotalSubstationStatisticsItem implements Serializable {

    String ID	;
    String NAME	;
    String NOTE	;
    String MRID	;
    String DIS_SEQ	;
    String REVERSE1	;
    String REVERSE2	;
    String STA_NUMTOTAL	;
    String STA_NUMDISC_I	;
    String STA_RATIODISC_I	;
    String DEV_NUMTOTAL	;
    String DEV_NUMDISC	;
    String DEV_RATIODISC ;
    String TIME_STATISTIC ;
    String STA_NUMDISC_II;
    String STA_RATIODISC_II;
    String STA_NUMPLAN;
    String NET_TYPE;
    String JUNIORID;

    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getNAME() {
        return NAME;
    }
    public void setNAME(String nAME) {
        NAME = nAME;
    }
    public String getNOTE() {
        return NOTE;
    }
    public void setNOTE(String nOTE) {
        NOTE = nOTE;
    }
    public String getMRID() {
        return MRID;
    }
    public void setMRID(String mRID) {
        MRID = mRID;
    }
    public String getDIS_SEQ() {
        return DIS_SEQ;
    }
    public void setDIS_SEQ(String dISSEQ) {
        DIS_SEQ = dISSEQ;
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
    public String getSTA_NUMTOTAL() {
        return STA_NUMTOTAL;
    }
    public void setSTA_NUMTOTAL(String sTANUMTOTAL) {
        STA_NUMTOTAL = sTANUMTOTAL;
    }
    public String getSTA_NUMDISC_I() {
        return STA_NUMDISC_I;
    }
    public void setSTA_NUMDISC_I(String sTANUMDISCI) {
        STA_NUMDISC_I = sTANUMDISCI;
    }
    public String getSTA_RATIODISC_I() {
        return STA_RATIODISC_I;
    }
    public void setSTA_RATIODISC_I(String sTARATIODISCI) {
        STA_RATIODISC_I = sTARATIODISCI;
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
    public String getDEV_RATIODISC() {
        return DEV_RATIODISC;
    }
    public void setDEV_RATIODISC(String dEVRATIODISC) {
        DEV_RATIODISC = dEVRATIODISC;
    }
    public String getTIME_STATISTIC() {
        return TIME_STATISTIC;
    }
    public void setTIME_STATISTIC(String tIMESTATISTIC) {
        TIME_STATISTIC = tIMESTATISTIC;
    }
    public String getSTA_NUMDISC_II() {
        return STA_NUMDISC_II;
    }
    public void setSTA_NUMDISC_II(String sTANUMDISCII) {
        STA_NUMDISC_II = sTANUMDISCII;
    }
    public String getSTA_RATIODISC_II() {
        return STA_RATIODISC_II;
    }
    public void setSTA_RATIODISC_II(String sTARATIODISCII) {
        STA_RATIODISC_II = sTARATIODISCII;
    }
    public String getSTA_NUMPLAN() {
        return STA_NUMPLAN;
    }
    public void setSTA_NUMPLAN(String sTANUMPLAN) {
        STA_NUMPLAN = sTANUMPLAN;
    }
    public String getNET_TYPE() {
        return NET_TYPE;
    }
    public void setNET_TYPE(String nETTYPE) {
        NET_TYPE = nETTYPE;
    }
    public String getJUNIORID() {
        return JUNIORID;
    }
    public void setJUNIORID(String jUNIORID) {
        JUNIORID = jUNIORID;
    }

    @Override
    public String toString() {
        return "{ID:" + ID + ",NAME:" + NAME +  ",NOTE:" + NOTE + ",MRID:" + MRID + ",DIS_SEQ:" +DIS_SEQ + ",REVERSE1" + REVERSE1 + ",REVERSE2:" + REVERSE2 +
                ",STA_NUMTOTAL:" +STA_NUMTOTAL + ",STA_NUMDISC_I:" + STA_NUMDISC_I  + ",STA_RATIODISC_I:" + STA_RATIODISC_I  + ",DEV_NUMTOTAL:" + DEV_NUMTOTAL + ",DEV_NUMDISC:" + DEV_NUMDISC
                + ",DEV_RATIODISC:" + DEV_RATIODISC + ",TIME_STATISTIC:" + TIME_STATISTIC + ",STA_NUMDISC_II:" + STA_NUMDISC_II + ",STA_RATIODISC_II:" + STA_RATIODISC_II  + ",STA_NUMPLAN:" + STA_NUMPLAN
                + ",NET_TYPE:" + NET_TYPE  + ",JUNIORID:" + JUNIORID + "}";
    }

}
