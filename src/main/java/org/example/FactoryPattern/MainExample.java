package org.example.FactoryPattern;

import javax.swing.plaf.TableHeaderUI;

public class MainExample {

    public static void main(String[] args) throws InterruptedException {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape c=shapeFactory.getShape("CIRCLE");
        c.draw();
        Thread.sleep(2000);
        Shape r=shapeFactory.getShape("RECTANGLE");
        r.draw();
    }
}
