package org.example.strategy;

//No Extra-driving capacities -parent ones are enough
public class PassengerVehicle extends Vehicle {
    PassengerVehicle(){
        super(new NomalDriveStrategy());
    }

}
