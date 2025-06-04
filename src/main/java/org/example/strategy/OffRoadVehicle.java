package org.example.strategy;

//Duplicate Code for drive() of Sports,OffRoad Vehicle
public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
