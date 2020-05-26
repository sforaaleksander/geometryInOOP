package com.codecool.java.geometry.shapes;

public class Rectangle extends Shape {
    private float sideA;
    private float sideB;
    public static final String AREA_FORMULA = "a×b";
    public static final String PERIMETER_FORMULA = "2a + 2b";

    Rectangle(float sideA, float sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA*sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2*sideA + 2*sideB;
    }

    @Override
    public String getAreaFormula() {
        return AREA_FORMULA;
    }

    @Override
    public String getPerimeterFormula() {
        return PERIMETER_FORMULA;
    }

    public String toString(){
        String info = "";
        info = getClass().getSimpleName() + ", a=" + sideA + ", b=" + sideB;
        return info;
    }
}
