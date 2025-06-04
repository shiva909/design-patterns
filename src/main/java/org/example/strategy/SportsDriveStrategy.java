package org.example.strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("level-1 driving capabilities");
    }
}
