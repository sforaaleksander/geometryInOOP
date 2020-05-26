package com.codecool.java.geometry;

import com.codecool.java.geometry.shapes.Engine;

public class Main {

    public static void main(String[] args) {
        Engine.initialize();
        boolean isRunning = true;

        while (isRunning) {
            Engine.displayMenu();
            int option = Engine.gatherIntInput("");
            switch (option) {
                case 1:
                    Engine.addNewShape();
                    break;
                case 2:
                    System.out.println(Engine.shapes.getShapesNames());
                    break;
                case 3:
                    System.out.println("The largest shape by perimeter:");
                    System.out.println(Engine.shapes.getLargestShapeByPerimeter().toString());
                    break;
                case 4:
                    System.out.println("The largest shape by area:");
                    System.out.println(Engine.shapes.getLargestShapeByArea().toString());
                    break;
                case 5:
                    Engine.showFormulas();
                    break;
                case 6:
                    System.out.println(Engine.shapes.createShapesTable());
                    break;
                case 7:
                    isRunning = false;
                    Engine.scan.close();
                    break;

            }
        }
    }
}
