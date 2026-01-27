package com.example;

public class arraysum {
    public static void main(String[] args){
        int arr[]={10,77,10,54,-11,10};
        int s=0;
        for (int x:arr){
            if(x==10){
                s+=x;
            }
        }
        if (s==30){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
        
    }
}
