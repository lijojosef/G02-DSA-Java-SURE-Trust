package com.lijo.basics.functions;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Grape");
        map.put(4, "Orange");

        //accessing
        String firstFruit = map.get(1);
        //remove
//        map.remove(2);
        //checking the value
        map.containsKey(2); //true
        map.containsValue("Apple"); // true

        //iterate:
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
