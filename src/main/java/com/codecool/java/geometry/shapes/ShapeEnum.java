package com.codecool.java.geometry.shapes;

public enum ShapeEnum {
    RECTANGLE(2), SQUARE(1), TRIANGLE(3), EQUILATERAL_TRIANGLE(1), CIRCLE(1), REGULAR_PENTAGON(1);

    private final int numOfArgs;

    ShapeEnum(int numOfArgs) {
        this.numOfArgs = numOfArgs;
    }

    public int getNumOfArgs(){
        return numOfArgs;
    }

}
