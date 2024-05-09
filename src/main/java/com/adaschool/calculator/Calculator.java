package com.adaschool.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) throws Exception {
        if (b != 0) {
            return a / b;
        }
        throw new Exception("Error");
    }
}
