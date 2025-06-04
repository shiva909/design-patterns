package org.example.questions.parkinglot;

public class Ticket {
     long entryTime;
     ParkingSpot parkingSpot;
     Vehicle vehicle;
    Ticket(long entryTime,ParkingSpot spot,Vehicle vehicle){
        this.entryTime=entryTime;
        this.vehicle=vehicle;
        this.parkingSpot=spot;
    }
}
