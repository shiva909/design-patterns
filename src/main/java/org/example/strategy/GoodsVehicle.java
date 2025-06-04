package org.example.strategy;

public class GoodsVehicle extends Vehicle {
    GoodsVehicle(){
        super(new NomalDriveStrategy());
    }

}
