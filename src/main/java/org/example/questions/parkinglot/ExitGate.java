package org.example.questions.parkinglot;

import java.util.ArrayList;

public class ExitGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory){
        this.parkingSpotManagerFactory=parkingSpotManagerFactory;
    }
    public void removeVehicle(Ticket ticket){
        ParkingSpotManager manager=parkingSpotManagerFactory.getParkingSpotManager(ticket.vehicle.vehicleType,
                new ArrayList<>());
        manager.removeVehicle(ticket.vehicle);
//      Not Like This
//        ParkingSpot parkingSpot=ticket.parkingSpot;
//        parkingSpot.removeVehicle();
    }
}
