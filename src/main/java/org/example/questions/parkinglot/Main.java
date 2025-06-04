package org.example.questions.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ParkingSpot> spots=new ArrayList<>();
        for(int i=1;i<=100;i++){
            if(i<=50)
                spots.add(new ParkingSpot(i,20));
            else
                spots.add(new ParkingSpot(i,100));
        }
        ParkingSpotManagerFactory factory=new ParkingSpotManagerFactory();
        EntranceGate entranceGate=new EntranceGate(factory);
        ExitGate exitGate=new ExitGate(factory);
        Vehicle vehicle=new Vehicle(123,VehicleType.TWO_WHEELER);
        ParkingSpot spot=entranceGate.findParkingSpace(VehicleType.TWO_WHEELER,spots);
        Ticket ticket=entranceGate.generateTicket(vehicle,spot);
        exitGate.removeVehicle(ticket);



    }
}
