package com.example;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> myMap=new HashMap<>();
        myMap.put(1,"red");
        myMap.put(2,"yellow");
        myMap.put(3,"blue");
        myMap.put(4,"black");
        myMap.put(5,"green");
        System.out.println(myMap);
        myMap.remove(5);
        System.out.println(myMap);
        System.out.println(myMap.containsValue("green"));
        System.out.println(myMap.size());

    }
}
