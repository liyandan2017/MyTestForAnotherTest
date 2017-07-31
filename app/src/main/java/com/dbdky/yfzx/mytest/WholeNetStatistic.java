package com.dbdky.yfzx.mytest;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class WholeNetStatistic implements Serializable {

    public String Stat_ItemName;
    public String Stat_Value;
    public String Stat_ItemDesc;

    public String getStat_ItemName() {
        return Stat_ItemName;
    }
    public void setStat_ItemName(String statItemName) {
        Stat_ItemName = statItemName;
    }
    public String getStat_Value() {
        return Stat_Value;
    }
    public void setStat_Value(String statValue) {
        Stat_Value = statValue;
    }
    public String getStat_ItemDesc() {
        return Stat_ItemDesc;
    }
    public void setStat_ItemDesc(String statItemDesc) {
        Stat_ItemDesc = statItemDesc;
    }

}
