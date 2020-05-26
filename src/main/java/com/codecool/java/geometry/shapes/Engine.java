package com.codecool.java.geometry.shapes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.codecool.java.geometry.containers.ShapeList;

public class Engine {
    public static Scanner scan;
    public static ShapeList shapes;
    public static String[] menuList;
    public static Map<String, Runnable> shapesMap;

    public static void initialize() {
        scan = new Scanner(System.in);
        scan.useDelimiter(System.lineSeparator());
        shapes = new ShapeList();
        menuList = new String[] { "Add new item", "Get list of shapes", "Get largest shape by perimeter",
                "Get largest shape by area", "Show formulas", "Display table of shapes", "Exit" };
        shapesMap = new HashMap<>();
        shapesMap.put("RECTANGLE", () -> addRectangle());
        shapesMap.put("SQUARE", () -> addSquare());
        shapesMap.put("TRIANGLE", () -> addTriangle());
        shapesMap.put("EQUILATERAL TRIANGLE", () -> addEquilateralTriangle());
        shapesMap.put("CIRCLE", () -> addCircle());
        shapesMap.put("REGULAR PENTAGON", () -> addRegularPentagon());
    }

    public static void displayMenu() {
        int i = 1;
        System.out.println("");
        for (String menuOption : menuList) {
            System.out.println(i + ". " + menuOption);
            i++;
        }
        System.out.println("");

    }

    public static String gatherInput(String title) {
        System.out.println(title);
        String userInput = scan.next().toUpperCase();
        return userInput;
    }

    public static int gatherIntInput(String title) {
        System.out.println(title);
        int userInput = scan.nextInt();
        return userInput;
    }

    public static void printOutShapes() {
        for (String shape : shapesMap.keySet()) {
            System.out.println(shape);
        }
    }

    public static void addNewShape() {
        printOutShapes();
        System.out.println("");
        String userShape = gatherInput("Type in the shape you want to add.");
        shapesMap.get(userShape).run();
    }

    public static void addRectangle() {
        int sideA = gatherIntInput("Provide the length of side A.");
        int sideB = gatherIntInput("Provide the length of side B.");
        Rectangle rectangle = new Rectangle(sideA, sideB);
        shapes.addShape(rectangle);
        System.out.println("Succesfully created a rectangle shape.");
    }

    public static void addSquare() {
        int sideA = gatherIntInput("Provide the length of side A.");
        Square square = new Square(sideA);
        shapes.addShape(square);
        System.out.println("Succesfully created a square shape.");
    }

    public static void addTriangle() {
        int sideA = gatherIntInput("Provide the length of side A.");
        int sideB = gatherIntInput("Provide the length of side B.");
        int sideC = gatherIntInput("Provide the length of side C.");
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        shapes.addShape(triangle);
        System.out.println("Succesfully created a triangle shape.");
    }

    public static void addEquilateralTriangle() {
        int sideA = gatherIntInput("Provide the length of side A.");
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(sideA);
        shapes.addShape(equilateralTriangle);
        System.out.println("Succesfully created a equilateralTriangle shape.");
    }

    public static void addCircle() {
        int radius = gatherIntInput("Provide the length of the radius.");
        Circle circle = new Circle(radius);
        shapes.addShape(circle);
        System.out.println("Succesfully created a circle shape.");
    }

    public static void addRegularPentagon() {
        int sideA = gatherIntInput("Provide the length of side A.");
        RegularPentagon regularpentagon = new RegularPentagon(sideA);
        shapes.addShape(regularpentagon);
        System.out.println("Succesfully created a regular pentagon shape.");
    }

    public static void showFormulas() {
        printOutShapes();
        System.out.println("");
        String userChoice = gatherInput("Which shape's formulas do you wish to get?");
        switch (userChoice) {
            case "RECTANGLE":
                System.out.println(Rectangle.AREA_FORMULA);
                System.out.println(Rectangle.PERIMETER_FORMULA);
                break;
            case "SQUARE":
                System.out.println(Square.AREA_FORMULA);
                System.out.println(Square.PERIMETER_FORMULA);
                break;
            case "TRIANGLE":
                System.out.println(Triangle.AREA_FORMULA);
                System.out.println(Triangle.PERIMETER_FORMULA);
                break;
            case "EQUILATERAL_TRIANGLE":
                System.out.println(EquilateralTriangle.AREA_FORMULA);
                System.out.println(EquilateralTriangle.PERIMETER_FORMULA);
                break;
            case "REGULAR_PENTAGON":
                System.out.println(RegularPentagon.AREA_FORMULA);
                System.out.println(RegularPentagon.PERIMETER_FORMULA);
                break;
            case "CIRCLE":
                System.out.println(Circle.AREA_FORMULA);
                System.out.println(Circle.PERIMETER_FORMULA);
                break;
        }
    }
}