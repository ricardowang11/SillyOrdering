package com.example.demo.utils;

import com.example.demo.bean.Item;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wangqin
 * @Date: 2021/5/1 0001 - 05 -01 -19:09
 * @Description: com.example.demo.utils
 * @version: 1.0
 */
public class HASUtils {
    public String HToString(HashMap<Integer, Integer> map) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (i != 0) {
                sb.append("_");
            }
            sb.append(entry.getKey());
            sb.append('&');
            sb.append(entry.getValue());
            i++;
        }
        return sb.toString();
    }
    public HashMap<Integer,Integer> StringToH(String s){
        String[] entries = s.split("_");
        HashMap<Integer,Integer> map=new HashMap<>();
        for (String entry : entries) {
            String[] split = entry.split("&");
            map.put(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
        return map;
    }
}
