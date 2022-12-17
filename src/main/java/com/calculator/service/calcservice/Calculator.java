package com.calculator.service.calcservice;

public class Calculator {

    private int x;
    private int y;
    private int Result;


    public Calculator(int x, int y, int result) {
        this.x = x;
        this.y = y;
        Result = result;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getResult() {
        return Result;
    }
}
