package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {
    public static final String AREA_FORMULA = "sqrt(s(s-a)×3)";
    public static final String PERIMETER_FORMULA = "3×a";
    private float sideA;
    
    EquilateralTriangle(float sideA) {
        super(sideA, sideA, sideA);
        this.sideA = sideA;
    }

    public String toString(){
        String info = "";
        info = getClass().getSimpleName() + ", a = " + sideA;
        return info;
    }
}
