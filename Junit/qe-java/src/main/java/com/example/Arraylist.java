package com.example;

import java.util.ArrayList;

public class Arraylist {
   


    public static void main(String[] args) {
         ArrayList<String> myList=new ArrayList<>();
    
    myList.add("karthik");
    myList.add("Pavan");
    myList.add("trived");
    myList.add("Prakash");
    myList.add("Abhiram");
    for (String x:myList){
        System.out.println(x);
    }
    System.out.println(myList.get(2));
    }
    
}
