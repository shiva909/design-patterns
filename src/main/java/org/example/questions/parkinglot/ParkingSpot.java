package org.example.questions.parkinglot;

public class ParkingSpot {
    private int id;
     Vehicle vehicle;
    private boolean isEmpty;
    private int price;
    ParkingSpot(int id,int price){
        this.id=id;
        this.isEmpty=true;
        this.price=price;
        this.vehicle=null;
    }
    public void parkVehicle(Vehicle v){
        isEmpty=false;
        this.vehicle=v;
    }
    public void removeVehicle(){
        this.vehicle=null;
        isEmpty=true;
    }

}
