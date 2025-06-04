package org.example;

import org.example.withoutstrategy.OffRoadVehicle;
import org.example.withoutstrategy.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v=new OffRoadVehicle();
        v.drive();
        System.out.println("Hello world!");
    }
}