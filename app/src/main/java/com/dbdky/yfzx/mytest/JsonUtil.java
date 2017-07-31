package com.dbdky.yfzx.mytest;
import java.util.Map;

import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.JSON;
/**
 * Created by Administrator on 2017/7/30 0030.
 */

public class JsonUtil {
    /**
     * 将json转化成map
     * @param jsonStr
     * @return
     */
    public static Map<String, Object>   convertJsonStrToMap(String jsonStr){

        Map<String, Object> map = JSON.parseObject(
                jsonStr,new TypeReference<Map<String, Object>>(){} );

        return map;
    }
}
