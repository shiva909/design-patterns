package org.example.questions.parkinglot;

import java.util.List;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType type, List<ParkingSpot> spots){
        if(type==VehicleType.TWO_WHEELER)
            return new TwoWheelerManager(spots);
        else if (type==VehicleType.FOUR_WHEELER) {
            return new FourWheelerManager(spots);
        }else{
            return null;
        }
    }
}
