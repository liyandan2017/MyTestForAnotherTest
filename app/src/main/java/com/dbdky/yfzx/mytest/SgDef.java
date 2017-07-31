package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class SgDef implements Serializable {

    private String ID;
    private String PT_ID;
    private String CPU_CODE;
    private String ZONE_CODE;
    private String SETTING_CODE;
    private String CURVALUE;
    private String CURVALUETM;
    private String PSRDATATYPE;
    private String STRBACKUP1;
    private String STRBACKUP2;
    private String STRBACKUP3;
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
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
    public String getZONE_CODE() {
        return ZONE_CODE;
    }
    public void setZONE_CODE(String zONECODE) {
        ZONE_CODE = zONECODE;
    }
    public String getSETTING_CODE() {
        return SETTING_CODE;
    }
    public void setSETTING_CODE(String sETTINGCODE) {
        SETTING_CODE = sETTINGCODE;
    }
    public String getCURVALUE() {
        return CURVALUE;
    }
    public void setCURVALUE(String cURVALUE) {
        CURVALUE = cURVALUE;
    }
    public String getCURVALUETM() {
        return CURVALUETM;
    }
    public void setCURVALUETM(String cURVALUETM) {
        CURVALUETM = cURVALUETM;
    }
    public String getPSRDATATYPE() {
        return PSRDATATYPE;
    }
    public void setPSRDATATYPE(String pSRDATATYPE) {
        PSRDATATYPE = pSRDATATYPE;
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
    public String getSTRBACKUP3() {
        return STRBACKUP3;
    }
    public void setSTRBACKUP3(String sTRBACKUP3) {
        STRBACKUP3 = sTRBACKUP3;
    }
    @Override
    public String toString() {
        return "SgDef [toString()=" + super.toString() + "]";
    }
}
