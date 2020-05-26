package com.codecool.java.geometry.shapes;


public class Circle extends Shape {
    private float radius;
    private final double PI = java.lang.Math.PI;
    public static final String AREA_FORMULA = "π×r^2";
    public static final String PERIMETER_FORMULA = "2×π×r";


    Circle(float radius){
        this.radius = radius;
    }
    
    @Override
    public double calculateArea(){
        return Math.pow((PI*radius), 2);
    }
    
    @Override
    public double calculatePerimeter(){
        return 2 * PI * radius;
    }

    @Override
    public String getAreaFormula(){
        return AREA_FORMULA;
    }

    @Override
    public String getPerimeterFormula(){
        return PERIMETER_FORMULA;
    }

    public String toString(){
        String info = "";
        info = getClass().getSimpleName() + ", r = " + radius;
        return info;
    }
}
