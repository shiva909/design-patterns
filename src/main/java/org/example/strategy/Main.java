package org.example.strategy;
//Avoid duplicate Code
//Focus on Reusablity like drive() Imp in OffRoadVehicle,SportsVehicle
//1)NormalDriveStrategy
//2)SportsDriveStrategy             3)interface-there 3 avoided duplicate code completely
public class Main {

    public static void main(String[] args) {
        Vehicle v=new OffRoadVehicle();
        v.drive();
        Vehicle c=new SportsVehicle();
        c.drive();
    }

}
