package com.example;

public class Mybook extends activity5{
    public void setTitle(String s){
        title=s;
        
    }
    public static void main(String[] args) {
        Mybook newbook=new Mybook();
        newbook.setTitle("car");
        System.out.println("The title of this book"+newbook.getTitle());
    }

}
