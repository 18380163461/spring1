package com.example.aop;

public class TestAop {
    public static void main(String args[]) {
        Calculator calculator = new CalculatorImpl();
        Calculator proxy=new  CalculatorLoggerImplProxy(calculator).getProxy();
        proxy.add(1,2);
    }
}
