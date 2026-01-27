package com.example;

class car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    car(){
        tyres=4;
        doors=4;

    }
    public void displayCharacteristics(){
        System.out.println("car make:"+make);
        System.out.println("car color:"+color);
        System.out.println("car transmission:"+transmission);
        System.out.println("car tyres:"+tyres);
        System.out.println("car doors:"+doors);
    }
    public void accelerate(){
        System.out.println("car is moving");
    }
    public void brake(){
        System.out.println("Car is stopped");
    }
}


class Activity1{
    public static void main(String[] args){
        car carname=new car();
        carname.make=2014;
        carname.color="black";
        carname.transmission="manual";
        carname.displayCharacteristics();
        carname.accelerate();
        carname.brake();

    }
}