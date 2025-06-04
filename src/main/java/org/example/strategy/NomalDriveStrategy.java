package org.example.strategy;

public class NomalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal Driving Capabilities");
    }
}
