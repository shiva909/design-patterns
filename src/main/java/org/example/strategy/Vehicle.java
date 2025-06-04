package org.example.strategy;


//Constrction Injection, Dynamic Method call
public class Vehicle {
    DriveStrategy strategy;
    Vehicle(DriveStrategy obj){
        this.strategy=obj;
    }
    public void drive(){
        strategy.drive();
    }

}
