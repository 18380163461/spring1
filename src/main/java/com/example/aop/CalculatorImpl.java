package com.example.aop;

public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        System.out.println("add");
        int result = i + j;
        System.out.println(result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("sub");
        int result = i - j;
        System.out.println(result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("mul");
        int result = i * j;
        System.out.println(result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("div");
        int result = i / j;
        System.out.println(result);
        return result;
    }
}
