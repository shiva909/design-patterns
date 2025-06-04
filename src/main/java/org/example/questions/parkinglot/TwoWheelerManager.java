package org.example.questions.parkinglot;

import java.util.List;

public class TwoWheelerManager extends ParkingSpotManager{
    TwoWheelerManager(List<ParkingSpot> spotList){
        super(spotList);
    }

    @Override
    public ParkingSpot findParkingSpace() {
        //Impl to find nearest parking spot for two-wheelers
        return null;
    }
}
