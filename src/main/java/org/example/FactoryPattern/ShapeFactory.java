package org.example.FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String input){
        switch (input){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default: return null;
        }
    }
}
