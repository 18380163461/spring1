package com.example.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop1 {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicatinContext.xml");
        Calculator calculator = applicationContext.getBean(Calculator.class);
        int result = calculator.add(2, 3);
        System.out.println(result);
    }
}
