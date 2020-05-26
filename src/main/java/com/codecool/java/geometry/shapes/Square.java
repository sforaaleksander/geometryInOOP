package com.codecool.java.geometry.shapes;

public class Square extends Rectangle {
    public static final String AREA_FORMULA = "a×a";
    public static final String PERIMETER_FORMULA = "4×a";
    private float sideA;

    Square(float sideA) {
        super(sideA, sideA);
        this.sideA = sideA;
    }

    public String toString(){
        String info = "";
        info = getClass().getSimpleName() + ", a=" + sideA;
        return info;
    }
}
