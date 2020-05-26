package com.codecool.java.geometry.containers;

import java.util.ArrayList;
import java.util.List;
import com.codecool.java.geometry.shapes.Shape;

public class ShapeList {
    private List<Shape> shapes;

    public ShapeList() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public Shape getShapeAt(int index) {
        return shapes.get(index);
    }

    public String createShapesTable() {
        String table = "";
        String leftAlignFormat = "|%-3d|%-22s|%-36s|%-15f|%-22s|%-15f|%-24s|%n";
        String leftAlignTitle = "|%-3s|%-22s|%-36s|%-15s|%-22s|%-15s|%-24s|%n";

        String dash = "-";
        String deli = "|";
        String borderLine = dash.repeat(145) + "\n";
        // String titleLine = deli + String.format("%-3s", "ID") + deli + String.format("%-22s", "CLASS") + deli
        //                     +  String.format("%-36s", "TOSTRING") + deli + String.format("%-15s", "PERIMETER") + deli
        //                     + String.format("%-22s", "PERIMETER FORMULA") + deli + String.format("%-15s", "AREA") + deli
        //                     + String.format("%-24s", "AREA FORMULA") + deli + "\n";

        String titleLine = String.format(leftAlignTitle, "ID", "CLASS", "TOSTRING", "PERIMETER",
                                                          "PERIMETER FORMULA", "AREA", "AREA FORMULA");

        table = borderLine + titleLine + borderLine;
        int i = 1;
        for (Shape element : shapes){
            table += String.format(leftAlignFormat, i, element.getClass().getSimpleName(), element.toString(), element.calculatePerimeter(),
                     element.getPerimeterFormula(), element.calculateArea(), element.getAreaFormula());
            table += borderLine;
            i++;
        }
        return table;
    }

    public String getShapesNames() {
        String list = "";
        for (Shape element : shapes) {
            list += element.getClass().getSimpleName() + "\n";
        }
        return list;
    }

    public Shape getLargestShapeByPerimeter() {
        double max = 0;
        Shape bigShape = null;
        for (Shape element : shapes){
            if (element.calculatePerimeter() > max){
                max = element.calculatePerimeter();
                bigShape = element;
            }
        }
        return bigShape;
    }

    public Shape getLargestShapeByArea() {
        double max = 0;
        Shape bigShape = null;
        for (Shape element : shapes){
            if (element.calculateArea() > max){
                max = element.calculateArea();
                bigShape = element;
            }
        }
        return bigShape;
    }

    // public String getFormulas(){
    //     String list = "";
    //     for (Shape element : shapes){
    //         element.getAreaFormula();
    //     }
    // }
}
