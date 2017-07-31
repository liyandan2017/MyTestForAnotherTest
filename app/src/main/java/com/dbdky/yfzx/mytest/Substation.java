package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class Substation implements Serializable {

    private String MANUFACTURE;
    private String STATION_NUM_I;
    private String STATION_NUM_II;
    private String RATIO_STA;

    public String getMANUFACTURE() {
        return MANUFACTURE;
    }
    public void setMANUFACTURE(String mANUFACTURE) {
        MANUFACTURE = mANUFACTURE;
    }
    public String getSTATION_NUM_I() {
        return STATION_NUM_I;
    }
    public void setSTATION_NUM_I(String sTATIONNUMI) {
        STATION_NUM_I = sTATIONNUMI;
    }
    public String getSTATION_NUM_II() {
        return STATION_NUM_II;
    }
    public void setSTATION_NUM_II(String sTATIONNUMII) {
        STATION_NUM_II = sTATIONNUMII;
    }
    public String getRATIO_STA() {
        return RATIO_STA;
    }
    public void setRATIO_STA(String rATIOSTA) {
        RATIO_STA = rATIOSTA;
    }
    @Override
    public String toString() {
        return "{MANUFACTURE:" + MANUFACTURE + ",STATION_NUM_I:" + STATION_NUM_I + ",STATION_NUM_II:" + STATION_NUM_II
                + ",RATIO_STA:" + RATIO_STA + "}";
    }

}
