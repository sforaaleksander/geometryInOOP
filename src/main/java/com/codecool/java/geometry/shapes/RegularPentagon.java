package com.codecool.java.geometry.shapes;

public class RegularPentagon extends Shape {
    private float sideA;
    public static final String AREA_FORMULA = "(a^2 * sqrt(5(5+2sqrt(5))))/4";
    public static final String PERIMETER_FORMULA = "a×5";

    RegularPentagon(float sideA){
        this.sideA = sideA;
    }

    public double calculateArea(){
        return (Math.pow(sideA,2) *  Math.sqrt(5 * (5+2 * Math.sqrt(5))))/4;
    }

    public double calculatePerimeter(){
        return sideA * 5;
    }

    public String getAreaFormula(){
        return AREA_FORMULA;
    }

    public String getPerimeterFormula(){
        return PERIMETER_FORMULA;
    }

    public String toString(){
        String info = "";
        info = getClass().getSimpleName() + ", a=" + sideA;
        return info;
    }
}
