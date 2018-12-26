package com.musk.test.container;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[]args){
        Map<String,String>testMap=new HashMap<>();
        testMap.put("d","aaa");
        testMap.put("b","bbb");
        testMap.put("c","ccc");
        testMap.put("e","eee");
        testMap.put("a","ddd");
        System.out.println("testMap:"+testMap.toString());
    }
}
