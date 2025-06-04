package org.example.strategy;

//Duplicate Code for drive() of Sports,OffRoad Vehicle
public class SportsVehicle extends Vehicle {
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
