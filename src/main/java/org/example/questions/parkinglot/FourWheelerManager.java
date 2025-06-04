package org.example.questions.parkinglot;

import java.util.List;

public class FourWheelerManager extends ParkingSpotManager{

    FourWheelerManager(List<ParkingSpot> spotList){
        super(spotList);
    }

    @Override
    public ParkingSpot findParkingSpace() {
        //Implementation to find nearest parking spot for four wheeler
        return null;
    }
}
