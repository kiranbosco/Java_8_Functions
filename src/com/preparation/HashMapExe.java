package com.preparation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExe {


    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"kiran");
        map.put(2,"kumar");
        map.put(3,"purini");

     for(Map.Entry<Integer,String> set :map.entrySet()){
         System.out.println(set.getKey() + " " + set.getValue());
     }
    }
}
