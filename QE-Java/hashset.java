package com.example;

import java.util.HashSet;

public class hashset {
public static void main(String[] args) {
    HashSet<String> myList=new HashSet<>();
    myList.add("pavan");
    myList.add("karthik");
    myList.add("trived");
    myList.add("prakash");
    myList.add("abhiram");
    myList.add("mani");
    System.out.println(myList.size());
    myList.remove("pavan");
    System.out.println(myList);
   System.out.println( myList.remove("krishna"));
    System.out.println(myList.contains("karthik"));
    System.out.println(myList);
}
}
