package org.example.questions.parkinglot;


import java.sql.Time;
import java.util.Date;
import java.util.List;

public class EntranceGate {
//    private Ticket ticket;
    private ParkingSpotManagerFactory factory;
//    private ParkingSpotManager factory;
    EntranceGate(ParkingSpotManagerFactory factory){
        this.factory=factory;
    }
    ParkingSpot findParkingSpace(VehicleType vehicleType, List<ParkingSpot> spots){
        ParkingSpotManager manager=factory.getParkingSpotManager(vehicleType,spots);
        return  manager.findParkingSpace();
    }
    Ticket generateTicket(Vehicle vehicle,ParkingSpot parkingSpot){
        //Impl to generate ticket
        //Ticket  ticket=new Ticket()
        return null;
    }

}
