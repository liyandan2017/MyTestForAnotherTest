package com.dbdky.yfzx.mytest;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.MapUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class JsonStringParser {
    public List<WholeNetStatistic> parseJsonUrl0(String jsonData)
    {
        List<WholeNetStatistic>  lstItems_WholeNetStatistic = new ArrayList<WholeNetStatistic>();
        try{
//		System.out.println(jsonData);
        Log.i("Debug",jsonData);

        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
        System.out.println("===================================================");
        System.out.println(map);

        System.out.println("Item Number : " + Integer.toString(map.size() ));
        for( int i = 0; i < map.size(); i++)
        {
        	System.out.println("===================================================");
        	if( 0 == i )
        	{
        		System.out.println("表列属性介绍如下：");
        		String desc = MapUtils.getString(map, "COLUMDESC");
        		String descItem = "COLUMDESC  :::: ";

        		System.out.println(descItem + desc);

        		int len = desc.length();
        	    String szValue = desc.substring(1, len-1);

        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
        		System.out.println(map1);

        	}else{
        		String szInfo = 	"第";
        		szInfo 		  += 	Integer.toString(i);
        		szInfo 		  += 	"行数据如下：";

        		System.out.println(szInfo);

                String value = MapUtils.getString(map, Integer.toString(i) );
        		System.out.println(value);

        		int len = value.length();
        	    String szValue = value.substring(1, len-1);

        	    System.out.println(szValue);

        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
        		System.out.println(map1);

        		String sta_item  	= MapUtils.getString(map1, Integer.toString(1) );
        		String sta_value 	= MapUtils.getString(map1, Integer.toString(2) );
        		String sta_itemdesc = MapUtils.getString(map1, Integer.toString(3) );

                WholeNetStatistic lineData = new WholeNetStatistic();

                lineData.setStat_ItemName(sta_item);
                lineData.setStat_Value(sta_value);
                lineData.setStat_ItemDesc(sta_itemdesc);

                lstItems_WholeNetStatistic.add( lineData );
        	}
         }
		}catch(Exception e)
		{
			System.out.println(e.getMessage()) ;

            List<WholeNetStatistic>  lst_WholeNetStatistic = new ArrayList<WholeNetStatistic>();
            return lst_WholeNetStatistic;
    	}

        return lstItems_WholeNetStatistic;
    }
    public List<TotalSubstationStatisticsItem> parseJsonUrl1(String jsonData)
    {
        List<TotalSubstationStatisticsItem>  lstItems_TotalSubstationSta = new ArrayList<TotalSubstationStatisticsItem>();
        try{
           // String jsonData = "{\"COLUMDESC\":[{\"1\":\"ID\",\"2\":\"NAME\",\"3\":\"NOTE\",\"4\":\"MRID\",\"5\":\"DIS_SEQ\",\"6\":\"REVERSE1\",\"7\":\"REVERSE2\",\"8\":\"STA_NUMTOTAL\",\"9\":\"STA_NUMDISC_I\",\"10\":\"STA_RATIODISC_I\",\"11\":\"DEV_NUMTOTAL\",\"12\":\"DEV_NUMDISC\",\"13\":\"DEV_RATIODISC\",\"14\":\"TIME_STATISTIC\",\"15\":\"STA_NUMDISC_II\",\"16\":\"STA_RATIODISC_II\",\"17\":\"STA_NUMPLAN\",\"18\":\"NET_TYPE\",\"19\":\"JUNIORID\"}],\"1\":[{\"1\":\"辽阳\",\"2\":\"辽阳\",\"3\":\"NULL\",\"4\":\"113715890943426579\",\"5\":0,\"6\":\"NULL\",\"7\":\"NULL\",\"8\":1,\"9\":0,\"10\":100,\"11\":22,\"12\":0,\"13\":100,\"14\":{\"date\":5,\"day\":3,\"hours\":14,\"minutes\":27,\"month\":6,\"nanos\":0,\"seconds\":56,\"time\":1499236076000,\"timezoneOffset\":-480,\"year\":117},\"15\":1,\"16\":0,\"17\":1,\"18\":0,\"19\":\"NULL\"}],\"2\":[{\"1\":\"营口\",\"2\":\"营口局\",\"3\":\"NULL\",\"4\":\"113715890943426585\",\"5\":0,\"6\":\"NULL\",\"7\":\"NULL\",\"8\":2,\"9\":0,\"10\":100,\"11\":45,\"12\":0,\"13\":100,\"14\":{\"date\":5,\"day\":3,\"hours\":14,\"minutes\":27,\"month\":6,\"nanos\":0,\"seconds\":56,\"time\":1499236076000,\"timezoneOffset\":-480,\"year\":117},\"15\":0,\"16\":100,\"17\":2,\"18\":0,\"19\":\"NULL\"}],\"3\":[{\"1\":\"朝阳局\",\"2\":\"朝阳局\",\"3\":\"NULL\",\"4\":\"113715890943426570\",\"5\":0,\"6\":\"NULL\",\"7\":\"NULL\",\"8\":1,\"9\":1,\"10\":0,\"11\":20,\"12\":2,\"13\":90,\"14\":{\"date\":5,\"day\":3,\"hours\":14,\"minutes\":27,\"month\":6,\"nanos\":0,\"seconds\":56,\"time\":1499236076000,\"timezoneOffset\":-480,\"year\":117},\"15\":0,\"16\":0,\"17\":0,\"18\":0,\"19\":\"NULL\"}],\"4\":[{\"1\":\"就地\",\"2\":\"就地化保护\",\"3\":\"NULL\",\"4\":\"113715890943426584\",\"5\":0,\"6\":\"NULL\",\"7\":\"NULL\",\"8\":1,\"9\":0,\"10\":0,\"11\":2,\"12\":0,\"13\":100,\"14\":{\"date\":5,\"day\":3,\"hours\":14,\"minutes\":27,\"month\":6,\"nanos\":0,\"seconds\":56,\"time\":1499236076000,\"timezoneOffset\":-480,\"year\":117},\"15\":1,\"16\":0,\"17\":0,\"18\":0,\"19\":\"NULL\"}]}";

            Log.i("Debug",jsonData);

            Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
            System.out.println("===================================================");
            System.out.println(map);
            System.out.println("line Number : " + Integer.toString(map.size() - 1 ));
            for( int i = 0; i < map.size(); i++)
            {
                System.out.println("===================================================");
                if( 0 == i )
                {
                    System.out.println("表列属性介绍如下：");
                    String desc = MapUtils.getString(map, "COLUMDESC");
                    String descItem = "COLUMDESC  :::: ";

                    System.out.println(descItem + desc);

                    int len = desc.length();
                    String szValue = desc.substring(1, len-1);

                    Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
                    System.out.println(map1);

                }else{
                    String szInfo = 	"第";
                    szInfo 		  += 	Integer.toString(i);
                    szInfo 		  += 	"行数据如下：";

                    System.out.println(szInfo);

                    String value = MapUtils.getString(map, Integer.toString(i) );
                    System.out.println(value);

                    int len = value.length();
                    String szValue = value.substring(1, len-1);

                    System.out.println(szValue);

                    Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
                    System.out.println(map1);

                    TotalSubstationStatisticsItem lineData = new TotalSubstationStatisticsItem();

                    String devNetBase_ID 	= MapUtils.getString(map1, Integer.toString(1) );
                    lineData.setID(devNetBase_ID);
                    System.out.println(devNetBase_ID);

                    String devNetBase_NAME 	= MapUtils.getString(map1, Integer.toString(2) );
                    lineData.setNAME(devNetBase_NAME);
                    System.out.println(devNetBase_NAME);

                    String devNetBase_NOTE = MapUtils.getString(map1, Integer.toString(3) );
                    lineData.setNOTE(devNetBase_NOTE);
                    System.out.println(devNetBase_NOTE);

                    String devNetBase_MRID 	= MapUtils.getString(map1, Integer.toString(4) );
                    lineData.setMRID(devNetBase_MRID);
                    System.out.println(devNetBase_MRID);

                    String devNetBase_DIS_SEQ 	= MapUtils.getString(map1, Integer.toString(5) );
                    lineData.setDIS_SEQ(devNetBase_DIS_SEQ);
                    System.out.println(devNetBase_DIS_SEQ);

                    String devNetBase_REVERSE1 = MapUtils.getString(map1, Integer.toString(6) );
                    lineData.setREVERSE1(devNetBase_REVERSE1);
                    System.out.println(devNetBase_REVERSE1);

                    String devNetBase_REVERSE2 	= MapUtils.getString(map1, Integer.toString(7) );
                    lineData.setREVERSE2(devNetBase_REVERSE2);
                    System.out.println(devNetBase_REVERSE2);

                    String devNetBase_STA_NUMTOTAL 	= MapUtils.getString(map1, Integer.toString(8) );
                    lineData.setSTA_NUMTOTAL(devNetBase_STA_NUMTOTAL);
                    System.out.println(devNetBase_STA_NUMTOTAL);

                    String devNetBase_STA_NUMDISC_I = MapUtils.getString(map1, Integer.toString(9) );
                    lineData.setSTA_NUMDISC_I(devNetBase_STA_NUMDISC_I);
                    System.out.println(devNetBase_STA_NUMDISC_I);

                    String devNetBase_STA_RATIODISC_I 	= MapUtils.getString(map1, Integer.toString(10) );
                    lineData.setSTA_RATIODISC_I(devNetBase_STA_RATIODISC_I);
                    System.out.println(devNetBase_STA_RATIODISC_I);

                    String devNetBase_DEV_NUMTOTAL 	= MapUtils.getString(map1, Integer.toString(11) );
                    lineData.setDEV_NUMTOTAL(devNetBase_DEV_NUMTOTAL);
                    System.out.println(devNetBase_DEV_NUMTOTAL);

                    String devNetBase_DEV_NUMDISC 	= MapUtils.getString(map1, Integer.toString(12) );
                    lineData.setDEV_NUMDISC(devNetBase_DEV_NUMDISC);
                    System.out.println(devNetBase_DEV_NUMDISC);

                    String devNetBase_DEV_RATIODISC 	= MapUtils.getString(map1, Integer.toString(13) );
                    lineData.setDEV_RATIODISC(devNetBase_DEV_RATIODISC);
                    System.out.println(devNetBase_DEV_RATIODISC);

                    String devNetBase_TIME_STATISTIC 	= MapUtils.getString(map1, Integer.toString(14) );
                    System.out.println(devNetBase_TIME_STATISTIC);

                    String tmp = devNetBase_TIME_STATISTIC;
                    Map<String, Object> map2 = JsonUtil.convertJsonStrToMap(tmp);
                    System.out.println(map2);
                    Integer year = MapUtils.getInteger(map2, "year" );
                    Integer yearTmp = year + 1900;
                    String  szYear  = yearTmp.toString();

                    Integer month = MapUtils.getInteger(map2, "month" );
                    Integer monthTmp = month+1;
                    String  szMonth = monthTmp.toString();

                    String date = MapUtils.getString(map2, "date" );

                    String hour = MapUtils.getString(map2, "hours" );
                    String minutes = MapUtils.getString(map2, "minutes" );
                    String seconds = MapUtils.getString(map2, "seconds" );

                    lineData.setTIME_STATISTIC( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );


                    String devNetBase_STA_NUMDISC_II = MapUtils.getString(map1, Integer.toString(15) );
                    lineData.setSTA_NUMDISC_II(devNetBase_STA_NUMDISC_II);
                    System.out.println(devNetBase_STA_NUMDISC_II);

                    String devNetBase_STA_RATIODISC_II 	= MapUtils.getString(map1, Integer.toString(16) );
                    lineData.setSTA_RATIODISC_II(devNetBase_STA_RATIODISC_II);
                    System.out.println(devNetBase_STA_RATIODISC_II);

                    String devNetBase_STA_NUMPLAN 	= MapUtils.getString(map1, Integer.toString(17) );
                    lineData.setSTA_NUMPLAN(devNetBase_STA_NUMPLAN);
                    System.out.println(devNetBase_STA_NUMPLAN);

                    String devNetBase_NET_TYPE = MapUtils.getString(map1, Integer.toString(18) );
                    lineData.setNET_TYPE(devNetBase_NET_TYPE);
                    System.out.println(devNetBase_NET_TYPE);

                    String devNetBase_JUNIORID = MapUtils.getString(map1, Integer.toString(19) );
                    lineData.setJUNIORID(devNetBase_JUNIORID);
                    System.out.println(devNetBase_JUNIORID);

                    lstItems_TotalSubstationSta.add(lineData);
                }
            }


        }catch(Exception e)
        {
            System.out.println(e.getMessage()) ;
            List<TotalSubstationStatisticsItem>  lstItems_TotalSubstationSta1 = new ArrayList<TotalSubstationStatisticsItem>();
            return lstItems_TotalSubstationSta1;
        }
        return lstItems_TotalSubstationSta;
    }
    public List<Substation> parseJsonUrl2(String jsonData)
    {
        List<Substation>  lstItems_SubStation = new ArrayList<Substation>();
        try{
            //String jsonData = "{\"COLUMDESC\":[{\"1\":\"MANUFACTURE\",\"2\":\"STATION_NUM_I\",\"3\":\"STATION_NUM_II\",\"4\":\"RATIO_STA\"}],\"1\":[{\"1\":\"上海泽鑫 \",\"2\":3,\"3\":3,\"4\":75}],\"2\":[{\"1\":\"北京四方 \"}],\"3\":[{\"1\":\"国电南思 \"}],\"4\":[{\"1\":\"南瑞继保 \",\"2\":1,\"3\":1,\"4\":25}],\"5\":[{\"1\":\"南瑞科技 \"}],\"6\":[{\"1\":\"上海许继 \"}],\"7\":[{\"1\":\"许继电气 \"}],\"8\":[{\"1\":\"航天银山 \"}],\"9\":[{\"1\":\"成都府河 \"}],\"10\":[{\"1\":\"湘能智能 \"}],\"11\":[{\"1\":\"中元华电 \"}],\"12\":[{\"1\":\"国电南自 \"}],\"13\":[{\"1\":\"长园深瑞 \"}],\"14\":[{\"1\":\"上海拓森 \"}],\"15\":[{\"1\":\"山大电力 \"}]}";
            System.out.println(jsonData);
            Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
            System.out.println("===================================================");
            System.out.println(map);

            System.out.println("line Number : " + Integer.toString(map.size() - 1 ));

            for( int i = 0; i < map.size(); i++)
            {
                System.out.println("===================================================");
                if( 0 == i )
                {
                    System.out.println("表列属性介绍如下：");
                    String desc = MapUtils.getString(map, "COLUMDESC");
                    String descItem = "COLUMDESC  :::: ";

                    System.out.println(descItem + desc);

                    int len = desc.length();
                    String szValue = desc.substring(1, len-1);

                    Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
                    System.out.println(map1);

                }else{
                    String szInfo = 	"第";
                    szInfo 		  += 	Integer.toString(i);
                    szInfo 		  += 	"行数据如下：";

                    System.out.println(szInfo);

                    String value = MapUtils.getString(map, Integer.toString(i) );
                    System.out.println(value);

                    int len = value.length();
                    String szValue = value.substring(1, len-1);

                    System.out.println(szValue);

                    Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
                    System.out.println(map1);

                    //MANUFACTURE","2":"STATION_NUM_I","3":"STATION_NUM_II","4":"RATIO_STA"
                    Substation lineData 	    = 	new Substation();
                    String szMANUFACTURE		= 	MapUtils.getString(map1, Integer.toString(1) );
                    lineData.setMANUFACTURE(szMANUFACTURE);
                    String szSTATION_NUM_I 	    =	MapUtils.getString(map1, Integer.toString(2) );
                    lineData.setSTATION_NUM_I(szSTATION_NUM_I);
                    String szSTATION_NUM_II 	=	MapUtils.getString(map1, Integer.toString(3) );
                    lineData.setSTATION_NUM_II(szSTATION_NUM_II);
                    String szRATIO_STA 		    =	MapUtils.getString(map1, Integer.toString(4) );
                    lineData.setRATIO_STA(szRATIO_STA);

                    lstItems_SubStation.add(lineData);

                }
            }


        }catch(Exception e)
        {
            System.out.println(e.getMessage()) ;

            List<Substation>  lstItems_SubStation1 = new ArrayList<Substation>();
            return lstItems_SubStation1;
        }

        return lstItems_SubStation;
    }
    public List<FaultShortenData> parseJsonUrl3(String jsonData)
    {

        List<FaultShortenData>  lstItems_FaultShortenData = new ArrayList<FaultShortenData>();
        try{
           // String jsonData = "{\"COLUMDESC\":[{\"1\":\"ID\",\"2\":\"CASENAME\",\"3\":\"PRIDEVICEID\",\"4\":\"FAULTTIME\",\"5\":\"FAULTLOCATION\",\"6\":\"FAULTTYPE\",\"7\":\"STATION1_ID\",\"8\":\"STATION2_ID\",\"9\":\"EVENTLEVEL\",\"10\":\"REVERSE1\",\"11\":\"REVERSE2\",\"12\":\"REVERSE3\",\"13\":\"REVERSE4\",\"14\":\"FAULTMSTIME\",\"15\":\"TYPICALCASE\",\"16\":\"FIS_PATH\",\"17\":\"OVERHAUL_FLAG\",\"18\":\"REVERSE5\",\"19\":\"REVERSE6\",\"20\":\"REVERSE7\",\"21\":\"ISACT_CORRECTLY\",\"22\":\"PRMDEV_TYPE\",\"23\":\"FAULT_REASON\",\"24\":\"PACKEG_TIME\",\"25\":\"REPORTFILE\",\"26\":\"KEY_PTID\",\"27\":\"KEY_RECVTIME\",\"28\":\"REALFAULT_BASE\",\"29\":\"PRIDEVICEID2\",\"30\":\"RECORDTIME\",\"31\":\"COMPLETED\",\"32\":\"VOLTAGE\"}],\"1\":[{\"1\":749,\"2\":\"20170705134256 220kV二号主变故障\",\"3\":\"兰家ZB40003\",\"4\":\"20170705134256\",\"5\":\" \",\"6\":0,\"7\":\"兰家\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"NULL\",\"14\":203,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":6,\"23\":\"NULL\",\"24\":\"20170705133752\",\"25\":\"兰家/reportfile/20170705134256_749.xml\",\"26\":\"兰家BH10032\",\"27\":\"20170705134257\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":5,\"day\":3,\"hours\":13,\"minutes\":44,\"month\":6,\"nanos\":0,\"seconds\":13,\"time\":1499233453000,\"timezoneOffset\":-480,\"year\":117},\"31\":0,\"32\":1000}],\"2\":[{\"1\":748,\"2\":\"20170705134256 220kV一号主变故障\",\"3\":\"兰家ZB40002\",\"4\":\"20170705134256\",\"5\":\" \",\"6\":0,\"7\":\"兰家\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"NULL\",\"14\":202,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":6,\"23\":\"NULL\",\"24\":\"20170705133752\",\"25\":\"兰家/reportfile/20170705134256_748.xml\",\"26\":\"兰家BH10028\",\"27\":\"20170705134256\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":5,\"day\":3,\"hours\":13,\"minutes\":44,\"month\":6,\"nanos\":0,\"seconds\":13,\"time\":1499233453000,\"timezoneOffset\":-480,\"year\":117},\"31\":0,\"32\":1000}],\"3\":[{\"1\":747,\"2\":\"20170704161923 220kV历京线2218故障\",\"3\":\"京诚XL20001\",\"4\":\"20170704161923\",\"5\":\" \",\"6\":0,\"7\":\"京诚\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"NULL\",\"14\":359,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":2,\"23\":\"NULL\",\"24\":\"20170704161423\",\"25\":\"京诚/reportfile/20170704161923_747.xml\",\"26\":\"京诚BH10021\",\"27\":\"20170704161824\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":4,\"day\":2,\"hours\":16,\"minutes\":20,\"month\":6,\"nanos\":0,\"seconds\":36,\"time\":1499156436000,\"timezoneOffset\":-480,\"year\":117},\"31\":1,\"32\":220}],\"4\":[{\"1\":745,\"2\":\"20170703205256 220kV二号主变故障\",\"3\":\"兰家ZB40003\",\"4\":\"20170703205256\",\"5\":\" \",\"6\":0,\"7\":\"兰家\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"NULL\",\"14\":281,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":6,\"23\":\"NULL\",\"24\":\"20170703204755\",\"25\":\"兰家/reportfile/20170703205256_745.xml\",\"26\":\"兰家BH10032\",\"27\":\"20170703205256\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":3,\"day\":1,\"hours\":20,\"minutes\":54,\"month\":6,\"nanos\":0,\"seconds\":0,\"time\":1499086440000,\"timezoneOffset\":-480,\"year\":117},\"31\":0,\"32\":1000}],\"5\":[{\"1\":744,\"2\":\"20170702011020 220kV历京线2218故障\",\"3\":\"京诚XL20001\",\"4\":\"20170702011020\",\"5\":\" \",\"6\":0,\"7\":\"京诚\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"NULL\",\"14\":258,\"15\":0,\"16\":\"NULL\",\"17\":0,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":2,\"23\":\"NULL\",\"24\":\"20170702010520\",\"25\":\"京诚/reportfile/20170702011020_744.xml\",\"26\":\"京诚BH10021\",\"27\":\"20170702010920\",\"28\":0,\"29\":\"NULL\",\"30\":{\"date\":2,\"day\":0,\"hours\":1,\"minutes\":11,\"month\":6,\"nanos\":0,\"seconds\":42,\"time\":1498929102000,\"timezoneOffset\":-480,\"year\":117},\"31\":1,\"32\":220}],\"6\":[{\"1\":734,\"2\":\"20170701232055 220kV历京线2218故障\",\"3\":\"京诚XL20001\",\"4\":\"20170701232055\",\"5\":\" \",\"6\":0,\"7\":\"京诚\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"NULL\",\"14\":1,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":2,\"23\":\"NULL\",\"24\":\"20170701231554\",\"25\":\"京诚/reportfile/20170701232055_734.xml\",\"26\":\"京诚BH10022\",\"27\":\"20170701231954\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":1,\"day\":6,\"hours\":23,\"minutes\":22,\"month\":6,\"nanos\":0,\"seconds\":1,\"time\":1498922521000,\"timezoneOffset\":-480,\"year\":117},\"31\":1,\"32\":220}],\"7\":[{\"1\":737,\"2\":\"20170701232055 220kV二号主变故障\",\"3\":\"兰家ZB40003\",\"4\":\"20170701232055\",\"5\":\" \",\"6\":0,\"7\":\"兰家\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"20170701231554\",\"14\":792,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":6,\"23\":\"NULL\",\"24\":\"20170701231554\",\"25\":\"兰家/reportfile/20170701232055_737.xml\",\"26\":\"兰家BH10031\",\"27\":\"20170701232054\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":1,\"day\":6,\"hours\":23,\"minutes\":22,\"month\":6,\"nanos\":0,\"seconds\":1,\"time\":1498922521000,\"timezoneOffset\":-480,\"year\":117},\"31\":0,\"32\":1000}],\"8\":[{\"1\":736,\"2\":\"20170701232055 220kV兰丁线故障\",\"3\":\"兰家XL20018\",\"4\":\"20170701232055\",\"5\":\" \",\"6\":0,\"7\":\"兰家\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"20170701231554\",\"14\":798,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":2,\"23\":\"NULL\",\"24\":\"20170701231554\",\"25\":\"兰家/reportfile/20170701232055_736.xml\",\"26\":\"兰家BH10042\",\"27\":\"20170701232054\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":1,\"day\":6,\"hours\":23,\"minutes\":22,\"month\":6,\"nanos\":0,\"seconds\":1,\"time\":1498922521000,\"timezoneOffset\":-480,\"year\":117},\"31\":0,\"32\":220}],\"9\":[{\"1\":735,\"2\":\"20170701232055 220kV兰首线故障\",\"3\":\"兰家XL20015\",\"4\":\"20170701232055\",\"5\":\" \",\"6\":0,\"7\":\"兰家\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"20170701231554\",\"14\":40,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":2,\"23\":\"NULL\",\"24\":\"20170701231554\",\"25\":\"兰家/reportfile/20170701232055_735.xml\",\"26\":\"兰家BH10035\",\"27\":\"20170701232054\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":1,\"day\":6,\"hours\":23,\"minutes\":22,\"month\":6,\"nanos\":0,\"seconds\":1,\"time\":1498922521000,\"timezoneOffset\":-480,\"year\":117},\"31\":0,\"32\":220}],\"10\":[{\"1\":743,\"2\":\"20170701232055 220kV兰嵋二线故障\",\"3\":\"兰家XL20020\",\"4\":\"20170701232055\",\"5\":\" \",\"6\":0,\"7\":\"兰家\",\"8\":\"未接入\",\"9\":1,\"10\":\"NULL\",\"11\":\"NULL\",\"12\":\"NULL\",\"13\":\"20170701231608\",\"14\":805,\"15\":0,\"16\":\"NULL\",\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":2,\"23\":\"NULL\",\"24\":\"20170701231608\",\"25\":\"兰家/reportfile/20170701232055_743.xml\",\"26\":\"兰家BH10047\",\"27\":\"20170701232107\",\"28\":5,\"29\":\"NULL\",\"30\":{\"date\":1,\"day\":6,\"hours\":23,\"minutes\":22,\"month\":6,\"nanos\":0,\"seconds\":23,\"time\":1498922543000,\"timezoneOffset\":-480,\"year\":117},\"31\":0,\"32\":220}]}";

            System.out.println(jsonData);

            Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
            System.out.println("===================================================");
            System.out.println(map);

            System.out.println("line Number : " + Integer.toString(map.size() - 1 ));

            for( int i = 0; i < map.size(); i++)
            {
                System.out.println("===================================================");
                if( 0 == i )
                {
                    System.out.println("表列属性介绍如下：");
                    String desc = MapUtils.getString(map, "COLUMDESC");
                    String descItem = "COLUMDESC  :::: ";

                    System.out.println(descItem + desc);

                    int len = desc.length();
                    String szValue = desc.substring(1, len-1);

                    Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
                    System.out.println(map1);

                }else{
                    String szInfo = 	"第";
                    szInfo 		  += 	Integer.toString(i);
                    szInfo 		  += 	"行数据如下：";

                    System.out.println(szInfo);

                    String value = MapUtils.getString(map, Integer.toString(i) );
                    System.out.println(value);

                    int len = value.length();
                    String szValue = value.substring(1, len-1);

                    System.out.println(szValue);

                    Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
                    System.out.println(map1);

                    //"1":"ID","2":"CASENAME","3":"PRIDEVICEID","4":"FAULTTIME","5":"FAULTLOCATION","6":"FAULTTYPE",
                    //"7":"STATION1_ID","8":"STATION2_ID","9":"EVENTLEVEL","10":"REVERSE1","11":"REVERSE2","12":"REVERSE3",
                    //"13":"REVERSE4","14":"FAULTMSTIME","15":"TYPICALCASE","16":"FIS_PATH","17":"OVERHAUL_FLAG",
                    //"18":"REVERSE5","19":"REVERSE6","20":"REVERSE7","21":"ISACT_CORRECTLY","22":"PRMDEV_TYPE",
                    //"23":"FAULT_REASON","24":"PACKEG_TIME","25":"REPORTFILE","26":"KEY_PTID","27":"KEY_RECVTIME",
                    //"28":"REALFAULT_BASE","29":"PRIDEVICEID2","30":"RECORDTIME","31":"COMPLETED","32":"VOLTAGE"

                    FaultShortenData lineData 	    = 	new FaultShortenData();
                    String ID		= 	MapUtils.getString(map1, Integer.toString(1) );
                    lineData.setID(ID);
                    String CASENAME 	    =	MapUtils.getString(map1, Integer.toString(2) );
                    lineData.setCASENAME(CASENAME);

                    String PRIDEVICEID 	=	MapUtils.getString(map1, Integer.toString(3) );
                    lineData.setPRIDEVICEID(PRIDEVICEID);
                    String FAULTTIME 		    =	MapUtils.getString(map1, Integer.toString(4) );
                    lineData.setFAULTTIME(FAULTTIME);
                    String FAULTLOCATION		= 	MapUtils.getString(map1, Integer.toString(5) );
                    lineData.setFAULTLOCATION(FAULTLOCATION);
                    String FAULTTYPE 	    =	MapUtils.getString(map1, Integer.toString(6) );
                    lineData.setFAULTTYPE(FAULTTYPE);
                    String STATION1_ID 	=	MapUtils.getString(map1, Integer.toString(7) );
                    lineData.setSTATION1_ID(STATION1_ID);
                    String STATION2_ID		= 	MapUtils.getString(map1, Integer.toString(8) );
                    lineData.setSTATION2_ID(STATION2_ID);
                    String EVENTLEVEL 	    =	MapUtils.getString(map1, Integer.toString(9) );
                    lineData.setEVENTLEVEL(EVENTLEVEL);
                    String REVERSE1 	=	MapUtils.getString(map1, Integer.toString(10) );
                    lineData.setREVERSE1(REVERSE1);
                    String REVERSE2 		    =	MapUtils.getString(map1, Integer.toString(11) );
                    lineData.setREVERSE2(REVERSE2);
                    String REVERSE3		= 	MapUtils.getString(map1, Integer.toString(12) );
                    lineData.setREVERSE3(REVERSE3);
                    String REVERSE4 	    =	MapUtils.getString(map1, Integer.toString(13) );
                    lineData.setREVERSE4(REVERSE4);
                    String FAULTMSTIME 	=	MapUtils.getString(map1, Integer.toString(14) );
                    lineData.setFAULTMSTIME(FAULTMSTIME);
                    String TYPICALCASE 		    =	MapUtils.getString(map1, Integer.toString(15) );
                    lineData.setTYPICALCASE(TYPICALCASE);
                    String FIS_PATH		= 	MapUtils.getString(map1, Integer.toString(16) );
                    lineData.setFIS_PATH(FIS_PATH);
                    String OVERHAUL_FLAG 	    =	MapUtils.getString(map1, Integer.toString(17) );
                    lineData.setOVERHAUL_FLAG(OVERHAUL_FLAG);
                    String REVERSE5 	=	MapUtils.getString(map1, Integer.toString(18) );
                    lineData.setREVERSE5(REVERSE5);
                    String REVERSE6 		    =	MapUtils.getString(map1, Integer.toString(19) );
                    lineData.setREVERSE6(REVERSE6);
                    String REVERSE7 		    =	MapUtils.getString(map1, Integer.toString(20) );
                    lineData.setREVERSE7(REVERSE7);
                    String ISACT_CORRECTLY		= 	MapUtils.getString(map1, Integer.toString(21) );
                    lineData.setISACT_CORRECTLY(ISACT_CORRECTLY);
                    String PRMDEV_TYPE 	    =	MapUtils.getString(map1, Integer.toString(22) );
                    lineData.setPRMDEV_TYPE(PRMDEV_TYPE);
                    String FAULT_REASON 	=	MapUtils.getString(map1, Integer.toString(23) );
                    lineData.setFAULT_REASON(FAULT_REASON);
                    String PACKEG_TIME 		    =	MapUtils.getString(map1, Integer.toString(24) );
                    lineData.setPACKEG_TIME(PACKEG_TIME);
                    String REPORTFILE		= 	MapUtils.getString(map1, Integer.toString(25) );
                    lineData.setREPORTFILE(REPORTFILE);
                    String KEY_PTID 	    =	MapUtils.getString(map1, Integer.toString(26) );
                    lineData.setKEY_PTID(KEY_PTID);
                    String KEY_RECVTIME 	=	MapUtils.getString(map1, Integer.toString(27) );
                    lineData.setKEY_RECVTIME(KEY_RECVTIME);
                    String REALFAULT_BASE 		    =	MapUtils.getString(map1, Integer.toString(28) );
                    lineData.setREALFAULT_BASE(REALFAULT_BASE);
                    String PRIDEVICEID2 		    =	MapUtils.getString(map1, Integer.toString(29) );
                    lineData.setPRIDEVICEID2(PRIDEVICEID2);
                    String RECORDTIME 		    =	MapUtils.getString(map1, Integer.toString(30) );

                    String tmp = RECORDTIME;
                    Map<String, Object> map2 = JsonUtil.convertJsonStrToMap(tmp);
                    System.out.println(map2);
                    Integer year = MapUtils.getInteger(map2, "year" );
                    Integer yearTmp = year + 1900;
                    String  szYear  = yearTmp.toString();

                    Integer month = MapUtils.getInteger(map2, "month" );
                    Integer monthTmp = month+1;
                    String  szMonth = monthTmp.toString();

                    String date = MapUtils.getString(map2, "date" );

                    String hour = MapUtils.getString(map2, "hours" );
                    String minutes = MapUtils.getString(map2, "minutes" );
                    String seconds = MapUtils.getString(map2, "seconds" );

                    lineData.setRECORDTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

                    String COMPLETED 		    =	MapUtils.getString(map1, Integer.toString(31) );
                    lineData.setCOMPLETED(COMPLETED);
                    String VOLTAGE 		    =	MapUtils.getString(map1, Integer.toString(32) );
                    lineData.setVOLTAGE(VOLTAGE);


                    lstItems_FaultShortenData.add(lineData);
                }
            }


        }catch(Exception e)
        {
            System.out.println(e.getMessage()) ;

            List<FaultShortenData>  lstItems_FaultShortenData1 = new ArrayList<FaultShortenData>();

            return lstItems_FaultShortenData1;
        }

        return lstItems_FaultShortenData;
    }
    public List<DevStation> parseJsonUrl4(String jsonData)
    {
        List<DevStation>  lstItems_DevStation = new ArrayList<DevStation>();
		try{
			//String jsonData = "{\"COLUMDESC\":[{\"1\":\"NAME\",\"2\":\"AREA_ID\",\"3\":\"RUN_STATUS\",\"4\":\"RUNSTATUSTIME\",\"5\":\"CH0_COMMU_REASON\",\"6\":\"CH1_COMMU_REASON\",\"7\":\"MANUFACTURER\",\"8\":\"DEV_NUMTOTAL\",\"9\":\"DEV_NUMDISC\"}],\"1\":[{\"1\":\"兰家变\",\"2\":\"辽阳\",\"3\":2,\"4\":{\"date\":23,\"day\":5,\"hours\":18,\"minutes\":27,\"month\":8,\"nanos\":0,\"seconds\":32,\"time\":1474626452000,\"timezoneOffset\":-480,\"year\":116},\"5\":0,\"6\":4,\"7\":\"上海泽鑫\",\"8\":22,\"9\":0}],\"2\":[{\"1\":\"京诚变\",\"2\":\"营口\",\"3\":2,\"4\":{\"date\":29,\"day\":6,\"hours\":10,\"minutes\":58,\"month\":9,\"nanos\":0,\"seconds\":39,\"time\":1477709919000,\"timezoneOffset\":-480,\"year\":116},\"5\":0,\"6\":0,\"7\":\"上海泽鑫\",\"8\":23,\"9\":0}],\"3\":[{\"1\":\"蟠龙变\",\"2\":\"营口\",\"3\":2,\"4\":{\"date\":22,\"day\":4,\"hours\":18,\"minutes\":20,\"month\":8,\"nanos\":0,\"seconds\":8,\"time\":1474539608000,\"timezoneOffset\":-480,\"year\":116},\"5\":0,\"6\":0,\"7\":\"上海泽鑫\",\"8\":22,\"9\":0}],\"4\":[{\"1\":\"榆州变\",\"2\":\"朝阳局\",\"3\":4,\"4\":{\"date\":9,\"day\":1,\"hours\":10,\"minutes\":55,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1483930539000,\"timezoneOffset\":-480,\"year\":117},\"5\":4,\"6\":0,\"7\":\"南瑞继保\",\"8\":20,\"9\":2}],\"5\":[{\"1\":\"保国变\",\"2\":\"就地\",\"3\":2,\"4\":{\"date\":28,\"day\":3,\"hours\":14,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":12,\"time\":1482906252000,\"timezoneOffset\":-480,\"year\":116},\"5\":0,\"6\":0,\"7\":\"南瑞继保\",\"8\":2,\"9\":0}]}";

			System.out.println(jsonData);

	        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
	        System.out.println("===================================================");
	        System.out.println(map);

	        System.out.println("line Number : " + Integer.toString(map.size() - 1 ));




	        for( int i = 0; i < map.size(); i++)
	        {
	        	System.out.println("===================================================");
	        	if( 0 == i )
	        	{
	        		System.out.println("表列属性介绍如下：");
	        		String desc = MapUtils.getString(map, "COLUMDESC");
	        		String descItem = "COLUMDESC  :::: ";

	        		System.out.println(descItem + desc);

	        		int len = desc.length();
	        	    String szValue = desc.substring(1, len-1);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        	}else{
	        		String szInfo = 	"第";
	        		szInfo 		  += 	Integer.toString(i);
	        		szInfo 		  += 	"行数据如下：";

	        		System.out.println(szInfo);

	                String value = MapUtils.getString(map, Integer.toString(i) );
	        		System.out.println(value);

	        		int len = value.length();
	        	    String szValue = value.substring(1, len-1);

	        	    System.out.println(szValue);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        		//"1\":\"NAME\",\"2\":\"AREA_ID\",\"3\":\"RUN_STATUS\",\"4\":\"RUNSTATUSTIME\",
	        		//\"5\":\"CH0_COMMU_REASON\",\"6\":\"CH1_COMMU_REASON\",\"7\":\"MANUFACTURER\",\"8\":\"DEV_NUMTOTAL\",\"9\":\"DEV_NUMDISC
	        		DevStation lineData 	    = 	new DevStation();

	        		String NAME		= 	MapUtils.getString(map1, Integer.toString(1) );
	        		lineData.setNAME(NAME);
	        		String AREA_ID 	    =	MapUtils.getString(map1, Integer.toString(2) );
	        		lineData.setAREA_ID(AREA_ID);
	        		String RUN_STATUS 	=	MapUtils.getString(map1, Integer.toString(3) );
	        		lineData.setRUN_STATUS(RUN_STATUS);
	        		String RUNSTATUSTIME 		    =	MapUtils.getString(map1, Integer.toString(4) );

	           		String tmp = RUNSTATUSTIME;
	        		Map<String, Object> map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		Integer year = MapUtils.getInteger(map2, "year" );
	        		Integer yearTmp = year + 1900;
	        		String  szYear  = yearTmp.toString();

	        		Integer month = MapUtils.getInteger(map2, "month" );
	        		Integer monthTmp = month+1;
	        		String  szMonth = monthTmp.toString();

	        		String date = MapUtils.getString(map2, "date" );

	        		String hour = MapUtils.getString(map2, "hours" );
	        		String minutes = MapUtils.getString(map2, "minutes" );
	        		String seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setRUNSTATUSTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String CH0_COMMU_REASON		= 	MapUtils.getString(map1, Integer.toString(5) );
	        		lineData.setCH0_COMMU_REASON(CH0_COMMU_REASON);
	        		String CH1_COMMU_REASON 	    =	MapUtils.getString(map1, Integer.toString(6) );
	        		lineData.setCH1_COMMU_REASON(CH1_COMMU_REASON);
	        		String MANUFACTURER 	=	MapUtils.getString(map1, Integer.toString(7) );
	        		lineData.setMANUFACTURER(MANUFACTURER);
	        		String DEV_NUMTOTAL		= 	MapUtils.getString(map1, Integer.toString(8) );
	        		lineData.setDEV_NUMTOTAL(DEV_NUMTOTAL);
	        		String DEV_NUMDISC 	    =	MapUtils.getString(map1, Integer.toString(9) );
	        		lineData.setDEV_NUMDISC(DEV_NUMDISC);

	        		lstItems_DevStation.add(lineData);
	        	}
	        }
			}catch(Exception e)
			{
				System.out.println(e.getMessage()) ;
                List<DevStation>  lstItems_DevStation1 = new ArrayList<DevStation>();
                return lstItems_DevStation1;
	    	}
	    	return lstItems_DevStation;
    }
    public List<SecDev> parseJsonUrl5(String jsonData)
    {
        List<SecDev>  lstItems_SecDev = new ArrayList<SecDev>();
		try{
			//String jsonData = "{\"COLUMDESC\":[{\"1\":\"PT_ID\",\"2\":\"URI\",\"3\":\"NAME\",\"4\":\"TYPE\",\"5\":\"KIND\",\"6\":\"MODEL\",\"7\":\"SYSVERSION\",\"8\":\"DEV_TIME\",\"9\":\"CRC\",\"10\":\"RUN_STATUS\",\"11\":\"STATION_ID\",\"12\":\"PRIMDEV_ID\",\"13\":\"PRIMDEV_TYPE\",\"14\":\"101ADDR\",\"15\":\"103ADDR\",\"16\":\"103GROUP\",\"17\":\"103ITEM\",\"18\":\"REVERSE1\",\"19\":\"REVERSE2\",\"20\":\"REVERSE3\",\"21\":\"COMMU_STATUS\",\"22\":\"COMMSTATUSTIME\",\"23\":\"RUNSTATUSTIME\",\"24\":\"COMMU_TYPE\",\"25\":\"61850SERVER_NAME\",\"26\":\"MRID\",\"27\":\"SUSPENDSTATUS\",\"28\":\"SUSPENDREASON\",\"29\":\"ALARMBAYNAME\",\"30\":\"ALARMDEVNAME\",\"31\":\"KINDSEQ\",\"32\":\"VOLTAGE_GRADE\",\"33\":\"CTRLENABLE\",\"34\":\"DOMAIN_FLAG\",\"35\":\"LOCK_FLAG\",\"36\":\"ABNORMAL_FLAG\",\"37\":\"EVENT_FLAG\",\"38\":\"TM_LASTACT\",\"39\":\"TM_LASTOSC\",\"40\":\"TM_LASTEVENT\",\"41\":\"TM_LASTDIGIT\",\"42\":\"ALARM_OVERLMT\",\"43\":\"ACTION_OVERLMT\",\"44\":\"DICHANGE_OVERLMT\",\"45\":\"OSC_OVERLMT\",\"46\":\"TM_LASTSETTING\",\"47\":\"TM_LASTSOFT\",\"48\":\"TM_LASTANALOG\"}],\"1\":[{\"1\":\"蟠龙BH001\",\"2\":\"NULL\",\"3\":\"营口220kV蟠龙变device\",\"4\":0,\"5\":\"NULL\",\"6\":\"NULL\",\"7\":\"NULL\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"NULL\",\"13\":9,\"14\":0,\"15\":1,\"16\":90,\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":12,\"month\":10,\"nanos\":0,\"seconds\":12,\"time\":1479265932000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":49,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479264566000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"15955133441\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":0,\"34\":2,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116}}],\"2\":[{\"1\":\"蟠龙BH002\",\"2\":\"NULL\",\"3\":\"220kV故障录波器WDGL-V\",\"4\":9,\"5\":\"NULL\",\"6\":\"WDGL-V\",\"7\":\"1.0\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"NULL\",\"13\":11,\"14\":0,\"15\":2,\"16\":90,\"17\":2,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":12,\"month\":10,\"nanos\":0,\"seconds\":12,\"time\":1479265932000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":49,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479264566000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"15955133442\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":0,\"34\":2,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":3,\"day\":2,\"hours\":18,\"minutes\":42,\"month\":0,\"nanos\":0,\"seconds\":14,\"time\":1483440134000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":2,\"day\":0,\"hours\":0,\"minutes\":54,\"month\":6,\"nanos\":0,\"seconds\":4,\"time\":1498928044000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":22,\"day\":4,\"hours\":15,\"minutes\":9,\"month\":5,\"nanos\":0,\"seconds\":15,\"time\":1498115355000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":26,\"time\":1479280466000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":22,\"day\":4,\"hours\":15,\"minutes\":10,\"month\":5,\"nanos\":0,\"seconds\":4,\"time\":1498115404000,\"timezoneOffset\":-480,\"year\":117}}],\"3\":[{\"1\":\"蟠龙BH10001\",\"2\":\"NULL\",\"3\":\"营口220kV蟠龙变device\",\"4\":0,\"5\":\"NULL\",\"6\":\"Z2000\",\"7\":\"V1.0.0.5\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"未知\",\"13\":9,\"14\":0,\"15\":1,\"16\":90,\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978625\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116}}],\"4\":[{\"1\":\"蟠龙BH10002\",\"2\":\"NULL\",\"3\":\"220kV母差保护BP-2B\",\"4\":1,\"5\":\"NULL\",\"6\":\"BP-2B\",\"7\":\"2.036\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙MX10001\",\"13\":1,\"14\":0,\"15\":2,\"16\":90,\"17\":2,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978626\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":25,\"day\":5,\"hours\":16,\"minutes\":50,\"month\":10,\"nanos\":0,\"seconds\":38,\"time\":1480063838000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":25,\"day\":5,\"hours\":16,\"minutes\":40,\"month\":10,\"nanos\":0,\"seconds\":12,\"time\":1480063212000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116}}],\"5\":[{\"1\":\"蟠龙BH10003\",\"2\":\"NULL\",\"3\":\"220kV母联保护PRS-723A\",\"4\":5,\"5\":\"NULL\",\"6\":\"PRS-723A\",\"7\":\"3.10\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙KG30001\",\"13\":3,\"14\":0,\"15\":3,\"16\":90,\"17\":3,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":19,\"day\":6,\"hours\":15,\"minutes\":33,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479540780000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978627\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":19,\"day\":6,\"hours\":6,\"minutes\":50,\"month\":10,\"nanos\":0,\"seconds\":35,\"time\":1479509435000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":14,\"minutes\":50,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1485413403000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":5,\"day\":1,\"hours\":10,\"minutes\":56,\"month\":11,\"nanos\":0,\"seconds\":6,\"time\":1480906566000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":22,\"day\":2,\"hours\":18,\"minutes\":17,\"month\":10,\"nanos\":0,\"seconds\":41,\"time\":1479809861000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479280471000,\"timezoneOffset\":-480,\"year\":116}}],\"6\":[{\"1\":\"蟠龙BH10004\",\"2\":\"NULL\",\"3\":\"220kV桥蟠一线第一套保护PCS-931BM\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931BM\",\"7\":\"1.00\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479280473000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙XL20001\",\"13\":2,\"14\":0,\"15\":4,\"16\":90,\"17\":4,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978628\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":14,\"time\":1481697074000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":17,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1485421698000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479280473000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":5,\"hours\":9,\"minutes\":48,\"month\":11,\"nanos\":0,\"seconds\":52,\"time\":1482457732000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":28,\"time\":1489115968000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":17,\"month\":2,\"nanos\":0,\"seconds\":50,\"time\":1489119470000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":19,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479611971000,\"timezoneOffset\":-480,\"year\":116}}],\"7\":[{\"1\":\"蟠龙BH10005\",\"2\":\"NULL\",\"3\":\"220kV桥蟠一线第二套保护PCS-931BM\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931BM\",\"7\":\"1.00\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":34,\"time\":1479280474000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙XL20001\",\"13\":2,\"14\":0,\"15\":5,\"16\":90,\"17\":5,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978629\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":14,\"time\":1481697074000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":17,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1485421698000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":34,\"time\":1479280474000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":19,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479611998000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":20,\"time\":1489115960000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":8,\"time\":1489119488000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":19,\"month\":10,\"nanos\":0,\"seconds\":46,\"time\":1479611986000,\"timezoneOffset\":-480,\"year\":116}}],\"8\":[{\"1\":\"蟠龙BH10006\",\"2\":\"NULL\",\"3\":\"220kV桥蟠一线2223断路器保护PCS-923A\",\"4\":5,\"5\":\"NULL\",\"6\":\"PCS-923A\",\"7\":\"1.00\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":36,\"time\":1479280476000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙KG30002\",\"13\":3,\"14\":0,\"15\":6,\"16\":90,\"17\":6,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978630\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":36,\"time\":1479280476000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":14,\"minutes\":39,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1485412750000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":36,\"time\":1479280476000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":31,\"month\":10,\"nanos\":0,\"seconds\":5,\"time\":1479612665000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":34,\"time\":1489115914000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":9,\"time\":1489119489000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":31,\"month\":10,\"nanos\":0,\"seconds\":13,\"time\":1479612673000,\"timezoneOffset\":-480,\"year\":116}}],\"9\":[{\"1\":\"蟠龙BH10007\",\"2\":\"NULL\",\"3\":\"220kV桥蟠二线第一套保护PCS-931BM\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931BM\",\"7\":\"1.00\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":37,\"time\":1479280477000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙XL20002\",\"13\":2,\"14\":0,\"15\":7,\"16\":90,\"17\":7,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978631\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":19,\"day\":6,\"hours\":6,\"minutes\":50,\"month\":10,\"nanos\":0,\"seconds\":32,\"time\":1479509432000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":17,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1485421698000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":37,\"time\":1479280477000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":9,\"day\":5,\"hours\":16,\"minutes\":2,\"month\":11,\"nanos\":0,\"seconds\":8,\"time\":1481270528000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489115973000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":11,\"time\":1489119491000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":9,\"day\":5,\"hours\":16,\"minutes\":2,\"month\":11,\"nanos\":0,\"seconds\":34,\"time\":1481270554000,\"timezoneOffset\":-480,\"year\":116}}],\"10\":[{\"1\":\"蟠龙BH10008\",\"2\":\"NULL\",\"3\":\"220kV桥蟠二线第二套保护PCS-931BM\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931BM\",\"7\":\"1.00\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":39,\"time\":1479280479000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙XL20002\",\"13\":2,\"14\":0,\"15\":8,\"16\":90,\"17\":8,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978632\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":19,\"day\":6,\"hours\":8,\"minutes\":28,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479515313000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":17,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1485421698000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":39,\"time\":1479280479000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":24,\"month\":10,\"nanos\":0,\"seconds\":22,\"time\":1479612262000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":42,\"time\":1489115982000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":11,\"time\":1489119491000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":24,\"month\":10,\"nanos\":0,\"seconds\":28,\"time\":1479612268000,\"timezoneOffset\":-480,\"year\":116}}],\"11\":[{\"1\":\"蟠龙BH10009\",\"2\":\"NULL\",\"3\":\"220kV桥蟠二线2224断路器保护PCS-923A\",\"4\":5,\"5\":\"NULL\",\"6\":\"PCS-923A\",\"7\":\"1.00\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":40,\"time\":1479280480000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙KG30003\",\"13\":3,\"14\":0,\"15\":9,\"16\":90,\"17\":9,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978633\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":40,\"time\":1479280480000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":40,\"time\":1479280480000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":40,\"time\":1479280480000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":31,\"month\":10,\"nanos\":0,\"seconds\":50,\"time\":1479612710000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":47,\"time\":1489115927000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":11,\"time\":1489119491000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":31,\"month\":10,\"nanos\":0,\"seconds\":41,\"time\":1479612701000,\"timezoneOffset\":-480,\"year\":116}}],\"12\":[{\"1\":\"蟠龙BH10010\",\"2\":\"NULL\",\"3\":\"220kV英蟠线第一套保护CSC-101BS\",\"4\":3,\"5\":\"NULL\",\"6\":\"CSC-101BS\",\"7\":\"1.23L\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":41,\"time\":1479280481000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙XL20003\",\"13\":2,\"14\":0,\"15\":10,\"16\":90,\"17\":10,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978634\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":3,\"day\":2,\"hours\":8,\"minutes\":43,\"month\":0,\"nanos\":0,\"seconds\":14,\"time\":1483404194000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":16,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479611804000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":41,\"time\":1479280481000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":4,\"month\":10,\"nanos\":0,\"seconds\":19,\"time\":1479611059000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":20,\"month\":2,\"nanos\":0,\"seconds\":9,\"time\":1489116009000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":41,\"time\":1479280481000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":28,\"month\":10,\"nanos\":0,\"seconds\":35,\"time\":1479612515000,\"timezoneOffset\":-480,\"year\":116}}],\"13\":[{\"1\":\"蟠龙BH10011\",\"2\":\"NULL\",\"3\":\"220kV英蟠线第二套保护CSC-103B\",\"4\":3,\"5\":\"NULL\",\"6\":\"CSC-103B\",\"7\":\"1.28L\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479280484000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙XL20003\",\"13\":2,\"14\":0,\"15\":11,\"16\":90,\"17\":11,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978635\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":3,\"day\":2,\"hours\":8,\"minutes\":43,\"month\":0,\"nanos\":0,\"seconds\":14,\"time\":1483404194000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":19,\"day\":6,\"hours\":8,\"minutes\":28,\"month\":10,\"nanos\":0,\"seconds\":32,\"time\":1479515312000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479280484000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":28,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479612480000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":20,\"month\":2,\"nanos\":0,\"seconds\":6,\"time\":1489116006000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":38,\"time\":1489119518000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":28,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479612497000,\"timezoneOffset\":-480,\"year\":116}}],\"14\":[{\"1\":\"蟠龙BH10012\",\"2\":\"NULL\",\"3\":\"220kV镁蟠线第一套保护PSL-603GM\",\"4\":3,\"5\":\"NULL\",\"6\":\"PSL-603GM\",\"7\":\"5.42\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":46,\"time\":1479280486000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙XL20004\",\"13\":2,\"14\":0,\"15\":12,\"16\":90,\"17\":12,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978636\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":3,\"day\":2,\"hours\":8,\"minutes\":43,\"month\":0,\"nanos\":0,\"seconds\":14,\"time\":1483404194000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":26,\"day\":4,\"hours\":17,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1485421698000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":46,\"time\":1479280486000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":30,\"time\":1479612090000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":11,\"time\":1489115891000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":14,\"time\":1489119494000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":30,\"day\":3,\"hours\":11,\"minutes\":19,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1480475984000,\"timezoneOffset\":-480,\"year\":116}}],\"15\":[{\"1\":\"蟠龙BH10013\",\"2\":\"NULL\",\"3\":\"220kV镁蟠线第二套保护PSL-603GM\",\"4\":3,\"5\":\"NULL\",\"6\":\"PSL-603GM\",\"7\":\"5.42\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":49,\"time\":1479280489000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙XL20004\",\"13\":2,\"14\":0,\"15\":13,\"16\":90,\"17\":13,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978637\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":3,\"day\":2,\"hours\":8,\"minutes\":43,\"month\":0,\"nanos\":0,\"seconds\":14,\"time\":1483404194000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":26,\"day\":4,\"hours\":17,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":19,\"time\":1485421699000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":49,\"time\":1479280489000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479612118000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":32,\"time\":1489115912000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":15,\"time\":1489119495000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479612107000,\"timezoneOffset\":-480,\"year\":116}}],\"16\":[{\"1\":\"蟠龙BH10014\",\"2\":\"NULL\",\"3\":\"220kV镁蟠线2228断路器保护PSL-631A\",\"4\":5,\"5\":\"NULL\",\"6\":\"PSL-631A\",\"7\":\"5.42\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":52,\"time\":1479280492000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙KG30005\",\"13\":3,\"14\":0,\"15\":14,\"16\":90,\"17\":14,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978638\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":52,\"time\":1479280492000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":17,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":24,\"time\":1485421704000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":52,\"time\":1479280492000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":33,\"month\":10,\"nanos\":0,\"seconds\":23,\"time\":1479612803000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":25,\"time\":1489115905000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":12,\"time\":1489119492000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":20,\"day\":0,\"hours\":11,\"minutes\":33,\"month\":10,\"nanos\":0,\"seconds\":29,\"time\":1479612809000,\"timezoneOffset\":-480,\"year\":116}}],\"17\":[{\"1\":\"蟠龙BH10015\",\"2\":\"NULL\",\"3\":\"#1主变第一套保护PRS-778\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-778\",\"7\":\"2.2.0.1\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":53,\"time\":1479280493000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙ZB40001\",\"13\":6,\"14\":0,\"15\":15,\"16\":90,\"17\":15,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978639\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":53,\"time\":1479280493000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":53,\"time\":1479280493000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":53,\"time\":1479280493000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":53,\"time\":1479280493000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":53,\"time\":1479280493000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":53,\"time\":1479280493000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":25,\"day\":5,\"hours\":16,\"minutes\":43,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1480063425000,\"timezoneOffset\":-480,\"year\":116}}],\"18\":[{\"1\":\"蟠龙BH10016\",\"2\":\"NULL\",\"3\":\"#1主变第二套保护PRS-778\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-778\",\"7\":\"2.2.0.1\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":55,\"time\":1479280495000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙ZB40001\",\"13\":6,\"14\":0,\"15\":16,\"16\":90,\"17\":16,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978640\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":55,\"time\":1479280495000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":55,\"time\":1479280495000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":55,\"time\":1479280495000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":55,\"time\":1479280495000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":55,\"time\":1479280495000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":55,\"time\":1479280495000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":25,\"day\":5,\"hours\":16,\"minutes\":43,\"month\":10,\"nanos\":0,\"seconds\":54,\"time\":1480063434000,\"timezoneOffset\":-480,\"year\":116}}],\"19\":[{\"1\":\"蟠龙BH10017\",\"2\":\"NULL\",\"3\":\"#1主变断路器保护PRS-723C\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-723C\",\"7\":\"3.11\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":57,\"time\":1479280497000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙ZB40001\",\"13\":6,\"14\":0,\"15\":17,\"16\":90,\"17\":17,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":19,\"day\":6,\"hours\":15,\"minutes\":32,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479540764000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978641\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":57,\"time\":1479280497000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":57,\"time\":1479280497000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":57,\"time\":1479280497000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":57,\"time\":1479280497000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":22,\"day\":2,\"hours\":18,\"minutes\":17,\"month\":10,\"nanos\":0,\"seconds\":40,\"time\":1479809860000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":57,\"time\":1479280497000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":25,\"day\":5,\"hours\":16,\"minutes\":44,\"month\":10,\"nanos\":0,\"seconds\":51,\"time\":1480063491000,\"timezoneOffset\":-480,\"year\":116}}],\"20\":[{\"1\":\"蟠龙BH10018\",\"2\":\"NULL\",\"3\":\"#1主变非电量保护PRS-761A\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-761A\",\"7\":\"3.10\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479280498000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙ZB40001\",\"13\":6,\"14\":0,\"15\":18,\"16\":90,\"17\":18,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":19,\"day\":6,\"hours\":15,\"minutes\":32,\"month\":10,\"nanos\":0,\"seconds\":43,\"time\":1479540763000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978642\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479280498000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479280498000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479280498000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479280498000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":22,\"day\":2,\"hours\":18,\"minutes\":17,\"month\":10,\"nanos\":0,\"seconds\":40,\"time\":1479809860000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479280498000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479280498000,\"timezoneOffset\":-480,\"year\":116}}],\"21\":[{\"1\":\"蟠龙BH10019\",\"2\":\"NULL\",\"3\":\"#2主变第一套保护PRS-778\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-778\",\"7\":\"2.2.0.1\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479280500000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙ZB40002\",\"13\":6,\"14\":0,\"15\":19,\"16\":90,\"17\":19,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978643\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479280500000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479280500000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479280500000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479280500000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479280500000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":0,\"time\":1479280500000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":25,\"day\":5,\"hours\":16,\"minutes\":45,\"month\":10,\"nanos\":0,\"seconds\":55,\"time\":1480063555000,\"timezoneOffset\":-480,\"year\":116}}],\"22\":[{\"1\":\"蟠龙BH10020\",\"2\":\"NULL\",\"3\":\"#2主变第二套保护PRS-778\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-778\",\"7\":\"2.2.0.1\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479280502000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙ZB40002\",\"13\":6,\"14\":0,\"15\":20,\"16\":90,\"17\":20,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":3,\"hours\":11,\"minutes\":21,\"month\":10,\"nanos\":0,\"seconds\":45,\"time\":1479266505000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978644\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479280502000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479280502000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479280502000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479280502000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479280502000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479280502000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":25,\"day\":5,\"hours\":16,\"minutes\":46,\"month\":10,\"nanos\":0,\"seconds\":3,\"time\":1480063563000,\"timezoneOffset\":-480,\"year\":116}}],\"23\":[{\"1\":\"蟠龙BH10021\",\"2\":\"NULL\",\"3\":\"#2主变断路器保护PRS-723C\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-723C\",\"7\":\"3.11\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479280504000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙ZB40002\",\"13\":6,\"14\":0,\"15\":21,\"16\":90,\"17\":21,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":19,\"day\":6,\"hours\":15,\"minutes\":32,\"month\":10,\"nanos\":0,\"seconds\":43,\"time\":1479540763000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978645\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479280504000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479280504000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479280504000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479280504000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":22,\"day\":2,\"hours\":18,\"minutes\":17,\"month\":10,\"nanos\":0,\"seconds\":41,\"time\":1479809861000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479280504000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":25,\"day\":5,\"hours\":16,\"minutes\":46,\"month\":10,\"nanos\":0,\"seconds\":38,\"time\":1480063598000,\"timezoneOffset\":-480,\"year\":116}}],\"24\":[{\"1\":\"蟠龙BH10022\",\"2\":\"NULL\",\"3\":\"#2主变非电量保护PRS-761A\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-761A\",\"7\":\"3.10\",\"8\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":5,\"time\":1479280505000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"蟠龙变\",\"12\":\"蟠龙ZB40002\",\"13\":6,\"14\":0,\"15\":22,\"16\":90,\"17\":22,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":19,\"day\":6,\"hours\":15,\"minutes\":32,\"month\":10,\"nanos\":0,\"seconds\":43,\"time\":1479540763000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479264726000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397978646\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":5,\"time\":1479280505000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":5,\"time\":1479280505000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":5,\"time\":1479280505000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":5,\"time\":1479280505000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":22,\"day\":2,\"hours\":16,\"minutes\":17,\"month\":10,\"nanos\":0,\"seconds\":12,\"time\":1479802632000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":5,\"time\":1479280505000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":3,\"hours\":15,\"minutes\":15,\"month\":10,\"nanos\":0,\"seconds\":5,\"time\":1479280505000,\"timezoneOffset\":-480,\"year\":116}}],\"25\":[{\"1\":\"兰家BH10024\",\"2\":\"NULL\",\"3\":\"220kV母联保护CSC-122B\",\"4\":5,\"5\":\"NULL\",\"6\":\"CSC-122B\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":16,\"time\":1479877756000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家KG30002\",\"13\":3,\"14\":0,\"15\":24,\"16\":90,\"17\":23,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980696\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":31,\"day\":6,\"hours\":4,\"minutes\":33,\"month\":11,\"nanos\":0,\"seconds\":57,\"time\":1483130037000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":21,\"minutes\":36,\"month\":0,\"nanos\":0,\"seconds\":1,\"time\":1485437761000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":16,\"time\":1479877756000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":16,\"time\":1479877756000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":28,\"day\":1,\"hours\":17,\"minutes\":49,\"month\":10,\"nanos\":0,\"seconds\":27,\"time\":1480326567000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":16,\"time\":1479877756000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":16,\"time\":1479877756000,\"timezoneOffset\":-480,\"year\":116}}],\"26\":[{\"1\":\"兰家BH10025\",\"2\":\"NULL\",\"3\":\"220kV一号主变保护B屏CSC-336C\",\"4\":2,\"5\":\"NULL\",\"6\":\"CSC-336C2\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479877757000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家ZB40002\",\"13\":6,\"14\":0,\"15\":25,\"16\":90,\"17\":24,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980697\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":1000,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479877757000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479877757000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479877757000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":31,\"day\":6,\"hours\":15,\"minutes\":13,\"month\":11,\"nanos\":0,\"seconds\":53,\"time\":1483168433000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479877757000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479877757000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479877757000,\"timezoneOffset\":-480,\"year\":116}}],\"27\":[{\"1\":\"兰家BH10026\",\"2\":\"NULL\",\"3\":\"220kV一号主变保护B屏CSC-326AB\",\"4\":2,\"5\":\"NULL\",\"6\":\"CSC-326AB\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":19,\"time\":1479877759000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家ZB40002\",\"13\":6,\"14\":0,\"15\":26,\"16\":90,\"17\":25,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980698\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":1000,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":10,\"minutes\":38,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484361512000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":20,\"day\":5,\"hours\":9,\"minutes\":28,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1484875683000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":19,\"time\":1479877759000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":19,\"time\":1479877759000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":19,\"time\":1479877759000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":19,\"time\":1479877759000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":19,\"time\":1479877759000,\"timezoneOffset\":-480,\"year\":116}}],\"28\":[{\"1\":\"兰家BH10027\",\"2\":\"NULL\",\"3\":\"220kV一号主变保护A屏断路器辅助保护CSC-122T\",\"4\":2,\"5\":\"NULL\",\"6\":\"CSC-122T\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":24,\"time\":1479877764000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家ZB40002\",\"13\":6,\"14\":0,\"15\":27,\"16\":90,\"17\":26,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980699\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":1000,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":13,\"day\":5,\"hours\":11,\"minutes\":3,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484276623000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":20,\"day\":5,\"hours\":9,\"minutes\":19,\"month\":0,\"nanos\":0,\"seconds\":28,\"time\":1484875168000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":24,\"time\":1479877764000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":24,\"time\":1479877764000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":28,\"day\":1,\"hours\":17,\"minutes\":50,\"month\":10,\"nanos\":0,\"seconds\":21,\"time\":1480326621000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":24,\"time\":1479877764000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":24,\"time\":1479877764000,\"timezoneOffset\":-480,\"year\":116}}],\"29\":[{\"1\":\"兰家BH10028\",\"2\":\"NULL\",\"3\":\"220kV一号主变保护A屏CSC-326AB\",\"4\":2,\"5\":\"NULL\",\"6\":\"CSC-326AB\",\"7\":\"V1.56\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":27,\"time\":1479877767000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家ZB40002\",\"13\":6,\"14\":0,\"15\":28,\"16\":90,\"17\":27,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980700\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":1000,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":10,\"minutes\":38,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484361512000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":20,\"day\":5,\"hours\":9,\"minutes\":35,\"month\":0,\"nanos\":0,\"seconds\":54,\"time\":1484876154000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":27,\"time\":1479877767000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":27,\"time\":1479877767000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":20,\"month\":2,\"nanos\":0,\"seconds\":2,\"time\":1489116002000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":27,\"time\":1479877767000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":27,\"time\":1479877767000,\"timezoneOffset\":-480,\"year\":116}}],\"30\":[{\"1\":\"兰家BH10030\",\"2\":\"NULL\",\"3\":\"220kV二号主变保护B屏CSC-326AB\",\"4\":2,\"5\":\"NULL\",\"6\":\"CSC-326AB\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":30,\"time\":1479877770000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家ZB40003\",\"13\":6,\"14\":0,\"15\":30,\"16\":90,\"17\":29,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980702\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":1000,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":7,\"day\":6,\"hours\":9,\"minutes\":32,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483752723000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":27,\"day\":5,\"hours\":0,\"minutes\":51,\"month\":0,\"nanos\":0,\"seconds\":11,\"time\":1485449471000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":30,\"time\":1479877770000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":30,\"time\":1479877770000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":28,\"day\":1,\"hours\":17,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":36,\"time\":1480326756000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":30,\"time\":1479877770000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":30,\"time\":1479877770000,\"timezoneOffset\":-480,\"year\":116}}],\"31\":[{\"1\":\"兰家BH10031\",\"2\":\"NULL\",\"3\":\"220kV二号主变保护A屏断路器辅助保护CSC-122T\",\"4\":2,\"5\":\"NULL\",\"6\":\"CSC-122T\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479877773000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家ZB40003\",\"13\":6,\"14\":0,\"15\":31,\"16\":90,\"17\":30,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980703\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":1000,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":7,\"day\":6,\"hours\":9,\"minutes\":32,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1483752733000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":27,\"day\":5,\"hours\":0,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1485449582000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479877773000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479877773000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":28,\"day\":1,\"hours\":17,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":22,\"time\":1480326802000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479877773000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479877773000,\"timezoneOffset\":-480,\"year\":116}}],\"32\":[{\"1\":\"兰家BH10032\",\"2\":\"NULL\",\"3\":\"220kV二号主变保护A屏CSC-326AB\",\"4\":2,\"5\":\"NULL\",\"6\":\"CSC-326AB\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":39,\"time\":1479877779000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家ZB40003\",\"13\":6,\"14\":0,\"15\":32,\"16\":90,\"17\":31,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980704\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":1000,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":7,\"day\":6,\"hours\":9,\"minutes\":32,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483752723000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":27,\"day\":5,\"hours\":0,\"minutes\":51,\"month\":0,\"nanos\":0,\"seconds\":17,\"time\":1485449477000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":39,\"time\":1479877779000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":39,\"time\":1479877779000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":28,\"day\":1,\"hours\":17,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1480326822000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":39,\"time\":1479877779000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":39,\"time\":1479877779000,\"timezoneOffset\":-480,\"year\":116}}],\"33\":[{\"1\":\"兰家BH10033\",\"2\":\"NULL\",\"3\":\"220kV母差第二套保护CSC-150\",\"4\":1,\"5\":\"NULL\",\"6\":\"CSC-150\",\"7\":\"V1.26LH\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家MX10002\",\"13\":1,\"14\":0,\"15\":33,\"16\":90,\"17\":32,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980705\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116}}],\"34\":[{\"1\":\"兰家BH10036\",\"2\":\"NULL\",\"3\":\"220kV铁兰线第一套保护CSC-101B\",\"4\":3,\"5\":\"NULL\",\"6\":\"CSC-101B\",\"7\":\"V1.23L\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20016\",\"13\":2,\"14\":0,\"15\":36,\"16\":90,\"17\":35,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":22,\"day\":2,\"hours\":1,\"minutes\":8,\"month\":10,\"nanos\":0,\"seconds\":32,\"time\":1479748112000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980708\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":39,\"month\":11,\"nanos\":0,\"seconds\":24,\"time\":1481697564000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":4,\"minutes\":49,\"month\":0,\"nanos\":0,\"seconds\":21,\"time\":1485377361000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":45,\"time\":1489115985000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":42,\"time\":1479877782000,\"timezoneOffset\":-480,\"year\":116}}],\"35\":[{\"1\":\"兰家BH10037\",\"2\":\"NULL\",\"3\":\"220kV铁兰线第二套保护CSC-103B\",\"4\":3,\"5\":\"NULL\",\"6\":\"CSC-103B\",\"7\":\"V1.28L\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479877784000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20016\",\"13\":2,\"14\":0,\"15\":37,\"16\":90,\"17\":36,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980709\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":24,\"time\":1481697084000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":4,\"minutes\":51,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1485377462000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479877784000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479877784000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":20,\"month\":2,\"nanos\":0,\"seconds\":4,\"time\":1489116004000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":25,\"time\":1489119505000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479877784000,\"timezoneOffset\":-480,\"year\":116}}],\"36\":[{\"1\":\"兰家BH10038\",\"2\":\"NULL\",\"3\":\"220kV兰耿线第一套保护CSC-101B\",\"4\":3,\"5\":\"NULL\",\"6\":\"CSC-101B\",\"7\":\"V1.23L\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479877787000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20017\",\"13\":2,\"14\":0,\"15\":38,\"16\":90,\"17\":37,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980710\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479877787000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479877787000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479877787000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479877787000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479877787000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479877787000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":47,\"time\":1479877787000,\"timezoneOffset\":-480,\"year\":116}}],\"37\":[{\"1\":\"兰家BH10039\",\"2\":\"NULL\",\"3\":\"220kV兰耿线第二套保护CSC-103B\",\"4\":3,\"5\":\"NULL\",\"6\":\"CSC-103B\",\"7\":\"V1.28L\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":48,\"time\":1479877788000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20017\",\"13\":2,\"14\":0,\"15\":39,\"16\":90,\"17\":38,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980711\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":48,\"time\":1479877788000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":48,\"time\":1479877788000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":48,\"time\":1479877788000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":48,\"time\":1479877788000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":48,\"time\":1479877788000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":48,\"time\":1479877788000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":48,\"time\":1479877788000,\"timezoneOffset\":-480,\"year\":116}}],\"38\":[{\"1\":\"兰家BH10040\",\"2\":\"NULL\",\"3\":\"220kV母差第一套保护NSR-371A-G-X\",\"4\":1,\"5\":\"NULL\",\"6\":\"NSR-371A\",\"7\":\"1.01\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":51,\"time\":1479877791000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家MX10002\",\"13\":1,\"14\":0,\"15\":40,\"16\":90,\"17\":39,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980712\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":22,\"month\":11,\"nanos\":0,\"seconds\":5,\"time\":1481696525000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":14,\"day\":3,\"hours\":15,\"minutes\":14,\"month\":11,\"nanos\":0,\"seconds\":19,\"time\":1481699659000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":51,\"time\":1479877791000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":29,\"day\":2,\"hours\":13,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":32,\"time\":1480398752000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":51,\"time\":1479877791000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":11,\"time\":1489119491000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":51,\"time\":1479877791000,\"timezoneOffset\":-480,\"year\":116}}],\"39\":[{\"1\":\"兰家BH10041\",\"2\":\"NULL\",\"3\":\"220kV兰丁线第一套保护PCS-931A-G\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931A-G\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":56,\"time\":1479877796000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20018\",\"13\":2,\"14\":0,\"15\":41,\"16\":90,\"17\":40,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980713\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":56,\"time\":1479877796000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":56,\"time\":1479877796000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":56,\"time\":1479877796000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":56,\"time\":1479877796000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":56,\"time\":1479877796000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":56,\"time\":1479877796000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":56,\"time\":1479877796000,\"timezoneOffset\":-480,\"year\":116}}],\"40\":[{\"1\":\"兰家BH10043\",\"2\":\"NULL\",\"3\":\"220kV兰丁线断路器及失灵辅助保护PCS-923A\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-923A\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479877798000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20018\",\"13\":2,\"14\":0,\"15\":43,\"16\":90,\"17\":42,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980715\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479877798000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479877798000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479877798000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479877798000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479877798000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479877798000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":58,\"time\":1479877798000,\"timezoneOffset\":-480,\"year\":116}}],\"41\":[{\"1\":\"兰家BH10044\",\"2\":\"NULL\",\"3\":\"220kV兰嵋一线第一套纵联保护RCS-931AMV\",\"4\":3,\"5\":\"NULL\",\"6\":\"RCS-931AMV\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":59,\"time\":1479877799000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20019\",\"13\":2,\"14\":0,\"15\":44,\"16\":90,\"17\":43,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980716\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":12,\"time\":1481697072000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":21,\"minutes\":59,\"month\":0,\"nanos\":0,\"seconds\":6,\"time\":1485439146000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":59,\"time\":1479877799000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":59,\"time\":1479877799000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":54,\"time\":1489115934000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":13,\"time\":1489119493000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":59,\"time\":1479877799000,\"timezoneOffset\":-480,\"year\":116}}],\"42\":[{\"1\":\"兰家BH10045\",\"2\":\"NULL\",\"3\":\"220kV兰嵋一线断路器及失灵辅助保护RCS-923A\",\"4\":3,\"5\":\"NULL\",\"6\":\"RCS-923A\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":1,\"time\":1479877801000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20019\",\"13\":2,\"14\":0,\"15\":45,\"16\":90,\"17\":44,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980717\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":32,\"month\":11,\"nanos\":0,\"seconds\":12,\"time\":1481697132000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":14,\"day\":3,\"hours\":15,\"minutes\":3,\"month\":11,\"nanos\":0,\"seconds\":48,\"time\":1481699028000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":1,\"time\":1479877801000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":1,\"time\":1479877801000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":25,\"time\":1489115905000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":13,\"time\":1489119493000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":1,\"time\":1479877801000,\"timezoneOffset\":-480,\"year\":116}}],\"43\":[{\"1\":\"兰家BH10046\",\"2\":\"NULL\",\"3\":\"220kV兰嵋一线第二套纵联保护RCS-931AMV\",\"4\":3,\"5\":\"NULL\",\"6\":\"RCS-931AMV\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479877802000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20019\",\"13\":2,\"14\":0,\"15\":46,\"16\":90,\"17\":45,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980718\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":12,\"time\":1481697072000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":14,\"day\":3,\"hours\":15,\"minutes\":5,\"month\":11,\"nanos\":0,\"seconds\":57,\"time\":1481699157000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479877802000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479877802000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115940000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":13,\"time\":1489119493000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":2,\"time\":1479877802000,\"timezoneOffset\":-480,\"year\":116}}],\"44\":[{\"1\":\"兰家BH10047\",\"2\":\"NULL\",\"3\":\"220kV兰嵋二线第一套纵联保护RCS-931AMV\",\"4\":3,\"5\":\"NULL\",\"6\":\"RCS-931AMV\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479877804000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20020\",\"13\":2,\"14\":0,\"15\":47,\"16\":90,\"17\":46,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980719\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":12,\"time\":1481697072000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":22,\"minutes\":1,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1485439316000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479877804000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":35,\"time\":1489119695000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":15,\"time\":1489115955000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":13,\"time\":1489119493000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":36,\"time\":1489119696000,\"timezoneOffset\":-480,\"year\":117}}],\"45\":[{\"1\":\"兰家BH10048\",\"2\":\"NULL\",\"3\":\"220kV兰嵋二线断路器及失灵辅助保护RCS-923A\",\"4\":3,\"5\":\"NULL\",\"6\":\"RCS-923A\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479877806000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20020\",\"13\":2,\"14\":0,\"15\":48,\"16\":90,\"17\":47,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980720\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":12,\"time\":1481697072000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":14,\"day\":3,\"hours\":15,\"minutes\":3,\"month\":11,\"nanos\":0,\"seconds\":49,\"time\":1481699029000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479877806000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":31,\"time\":1489119691000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":29,\"time\":1489115909000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":14,\"time\":1489119494000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":32,\"time\":1489119692000,\"timezoneOffset\":-480,\"year\":117}}],\"46\":[{\"1\":\"兰家BH10049\",\"2\":\"NULL\",\"3\":\"220kV兰嵋二线第二套纵联保护RCS-931AMV\",\"4\":3,\"5\":\"NULL\",\"6\":\"RCS-931AMV\",\"7\":\"NULL\",\"8\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479877806000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"兰家\",\"12\":\"兰家XL20020\",\"13\":2,\"14\":0,\"15\":49,\"16\":90,\"17\":48,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":25,\"day\":0,\"hours\":12,\"minutes\":1,\"month\":8,\"nanos\":0,\"seconds\":22,\"time\":1474776082000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":14,\"time\":1474686554000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397980721\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":3,\"hours\":14,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":12,\"time\":1481697072000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":4,\"hours\":22,\"minutes\":1,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1485439316000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":23,\"day\":3,\"hours\":13,\"minutes\":10,\"month\":10,\"nanos\":0,\"seconds\":6,\"time\":1479877806000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":35,\"time\":1489119695000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":39,\"time\":1489115979000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":14,\"time\":1489119494000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":36,\"time\":1489119696000,\"timezoneOffset\":-480,\"year\":117}}],\"47\":[{\"1\":\"京诚BH001\",\"2\":\"NULL\",\"3\":\"营口220kV京诚变device\",\"4\":0,\"5\":\"NULL\",\"6\":\"Z2000\",\"7\":\"1.0.0.5\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"NULL\",\"13\":9,\"14\":0,\"15\":1,\"16\":90,\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":48,\"month\":11,\"nanos\":0,\"seconds\":0,\"time\":1481694480000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":26,\"month\":11,\"nanos\":0,\"seconds\":19,\"time\":1481693179000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"15955136513\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":1,\"34\":2,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116}}],\"48\":[{\"1\":\"京诚BH002\",\"2\":\"NULL\",\"3\":\"220kV故障录波器WDGL-V\",\"4\":9,\"5\":\"NULL\",\"6\":\"WDGL-V\",\"7\":\"5.11\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"NULL\",\"13\":11,\"14\":0,\"15\":2,\"16\":90,\"17\":2,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":19,\"day\":1,\"hours\":15,\"minutes\":48,\"month\":11,\"nanos\":0,\"seconds\":48,\"time\":1482133728000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":26,\"month\":11,\"nanos\":0,\"seconds\":19,\"time\":1481693179000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"15955136514\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":1,\"34\":2,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":10,\"day\":2,\"hours\":22,\"minutes\":5,\"month\":0,\"nanos\":0,\"seconds\":42,\"time\":1484057142000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":1,\"day\":6,\"hours\":23,\"minutes\":21,\"month\":6,\"nanos\":0,\"seconds\":22,\"time\":1498922482000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":22,\"day\":4,\"hours\":14,\"minutes\":47,\"month\":5,\"nanos\":0,\"seconds\":32,\"time\":1498114052000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116}}],\"49\":[{\"1\":\"京诚BH10001\",\"2\":\"NULL\",\"3\":\"辽宁营口220kV京诚变device\",\"4\":0,\"5\":\"NULL\",\"6\":\"Z2000\",\"7\":\"1.0.0.5\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"未知\",\"13\":9,\"14\":0,\"15\":1,\"16\":90,\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981697\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116}}],\"50\":[{\"1\":\"京诚BH10002\",\"2\":\"NULL\",\"3\":\"220kV渤诚线2219第一套路保护PSL-602GM\",\"4\":3,\"5\":\"NULL\",\"6\":\"PSL-602GM\",\"7\":\"5.31\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚XL20002\",\"13\":2,\"14\":0,\"15\":2,\"16\":90,\"17\":2,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981698\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":59,\"time\":1481855459000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":42,\"time\":1489119702000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":23,\"time\":1489115903000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":21,\"time\":1489119501000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":43,\"time\":1489119703000,\"timezoneOffset\":-480,\"year\":117}}],\"51\":[{\"1\":\"京诚BH10003\",\"2\":\"NULL\",\"3\":\"220kV渤诚线2219第二套保护PSL-603GM\",\"4\":3,\"5\":\"NULL\",\"6\":\"PSL-603GM\",\"7\":\"5.31\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":4,\"time\":1481855464000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚XL20002\",\"13\":2,\"14\":0,\"15\":3,\"16\":90,\"17\":3,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981699\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":4,\"time\":1481855464000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":4,\"time\":1481855464000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":4,\"time\":1481855464000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":44,\"time\":1489119704000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":40,\"time\":1489115920000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":23,\"time\":1489119503000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":45,\"time\":1489119705000,\"timezoneOffset\":-480,\"year\":117}}],\"52\":[{\"1\":\"京诚BH10004\",\"2\":\"NULL\",\"3\":\"220kV渤诚线2219断路器保护PSL-631A\",\"4\":5,\"5\":\"NULL\",\"6\":\"PSL-631A\",\"7\":\"5.31\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":8,\"time\":1481855468000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚KG30003\",\"13\":3,\"14\":0,\"15\":4,\"16\":90,\"17\":4,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981700\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":8,\"time\":1481855468000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":8,\"time\":1481855468000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":8,\"time\":1481855468000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":30,\"time\":1489119690000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":27,\"time\":1489115907000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":12,\"time\":1489119492000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":31,\"time\":1489119691000,\"timezoneOffset\":-480,\"year\":117}}],\"53\":[{\"1\":\"京诚BH10005\",\"2\":\"NULL\",\"3\":\"220kV母差保护RCS-915AB\",\"4\":1,\"5\":\"NULL\",\"6\":\"RCS-915AB\",\"7\":\"3.32\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":9,\"time\":1481855469000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚MX10001\",\"13\":1,\"14\":0,\"15\":5,\"16\":90,\"17\":5,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981701\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":9,\"time\":1481855469000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":9,\"time\":1481855469000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":9,\"time\":1481855469000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":42,\"time\":1489119702000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":53,\"time\":1489115993000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":9,\"time\":1481855469000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":44,\"time\":1489119704000,\"timezoneOffset\":-480,\"year\":117}}],\"54\":[{\"1\":\"京诚BH10006\",\"2\":\"NULL\",\"3\":\"220kV母联保护RCS-923A\",\"4\":5,\"5\":\"NULL\",\"6\":\"RCS-923A\",\"7\":\"2.00\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":14,\"time\":1481855474000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚KG30001\",\"13\":3,\"14\":0,\"15\":6,\"16\":90,\"17\":6,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981702\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":14,\"time\":1481855474000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":14,\"time\":1481855474000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":14,\"time\":1481855474000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":29,\"time\":1489119689000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":51,\"time\":1489115931000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":12,\"time\":1489119492000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":30,\"time\":1489119690000,\"timezoneOffset\":-480,\"year\":117}}],\"55\":[{\"1\":\"京诚BH10007\",\"2\":\"NULL\",\"3\":\"#2主变第一套保护RCS-978L2\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-978L2\",\"7\":\"3.02\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":15,\"time\":1481855475000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40002\",\"13\":6,\"14\":0,\"15\":7,\"16\":90,\"17\":7,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981703\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":15,\"time\":1481855475000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":15,\"time\":1481855475000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":15,\"time\":1481855475000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":29,\"time\":1489119689000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":43,\"time\":1489115923000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":15,\"time\":1481855475000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":30,\"time\":1489119690000,\"timezoneOffset\":-480,\"year\":117}}],\"56\":[{\"1\":\"京诚BH10008\",\"2\":\"NULL\",\"3\":\"#2主变第二套保护RCS-978L2\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-978L2\",\"7\":\"3.02\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":17,\"time\":1481855477000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40002\",\"13\":6,\"14\":0,\"15\":8,\"16\":90,\"17\":8,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981704\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":17,\"time\":1481855477000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":17,\"time\":1481855477000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":17,\"time\":1481855477000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":31,\"time\":1489119691000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":32,\"time\":1489115972000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":17,\"time\":1481855477000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117}}],\"57\":[{\"1\":\"京诚BH10009\",\"2\":\"NULL\",\"3\":\"#2主变非电量保护RCS-974A\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-974A\",\"7\":\"1.10\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":19,\"time\":1481855479000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40002\",\"13\":6,\"14\":0,\"15\":9,\"16\":90,\"17\":9,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981705\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":19,\"time\":1481855479000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":19,\"time\":1481855479000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":19,\"time\":1481855479000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":56,\"time\":1489115936000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":19,\"time\":1481855479000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117}}],\"58\":[{\"1\":\"京诚BH10010\",\"2\":\"NULL\",\"3\":\"#3主变第一套保护RCS-978L2\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-978L2\",\"7\":\"3.02\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":20,\"time\":1481855480000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40003\",\"13\":6,\"14\":0,\"15\":10,\"16\":90,\"17\":10,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981706\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":20,\"time\":1481855480000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":20,\"time\":1481855480000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":20,\"time\":1481855480000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":28,\"time\":1489119688000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":45,\"time\":1489115925000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":20,\"time\":1481855480000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":30,\"time\":1489119690000,\"timezoneOffset\":-480,\"year\":117}}],\"59\":[{\"1\":\"京诚BH10011\",\"2\":\"NULL\",\"3\":\"#3主变第二套保护RCS-978L2\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-978L2\",\"7\":\"3.02\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":22,\"time\":1481855482000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40003\",\"13\":6,\"14\":0,\"15\":11,\"16\":90,\"17\":11,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981707\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":22,\"time\":1481855482000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":22,\"time\":1481855482000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":22,\"time\":1481855482000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":31,\"time\":1489119691000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":6,\"time\":1489115946000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":22,\"time\":1481855482000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117}}],\"60\":[{\"1\":\"京诚BH10012\",\"2\":\"NULL\",\"3\":\"#3主变非电量保护RCS-974A\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-974A\",\"7\":\"1.10\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":24,\"time\":1481855484000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40003\",\"13\":6,\"14\":0,\"15\":12,\"16\":90,\"17\":12,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981708\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":24,\"time\":1481855484000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":24,\"time\":1481855484000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":24,\"time\":1481855484000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":8,\"time\":1489115948000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":24,\"time\":1481855484000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117}}],\"61\":[{\"1\":\"京诚BH10013\",\"2\":\"NULL\",\"3\":\"#4主变第一套保护RCS-978L2\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-978L2\",\"7\":\"3.02\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":25,\"time\":1481855485000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40004\",\"13\":6,\"14\":0,\"15\":13,\"16\":90,\"17\":13,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981709\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":25,\"time\":1481855485000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":25,\"time\":1481855485000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":25,\"time\":1481855485000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":29,\"time\":1489119689000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":3,\"time\":1489115943000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":25,\"time\":1481855485000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":30,\"time\":1489119690000,\"timezoneOffset\":-480,\"year\":117}}],\"62\":[{\"1\":\"京诚BH10014\",\"2\":\"NULL\",\"3\":\"#4主变第二套保护RCS-978L2\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-978L2\",\"7\":\"3.02\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481855487000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40004\",\"13\":6,\"14\":0,\"15\":14,\"16\":90,\"17\":14,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981710\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481855487000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481855487000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481855487000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":31,\"time\":1489119691000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":36,\"time\":1489115976000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481855487000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117}}],\"63\":[{\"1\":\"京诚BH10015\",\"2\":\"NULL\",\"3\":\"#4主变非电量保护RCS-974A\",\"4\":2,\"5\":\"NULL\",\"6\":\"RCS-974A\",\"7\":\"1.10\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":29,\"time\":1481855489000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40004\",\"13\":6,\"14\":0,\"15\":15,\"16\":90,\"17\":15,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981711\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":29,\"time\":1481855489000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":29,\"time\":1481855489000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":29,\"time\":1481855489000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":19,\"month\":2,\"nanos\":0,\"seconds\":11,\"time\":1489115951000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":29,\"time\":1481855489000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":33,\"time\":1489119693000,\"timezoneOffset\":-480,\"year\":117}}],\"64\":[{\"1\":\"京诚BH10016\",\"2\":\"NULL\",\"3\":\"#5主变第一套保护PRS-778\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-778\",\"7\":\"2.3.0.2\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":30,\"time\":1481855490000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40005\",\"13\":6,\"14\":0,\"15\":16,\"16\":90,\"17\":16,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981712\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":30,\"time\":1481855490000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":30,\"time\":1481855490000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":30,\"time\":1481855490000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":30,\"time\":1481855490000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":30,\"time\":1481855490000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":30,\"time\":1481855490000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":29,\"time\":1489119689000,\"timezoneOffset\":-480,\"year\":117}}],\"65\":[{\"1\":\"京诚BH10017\",\"2\":\"NULL\",\"3\":\"#5主变第二套保护PRS-778\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-778\",\"7\":\"2.3.0.2\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":33,\"time\":1481855493000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40005\",\"13\":6,\"14\":0,\"15\":17,\"16\":90,\"17\":17,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981713\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":33,\"time\":1481855493000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":33,\"time\":1481855493000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":33,\"time\":1481855493000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":33,\"time\":1481855493000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":33,\"time\":1481855493000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":33,\"time\":1481855493000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":29,\"time\":1489119689000,\"timezoneOffset\":-480,\"year\":117}}],\"66\":[{\"1\":\"京诚BH10018\",\"2\":\"NULL\",\"3\":\"#5主变非电量保护PRS-761A\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-761A\",\"7\":\"3.10\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481855495000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40005\",\"13\":6,\"14\":0,\"15\":18,\"16\":90,\"17\":18,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981714\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481855495000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481855495000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481855495000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481855495000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481855495000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481855495000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481855495000,\"timezoneOffset\":-480,\"year\":116}}],\"67\":[{\"1\":\"京诚BH10019\",\"2\":\"NULL\",\"3\":\"#5主变失灵及非全相保护PRS-723C\",\"4\":2,\"5\":\"NULL\",\"6\":\"PRS-723C\",\"7\":\"3.11\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":37,\"time\":1481855497000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40005\",\"13\":6,\"14\":0,\"15\":19,\"16\":90,\"17\":19,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981715\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":37,\"time\":1481855497000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":37,\"time\":1481855497000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":37,\"time\":1481855497000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":37,\"time\":1481855497000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":48,\"time\":1489115928000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":37,\"time\":1481855497000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":29,\"time\":1489119689000,\"timezoneOffset\":-480,\"year\":117}}],\"68\":[{\"1\":\"京诚BH10020\",\"2\":\"NULL\",\"3\":\"#5主变中压侧保护ISA-351G\",\"4\":2,\"5\":\"NULL\",\"6\":\"ISA-351G\",\"7\":\"3.10\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":38,\"time\":1481855498000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚ZB40005\",\"13\":6,\"14\":0,\"15\":20,\"16\":90,\"17\":20,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981716\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":38,\"time\":1481855498000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":26,\"day\":1,\"hours\":5,\"minutes\":2,\"month\":11,\"nanos\":0,\"seconds\":7,\"time\":1482699727000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":38,\"time\":1481855498000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":38,\"time\":1481855498000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":58,\"time\":1489115938000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":38,\"time\":1481855498000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":29,\"time\":1489119689000,\"timezoneOffset\":-480,\"year\":117}}],\"69\":[{\"1\":\"京诚BH10021\",\"2\":\"NULL\",\"3\":\"220kV历京线2218第一套保护CSC-103A\",\"4\":3,\"5\":\"NULL\",\"6\":\"CSC-103A-G\",\"7\":\"V1.00L2\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":40,\"time\":1481855500000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚XL20001\",\"13\":2,\"14\":0,\"15\":21,\"16\":90,\"17\":21,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981717\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":23,\"day\":5,\"hours\":3,\"minutes\":43,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1482435831000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":27,\"day\":5,\"hours\":14,\"minutes\":20,\"month\":0,\"nanos\":0,\"seconds\":47,\"time\":1485498047000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":40,\"time\":1481855500000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":26,\"time\":1489119686000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":26,\"day\":4,\"hours\":4,\"minutes\":42,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1485376935000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":7,\"time\":1489119487000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":27,\"time\":1489119687000,\"timezoneOffset\":-480,\"year\":117}}],\"70\":[{\"1\":\"京诚BH10022\",\"2\":\"NULL\",\"3\":\"220kV历京线2218第二套保护CSC-103A\",\"4\":3,\"5\":\"NULL\",\"6\":\"CSC-103A-G\",\"7\":\"V1.00L2\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":45,\"time\":1481855505000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚XL20001\",\"13\":2,\"14\":0,\"15\":22,\"16\":90,\"17\":22,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":12,\"minutes\":40,\"month\":11,\"nanos\":0,\"seconds\":45,\"time\":1481863245000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981718\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":1,\"38\":{\"date\":23,\"day\":5,\"hours\":3,\"minutes\":43,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1482435831000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":27,\"day\":5,\"hours\":14,\"minutes\":20,\"month\":0,\"nanos\":0,\"seconds\":48,\"time\":1485498048000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":45,\"time\":1481855505000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":26,\"time\":1489119686000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":5,\"hours\":14,\"minutes\":33,\"month\":11,\"nanos\":0,\"seconds\":23,\"time\":1481870003000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":19,\"day\":1,\"hours\":15,\"minutes\":48,\"month\":11,\"nanos\":0,\"seconds\":55,\"time\":1482133735000,\"timezoneOffset\":-480,\"year\":116},\"48\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":21,\"month\":2,\"nanos\":0,\"seconds\":27,\"time\":1489119687000,\"timezoneOffset\":-480,\"year\":117}}],\"71\":[{\"1\":\"京诚BH10023\",\"2\":\"NULL\",\"3\":\"220kV历京线2218断路器保护CSC-122B\",\"4\":5,\"5\":\"NULL\",\"6\":\"CSC-122B\",\"7\":\"V1.04\",\"8\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":47,\"time\":1481855507000,\"timezoneOffset\":-480,\"year\":116},\"9\":\"NULL\",\"10\":2,\"11\":\"京诚\",\"12\":\"京诚KG30002\",\"13\":3,\"14\":0,\"15\":23,\"16\":90,\"17\":23,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":24,\"month\":11,\"nanos\":0,\"seconds\":46,\"time\":1481855086000,\"timezoneOffset\":-480,\"year\":116},\"23\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":20,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481854851000,\"timezoneOffset\":-480,\"year\":116},\"24\":2,\"25\":\"NULL\",\"26\":\"60397981719\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":47,\"time\":1481855507000,\"timezoneOffset\":-480,\"year\":116},\"39\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":47,\"time\":1481855507000,\"timezoneOffset\":-480,\"year\":116},\"40\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":47,\"time\":1481855507000,\"timezoneOffset\":-480,\"year\":116},\"41\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":47,\"time\":1481855507000,\"timezoneOffset\":-480,\"year\":116},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":47,\"time\":1481855507000,\"timezoneOffset\":-480,\"year\":116},\"47\":{\"date\":10,\"day\":5,\"hours\":12,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":12,\"time\":1489119492000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":31,\"month\":11,\"nanos\":0,\"seconds\":47,\"time\":1481855507000,\"timezoneOffset\":-480,\"year\":116}}],\"72\":[{\"1\":\"榆州BH10022\",\"2\":\"NULL\",\"3\":\"220kV利榆一线第一套保护PCS-931A-\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931A-FA-G\",\"7\":\"V2.00\",\"8\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484385190000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州XL2001\",\"13\":2,\"14\":0,\"15\":22,\"16\":1,\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":12,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483935123000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1483934762000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983766\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484385190000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484385190000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484385190000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484385190000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484385190000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484385190000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484385190000,\"timezoneOffset\":-480,\"year\":117}}],\"73\":[{\"1\":\"榆州BH10023\",\"2\":\"NULL\",\"3\":\"220kV利榆一线第二套保护PCS-931A-\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931A-FA-G\",\"7\":\"V2.00\",\"8\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484385193000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州XL2001\",\"13\":2,\"14\":0,\"15\":23,\"16\":1,\"17\":2,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":12,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483935123000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1483934762000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983767\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484385193000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484385193000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484385193000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484385193000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484385193000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484385193000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484385193000,\"timezoneOffset\":-480,\"year\":117}}],\"74\":[{\"1\":\"榆州BH10025\",\"2\":\"NULL\",\"3\":\"220kV利榆二线第一套保护PCS-931A-\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931A-FA-G\",\"7\":\"V2.00\",\"8\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1484385195000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州XL2002\",\"13\":2,\"14\":0,\"15\":25,\"16\":1,\"17\":3,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":12,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483935123000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1483934762000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983769\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1484385195000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1484385195000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1484385195000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1484385195000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1484385195000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1484385195000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1484385195000,\"timezoneOffset\":-480,\"year\":117}}],\"75\":[{\"1\":\"榆州BH10026\",\"2\":\"NULL\",\"3\":\"220kV利榆二线第二套保护PCS-931A-\",\"4\":3,\"5\":\"NULL\",\"6\":\"PCS-931A-FA-G\",\"7\":\"V2.00\",\"8\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484385198000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州XL2002\",\"13\":2,\"14\":0,\"15\":26,\"16\":1,\"17\":4,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":12,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483935123000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1483934762000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983770\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484385198000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484385198000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484385198000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484385198000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484385198000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484385198000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484385198000,\"timezoneOffset\":-480,\"year\":117}}],\"76\":[{\"1\":\"榆州BH10029\",\"2\":\"NULL\",\"3\":\"1号主变第一套保护PCS-978T2-FA-G\",\"4\":2,\"5\":\"NULL\",\"6\":\"PCS-978T2-FA-G_00394423\",\"7\":\"1.00\",\"8\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":20,\"time\":1484385200000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州ZB3001\",\"13\":6,\"14\":0,\"15\":29,\"16\":1,\"17\":5,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":12,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483935123000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1483934762000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983773\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":20,\"time\":1484385200000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":20,\"time\":1484385200000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":20,\"time\":1484385200000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":20,\"time\":1484385200000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":20,\"time\":1484385200000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":20,\"time\":1484385200000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":20,\"time\":1484385200000,\"timezoneOffset\":-480,\"year\":117}}],\"77\":[{\"1\":\"榆州BH10030\",\"2\":\"NULL\",\"3\":\"1号主变第二套保护PCS-978T2-FA-G\",\"4\":2,\"5\":\"NULL\",\"6\":\"PCS-978T2-FA-G_00394423\",\"7\":\"1.00\",\"8\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484385206000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州ZB3001\",\"13\":6,\"14\":0,\"15\":30,\"16\":1,\"17\":6,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":12,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483935123000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1483934762000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983774\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484385206000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484385206000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484385206000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484385206000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484385206000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484385206000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484385206000,\"timezoneOffset\":-480,\"year\":117}}],\"78\":[{\"1\":\"榆州BH10033\",\"2\":\"NULL\",\"3\":\"220kV母线第一套保护PCS-915A-FA-G\",\"4\":1,\"5\":\"NULL\",\"6\":\"PCS-915A-FA-G\",\"7\":\"1.00\",\"8\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":31,\"time\":1484385211000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州MX4001\",\"13\":1,\"14\":0,\"15\":33,\"16\":1,\"17\":7,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":12,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483935123000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1483934762000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983777\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":31,\"time\":1484385211000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":31,\"time\":1484385211000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":31,\"time\":1484385211000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":31,\"time\":1484385211000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":31,\"time\":1484385211000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":31,\"time\":1484385211000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":31,\"time\":1484385211000,\"timezoneOffset\":-480,\"year\":117}}],\"79\":[{\"1\":\"榆州BH10034\",\"2\":\"NULL\",\"3\":\"220kV母线第二套保护PCS-915A-FA-G\",\"4\":1,\"5\":\"NULL\",\"6\":\"PCS-915A-FA-G\",\"7\":\"1.00\",\"8\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":41,\"time\":1484385221000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州MX4001\",\"13\":1,\"14\":0,\"15\":34,\"16\":1,\"17\":8,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":12,\"month\":0,\"nanos\":0,\"seconds\":3,\"time\":1483935123000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1483934762000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983778\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":41,\"time\":1484385221000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":41,\"time\":1484385221000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":41,\"time\":1484385221000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":41,\"time\":1484385221000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":41,\"time\":1484385221000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":41,\"time\":1484385221000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":14,\"day\":6,\"hours\":17,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":41,\"time\":1484385221000,\"timezoneOffset\":-480,\"year\":117}}],\"80\":[{\"1\":\"榆州BH10001\",\"2\":\"NULL\",\"3\":\"220kV利榆一线第一套保护PCS-931A-FA-G\",\"4\":3,\"5\":\"NULL\",\"6\":\"PL2210A_PCS-931A-FA-G\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":21,\"time\":1484463141000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州XL11001\",\"13\":2,\"14\":0,\"15\":1,\"16\":1,\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":46,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462816000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1484462439000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983745\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":21,\"time\":1484463141000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":21,\"time\":1484463141000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":21,\"time\":1484463141000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":21,\"time\":1484463141000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":1,\"hours\":10,\"minutes\":15,\"month\":0,\"nanos\":0,\"seconds\":45,\"time\":1484532945000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":1,\"hours\":10,\"minutes\":10,\"month\":0,\"nanos\":0,\"seconds\":0,\"time\":1484532600000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":21,\"time\":1484463141000,\"timezoneOffset\":-480,\"year\":117}}],\"81\":[{\"1\":\"榆州BH10002\",\"2\":\"NULL\",\"3\":\"220kV利榆一线第二套保护PCS-931A-FA-G\",\"4\":3,\"5\":\"NULL\",\"6\":\"PL2210B_PCS-931A-FA-G\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":24,\"time\":1484463144000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州XL11001\",\"13\":2,\"14\":0,\"15\":2,\"16\":1,\"17\":2,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":46,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462816000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1484462439000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983746\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":24,\"time\":1484463144000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":14,\"day\":6,\"hours\":14,\"minutes\":51,\"month\":0,\"nanos\":0,\"seconds\":4,\"time\":1484376664000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":24,\"time\":1484463144000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":24,\"time\":1484463144000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":16,\"day\":1,\"hours\":10,\"minutes\":13,\"month\":0,\"nanos\":0,\"seconds\":24,\"time\":1484532804000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":16,\"day\":1,\"hours\":10,\"minutes\":9,\"month\":0,\"nanos\":0,\"seconds\":48,\"time\":1484532588000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":24,\"time\":1484463144000,\"timezoneOffset\":-480,\"year\":117}}],\"82\":[{\"1\":\"榆州BH10003\",\"2\":\"NULL\",\"3\":\"220kV利榆二线第一套保护PCS-931A-FA-G\",\"4\":3,\"5\":\"NULL\",\"6\":\"PL2209A_PCS-931A-FA-G\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484463146000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州XL11002\",\"13\":2,\"14\":0,\"15\":3,\"16\":1,\"17\":3,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":46,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462816000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1484462439000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983747\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484463146000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484463146000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484463146000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484463146000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484463146000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484463146000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":26,\"time\":1484463146000,\"timezoneOffset\":-480,\"year\":117}}],\"83\":[{\"1\":\"榆州BH10004\",\"2\":\"NULL\",\"3\":\"220kV利榆二线第二套保护PCS-931A-FA-G\",\"4\":3,\"5\":\"NULL\",\"6\":\"PL2209B_PCS-931A-FA-G\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":29,\"time\":1484463149000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州XL11002\",\"13\":2,\"14\":0,\"15\":4,\"16\":1,\"17\":4,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":46,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462816000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1484462439000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983748\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":29,\"time\":1484463149000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":29,\"time\":1484463149000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":29,\"time\":1484463149000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":29,\"time\":1484463149000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":29,\"time\":1484463149000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":29,\"time\":1484463149000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":29,\"time\":1484463149000,\"timezoneOffset\":-480,\"year\":117}}],\"84\":[{\"1\":\"榆州BH10005\",\"2\":\"NULL\",\"3\":\"1号主变第一套保护PCS-978P2-FA-G\",\"4\":2,\"5\":\"NULL\",\"6\":\"PT2201A_PCS-978T2-FA-G_\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484463152000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州ZB41001\",\"13\":6,\"14\":0,\"15\":5,\"16\":1,\"17\":5,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":46,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462816000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1484462439000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983749\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484463152000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484463152000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484463152000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484463152000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484463152000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484463152000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":32,\"time\":1484463152000,\"timezoneOffset\":-480,\"year\":117}}],\"85\":[{\"1\":\"榆州BH10006\",\"2\":\"NULL\",\"3\":\"1号主变第二套保护PCS-978P2-FA-G\",\"4\":2,\"5\":\"NULL\",\"6\":\"PT2201B_PCS-978T2-FA-G_\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":38,\"time\":1484463158000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州ZB41001\",\"13\":6,\"14\":0,\"15\":6,\"16\":1,\"17\":6,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":46,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462816000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1484462439000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983750\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":38,\"time\":1484463158000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":38,\"time\":1484463158000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":38,\"time\":1484463158000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":38,\"time\":1484463158000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":38,\"time\":1484463158000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":38,\"time\":1484463158000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":38,\"time\":1484463158000,\"timezoneOffset\":-480,\"year\":117}}],\"86\":[{\"1\":\"榆州BH10007\",\"2\":\"NULL\",\"3\":\"220kV母线第一套保护PCS-915A-FA-G\",\"4\":1,\"5\":\"NULL\",\"6\":\"PM2201A_PCS-915A-FA-G\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":44,\"time\":1484463164000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州MX21001\",\"13\":1,\"14\":0,\"15\":7,\"16\":1,\"17\":7,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":46,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462816000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1484462439000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983751\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":44,\"time\":1484463164000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":44,\"time\":1484463164000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":44,\"time\":1484463164000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":44,\"time\":1484463164000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":44,\"time\":1484463164000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":44,\"time\":1484463164000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":44,\"time\":1484463164000,\"timezoneOffset\":-480,\"year\":117}}],\"87\":[{\"1\":\"榆州BH10008\",\"2\":\"NULL\",\"3\":\"220kV母线第二套保护PCS-915A-FA-G\",\"4\":1,\"5\":\"NULL\",\"6\":\"PM2201B_PCS-915A-FA-G\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484463176000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"榆州MX21002\",\"13\":1,\"14\":0,\"15\":8,\"16\":1,\"17\":8,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":46,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462816000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1484462439000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397983752\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484463176000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484463176000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484463176000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484463176000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484463176000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484463176000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":52,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484463176000,\"timezoneOffset\":-480,\"year\":117}}],\"88\":[{\"1\":\"榆州BH001\",\"2\":\"NULL\",\"3\":\"主变第一套录波器YS-ES1\",\"4\":9,\"5\":\"NULL\",\"6\":\"ZBA_YS-ES1\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":8,\"time\":1484463188000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"NULL\",\"13\":11,\"14\":0,\"15\":1,\"16\":1,\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":1,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":49,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484462950000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484462658000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"15955138561\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":0,\"34\":2,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":8,\"time\":1484463188000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":18,\"day\":4,\"hours\":11,\"minutes\":8,\"month\":4,\"nanos\":0,\"seconds\":2,\"time\":1495076882000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":8,\"time\":1484463188000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":8,\"time\":1484463188000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":8,\"time\":1484463188000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":8,\"time\":1484463188000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":8,\"time\":1484463188000,\"timezoneOffset\":-480,\"year\":117}}],\"89\":[{\"1\":\"榆州BH002\",\"2\":\"NULL\",\"3\":\"主变第二套录波器YS-ES1\",\"4\":9,\"5\":\"NULL\",\"6\":\"ZBB_YS-ES1\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484463193000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"NULL\",\"13\":11,\"14\":0,\"15\":2,\"16\":1,\"17\":2,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":1,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":49,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484462950000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484462658000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"15955138562\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":0,\"34\":2,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484463193000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":1,\"day\":4,\"hours\":14,\"minutes\":6,\"month\":5,\"nanos\":0,\"seconds\":14,\"time\":1496297174000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484463193000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484463193000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484463193000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484463193000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":13,\"time\":1484463193000,\"timezoneOffset\":-480,\"year\":117}}],\"90\":[{\"1\":\"榆州BH003\",\"2\":\"NULL\",\"3\":\"220kV线路A网故障录波器WDGL-VI-D\",\"4\":9,\"5\":\"NULL\",\"6\":\"GL220A_WDGL-VI/D\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484463198000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"NULL\",\"13\":11,\"14\":0,\"15\":3,\"16\":1,\"17\":3,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":49,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484462950000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484462658000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"15955138563\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":0,\"34\":2,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484463198000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":1,\"day\":6,\"hours\":23,\"minutes\":21,\"month\":6,\"nanos\":0,\"seconds\":11,\"time\":1498922471000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484463198000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484463198000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484463198000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484463198000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484463198000,\"timezoneOffset\":-480,\"year\":117}}],\"91\":[{\"1\":\"榆州BH004\",\"2\":\"NULL\",\"3\":\"220kV线路B网故障录波器WDGL-VI-D\",\"4\":9,\"5\":\"NULL\",\"6\":\"GL220B_WDGL-VI/D\",\"7\":\"V1.00\",\"8\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":49,\"time\":1484463229000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"榆州\",\"12\":\"NULL\",\"13\":11,\"14\":0,\"15\":4,\"16\":1,\"17\":4,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":49,\"month\":0,\"nanos\":0,\"seconds\":10,\"time\":1484462950000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":18,\"time\":1484462658000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"15955138564\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":5,\"33\":0,\"34\":2,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":49,\"time\":1484463229000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":3,\"day\":1,\"hours\":17,\"minutes\":7,\"month\":6,\"nanos\":0,\"seconds\":16,\"time\":1499072836000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":49,\"time\":1484463229000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":49,\"time\":1484463229000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":49,\"time\":1484463229000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":49,\"time\":1484463229000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":53,\"month\":0,\"nanos\":0,\"seconds\":49,\"time\":1484463229000,\"timezoneOffset\":-480,\"year\":117}}],\"92\":[{\"1\":\"保国BH10001\",\"2\":\"NULL\",\"3\":\"220kV海保1号线保护CSD103AJGGRPLDY\",\"4\":3,\"5\":\"NULL\",\"6\":\"NULL\",\"7\":\"v1.00\",\"8\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115160000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"保国\",\"12\":\"保国XL2001\",\"13\":2,\"14\":0,\"15\":1,\"16\":1,\"17\":1,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":4,\"hours\":15,\"minutes\":29,\"month\":2,\"nanos\":0,\"seconds\":24,\"time\":1489044564000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":4,\"hours\":14,\"minutes\":59,\"month\":2,\"nanos\":0,\"seconds\":13,\"time\":1489042753000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397982721\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115160000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115160000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115160000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115160000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115160000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115160000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":0,\"time\":1489115160000,\"timezoneOffset\":-480,\"year\":117}}],\"93\":[{\"1\":\"保国BH10002\",\"2\":\"NULL\",\"3\":\"220kV海保1号线保护PRS753AJGGRPLDY\",\"4\":3,\"5\":\"NULL\",\"6\":\"NULL\",\"7\":\"v1.00\",\"8\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":5,\"time\":1489115165000,\"timezoneOffset\":-480,\"year\":117},\"9\":\"NULL\",\"10\":2,\"11\":\"保国\",\"12\":\"保国XL2001\",\"13\":2,\"14\":0,\"15\":2,\"16\":1,\"17\":2,\"18\":\"NULL\",\"19\":\"NULL\",\"20\":\"NULL\",\"21\":0,\"22\":{\"date\":9,\"day\":4,\"hours\":15,\"minutes\":29,\"month\":2,\"nanos\":0,\"seconds\":24,\"time\":1489044564000,\"timezoneOffset\":-480,\"year\":117},\"23\":{\"date\":9,\"day\":4,\"hours\":14,\"minutes\":59,\"month\":2,\"nanos\":0,\"seconds\":13,\"time\":1489042753000,\"timezoneOffset\":-480,\"year\":117},\"24\":2,\"25\":\"NULL\",\"26\":\"60397982722\",\"27\":0,\"28\":0,\"29\":\"NULL\",\"30\":\"NULL\",\"31\":1,\"32\":220,\"33\":0,\"34\":1,\"35\":0,\"36\":0,\"37\":0,\"38\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":5,\"time\":1489115165000,\"timezoneOffset\":-480,\"year\":117},\"39\":{\"date\":3,\"day\":5,\"hours\":11,\"minutes\":41,\"month\":2,\"nanos\":0,\"seconds\":48,\"time\":1488512508000,\"timezoneOffset\":-480,\"year\":117},\"40\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":5,\"time\":1489115165000,\"timezoneOffset\":-480,\"year\":117},\"41\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":5,\"time\":1489115165000,\"timezoneOffset\":-480,\"year\":117},\"42\":0,\"43\":0,\"44\":0,\"45\":0,\"46\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":5,\"time\":1489115165000,\"timezoneOffset\":-480,\"year\":117},\"47\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":5,\"time\":1489115165000,\"timezoneOffset\":-480,\"year\":117},\"48\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":6,\"month\":2,\"nanos\":0,\"seconds\":5,\"time\":1489115165000,\"timezoneOffset\":-480,\"year\":117}}]}";
			System.out.println(jsonData);
	        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
	        System.out.println("===================================================");
	        System.out.println(map);
	        System.out.println("line Number : " + Integer.toString(map.size() - 1 ));

	        for( int i = 0; i < map.size(); i++)
	        {
	        	System.out.println("===================================================");
	        	if( 0 == i )
	        	{
	        		System.out.println("表列属性介绍如下：");
	        		String desc = MapUtils.getString(map, "COLUMDESC");
	        		String descItem = "COLUMDESC  :::: ";
	        		System.out.println(descItem + desc);
	        		int len = desc.length();
	        	    String szValue = desc.substring(1, len-1);
	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);
	        	}else{
	        		String szInfo = 	"第";
	        		szInfo 		  += 	Integer.toString(i);
	        		szInfo 		  += 	"行数据如下：";

	        		System.out.println(szInfo);

	                String value = MapUtils.getString(map, Integer.toString(i) );
	        		System.out.println(value);

	        		int len = value.length();
	        	    String szValue = value.substring(1, len-1);

	        	    System.out.println(szValue);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        		SecDev lineData 	    = 	new SecDev();

	        		String PT_ID			= 	MapUtils.getString(map1, Integer.toString(1) );
	        		lineData.setPT_ID(PT_ID);

	        		String URI				= 	MapUtils.getString(map1, Integer.toString(2) );
	        		lineData.setURI(URI);

	        		String NAME				= 	MapUtils.getString(map1, Integer.toString(3) );
	        		lineData.setNAME(NAME);

	        		String TYPE				= 	MapUtils.getString(map1, Integer.toString(4) );
	        		lineData.setTYPE(TYPE);

	        		String KIND				= 	MapUtils.getString(map1, Integer.toString(5) );
	        		lineData.setKIND(KIND);

	        		String MODEL			= 	MapUtils.getString(map1, Integer.toString(6) );
	        		lineData.setMODEL(MODEL);

	        		String SYSVERSION		= 	MapUtils.getString(map1, Integer.toString(7) );
	        		lineData.setSYSVERSION(SYSVERSION);

	        		String DEV_TIME			= 	MapUtils.getString(map1, Integer.toString(8) );
	        		lineData.setDEV_TIME(DEV_TIME);

	        		String CRC				= 	MapUtils.getString(map1, Integer.toString(9) );
	        		lineData.setCRC(CRC);

	        		String RUN_STATUS		= 	MapUtils.getString(map1, Integer.toString(10) );
	        		lineData.setRUN_STATUS(RUN_STATUS);

	        		String STATION_ID		= 	MapUtils.getString(map1, Integer.toString(11) );
	        		lineData.setSTATION_ID(STATION_ID);

	        		String PRIMDEV_ID		= 	MapUtils.getString(map1, Integer.toString(12) );
	        		lineData.setPRIMDEV_ID(PRIMDEV_ID);

	        		String PRIMDEV_TYPE		= 	MapUtils.getString(map1, Integer.toString(13) );
	        		lineData.setPRIMDEV_TYPE(PRIMDEV_TYPE);

	        		String sz101ADDR		= 	MapUtils.getString(map1, Integer.toString(14) );
	        		lineData.setSz101ADDR(sz101ADDR);

	        		String sz103ADDR		= 	MapUtils.getString(map1, Integer.toString(15) );
	        		lineData.setSz103ADDR(sz103ADDR);

	        		String sz103GROUP		= 	MapUtils.getString(map1, Integer.toString(16) );
	        		lineData.setSz103GROUP(sz103GROUP);

	        		String sz103ITEM		= 	MapUtils.getString(map1, Integer.toString(17) );
	        		lineData.setSz103ITEM(sz103ITEM);

	        		String REVERSE1			= 	MapUtils.getString(map1, Integer.toString(18) );
	        		lineData.setREVERSE1(REVERSE1);

	        		String REVERSE2			= 	MapUtils.getString(map1, Integer.toString(19) );
	        		lineData.setREVERSE2(REVERSE2);

	        		String REVERSE3			= 	MapUtils.getString(map1, Integer.toString(20) );
	        		lineData.setREVERSE3(REVERSE3);

	        		String COMMU_STATUS		= 	MapUtils.getString(map1, Integer.toString(21) );
	        		lineData.setCOMMU_STATUS(COMMU_STATUS);

	        		String COMMSTATUSTIME	= 	MapUtils.getString(map1, Integer.toString(22) );
//	        		lineData.setCOMMSTATUSTIME(COMMSTATUSTIME);//时间

	           		String tmp = COMMSTATUSTIME;
	        		Map<String, Object> map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		Integer year = MapUtils.getInteger(map2, "year" );
	        		Integer yearTmp = year + 1900;
	        		String  szYear  = yearTmp.toString();

	        		Integer month = MapUtils.getInteger(map2, "month" );
	        		Integer monthTmp = month+1;
	        		String  szMonth = monthTmp.toString();

	        		String date = MapUtils.getString(map2, "date" );

	        		String hour = MapUtils.getString(map2, "hours" );
	        		String minutes = MapUtils.getString(map2, "minutes" );
	        		String seconds = MapUtils.getString(map2, "seconds" );
	        		lineData.setCOMMSTATUSTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String RUNSTATUSTIME	= 	MapUtils.getString(map1, Integer.toString(23) );
//	        		lineData.setRUNSTATUSTIME(RUNSTATUSTIME);//时间

	           		tmp = RUNSTATUSTIME;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );
	        		lineData.setRUNSTATUSTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String COMMU_TYPE		= 	MapUtils.getString(map1, Integer.toString(24) );
	        		lineData.setCOMMU_TYPE(COMMU_TYPE);

	        		String sz61850SERVER_NAME		= 	MapUtils.getString(map1, Integer.toString(25) );
	        		lineData.setSz61850SERVER_NAME(sz61850SERVER_NAME);

	        		String MRID						= 	MapUtils.getString(map1, Integer.toString(26) );
	        		lineData.setMRID(MRID);

	        		String SUSPENDSTATUS			= 	MapUtils.getString(map1, Integer.toString(27) );
	        		lineData.setSUSPENDSTATUS(SUSPENDSTATUS);

	        		String SUSPENDREASON			= 	MapUtils.getString(map1, Integer.toString(28) );
	        		lineData.setSUSPENDREASON(SUSPENDREASON);

	        		String ALARMBAYNAME				= 	MapUtils.getString(map1, Integer.toString(29) );
	        		lineData.setALARMBAYNAME(ALARMBAYNAME);

	        		String ALARMDEVNAME				= 	MapUtils.getString(map1, Integer.toString(30) );
	        		lineData.setALARMDEVNAME(ALARMDEVNAME);

	        		String KINDSEQ					= 	MapUtils.getString(map1, Integer.toString(31) );
	        		lineData.setKINDSEQ(KINDSEQ);

	        		String VOLTAGE_GRADE			= 	MapUtils.getString(map1, Integer.toString(32) );
	        		lineData.setVOLTAGE_GRADE(VOLTAGE_GRADE);

	        		String CTRLENABLE				= 	MapUtils.getString(map1, Integer.toString(33) );
	        		lineData.setCTRLENABLE(CTRLENABLE);

	        		String DOMAIN_FLAG				= 	MapUtils.getString(map1, Integer.toString(34) );
	        		lineData.setDOMAIN_FLAG(DOMAIN_FLAG);

	        		String LOCK_FLAG				= 	MapUtils.getString(map1, Integer.toString(35) );
	        		lineData.setLOCK_FLAG(LOCK_FLAG);

	        		String ABNORMAL_FLAG			= 	MapUtils.getString(map1, Integer.toString(36) );
	        		lineData.setABNORMAL_FLAG(ABNORMAL_FLAG);

	        		String EVENT_FLAG				= 	MapUtils.getString(map1, Integer.toString(37) );
	        		lineData.setEVENT_FLAG(EVENT_FLAG);

	        		String TM_LASTACT				= 	MapUtils.getString(map1, Integer.toString(38) );
//	        		lineData.setTM_LASTACT(TM_LASTACT);//时间

	        		tmp = TM_LASTACT;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTM_LASTACT( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String TM_LASTOSC				= 	MapUtils.getString(map1, Integer.toString(39) );
//	        		lineData.setTM_LASTOSC(TM_LASTOSC);//时间

	        		tmp = TM_LASTOSC;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTM_LASTOSC( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );


	        		String TM_LASTEVENT				= 	MapUtils.getString(map1, Integer.toString(40) );
//	        		lineData.setTM_LASTEVENT(TM_LASTEVENT);//时间

	        		tmp = TM_LASTEVENT;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTM_LASTEVENT( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );


	        		String TM_LASTDIGIT				= 	MapUtils.getString(map1, Integer.toString(41) );
//	        		lineData.setTM_LASTDIGIT(TM_LASTDIGIT); //时间

	        		tmp = TM_LASTDIGIT;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTM_LASTDIGIT( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );


	        		String ALARM_OVERLMT			= 	MapUtils.getString(map1, Integer.toString(42) );
	        		lineData.setALARM_OVERLMT(ALARM_OVERLMT);

	        		String ACTION_OVERLMT			= 	MapUtils.getString(map1, Integer.toString(43) );
	        		lineData.setACTION_OVERLMT(ACTION_OVERLMT);

	        		String DICHANGE_OVERLMT			= 	MapUtils.getString(map1, Integer.toString(44) );
	        		lineData.setDICHANGE_OVERLMT(DICHANGE_OVERLMT);

	        		String OSC_OVERLMT				= 	MapUtils.getString(map1, Integer.toString(45) );
	        		lineData.setOSC_OVERLMT(OSC_OVERLMT);

	        		String TM_LASTSETTING			= 	MapUtils.getString(map1, Integer.toString(46) );
//	        		lineData.setTM_LASTSETTING(TM_LASTSETTING);//时间

	        		tmp = TM_LASTSETTING;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTM_LASTSETTING( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String TM_LASTSOFT				= 	MapUtils.getString(map1, Integer.toString(47) );
//	        		lineData.setTM_LASTSOFT(TM_LASTSOFT);//时间

	        		tmp = TM_LASTSOFT;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTM_LASTSOFT( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );


	        		String TM_LASTANALOG			= 	MapUtils.getString(map1, Integer.toString(48) );
//	        		lineData.setTM_LASTANALOG(TM_LASTANALOG);  //时间

	        		tmp = TM_LASTANALOG;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTM_LASTANALOG( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		lstItems_SecDev.add(lineData);
	        	}
	        }


			}catch(Exception e)
			{
				System.out.println(e.getMessage()) ;
                List<SecDev>  lstItems_SecDev1 = new ArrayList<SecDev>();
                return lstItems_SecDev1;
	    	}
            return lstItems_SecDev;
    }
    public List<SettingDef> parseJsonUrl6(String jsonData)
    {

        List<SettingDef>  lstItems_SettingDef = new ArrayList<SettingDef>();
		try{
			//String jsonData = "{\"COLUMDESC\":[{\"1\":\"PT_ID\",\"2\":\"CPU_CODE\",\"3\":\"SETTING_ID\",\"4\":\"ZONE\",\"5\":\"103GROUP\",\"6\":\"103ITEM\",\"7\":\"NAME\",\"8\":\"CODE_NAME\",\"9\":\"PROPERTY\",\"10\":\"MINVALUE\",\"11\":\"MAXVALUE\",\"12\":\"STEPVALUE\",\"13\":\"RATIO\",\"14\":\"VPICKLIST\",\"15\":\"UNIT\",\"16\":\"S_PRECISION\",\"17\":\"DATATYPE\",\"18\":\"STATION_LIST\",\"19\":\"RESERVE1\",\"20\":\"RESERVE2\",\"21\":\"RESERVE3\",\"22\":\"RESERVE4\",\"23\":\"61850REF\",\"24\":\"MRID\",\"25\":\"101INF\"}],\"1\":[{\"1\":\"兰家BH10029\",\"2\":1,\"3\":1110001,\"4\":0,\"5\":110,\"6\":1,\"7\":\"X12-a4输入1KG,0\",\"8\":\"X12-a4输入1KG\",\"9\":1,\"10\":0,\"11\":0,\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"2,2\",\"17\":2,\"18\":\"NULL\",\"19\":\"1\",\"20\":\"NULL\",\"21\":\"NULL\",\"22\":\"NULL\",\"23\":\"NULL\",\"24\":\"NULL\",\"25\":0}],\"2\":[{\"1\":\"兰家BH10029\",\"2\":1,\"3\":1110002,\"4\":0,\"5\":110,\"6\":2,\"7\":\"X12-a4输入1延时\",\"8\":\"X12-a4输入1延时\",\"9\":1,\"10\":0,\"11\":9999,\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"s\",\"16\":\"4,2\",\"17\":0,\"18\":\"NULL\",\"19\":\"1\",\"20\":\"NULL\",\"21\":\"NULL\",\"22\":\"NULL\",\"23\":\"NULL\",\"24\":\"NULL\",\"25\":0}],\"3\":[{\"1\":\"兰家BH10029\",\"2\":1,\"3\":1110003,\"4\":0,\"5\":110,\"6\":3,\"7\":\"X12-c4输入2KG,0\",\"8\":\"X12-c4输入2KG\",\"9\":1,\"10\":0,\"11\":0,\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"2,2\",\"17\":2,\"18\":\"NULL\",\"19\":\"1\",\"20\":\"NULL\",\"21\":\"NULL\",\"22\":\"NULL\",\"23\":\"NULL\",\"24\":\"NULL\",\"25\":0}],\"4\":[{\"1\":\"兰家BH10029\",\"2\":1,\"3\":1110004,\"4\":0,\"5\":110,\"6\":4,\"7\":\"X12-c4输入2延时\",\"8\":\"X12-c4输入2延时\",\"9\":1,\"10\":0,\"11\":9999,\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"s\",\"16\":\"4,2\",\"17\":0,\"18\":\"NULL\",\"19\":\"1\",\"20\":\"NULL\",\"21\":\"NULL\",\"22\":\"NULL\",\"23\":\"NULL\",\"24\":\"NULL\",\"25\":0}],\"5\":[{\"1\":\"兰家BH10029\",\"2\":1,\"3\":1110005,\"4\":0,\"5\":110,\"6\":5,\"7\":\"冷却器全停KG,0\",\"8\":\"冷却器全停KG\",\"9\":1,\"10\":0,\"11\":0,\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"2,2\",\"17\":2,\"18\":\"NULL\",\"19\":\"1\",\"20\":\"NULL\",\"21\":\"NULL\",\"22\":\"NULL\",\"23\":\"NULL\",\"24\":\"NULL\",\"25\":0}]}";

			System.out.println(jsonData);

	        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
	        System.out.println("===================================================");
	        System.out.println(map);

	        System.out.println("line Number : " + Integer.toString(map.size() - 1 ));

	        for( int i = 0; i < map.size(); i++)
	        {
	        	System.out.println("===================================================");
	        	if( 0 == i )
	        	{
	        		System.out.println("表列属性介绍如下：");
	        		String desc = MapUtils.getString(map, "COLUMDESC");
	        		String descItem = "COLUMDESC  :::: ";

	        		System.out.println(descItem + desc);

	        		int len = desc.length();
	        	    String szValue = desc.substring(1, len-1);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        	}else{
	        		String szInfo = 	"第";
	        		szInfo 		  += 	Integer.toString(i);
	        		szInfo 		  += 	"行数据如下：";

	        		System.out.println(szInfo);

	                String value = MapUtils.getString(map, Integer.toString(i) );
	        		System.out.println(value);

	        		int len = value.length();
	        	    String szValue = value.substring(1, len-1);

	        	    System.out.println(szValue);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        		SettingDef lineData 	    = 	new SettingDef();

	        		String PT_ID			= 	MapUtils.getString(map1, Integer.toString(1) );
	        		lineData.setPT_ID(PT_ID);

	        		String CPU_CODE			= 	MapUtils.getString(map1, Integer.toString(2) );
	        		lineData.setCPU_CODE(CPU_CODE);



	        		String SETTING_ID			= 	MapUtils.getString(map1, Integer.toString(3) );
	        		lineData.setSETTING_ID(SETTING_ID);

	        		String ZONE 			=   MapUtils.getString(map1, Integer.toString(4) );
	        		lineData.setZONE(ZONE);

	        		String sz103GROUP			= 	MapUtils.getString(map1, Integer.toString(5) );
	        		lineData.setSz103GROUP(sz103GROUP);

	        		String sz103ITEM			= 	MapUtils.getString(map1, Integer.toString(6) );
	        		lineData.setSz103ITEM(sz103ITEM);

	        		String NAME			= 	MapUtils.getString(map1, Integer.toString(7) );
	        		lineData.setNAME(NAME);

	        		String CODE_NAME			= 	MapUtils.getString(map1, Integer.toString(8) );
	        		lineData.setCODE_NAME(CODE_NAME);

	        		String PROPERTY			= 	MapUtils.getString(map1, Integer.toString(9) );
	        		lineData.setPROPERTY(PROPERTY);

	        		String MINVALUE			= 	MapUtils.getString(map1, Integer.toString(10) );
	        		lineData.setMINVALUE(MINVALUE);

	        		String MAXVALUE			= 	MapUtils.getString(map1, Integer.toString(11) );
	        		lineData.setMAXVALUE(MAXVALUE);

	        		String STEPVALUE			= 	MapUtils.getString(map1, Integer.toString(12) );
	        		lineData.setSTEPVALUE(STEPVALUE);

	        		String RATIO			= 	MapUtils.getString(map1, Integer.toString(13) );
	        		lineData.setRATIO(RATIO);

	        		String VPICKLIST			= 	MapUtils.getString(map1, Integer.toString(14) );
	        		lineData.setVPICKLIST(VPICKLIST);

	        		String UNIT			= 	MapUtils.getString(map1, Integer.toString(15) );
	        		lineData.setUNIT(UNIT);

	        		String S_PRECISION			= 	MapUtils.getString(map1, Integer.toString(16) );
	        		lineData.setS_PRECISION(S_PRECISION);

	        		String DATATYPE			= 	MapUtils.getString(map1, Integer.toString(17) );
	        		lineData.setDATATYPE(DATATYPE);

	        		String STATION_LIST			= 	MapUtils.getString(map1, Integer.toString(18) );
	        		lineData.setSTATION_LIST(STATION_LIST);

	        		String RESERVE1			= 	MapUtils.getString(map1, Integer.toString(19) );
	        		lineData.setRESERVE1(RESERVE1);

	        		String RESERVE2			= 	MapUtils.getString(map1, Integer.toString(20) );
	        		lineData.setRESERVE2(RESERVE2);

	        		String RESERVE3			= 	MapUtils.getString(map1, Integer.toString(21) );
	        		lineData.setPT_ID(RESERVE3);

	        		String RESERVE4			= 	MapUtils.getString(map1, Integer.toString(22) );
	        		lineData.setRESERVE4(RESERVE4);

	        		String sz61850REF			= 	MapUtils.getString(map1, Integer.toString(23) );
	        		lineData.setSz61850REF(sz61850REF);

	        		String  MRID			=    MapUtils.getString(map1, Integer.toString(24) );
	        		lineData.setMRID(MRID);

	        		String sz101INF			= 	MapUtils.getString(map1, Integer.toString(25) );
	        		lineData.setSz101INF(sz101INF);


//	        		lineData.setPT_ID(PT_ID);
//	        		String TM_LASTANALOG			= 	MapUtils.getString(map1, Integer.toString(48) );
////	        		lineData.setTM_LASTANALOG(TM_LASTANALOG);  //时间
//
//	        		tmp = TM_LASTANALOG;
//	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
//	        		System.out.println(map2);
//	        		year = MapUtils.getInteger(map2, "year" );
//	        		yearTmp = year + 1900;
//	        		szYear  = yearTmp.toString();
//
//	        		month = MapUtils.getInteger(map2, "month" );
//	        		monthTmp = month+1;
//	        		szMonth = monthTmp.toString();
//
//	        		date = MapUtils.getString(map2, "date" );
//
//	        		hour = MapUtils.getString(map2, "hours" );
//	        		minutes = MapUtils.getString(map2, "minutes" );
//	        		seconds = MapUtils.getString(map2, "seconds" );
//
//	        		lineData.setTM_LASTANALOG( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );
//

	        		lstItems_SettingDef.add(lineData);



	        	}
	        }


			}catch(Exception e)
			{
				System.out.println(e.getMessage()) ;
                List<SettingDef>  lstItems_SettingDef1 = new ArrayList<SettingDef>();
                return lstItems_SettingDef1;
	    	}

	    	return lstItems_SettingDef;
    }
    public List<ZoneDef> parseJsonUrl7(String jsonData)
    {
        List<ZoneDef>  lstItems_ZoneDef = new ArrayList<ZoneDef>();

		try{
			//String jsonData = "{\"COLUMDESC\":[{\"1\":\"PT_ID\",\"2\":\"CPU_CODE\",\"3\":\"ZONE_ID\",\"4\":\"NAME\",\"5\":\"CODE_NAME\",\"6\":\"103GROUP\",\"7\":\"103ITEM\",\"8\":\"MINVALUE\",\"9\":\"MAXVALUE\",\"10\":\"STEPVALUE\",\"11\":\"S_PRECISION\",\"12\":\"DATATYPE\",\"13\":\"ZONE_VALUE\",\"14\":\"RESERVE1\",\"15\":\"RESERVE2\",\"16\":\"RESERVE3\",\"17\":\"RESERVE4\",\"18\":\"61850REF\",\"19\":\"PSRTYPE\",\"20\":\"BASEVALUE\",\"21\":\"BASEVALUETM\",\"22\":\"101INF\"}],\"1\":[{\"1\":\"兰家BH10029\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":36,\"time\":1474686576000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"2\":[{\"1\":\"兰家BH10034\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":9,\"month\":8,\"nanos\":0,\"seconds\":58,\"time\":1474686598000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"3\":[{\"1\":\"兰家BH10035\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":10,\"month\":8,\"nanos\":0,\"seconds\":2,\"time\":1474686602000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"4\":[{\"1\":\"兰家BH10042\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":10,\"month\":8,\"nanos\":0,\"seconds\":35,\"time\":1474686635000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"5\":[{\"1\":\"兰家BH005\",\"2\":1,\"3\":1100001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":100,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":44,\"month\":9,\"nanos\":0,\"seconds\":47,\"time\":1476927887000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"6\":[{\"1\":\"兰家BH005\",\"2\":1,\"3\":1100002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":100,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":44,\"month\":9,\"nanos\":0,\"seconds\":47,\"time\":1476927887000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"7\":[{\"1\":\"兰家BH005\",\"2\":2,\"3\":2101001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":101,\"7\":1,\"8\":0,\"9\":3,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":44,\"month\":9,\"nanos\":0,\"seconds\":47,\"time\":1476927887000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"8\":[{\"1\":\"兰家BH005\",\"2\":2,\"3\":2101002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":101,\"7\":2,\"8\":0,\"9\":3,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":44,\"month\":9,\"nanos\":0,\"seconds\":47,\"time\":1476927887000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"9\":[{\"1\":\"兰家BH006\",\"2\":1,\"3\":1100001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":100,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":44,\"month\":9,\"nanos\":0,\"seconds\":52,\"time\":1476927892000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"10\":[{\"1\":\"兰家BH006\",\"2\":1,\"3\":1100002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":100,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":44,\"month\":9,\"nanos\":0,\"seconds\":52,\"time\":1476927892000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"11\":[{\"1\":\"兰家BH006\",\"2\":2,\"3\":2101001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":101,\"7\":1,\"8\":0,\"9\":3,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":44,\"month\":9,\"nanos\":0,\"seconds\":52,\"time\":1476927892000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"12\":[{\"1\":\"兰家BH006\",\"2\":2,\"3\":2101002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":101,\"7\":2,\"8\":0,\"9\":3,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":44,\"month\":9,\"nanos\":0,\"seconds\":52,\"time\":1476927892000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"13\":[{\"1\":\"京诚BH10024\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":4,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":29,\"day\":6,\"hours\":11,\"minutes\":20,\"month\":9,\"nanos\":0,\"seconds\":0,\"time\":1477711200000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"14\":[{\"1\":\"京诚BH10025\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":4,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":29,\"day\":6,\"hours\":11,\"minutes\":20,\"month\":9,\"nanos\":0,\"seconds\":4,\"time\":1477711204000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"15\":[{\"1\":\"蟠龙BH003\",\"2\":1,\"3\":1100001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":100,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":10,\"day\":4,\"hours\":14,\"minutes\":33,\"month\":10,\"nanos\":0,\"seconds\":25,\"time\":1478759605000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"16\":[{\"1\":\"蟠龙BH003\",\"2\":1,\"3\":1100002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":100,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":10,\"day\":4,\"hours\":14,\"minutes\":33,\"month\":10,\"nanos\":0,\"seconds\":25,\"time\":1478759605000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"17\":[{\"1\":\"蟠龙BH003\",\"2\":2,\"3\":2101001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":101,\"7\":1,\"8\":0,\"9\":3,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":10,\"day\":4,\"hours\":14,\"minutes\":33,\"month\":10,\"nanos\":0,\"seconds\":25,\"time\":1478759605000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"18\":[{\"1\":\"蟠龙BH003\",\"2\":2,\"3\":2101002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":101,\"7\":2,\"8\":0,\"9\":3,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":10,\"day\":4,\"hours\":14,\"minutes\":33,\"month\":10,\"nanos\":0,\"seconds\":25,\"time\":1478759605000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"19\":[{\"1\":\"蟠龙BH002\",\"2\":1,\"3\":1100001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":100,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":49,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479264571000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"20\":[{\"1\":\"蟠龙BH002\",\"2\":1,\"3\":1100002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":100,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":49,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479264571000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"21\":[{\"1\":\"蟠龙BH002\",\"2\":2,\"3\":2101001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":101,\"7\":1,\"8\":0,\"9\":3,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":49,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479264571000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"22\":[{\"1\":\"蟠龙BH002\",\"2\":2,\"3\":2101002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":101,\"7\":2,\"8\":0,\"9\":3,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":49,\"month\":10,\"nanos\":0,\"seconds\":31,\"time\":1479264571000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"23\":[{\"1\":\"蟠龙BH10002\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":9,\"time\":1479264729000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"24\":[{\"1\":\"蟠龙BH10003\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":10,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":12,\"time\":1479264732000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"25\":[{\"1\":\"蟠龙BH10004\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":17,\"time\":1479264737000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"26\":[{\"1\":\"蟠龙BH10005\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":21,\"time\":1479264741000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"27\":[{\"1\":\"蟠龙BH10006\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":25,\"time\":1479264745000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"28\":[{\"1\":\"蟠龙BH10007\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":29,\"time\":1479264749000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"29\":[{\"1\":\"蟠龙BH10008\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":33,\"time\":1479264753000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"30\":[{\"1\":\"蟠龙BH10009\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":38,\"time\":1479264758000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"31\":[{\"1\":\"蟠龙BH10010\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":41,\"time\":1479264761000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"32\":[{\"1\":\"蟠龙BH10011\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":46,\"time\":1479264766000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"33\":[{\"1\":\"蟠龙BH10012\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":54,\"time\":1479264774000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"34\":[{\"1\":\"蟠龙BH10012\",\"2\":2,\"3\":2101001,\"4\":\"CPU2\",\"5\":\"CPU2\",\"6\":101,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":54,\"time\":1479264774000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"35\":[{\"1\":\"蟠龙BH10012\",\"2\":3,\"3\":3102001,\"4\":\"CPU3\",\"5\":\"CPU3\",\"6\":102,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":54,\"time\":1479264774000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"36\":[{\"1\":\"蟠龙BH10012\",\"2\":4,\"3\":4103001,\"4\":\"CPU4\",\"5\":\"CPU4\",\"6\":103,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":52,\"month\":10,\"nanos\":0,\"seconds\":54,\"time\":1479264774000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"37\":[{\"1\":\"蟠龙BH10013\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":7,\"time\":1479264787000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"38\":[{\"1\":\"蟠龙BH10013\",\"2\":2,\"3\":2101001,\"4\":\"CPU2\",\"5\":\"CPU2\",\"6\":101,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":7,\"time\":1479264787000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"39\":[{\"1\":\"蟠龙BH10013\",\"2\":3,\"3\":3102001,\"4\":\"CPU3\",\"5\":\"CPU3\",\"6\":102,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":7,\"time\":1479264787000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"40\":[{\"1\":\"蟠龙BH10013\",\"2\":4,\"3\":4103001,\"4\":\"CPU4\",\"5\":\"CPU4\",\"6\":103,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":7,\"time\":1479264787000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"41\":[{\"1\":\"蟠龙BH10014\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":16,\"time\":1479264796000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"42\":[{\"1\":\"蟠龙BH10015\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":19,\"time\":1479264799000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"43\":[{\"1\":\"蟠龙BH10016\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":23,\"time\":1479264803000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"44\":[{\"1\":\"蟠龙BH10017\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":9,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":27,\"time\":1479264807000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"45\":[{\"1\":\"蟠龙BH10018\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":13,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":30,\"time\":1479264810000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"46\":[{\"1\":\"蟠龙BH10019\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":34,\"time\":1479264814000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"47\":[{\"1\":\"蟠龙BH10020\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":38,\"time\":1479264818000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"48\":[{\"1\":\"蟠龙BH10021\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":9,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":41,\"time\":1479264821000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"49\":[{\"1\":\"蟠龙BH10022\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":13,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":3,\"hours\":10,\"minutes\":53,\"month\":10,\"nanos\":0,\"seconds\":44,\"time\":1479264824000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"50\":[{\"1\":\"兰家BH10024\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":0,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":9,\"month\":9,\"nanos\":0,\"seconds\":19,\"time\":1477033759000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"51\":[{\"1\":\"兰家BH10025\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":28,\"day\":5,\"hours\":10,\"minutes\":23,\"month\":9,\"nanos\":0,\"seconds\":28,\"time\":1477621408000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"52\":[{\"1\":\"兰家BH10026\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":12,\"month\":9,\"nanos\":0,\"seconds\":6,\"time\":1477033926000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"53\":[{\"1\":\"兰家BH10027\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":11,\"month\":9,\"nanos\":0,\"seconds\":54,\"time\":1477033914000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"54\":[{\"1\":\"兰家BH10028\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":11,\"month\":9,\"nanos\":0,\"seconds\":46,\"time\":1477033906000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"55\":[{\"1\":\"兰家BH10030\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":27,\"day\":4,\"hours\":17,\"minutes\":35,\"month\":9,\"nanos\":0,\"seconds\":53,\"time\":1477560953000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"56\":[{\"1\":\"兰家BH10031\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":13,\"month\":9,\"nanos\":0,\"seconds\":37,\"time\":1477034017000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"57\":[{\"1\":\"兰家BH10032\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":28,\"day\":5,\"hours\":11,\"minutes\":55,\"month\":9,\"nanos\":0,\"seconds\":11,\"time\":1477626911000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"58\":[{\"1\":\"兰家BH10036\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":9,\"month\":9,\"nanos\":0,\"seconds\":30,\"time\":1477033770000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"59\":[{\"1\":\"兰家BH10037\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":9,\"month\":9,\"nanos\":0,\"seconds\":40,\"time\":1477033780000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"60\":[{\"1\":\"兰家BH10038\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":10,\"month\":8,\"nanos\":0,\"seconds\":15,\"time\":1474686615000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"61\":[{\"1\":\"兰家BH10039\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":10,\"month\":8,\"nanos\":0,\"seconds\":19,\"time\":1474686619000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"62\":[{\"1\":\"兰家BH10040\",\"2\":1,\"3\":1100001,\"4\":\"当前区\",\"5\":\"当前区\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":9,\"month\":9,\"nanos\":0,\"seconds\":58,\"time\":1477033798000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"63\":[{\"1\":\"兰家BH10041\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":10,\"month\":8,\"nanos\":0,\"seconds\":29,\"time\":1474686629000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"64\":[{\"1\":\"兰家BH10043\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":24,\"day\":6,\"hours\":11,\"minutes\":10,\"month\":8,\"nanos\":0,\"seconds\":39,\"time\":1474686639000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"65\":[{\"1\":\"兰家BH10044\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":20,\"day\":0,\"hours\":20,\"minutes\":5,\"month\":10,\"nanos\":0,\"seconds\":4,\"time\":1479643504000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"66\":[{\"1\":\"兰家BH10045\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":8,\"month\":9,\"nanos\":0,\"seconds\":43,\"time\":1477033723000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"67\":[{\"1\":\"兰家BH10046\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":20,\"day\":4,\"hours\":9,\"minutes\":51,\"month\":9,\"nanos\":0,\"seconds\":28,\"time\":1476928288000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"68\":[{\"1\":\"兰家BH10047\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":10,\"month\":9,\"nanos\":0,\"seconds\":31,\"time\":1477033831000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"69\":[{\"1\":\"兰家BH10048\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":21,\"day\":5,\"hours\":15,\"minutes\":10,\"month\":9,\"nanos\":0,\"seconds\":21,\"time\":1477033821000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"70\":[{\"1\":\"兰家BH10049\",\"2\":1,\"3\":1100001,\"4\":\"cur zone\",\"5\":\"cur zone\",\"6\":100,\"7\":1,\"8\":0,\"9\":8,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":20,\"day\":0,\"hours\":20,\"minutes\":9,\"month\":10,\"nanos\":0,\"seconds\":49,\"time\":1479643789000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"71\":[{\"1\":\"京诚BH10002\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":4,\"hours\":15,\"minutes\":39,\"month\":11,\"nanos\":0,\"seconds\":2,\"time\":1481787542000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"72\":[{\"1\":\"京诚BH10002\",\"2\":2,\"3\":2101001,\"4\":\"CPU2\",\"5\":\"CPU2\",\"6\":101,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":4,\"hours\":15,\"minutes\":39,\"month\":11,\"nanos\":0,\"seconds\":2,\"time\":1481787542000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"73\":[{\"1\":\"京诚BH10002\",\"2\":3,\"3\":3102001,\"4\":\"CPU3\",\"5\":\"CPU3\",\"6\":102,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":4,\"hours\":15,\"minutes\":39,\"month\":11,\"nanos\":0,\"seconds\":2,\"time\":1481787542000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"74\":[{\"1\":\"京诚BH10002\",\"2\":4,\"3\":4103001,\"4\":\"CPU4\",\"5\":\"CPU4\",\"6\":103,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":4,\"hours\":15,\"minutes\":39,\"month\":11,\"nanos\":0,\"seconds\":2,\"time\":1481787542000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"75\":[{\"1\":\"京诚BH10003\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":4,\"hours\":15,\"minutes\":38,\"month\":11,\"nanos\":0,\"seconds\":55,\"time\":1481787535000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"76\":[{\"1\":\"京诚BH10003\",\"2\":2,\"3\":2101001,\"4\":\"CPU2\",\"5\":\"CPU2\",\"6\":101,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":4,\"hours\":15,\"minutes\":38,\"month\":11,\"nanos\":0,\"seconds\":55,\"time\":1481787535000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"77\":[{\"1\":\"京诚BH10003\",\"2\":3,\"3\":3102001,\"4\":\"CPU3\",\"5\":\"CPU3\",\"6\":102,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":0,\"21\":{\"date\":15,\"day\":4,\"hours\":15,\"minutes\":38,\"month\":11,\"nanos\":0,\"seconds\":55,\"time\":1481787535000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"78\":[{\"1\":\"京诚BH10003\",\"2\":4,\"3\":4103001,\"4\":\"CPU4\",\"5\":\"CPU4\",\"6\":103,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":0,\"21\":{\"date\":15,\"day\":4,\"hours\":15,\"minutes\":38,\"month\":11,\"nanos\":0,\"seconds\":55,\"time\":1481787535000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"79\":[{\"1\":\"京诚BH10004\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":27,\"month\":11,\"nanos\":0,\"seconds\":31,\"time\":1481693251000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"80\":[{\"1\":\"京诚BH10005\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":27,\"month\":11,\"nanos\":0,\"seconds\":37,\"time\":1481693257000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"81\":[{\"1\":\"京诚BH10006\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":27,\"month\":11,\"nanos\":0,\"seconds\":41,\"time\":1481693261000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"82\":[{\"1\":\"京诚BH10007\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":27,\"month\":11,\"nanos\":0,\"seconds\":45,\"time\":1481693265000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"83\":[{\"1\":\"京诚BH10008\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":27,\"month\":11,\"nanos\":0,\"seconds\":48,\"time\":1481693268000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"84\":[{\"1\":\"京诚BH10009\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":27,\"month\":11,\"nanos\":0,\"seconds\":53,\"time\":1481693273000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"85\":[{\"1\":\"京诚BH10010\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":27,\"month\":11,\"nanos\":0,\"seconds\":56,\"time\":1481693276000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"86\":[{\"1\":\"京诚BH10011\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":0,\"time\":1481693280000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"87\":[{\"1\":\"京诚BH10012\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":4,\"time\":1481693284000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"88\":[{\"1\":\"京诚BH10013\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":8,\"time\":1481693288000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"89\":[{\"1\":\"京诚BH10014\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":12,\"time\":1481693292000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"90\":[{\"1\":\"京诚BH10015\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":16,\"time\":1481693296000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"91\":[{\"1\":\"京诚BH10016\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":20,\"time\":1481693300000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"92\":[{\"1\":\"京诚BH10017\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":24,\"time\":1481693304000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"93\":[{\"1\":\"京诚BH10018\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481693307000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"94\":[{\"1\":\"京诚BH10019\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":9,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":31,\"time\":1481693311000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"95\":[{\"1\":\"京诚BH10020\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":23,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":35,\"time\":1481693315000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"96\":[{\"1\":\"京诚BH10021\",\"2\":1,\"3\":1100001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":100,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481693427000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"97\":[{\"1\":\"京诚BH10021\",\"2\":1,\"3\":1100002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":100,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481693427000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"98\":[{\"1\":\"京诚BH10021\",\"2\":2,\"3\":2101001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":101,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481693427000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"99\":[{\"1\":\"京诚BH10021\",\"2\":2,\"3\":2101002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":101,\"7\":2,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":27,\"time\":1481693427000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"100\":[{\"1\":\"京诚BH10021\",\"2\":3,\"3\":3102001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":102,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":28,\"time\":1481693428000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"101\":[{\"1\":\"京诚BH10021\",\"2\":3,\"3\":3102002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":102,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":30,\"month\":11,\"nanos\":0,\"seconds\":28,\"time\":1481693428000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"102\":[{\"1\":\"京诚BH10022\",\"2\":1,\"3\":1100001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":100,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":23,\"month\":11,\"nanos\":0,\"seconds\":32,\"time\":1481855012000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"103\":[{\"1\":\"京诚BH10022\",\"2\":1,\"3\":1100002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":100,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":23,\"month\":11,\"nanos\":0,\"seconds\":32,\"time\":1481855012000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"104\":[{\"1\":\"京诚BH10022\",\"2\":2,\"3\":2101001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":101,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":23,\"month\":11,\"nanos\":0,\"seconds\":32,\"time\":1481855012000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"105\":[{\"1\":\"京诚BH10022\",\"2\":2,\"3\":2101002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":101,\"7\":2,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":23,\"month\":11,\"nanos\":0,\"seconds\":32,\"time\":1481855012000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"106\":[{\"1\":\"京诚BH10022\",\"2\":3,\"3\":3102001,\"4\":\"当前区定值\",\"5\":\"当前区定值\",\"6\":102,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":23,\"month\":11,\"nanos\":0,\"seconds\":32,\"time\":1481855012000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"107\":[{\"1\":\"京诚BH10022\",\"2\":3,\"3\":3102002,\"4\":\"编辑区定值\",\"5\":\"编辑区定值\",\"6\":102,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":16,\"day\":5,\"hours\":10,\"minutes\":23,\"month\":11,\"nanos\":0,\"seconds\":32,\"time\":1481855012000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"108\":[{\"1\":\"京诚BH10023\",\"2\":1,\"3\":1100001,\"4\":\"CPU1\",\"5\":\"CPU1\",\"6\":100,\"7\":1,\"8\":0,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":14,\"day\":3,\"hours\":13,\"minutes\":28,\"month\":11,\"nanos\":0,\"seconds\":51,\"time\":1481693331000,\"timezoneOffset\":-480,\"year\":116},\"22\":0}],\"109\":[{\"1\":\"榆州BH10022\",\"2\":1,\"3\":1009001,\"4\":\"运行区定值区号\",\"5\":\"运行区定值区号\",\"6\":9,\"7\":1,\"8\":1,\"9\":31,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":11,\"time\":1483934771000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"110\":[{\"1\":\"榆州BH10023\",\"2\":1,\"3\":1009001,\"4\":\"运行区定值区号\",\"5\":\"运行区定值区号\",\"6\":9,\"7\":1,\"8\":1,\"9\":31,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":35,\"time\":1483934795000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"111\":[{\"1\":\"榆州BH10025\",\"2\":1,\"3\":1009001,\"4\":\"运行区定值区号\",\"5\":\"运行区定值区号\",\"6\":9,\"7\":1,\"8\":1,\"9\":31,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":6,\"month\":0,\"nanos\":0,\"seconds\":59,\"time\":1483934819000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"112\":[{\"1\":\"榆州BH10026\",\"2\":1,\"3\":1009001,\"4\":\"运行区定值区号\",\"5\":\"运行区定值区号\",\"6\":9,\"7\":1,\"8\":1,\"9\":31,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":7,\"month\":0,\"nanos\":0,\"seconds\":23,\"time\":1483934843000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"113\":[{\"1\":\"榆州BH10029\",\"2\":1,\"3\":1010001,\"4\":\"运行区定值区号\",\"5\":\"运行区定值区号\",\"6\":10,\"7\":1,\"8\":1,\"9\":11,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":7,\"month\":0,\"nanos\":0,\"seconds\":49,\"time\":1483934869000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"114\":[{\"1\":\"榆州BH10030\",\"2\":1,\"3\":1010001,\"4\":\"运行区定值区号\",\"5\":\"运行区定值区号\",\"6\":10,\"7\":1,\"8\":1,\"9\":11,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":15,\"time\":1483934895000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"115\":[{\"1\":\"榆州BH10033\",\"2\":1,\"3\":1012001,\"4\":\"运行区定值区号\",\"5\":\"运行区定值区号\",\"6\":12,\"7\":1,\"8\":1,\"9\":11,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":8,\"month\":0,\"nanos\":0,\"seconds\":39,\"time\":1483934919000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"116\":[{\"1\":\"榆州BH10034\",\"2\":1,\"3\":1012001,\"4\":\"运行区定值区号\",\"5\":\"运行区定值区号\",\"6\":12,\"7\":1,\"8\":1,\"9\":11,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":1,\"hours\":12,\"minutes\":9,\"month\":0,\"nanos\":0,\"seconds\":12,\"time\":1483934952000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"117\":[{\"1\":\"榆州BH10001\",\"2\":1,\"3\":1007001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":7,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462443000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"118\":[{\"1\":\"榆州BH10001\",\"2\":1,\"3\":1007002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":7,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462443000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"119\":[{\"1\":\"榆州BH10001\",\"2\":1,\"3\":1007003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":7,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462443000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"120\":[{\"1\":\"榆州BH10001\",\"2\":1,\"3\":1007004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":7,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462443000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"121\":[{\"1\":\"榆州BH10001\",\"2\":1,\"3\":1007005,\"4\":\"运行定值区号_(重复2)\",\"5\":\"运行定值区号_(重复2)\",\"6\":7,\"7\":5,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462443000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"122\":[{\"1\":\"榆州BH10001\",\"2\":1,\"3\":1007006,\"4\":\"编辑定值区号_(重复2)\",\"5\":\"编辑定值区号_(重复2)\",\"6\":7,\"7\":6,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462443000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"123\":[{\"1\":\"榆州BH10002\",\"2\":1,\"3\":1007001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":7,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":53,\"time\":1484462453000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"124\":[{\"1\":\"榆州BH10002\",\"2\":1,\"3\":1007002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":7,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":53,\"time\":1484462453000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"125\":[{\"1\":\"榆州BH10002\",\"2\":1,\"3\":1007003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":7,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":53,\"time\":1484462453000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"126\":[{\"1\":\"榆州BH10002\",\"2\":1,\"3\":1007004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":7,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":53,\"time\":1484462453000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"127\":[{\"1\":\"榆州BH10002\",\"2\":1,\"3\":1007005,\"4\":\"运行定值区号_(重复2)\",\"5\":\"运行定值区号_(重复2)\",\"6\":7,\"7\":5,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":53,\"time\":1484462453000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"128\":[{\"1\":\"榆州BH10002\",\"2\":1,\"3\":1007006,\"4\":\"编辑定值区号_(重复2)\",\"5\":\"编辑定值区号_(重复2)\",\"6\":7,\"7\":6,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":40,\"month\":0,\"nanos\":0,\"seconds\":53,\"time\":1484462453000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"129\":[{\"1\":\"榆州BH10003\",\"2\":1,\"3\":1007001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":7,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1484462462000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"130\":[{\"1\":\"榆州BH10003\",\"2\":1,\"3\":1007002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":7,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1484462462000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"131\":[{\"1\":\"榆州BH10003\",\"2\":1,\"3\":1007003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":7,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1484462462000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"132\":[{\"1\":\"榆州BH10003\",\"2\":1,\"3\":1007004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":7,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1484462462000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"133\":[{\"1\":\"榆州BH10003\",\"2\":1,\"3\":1007005,\"4\":\"运行定值区号_(重复2)\",\"5\":\"运行定值区号_(重复2)\",\"6\":7,\"7\":5,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1484462462000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"134\":[{\"1\":\"榆州BH10003\",\"2\":1,\"3\":1007006,\"4\":\"编辑定值区号_(重复2)\",\"5\":\"编辑定值区号_(重复2)\",\"6\":7,\"7\":6,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":2,\"time\":1484462462000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"135\":[{\"1\":\"榆州BH10004\",\"2\":1,\"3\":1007001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":7,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":11,\"time\":1484462471000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"136\":[{\"1\":\"榆州BH10004\",\"2\":1,\"3\":1007002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":7,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":11,\"time\":1484462471000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"137\":[{\"1\":\"榆州BH10004\",\"2\":1,\"3\":1007003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":7,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":11,\"time\":1484462471000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"138\":[{\"1\":\"榆州BH10004\",\"2\":1,\"3\":1007004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":7,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":11,\"time\":1484462471000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"139\":[{\"1\":\"榆州BH10004\",\"2\":1,\"3\":1007005,\"4\":\"运行定值区号_(重复2)\",\"5\":\"运行定值区号_(重复2)\",\"6\":7,\"7\":5,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":11,\"time\":1484462471000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"140\":[{\"1\":\"榆州BH10004\",\"2\":1,\"3\":1007006,\"4\":\"编辑定值区号_(重复2)\",\"5\":\"编辑定值区号_(重复2)\",\"6\":7,\"7\":6,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":11,\"time\":1484462471000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"141\":[{\"1\":\"榆州BH10005\",\"2\":1,\"3\":1008001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":8,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":23,\"time\":1484462483000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"142\":[{\"1\":\"榆州BH10005\",\"2\":1,\"3\":1008002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":8,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":23,\"time\":1484462483000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"143\":[{\"1\":\"榆州BH10005\",\"2\":1,\"3\":1008003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":8,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":23,\"time\":1484462483000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"144\":[{\"1\":\"榆州BH10005\",\"2\":1,\"3\":1008004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":8,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":23,\"time\":1484462483000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"145\":[{\"1\":\"榆州BH10005\",\"2\":1,\"3\":1008005,\"4\":\"运行定值区号_(重复2)\",\"5\":\"运行定值区号_(重复2)\",\"6\":8,\"7\":5,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":23,\"time\":1484462483000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"146\":[{\"1\":\"榆州BH10005\",\"2\":1,\"3\":1008006,\"4\":\"编辑定值区号_(重复2)\",\"5\":\"编辑定值区号_(重复2)\",\"6\":8,\"7\":6,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":23,\"time\":1484462483000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"147\":[{\"1\":\"榆州BH10006\",\"2\":1,\"3\":1008001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":8,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":33,\"time\":1484462493000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"148\":[{\"1\":\"榆州BH10006\",\"2\":1,\"3\":1008002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":8,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":33,\"time\":1484462493000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"149\":[{\"1\":\"榆州BH10006\",\"2\":1,\"3\":1008003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":8,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":33,\"time\":1484462493000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"150\":[{\"1\":\"榆州BH10006\",\"2\":1,\"3\":1008004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":8,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":33,\"time\":1484462493000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"151\":[{\"1\":\"榆州BH10006\",\"2\":1,\"3\":1008005,\"4\":\"运行定值区号_(重复2)\",\"5\":\"运行定值区号_(重复2)\",\"6\":8,\"7\":5,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":33,\"time\":1484462493000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"152\":[{\"1\":\"榆州BH10006\",\"2\":1,\"3\":1008006,\"4\":\"编辑定值区号_(重复2)\",\"5\":\"编辑定值区号_(重复2)\",\"6\":8,\"7\":6,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":33,\"time\":1484462493000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"153\":[{\"1\":\"榆州BH10007\",\"2\":1,\"3\":1008001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":8,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462503000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"154\":[{\"1\":\"榆州BH10007\",\"2\":1,\"3\":1008002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":8,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462503000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"155\":[{\"1\":\"榆州BH10007\",\"2\":1,\"3\":1008003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":8,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462503000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"156\":[{\"1\":\"榆州BH10007\",\"2\":1,\"3\":1008004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":8,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462503000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"157\":[{\"1\":\"榆州BH10007\",\"2\":1,\"3\":1008005,\"4\":\"运行定值区号_(重复2)\",\"5\":\"运行定值区号_(重复2)\",\"6\":8,\"7\":5,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462503000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"158\":[{\"1\":\"榆州BH10007\",\"2\":1,\"3\":1008006,\"4\":\"编辑定值区号_(重复2)\",\"5\":\"编辑定值区号_(重复2)\",\"6\":8,\"7\":6,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":43,\"time\":1484462503000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"159\":[{\"1\":\"榆州BH10008\",\"2\":1,\"3\":1008001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":8,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462516000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"160\":[{\"1\":\"榆州BH10008\",\"2\":1,\"3\":1008002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":8,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462516000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"161\":[{\"1\":\"榆州BH10008\",\"2\":1,\"3\":1008003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":8,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462516000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"162\":[{\"1\":\"榆州BH10008\",\"2\":1,\"3\":1008004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":8,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462516000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"163\":[{\"1\":\"榆州BH10008\",\"2\":1,\"3\":1008005,\"4\":\"运行定值区号_(重复2)\",\"5\":\"运行定值区号_(重复2)\",\"6\":8,\"7\":5,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462516000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"164\":[{\"1\":\"榆州BH10008\",\"2\":1,\"3\":1008006,\"4\":\"编辑定值区号_(重复2)\",\"5\":\"编辑定值区号_(重复2)\",\"6\":8,\"7\":6,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":41,\"month\":0,\"nanos\":0,\"seconds\":56,\"time\":1484462516000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"165\":[{\"1\":\"榆州BH001\",\"2\":1,\"3\":1005001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":5,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":22,\"time\":1484462662000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"166\":[{\"1\":\"榆州BH001\",\"2\":1,\"3\":1005002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":5,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":22,\"time\":1484462662000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"167\":[{\"1\":\"榆州BH001\",\"2\":1,\"3\":1005003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":5,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":22,\"time\":1484462662000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"168\":[{\"1\":\"榆州BH001\",\"2\":1,\"3\":1005004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":5,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":22,\"time\":1484462662000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"169\":[{\"1\":\"榆州BH002\",\"2\":1,\"3\":1005001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":5,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":28,\"time\":1484462668000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"170\":[{\"1\":\"榆州BH002\",\"2\":1,\"3\":1005002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":5,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":28,\"time\":1484462668000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"171\":[{\"1\":\"榆州BH002\",\"2\":1,\"3\":1005003,\"4\":\"运行定值区号_(重复1)\",\"5\":\"运行定值区号_(重复1)\",\"6\":5,\"7\":3,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":28,\"time\":1484462668000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"172\":[{\"1\":\"榆州BH002\",\"2\":1,\"3\":1005004,\"4\":\"编辑定值区号_(重复1)\",\"5\":\"编辑定值区号_(重复1)\",\"6\":5,\"7\":4,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":28,\"time\":1484462668000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"173\":[{\"1\":\"榆州BH003\",\"2\":1,\"3\":1042001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":42,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":50,\"time\":1484462690000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"174\":[{\"1\":\"榆州BH003\",\"2\":1,\"3\":1042002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":42,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":44,\"month\":0,\"nanos\":0,\"seconds\":50,\"time\":1484462690000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"175\":[{\"1\":\"榆州BH004\",\"2\":1,\"3\":1041001,\"4\":\"运行定值区号\",\"5\":\"运行定值区号\",\"6\":41,\"7\":1,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":45,\"month\":0,\"nanos\":0,\"seconds\":12,\"time\":1484462712000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"176\":[{\"1\":\"榆州BH004\",\"2\":1,\"3\":1041002,\"4\":\"编辑定值区号\",\"5\":\"编辑定值区号\",\"6\":41,\"7\":2,\"8\":0,\"9\":0,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":0,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":2,\"20\":1,\"21\":{\"date\":15,\"day\":0,\"hours\":14,\"minutes\":45,\"month\":0,\"nanos\":0,\"seconds\":12,\"time\":1484462712000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"177\":[{\"1\":\"保国BH10001\",\"2\":1,\"3\":1208001,\"4\":\"当前定值区号\",\"5\":\"当前定值区号\",\"6\":208,\"7\":1,\"8\":1,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":4,\"hours\":14,\"minutes\":59,\"month\":2,\"nanos\":0,\"seconds\":16,\"time\":1489042756000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}],\"178\":[{\"1\":\"保国BH10002\",\"2\":1,\"3\":1208001,\"4\":\"当前定值区号\",\"5\":\"当前定值区号\",\"6\":208,\"7\":1,\"8\":1,\"9\":32,\"10\":1,\"11\":\"2,2\",\"12\":0,\"13\":1,\"14\":\"NULL\",\"15\":\"NULL\",\"16\":\"NULL\",\"17\":\"NULL\",\"18\":\"NULL\",\"19\":1,\"20\":1,\"21\":{\"date\":9,\"day\":4,\"hours\":14,\"minutes\":59,\"month\":2,\"nanos\":0,\"seconds\":23,\"time\":1489042763000,\"timezoneOffset\":-480,\"year\":117},\"22\":0}]}";

			System.out.println(jsonData);

	        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
	        System.out.println("===================================================");
	        System.out.println(map);

	        System.out.println("line Number : " + Integer.toString(map.size() - 1 ));

	        for( int i = 0; i < map.size(); i++)
	        {
	        	System.out.println("===================================================");
	        	if( 0 == i )
	        	{
	        		System.out.println("表列属性介绍如下：");
	        		String desc = MapUtils.getString(map, "COLUMDESC");
	        		String descItem = "COLUMDESC  :::: ";

	        		System.out.println(descItem + desc);

	        		int len = desc.length();
	        	    String szValue = desc.substring(1, len-1);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        	}else{
	        		String szInfo = 	"第";
	        		szInfo 		  += 	Integer.toString(i);
	        		szInfo 		  += 	"行数据如下：";

	        		System.out.println(szInfo);

	                String value = MapUtils.getString(map, Integer.toString(i) );
	        		System.out.println(value);

	        		int len = value.length();
	        	    String szValue = value.substring(1, len-1);

	        	    System.out.println(szValue);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        		ZoneDef lineData 	    = 	new ZoneDef();

	        		String PT_ID			= 	MapUtils.getString(map1, Integer.toString(1) );
	        		lineData.setPT_ID(PT_ID);

	        		String CPU_CODE			= 	MapUtils.getString(map1, Integer.toString(2) );
	        		lineData.setCPU_CODE(CPU_CODE);


	        		String ZONE_ID			= 	MapUtils.getString(map1, Integer.toString(3) );
	        		lineData.setZONE_ID(ZONE_ID);

	        		String NAME 			=   MapUtils.getString(map1, Integer.toString(4) );
	        		lineData.setNAME(NAME);

	        		String CODE_NAME			= 	MapUtils.getString(map1, Integer.toString(5) );
	        		lineData.setCODE_NAME(CODE_NAME);

	        		String sz103GROUP			= 	MapUtils.getString(map1, Integer.toString(6) );
	        		lineData.setSz103GROUP(sz103GROUP);

	        		String sz103ITEM			= 	MapUtils.getString(map1, Integer.toString(7) );
	        		lineData.setSz103ITEM(sz103ITEM);

	        		String MINVALUE			= 	MapUtils.getString(map1, Integer.toString(8) );
	        		lineData.setMINVALUE(MINVALUE);

	        		String MAXVALUE			= 	MapUtils.getString(map1, Integer.toString(9) );
	        		lineData.setMAXVALUE(MAXVALUE);

	        		String STEPVALUE			= 	MapUtils.getString(map1, Integer.toString(10) );
	        		lineData.setSTEPVALUE(STEPVALUE);

	        		String S_PRECISION			= 	MapUtils.getString(map1, Integer.toString(11) );
	        		lineData.setS_PRECISION(S_PRECISION);

	        		String DATATYPE			= 	MapUtils.getString(map1, Integer.toString(12) );
	        		lineData.setDATATYPE(DATATYPE);

	        		String ZONE_VALUE			= 	MapUtils.getString(map1, Integer.toString(13) );
	        		lineData.setZONE_VALUE(ZONE_VALUE);

	        		String RESERVE1			= 	MapUtils.getString(map1, Integer.toString(14) );
	        		lineData.setRESERVE1(RESERVE1);

	        		String RESERVE2			= 	MapUtils.getString(map1, Integer.toString(15) );
	        		lineData.setRESERVE2(RESERVE2);

	        		String RESERVE3			= 	MapUtils.getString(map1, Integer.toString(16) );
	        		lineData.setRESERVE3(RESERVE3);

	        		String RESERVE4			= 	MapUtils.getString(map1, Integer.toString(17) );
	        		lineData.setRESERVE4(RESERVE4);


	        		String sz61850REF			= 	MapUtils.getString(map1, Integer.toString(18) );
	        		lineData.setSz61850REF(sz61850REF);

	        		String PSRTYPE			= 	MapUtils.getString(map1, Integer.toString(19) );
	        		lineData.setPSRTYPE(PSRTYPE);

	        		String BASEVALUE			= 	MapUtils.getString(map1, Integer.toString(20) );
	        		lineData.setBASEVALUE(BASEVALUE);

	        		String BASEVALUETM			= 	MapUtils.getString(map1, Integer.toString(21) );
//	        		lineData.setBASEVALUETM(BASEVALUETM);

	        		String tmp = BASEVALUETM;
	        		Map<String, Object> map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		Integer year = MapUtils.getInteger(map2, "year" );
	        		Integer yearTmp = year + 1900;
	        		String szYear  = yearTmp.toString();

	        		Integer month = MapUtils.getInteger(map2, "month" );
	        		Integer monthTmp = month+1;
	        		String szMonth = monthTmp.toString();

	        		String date = MapUtils.getString(map2, "date" );

	        		String hour = MapUtils.getString(map2, "hours" );
	        		String minutes = MapUtils.getString(map2, "minutes" );
	        		String seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setBASEVALUETM( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );


	        		String sz101INF			= 	MapUtils.getString(map1, Integer.toString(22) );
	        		lineData.setSz101INF(sz101INF);



//	        		lineData.setPT_ID(PT_ID);
//	        		String TM_LASTANALOG			= 	MapUtils.getString(map1, Integer.toString(48) );
////	        		lineData.setTM_LASTANALOG(TM_LASTANALOG);  //时间
//
//	        		tmp = TM_LASTANALOG;
//	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
//	        		System.out.println(map2);
//	        		year = MapUtils.getInteger(map2, "year" );
//	        		yearTmp = year + 1900;
//	        		szYear  = yearTmp.toString();
//
//	        		month = MapUtils.getInteger(map2, "month" );
//	        		monthTmp = month+1;
//	        		szMonth = monthTmp.toString();
//
//	        		date = MapUtils.getString(map2, "date" );
//
//	        		hour = MapUtils.getString(map2, "hours" );
//	        		minutes = MapUtils.getString(map2, "minutes" );
//	        		seconds = MapUtils.getString(map2, "seconds" );
//
//	        		lineData.setTM_LASTANALOG( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );
//

	        		lstItems_ZoneDef.add(lineData);



	        	}
	        }


			}catch(Exception e)
			{
				System.out.println(e.getMessage()) ;

                List<ZoneDef>  lstItems_ZoneDef1 = new ArrayList<ZoneDef>();
                return lstItems_ZoneDef1;
	    	}
	    	return lstItems_ZoneDef;
    }

    public List<SgDef> parseJsonUrl8(String jsonData)
    {
        List<SgDef>  lstItems_SgDef = new ArrayList<SgDef>();
		try{
			//String jsonData = "{\"COLUMDESC\":[{\"1\":\"ID\",\"2\":\"PT_ID\",\"3\":\"CPU_CODE\",\"4\":\"ZONE_CODE\",\"5\":\"SETTING_CODE\",\"6\":\"CURVALUE\",\"7\":\"CURVALUETM\",\"8\":\"PSRDATATYPE\",\"9\":\"STRBACKUP1\",\"10\":\"STRBACKUP2\",\"11\":\"STRBACKUP3\"}],\"1\":[{\"1\":1,\"2\":\"京诚BH10002\",\"3\":1,\"4\":1,\"5\":1110001,\"6\":\"8242\",\"7\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":9,\"time\":1489115889000,\"timezoneOffset\":-480,\"year\":117},\"8\":0}],\"2\":[{\"1\":2,\"2\":\"京诚BH10002\",\"3\":1,\"4\":1,\"5\":1110002,\"6\":\" 0\",\"7\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":9,\"time\":1489115889000,\"timezoneOffset\":-480,\"year\":117},\"8\":0}],\"3\":[{\"1\":3,\"2\":\"京诚BH10002\",\"3\":1,\"4\":1,\"5\":1110003,\"6\":\"0.78 \",\"7\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":9,\"time\":1489115889000,\"timezoneOffset\":-480,\"year\":117},\"8\":0}],\"4\":[{\"1\":4,\"2\":\"京诚BH10002\",\"3\":1,\"4\":1,\"5\":1110004,\"6\":\"0.78 \",\"7\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":9,\"time\":1489115889000,\"timezoneOffset\":-480,\"year\":117},\"8\":0}],\"5\":[{\"1\":5,\"2\":\"京诚BH10002\",\"3\":1,\"4\":1,\"5\":1110005,\"6\":\"1.50 \",\"7\":{\"date\":10,\"day\":5,\"hours\":11,\"minutes\":18,\"month\":2,\"nanos\":0,\"seconds\":9,\"time\":1489115889000,\"timezoneOffset\":-480,\"year\":117},\"8\":0}]}";

			System.out.println(jsonData);

	        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
	        System.out.println("===================================================");
	        System.out.println(map);

	        System.out.println("line Number : " + Integer.toString(map.size() - 1 ));

	        for( int i = 0; i < map.size(); i++)
	        {
	        	System.out.println("===================================================");
	        	if( 0 == i )
	        	{
	        		System.out.println("表列属性介绍如下：");
	        		String desc = MapUtils.getString(map, "COLUMDESC");
	        		String descItem = "COLUMDESC  :::: ";

	        		System.out.println(descItem + desc);

	        		int len = desc.length();
	        	    String szValue = desc.substring(1, len-1);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        	}else{
	        		String szInfo = 	"第";
	        		szInfo 		  += 	Integer.toString(i);
	        		szInfo 		  += 	"行数据如下：";

	        		System.out.println(szInfo);

	                String value = MapUtils.getString(map, Integer.toString(i) );
	        		System.out.println(value);

	        		int len = value.length();
	        	    String szValue = value.substring(1, len-1);

	        	    System.out.println(szValue);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        		SgDef lineData 	    = 	new SgDef();

	        		String ID			= 	MapUtils.getString(map1, Integer.toString(1) );
	        		lineData.setID(ID);

	        		String PT_ID			= 	MapUtils.getString(map1, Integer.toString(2) );
	        		lineData.setPT_ID(PT_ID);

	        		String CPU_CODE			= 	MapUtils.getString(map1, Integer.toString(3) );
	        		lineData.setCPU_CODE(CPU_CODE);

	        		String ZONE_CODE 			=   MapUtils.getString(map1, Integer.toString(4) );
	        		lineData.setZONE_CODE(ZONE_CODE);

	        		String SETTING_CODE			= 	MapUtils.getString(map1, Integer.toString(5) );
	        		lineData.setSETTING_CODE(SETTING_CODE);

	        		String CURVALUE			= 	MapUtils.getString(map1, Integer.toString(6) );
	        		lineData.setCURVALUE(CURVALUE);

	        		String CURVALUETM		=   MapUtils.getString(map1, Integer.toString(7) );
//	        		lineData.setCURVALUETM(CURVALUETM);


	        		String tmp = CURVALUETM;
	        		Map<String, Object>map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		Integer year = MapUtils.getInteger(map2, "year" );
	        		Integer yearTmp = year + 1900;
	        		String szYear  = yearTmp.toString();

	        		Integer month = MapUtils.getInteger(map2, "month" );
	        		Integer monthTmp = month+1;
	        		String szMonth = monthTmp.toString();

	        		String date = MapUtils.getString(map2, "date" );

	        		String hour = MapUtils.getString(map2, "hours" );
	        		String minutes = MapUtils.getString(map2, "minutes" );
	        		String seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setCURVALUETM( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );


	        		String PSRDATATYPE			= 	MapUtils.getString(map1, Integer.toString(8) );
	        		lineData.setPSRDATATYPE(PSRDATATYPE);

	        		String STRBACKUP1			= 	MapUtils.getString(map1, Integer.toString(9) );
	        		lineData.setSTRBACKUP1(STRBACKUP1);

	        		String STRBACKUP2			= 	MapUtils.getString(map1, Integer.toString(10) );
	        		lineData.setSTRBACKUP2(STRBACKUP2);

	        		String STRBACKUP3			= 	MapUtils.getString(map1, Integer.toString(11) );
	        		lineData.setSTRBACKUP3(STRBACKUP3);

//	        		lineData.setPT_ID(PT_ID);
//	        		String TM_LASTANALOG			= 	MapUtils.getString(map1, Integer.toString(48) );
////	        		lineData.setTM_LASTANALOG(TM_LASTANALOG);  //时间
//
//	        		tmp = TM_LASTANALOG;
//	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
//	        		System.out.println(map2);
//	        		year = MapUtils.getInteger(map2, "year" );
//	        		yearTmp = year + 1900;
//	        		szYear  = yearTmp.toString();
//
//	        		month = MapUtils.getInteger(map2, "month" );
//	        		monthTmp = month+1;
//	        		szMonth = monthTmp.toString();
//
//	        		date = MapUtils.getString(map2, "date" );
//
//	        		hour = MapUtils.getString(map2, "hours" );
//	        		minutes = MapUtils.getString(map2, "minutes" );
//	        		seconds = MapUtils.getString(map2, "seconds" );
//
//	        		lineData.setTM_LASTANALOG( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );
//

	        		lstItems_SgDef.add(lineData);



	        	}
	        }


			}catch(Exception e)
			{
				System.out.println(e.getMessage()) ;
                List<SgDef>  lstItems_SgDef1 = new ArrayList<SgDef>();
                return lstItems_SgDef1;
	    	}
	    	return lstItems_SgDef;
    }

    public List<PtAction> parseJsonUrl9(String jsonData)
    {
        List<PtAction>  lstItems_PtAction = new ArrayList<PtAction>();
		try{
			//String jsonData = "{\"COLUMDESC\":[{\"1\":\"ID\",\"2\":\"MSG\",\"3\":\"PT_ID\",\"4\":\"IS_ACK\",\"5\":\"CURTIME\",\"6\":\"MS\",\"7\":\"MS2\",\"8\":\"RELATIVE_TIME\",\"9\":\"RECVTIME\",\"10\":\"FAN\",\"11\":\"FAULTTYPE\",\"12\":\"ISDEBUG\",\"13\":\"PROPERTY\",\"14\":\"REVERSE1\",\"15\":\"REVERSE2\",\"16\":\"REVERSE3\",\"17\":\"REVERSE4\",\"18\":\"61850REF\",\"19\":\"PSRDATATYPE\",\"20\":\"CURVALUE\",\"21\":\"MSGID\",\"22\":\"SIGNALTIME\",\"23\":\"RECORDTIME\"}]}";

			System.out.println(jsonData);

	        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
	        System.out.println("===================================================");
	        System.out.println(map);

	        System.out.println("line Number : " + Integer.toString(map.size() - 1 ));
	        for( int i = 0; i < map.size(); i++)
	        {
	        	System.out.println("===================================================");
	        	if( 0 == i )
	        	{
	        		System.out.println("表列属性介绍如下：");
	        		String desc = MapUtils.getString(map, "COLUMDESC");
	        		String descItem = "COLUMDESC  :::: ";

	        		System.out.println(descItem + desc);

	        		int len = desc.length();
	        	    String szValue = desc.substring(1, len-1);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        	}else{
	        		String szInfo = 	"第";
	        		szInfo 		  += 	Integer.toString(i);
	        		szInfo 		  += 	"行数据如下：";

	        		System.out.println(szInfo);

	                String value = MapUtils.getString( map, Integer.toString(i) );
	        		System.out.println(value);

	        		int len = value.length();
	        	    String szValue = value.substring(1, len-1);

	        	    System.out.println(szValue);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        		PtAction lineData 	    = 	new PtAction();

	        		String ID			= 	MapUtils.getString(map1, Integer.toString(1) );
	        		lineData.setID(ID);

	        		String MSG			= 	MapUtils.getString(map1, Integer.toString(2) );
	        		lineData.setMSG(MSG);

	        		String PT_ID			= 	MapUtils.getString(map1, Integer.toString(3) );
	        		lineData.setPT_ID(PT_ID);

	        		String IS_ACK 			=   MapUtils.getString(map1, Integer.toString(4) );
	        		lineData.setIS_ACK(IS_ACK);

	        		String CURTIME			= 	MapUtils.getString(map1, Integer.toString(5) );
	        		lineData.setCURTIME(CURTIME);	  //时间

	        		String tmp = CURTIME;
	        		Map<String, Object> map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		Integer year = MapUtils.getInteger(map2, "year" );
	        		Integer yearTmp = year + 1900;
	        		String szYear  = yearTmp.toString();

	        		Integer month = MapUtils.getInteger(map2, "month" );
	        		Integer monthTmp = month+1;
	        		String szMonth = monthTmp.toString();

	        		String date = MapUtils.getString(map2, "date" );

	        		String hour = MapUtils.getString(map2, "hours" );
	        		String minutes = MapUtils.getString(map2, "minutes" );
	        		String seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setCURTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String MS			= 	MapUtils.getString(map1, Integer.toString(6) );
	        		lineData.setMS(MS);

	        		String MS2		=   MapUtils.getString(map1, Integer.toString(7) );
	        		lineData.setMS2(MS2);

	        		String RELATIVE_TIME			= 	MapUtils.getString(map1, Integer.toString(8) );

	        		tmp = RELATIVE_TIME;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setRELATIVE_TIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String RECVTIME			= 	MapUtils.getString(map1, Integer.toString(9) );
	        		lineData.setRECVTIME(RECVTIME);	              //时间

	        		tmp = RECVTIME;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setRECVTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String FAN			= 	MapUtils.getString(map1, Integer.toString(10) );
	        		lineData.setFAN(FAN);

	        		String FAULTTYPE			= 	MapUtils.getString(map1, Integer.toString(11) );
	        		lineData.setFAULTTYPE(FAULTTYPE);

	        		String ISDEBUG			= 	MapUtils.getString(map1, Integer.toString(12) );
	        		lineData.setISDEBUG(ISDEBUG);

	        		String PROPERTY			= 	MapUtils.getString(map1, Integer.toString(13) );
	        		lineData.setPROPERTY(PROPERTY);

	        		String REVERSE1			= 	MapUtils.getString(map1, Integer.toString(14) );
	        		lineData.setREVERSE1(REVERSE1);

	        		String REVERSE2			= 	MapUtils.getString(map1, Integer.toString(15) );
	        		lineData.setREVERSE2(REVERSE2);

	        		String REVERSE3			= 	MapUtils.getString(map1, Integer.toString(16) );
	        		lineData.setREVERSE3(REVERSE3);

	        		String REVERSE4			= 	MapUtils.getString(map1, Integer.toString(17) );
	        		lineData.setFAULTTYPE(REVERSE4);

	        		String sz61850REF			= 	MapUtils.getString(map1, Integer.toString(18) );
	        		lineData.setSz61850REF(sz61850REF);

	        		String PSRDATATYPE			= 	MapUtils.getString(map1, Integer.toString(19) );
	        		lineData.setPSRDATATYPE(PSRDATATYPE);

	        		String CURVALUE			= 	MapUtils.getString(map1, Integer.toString(20) );
	        		lineData.setCURVALUE(CURVALUE);

	        		String MSGID			= 	MapUtils.getString(map1, Integer.toString(21) );
	        		lineData.setMSGID(MSGID);

	        		String SIGNALTIME			= 	MapUtils.getString(map1, Integer.toString(22) );

	        		tmp = SIGNALTIME;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setSIGNALTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String RECORDTIME			= 	MapUtils.getString(map1, Integer.toString(23) );

	        		tmp = RECORDTIME;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setRECORDTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		lstItems_PtAction.add(lineData);


	        	}
	        }


			}catch(Exception e)
			{
				System.out.println(e.getMessage()) ;
                List<PtAction>  lstItems_PtAction1 = new ArrayList<PtAction>();
                return lstItems_PtAction1;
	    	}
	    	return lstItems_PtAction;
    }

    public List<PtAlarm> parseJsonUrl10(String jsonData)
    {
        List<PtAlarm>  lstItems_PtAlarm = new ArrayList<PtAlarm>();
		try{
			//String jsonData = "{\"COLUMDESC\":[{\"1\":\"ID\",\"2\":\"MSG\",\"3\":\"PT_ID\",\"4\":\"CPU\",\"5\":\"DI_ID\",\"6\":\"IS_ACK\",\"7\":\"VALUE\",\"8\":\"TIME\",\"9\":\"MS\",\"10\":\"ISDEBUG\",\"11\":\"VAL_SRC_TYPE\",\"12\":\"STRBACKUP1\",\"13\":\"STRBACKUP2\",\"14\":\"RECORDTIME\"}]}";

			System.out.println(jsonData);

	        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
	        System.out.println("===================================================");
	        System.out.println(map);

	        System.out.println("line Number : " + Integer.toString(map.size() - 1 ));

	        for( int i = 0; i < map.size(); i++)
	        {
	        	System.out.println("===================================================");
	        	if( 0 == i )
	        	{
	        		System.out.println("表列属性介绍如下：");
	        		String desc = MapUtils.getString(map, "COLUMDESC");
	        		String descItem = "COLUMDESC  :::: ";

	        		System.out.println(descItem + desc);

	        		int len = desc.length();
	        	    String szValue = desc.substring(1, len-1);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        	}else{
	        		String szInfo = 	"第";
	        		szInfo 		  += 	Integer.toString(i);
	        		szInfo 		  += 	"行数据如下：";

	        		System.out.println(szInfo);

	                String value = MapUtils.getString( map, Integer.toString(i) );
	        		System.out.println(value);

	        		int len = value.length();
	        	    String szValue = value.substring(1, len-1);

	        	    System.out.println(szValue);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        		PtAlarm lineData 	    = 	new PtAlarm();

	        		String ID			= 	MapUtils.getString(map1, Integer.toString(1) );
	        		lineData.setID(ID);

	        		String MSG			= 	MapUtils.getString(map1, Integer.toString(2) );
	        		lineData.setMSG(MSG);

	        		String PT_ID			= 	MapUtils.getString(map1, Integer.toString(3) );
	        		lineData.setPT_ID(PT_ID);

	        		String CPU 			=   MapUtils.getString(map1, Integer.toString(4) );
	        		lineData.setCPU(CPU);

	        		String DI_ID			= 	MapUtils.getString(map1, Integer.toString(5) );
	        		lineData.setDI_ID(DI_ID);


	        		String IS_ACK			= 	MapUtils.getString(map1, Integer.toString(6) );
	        		lineData.setIS_ACK(IS_ACK);

	        		String VALUE		=   MapUtils.getString(map1, Integer.toString(7) );
	        		lineData.setVALUE(VALUE);

	        		String TIME			= 	MapUtils.getString(map1, Integer.toString(8) );

	        		String tmp = TIME;
	        		Map<String, Object> map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		Integer year = MapUtils.getInteger(map2, "year" );
	        		Integer yearTmp = year + 1900;
	        		String szYear  = yearTmp.toString();

	        		Integer month = MapUtils.getInteger(map2, "month" );
	        		Integer monthTmp = month+1;
	        		String szMonth = monthTmp.toString();

	        		String date = MapUtils.getString(map2, "date" );

	        		String hour = MapUtils.getString(map2, "hours" );
	        		String minutes = MapUtils.getString(map2, "minutes" );
	        		String seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String MS			= 	MapUtils.getString(map1, Integer.toString(9) );
	        		lineData.setMS(MS);

	        		String ISDEBUG			= 	MapUtils.getString(map1, Integer.toString(10) );
	        		lineData.setISDEBUG(ISDEBUG);

	        		String VAL_SRC_TYPE			= 	MapUtils.getString(map1, Integer.toString(11) );
	        		lineData.setVAL_SRC_TYPE(VAL_SRC_TYPE);

	        		String STRBACKUP1			= 	MapUtils.getString(map1, Integer.toString(12) );
	        		lineData.setSTRBACKUP1(STRBACKUP1);

	        		String STRBACKUP2			= 	MapUtils.getString(map1, Integer.toString(13) );
	        		lineData.setSTRBACKUP2(STRBACKUP2);

	        		String RECORDTIME			= 	MapUtils.getString(map1, Integer.toString(14) );

	        		tmp = RECORDTIME;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setRECORDTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		lstItems_PtAlarm.add(lineData);

	        	}
	        }


			}catch(Exception e)
			{
				System.out.println(e.getMessage()) ;
                List<PtAlarm>  lstItems_PtAlarm1 = new ArrayList<PtAlarm>();
                return lstItems_PtAlarm1;
	    	}
	    	return lstItems_PtAlarm;
    }
    public List<PtChange> parseJsonUrl11(String jsonData)
    {
        List<PtChange>  lstItems_PtChange = new ArrayList<PtChange>();
		try{
			//String jsonData = "{\"COLUMDESC\":[{\"1\":\"ID\",\"2\":\"PT_ID\",\"3\":\"FILENAME\",\"4\":\"TRIGGER_TIME\",\"5\":\"MS\",\"6\":\"SAVEPATH\",\"7\":\"FILESIZE\",\"8\":\"DOWNLOAD\",\"9\":\"BFAULTFILE\",\"10\":\"STATION_ID\",\"11\":\"FAULT_TYPE\",\"12\":\"TRIGGER_TYPE\",\"13\":\"RECLOSE_TIME\",\"14\":\"FAULT_DISTANCE\",\"15\":\"IS_ACK\",\"16\":\"REVERSE1\",\"17\":\"REVERSE2\",\"18\":\"RECV_TIME\",\"19\":\"RECV_MS\",\"20\":\"FDEV_ID\",\"21\":\"IS_ANALYZE\",\"22\":\"START_DURATION\",\"23\":\"MAX_CURRENT\",\"24\":\"CHANNEL_NO\",\"25\":\"CHANNEL_NAME\",\"26\":\"IPHASEREVERSE\",\"27\":\"DOUBLE_DISTANCE\",\"28\":\"OPP_FILENAME\",\"29\":\"REVERSE3\",\"30\":\"SUFFIX\",\"31\":\"RECORDTIME\"}],\"1\":[{\"1\":4368,\"2\":\"京诚BH002\",\"3\":\"WDGL220_RCD_2426_20170523_165854_050.cfg\",\"4\":{\"date\":23,\"day\":2,\"hours\":16,\"minutes\":58,\"month\":4,\"nanos\":0,\"seconds\":54,\"time\":1495529934000,\"timezoneOffset\":-480,\"year\":117},\"5\":50,\"6\":\"京诚/录波器/220kV故障录波器WDGL-V(京诚BH002)\",\"7\":0,\"8\":1,\"9\":0,\"10\":\"none\",\"11\":\"NON\",\"12\":\"NON\",\"13\":0,\"14\":\"none\",\"15\":0,\"16\":\"none\",\"17\":\"1\",\"18\":{\"date\":23,\"day\":2,\"hours\":17,\"minutes\":18,\"month\":4,\"nanos\":0,\"seconds\":43,\"time\":1495531123000,\"timezoneOffset\":-480,\"year\":117},\"19\":0,\"20\":\"none\",\"21\":3,\"22\":0,\"23\":\"0\",\"24\":0,\"25\":\"0\",\"26\":0,\"30\":\",cfg\",\"31\":{\"date\":23,\"day\":2,\"hours\":16,\"minutes\":53,\"month\":4,\"nanos\":0,\"seconds\":38,\"time\":1495529618000,\"timezoneOffset\":-480,\"year\":117}}],\"2\":[{\"1\":4369,\"2\":\"京诚BH002\",\"3\":\"WDGL220_RCD_2427_20170524_155854_811.cfg\",\"4\":{\"date\":24,\"day\":3,\"hours\":15,\"minutes\":58,\"month\":4,\"nanos\":0,\"seconds\":54,\"time\":1495612734000,\"timezoneOffset\":-480,\"year\":117},\"5\":811,\"6\":\"京诚/录波器/220kV故障录波器WDGL-V(京诚BH002)\",\"7\":0,\"8\":1,\"9\":0,\"10\":\"none\",\"11\":\"NON\",\"12\":\"NON\",\"13\":0,\"14\":\"none\",\"15\":0,\"16\":\"none\",\"17\":\"1\",\"18\":{\"date\":24,\"day\":3,\"hours\":16,\"minutes\":18,\"month\":4,\"nanos\":0,\"seconds\":55,\"time\":1495613935000,\"timezoneOffset\":-480,\"year\":117},\"19\":0,\"20\":\"none\",\"21\":3,\"22\":0,\"23\":\"0\",\"24\":0,\"25\":\"0\",\"26\":0,\"30\":\",cfg\",\"31\":{\"date\":24,\"day\":3,\"hours\":15,\"minutes\":53,\"month\":4,\"nanos\":0,\"seconds\":46,\"time\":1495612426000,\"timezoneOffset\":-480,\"year\":117}}]}";

			System.out.println(jsonData);

	        Map<String, Object> map = JsonUtil.convertJsonStrToMap(jsonData);
	        System.out.println("===================================================");
	        System.out.println(map);

	        System.out.println("line Number : " + Integer.toString(map.size() - 1 ));

	        for( int i = 0; i < map.size(); i++)
	        {
	        	System.out.println("===================================================");
	        	if( 0 == i )
	        	{
	        		System.out.println("表列属性介绍如下：");
	        		String desc = MapUtils.getString(map, "COLUMDESC");
	        		String descItem = "COLUMDESC  :::: ";

	        		System.out.println(descItem + desc);

	        		int len = desc.length();
	        	    String szValue = desc.substring(1, len-1);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        	}else{
	        		String szInfo = 	"第";
	        		szInfo 		  += 	Integer.toString(i);
	        		szInfo 		  += 	"行数据如下：";

	        		System.out.println(szInfo);

	                String value = MapUtils.getString( map, Integer.toString(i) );
	        		System.out.println(value);

	        		int len = value.length();
	        	    String szValue = value.substring(1, len-1);

	        	    System.out.println(szValue);

	        		Map<String, Object> map1 = JsonUtil.convertJsonStrToMap(szValue);
	        		System.out.println(map1);

	        		PtChange lineData 	    = 	new PtChange();



	        		String ID			= 	MapUtils.getString(map1, Integer.toString(1) );
	        		lineData.setID(ID);

	        		String PT_ID			= 	MapUtils.getString(map1, Integer.toString(2) );
	        		lineData.setPT_ID(PT_ID);

	        		String FILENAME			= 	MapUtils.getString(map1, Integer.toString(3) );
	        		lineData.setFILENAME(FILENAME);

	        		String TRIGGER_TIME 			=   MapUtils.getString(map1, Integer.toString(4) );
//	        		lineData.setTRIGGER_TIME(TRIGGER_TIME);

	        		String tmp = TRIGGER_TIME;
	        		Map<String, Object> map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		Integer year = MapUtils.getInteger(map2, "year" );
	        		Integer yearTmp = year + 1900;
	        		String szYear  = yearTmp.toString();

	        		Integer month = MapUtils.getInteger(map2, "month" );
	        		Integer monthTmp = month+1;
	        		String szMonth = monthTmp.toString();

	        		String date = MapUtils.getString(map2, "date" );

	        		String hour = MapUtils.getString(map2, "hours" );
	        		String minutes = MapUtils.getString(map2, "minutes" );
	        		String seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setTRIGGER_TIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String MS			= 	MapUtils.getString(map1, Integer.toString(5) );
	        		lineData.setMS(MS);


	        		String SAVEPATH			= 	MapUtils.getString(map1, Integer.toString(6) );
	        		lineData.setSAVEPATH(SAVEPATH);

	        		String FILESIZE		=   MapUtils.getString(map1, Integer.toString(7) );
	        		lineData.setFILESIZE(FILESIZE);

	        		String DOWNLOAD			= 	MapUtils.getString(map1, Integer.toString(8) );
	        		lineData.setDOWNLOAD(DOWNLOAD);

	        		String BFAULTFILE			= 	MapUtils.getString(map1, Integer.toString(9) );
	        		lineData.setBFAULTFILE(BFAULTFILE);

	        		String STATION_ID			= 	MapUtils.getString(map1, Integer.toString(10) );
	        		lineData.setSTATION_ID(STATION_ID);

	        		String FAULT_TYPE			= 	MapUtils.getString(map1, Integer.toString(11) );
	        		lineData.setFAULT_TYPE(FAULT_TYPE);

	        		String TRIGGER_TYPE			= 	MapUtils.getString(map1, Integer.toString(12) );
	        		lineData.setTRIGGER_TYPE(TRIGGER_TYPE);

	        		String RECLOSE_TIME			= 	MapUtils.getString(map1, Integer.toString(13) );
	        		lineData.setRECLOSE_TIME(RECLOSE_TIME);

	        		String FAULT_DISTANCE			= 	MapUtils.getString(map1, Integer.toString(14) );
	        		lineData.setFAULT_DISTANCE( FAULT_DISTANCE );

	        		String IS_ACK			= 	MapUtils.getString(map1, Integer.toString(15) );
	        		lineData.setIS_ACK(IS_ACK);

	        		String REVERSE1			= 	MapUtils.getString(map1, Integer.toString(16) );
	        		lineData.setREVERSE1(REVERSE1);

	        		String REVERSE2			= 	MapUtils.getString(map1, Integer.toString(17) );
	        		lineData.setREVERSE2(REVERSE2);

	        		String RECV_TIME			= 	MapUtils.getString(map1, Integer.toString(18) );
//	        		lineData.setRECV_TIME(RECV_TIME);

	        		tmp = RECV_TIME;
	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
	        		System.out.println(map2);
	        		year = MapUtils.getInteger(map2, "year" );
	        		yearTmp = year + 1900;
	        		szYear  = yearTmp.toString();

	        		month = MapUtils.getInteger(map2, "month" );
	        		monthTmp = month+1;
	        		szMonth = monthTmp.toString();

	        		date = MapUtils.getString(map2, "date" );

	        		hour = MapUtils.getString(map2, "hours" );
	        		minutes = MapUtils.getString(map2, "minutes" );
	        		seconds = MapUtils.getString(map2, "seconds" );

	        		lineData.setRECV_TIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );

	        		String RECV_MS			= 	MapUtils.getString(map1, Integer.toString(19) );
	        		lineData.setRECV_MS(RECV_MS);


	        		String FDEV_ID			= 	MapUtils.getString(map1, Integer.toString(20) );
	        		lineData.setFDEV_ID(FDEV_ID);

	        		String IS_ANALYZE			= 	MapUtils.getString(map1, Integer.toString(21) );
	        		lineData.setIS_ANALYZE(IS_ANALYZE);

	        		String START_DURATION			= 	MapUtils.getString(map1, Integer.toString(22) );
	        		lineData.setSTART_DURATION(START_DURATION);

	        		String MAX_CURRENT			= 	MapUtils.getString(map1, Integer.toString(23) );
	        		lineData.setMAX_CURRENT(MAX_CURRENT);

	        		String CHANNEL_NO			= 	MapUtils.getString(map1, Integer.toString(24) );
	        		lineData.setCHANNEL_NO(CHANNEL_NO);

	        		String CHANNEL_NAME			= 	MapUtils.getString(map1, Integer.toString(25) );
	        		lineData.setCHANNEL_NAME(CHANNEL_NAME);

	        		String IPHASEREVERSE			= 	MapUtils.getString(map1, Integer.toString(26) );
	        		lineData.setIPHASEREVERSE(IPHASEREVERSE);

	        		String DOUBLE_DISTANCE			= 	MapUtils.getString(map1, Integer.toString(27) );
	        		lineData.setDOUBLE_DISTANCE(DOUBLE_DISTANCE);

	        		String OPP_FILENAME			= 	MapUtils.getString(map1, Integer.toString(28) );
	        		lineData.setOPP_FILENAME(OPP_FILENAME);

	        		String REVERSE3			= 	MapUtils.getString(map1, Integer.toString(29) );
	        		lineData.setREVERSE3(REVERSE3);

	        		String SUFFIX			= 	MapUtils.getString(map1, Integer.toString(30) );
	        		lineData.setSUFFIX(SUFFIX);

	        		String RECORDTIME			= 	MapUtils.getString(map1, Integer.toString(29) );
             		lineData.setRECORDTIME(RECORDTIME);

//	        		tmp = RECORDTIME;
//	        		map2 = JsonUtil.convertJsonStrToMap(tmp);
//	        		System.out.println(map2);
//	        		year = MapUtils.getInteger(map2, "year" );
//	        		yearTmp = year + 1900;
//	        		szYear  = yearTmp.toString();
//
//	        		month = MapUtils.getInteger(map2, "month" );
//	        		monthTmp = month+1;
//	        		szMonth = monthTmp.toString();
//
//	        		date = MapUtils.getString(map2, "date" );
//
//	        		hour = MapUtils.getString(map2, "hours" );
//	        		minutes = MapUtils.getString(map2, "minutes" );
//	        		seconds = MapUtils.getString(map2, "seconds" );

//	        		lineData.setRECORDTIME( szYear + "-" + szMonth + "-" + date + " " + hour + ":" + minutes + ":" + seconds );


	        		lstItems_PtChange.add(lineData);

	        	}
	        }

			}catch(Exception e)
			{
				System.out.println(e.getMessage()) ;
                List<PtChange>  lstItems_PtChange1 = new ArrayList<PtChange>();
                return lstItems_PtChange1;
	    	}

	    	return lstItems_PtChange;
    }
    public List<PtOsc> parseJsonUrl12(String jsonData)
    {
      return null;
    }
}
