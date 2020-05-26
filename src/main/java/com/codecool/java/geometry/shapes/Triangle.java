package com.codecool.java.geometry.shapes;

public class Triangle extends Shape {
    private float sideA;
    private float sideB;
    private float sideC;
    private float semiPerimeter;
    public static final String AREA_FORMULA = "sqrt(s(s-a)(s-b)(s-c))";
    public static final String PERIMETER_FORMULA = "a+b+c";


    Triangle(float sideA, float sideB, float sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.semiPerimeter = (sideA + sideB + sideC)/2;
    }

    @Override
    public double calculateArea() {
        return Math.sqrt((semiPerimeter-sideA)*(semiPerimeter - sideB)*(semiPerimeter - sideC));
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    // @Override
    public String getAreaFormula(){
        return AREA_FORMULA;
    }

    // @Override
    public String getPerimeterFormula(){
        return PERIMETER_FORMULA;
    }

    public String toString(){
        String info = "";
        info = getClass().getSimpleName() + ", a=" + sideA + ", b=" + sideB + ", c=" +sideC;
        return info;
    }
}
