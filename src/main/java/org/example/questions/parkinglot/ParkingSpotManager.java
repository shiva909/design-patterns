package org.example.questions.parkinglot;

import java.util.List;

public abstract  class ParkingSpotManager {
    List<ParkingSpot> spots;
    public ParkingSpotManager(List<ParkingSpot> spotList){
        this.spots=spotList;
    }
     public abstract ParkingSpot findParkingSpace();

    public void parkVehicle(Vehicle V){
        ParkingSpot spot=findParkingSpace();
        spot.parkVehicle(V);
    }
    public void removeVehicle(Vehicle v){
        for(ParkingSpot spot:spots){
            if(spot.vehicle!=null && spot.vehicle.equals(v)){
                spot.removeVehicle();
                break;
            }
        }
    }
    public void addParkingSpot(ParkingSpot p){
        //future Impl;
    }
    public void removeParkingSpot(ParkingSpot p){
        //future Impl
    }
}
