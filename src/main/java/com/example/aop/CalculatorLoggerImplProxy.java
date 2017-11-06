package com.example.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorLoggerImplProxy {
    public CalculatorLoggerImplProxy(Calculator target) {
        this.target = target;
    }

    private Calculator target;

    public Calculator getProxy() {
        Calculator proxy;
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class[] interfaecs = new Class[]{Calculator.class};
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("invoke");
                Object object = method.invoke(target, args);
                System.out.println("invoke的结果是：" + object);
                return object;
            }
        };
        proxy = (Calculator) Proxy.newProxyInstance(classLoader, target.getClass().getInterfaces(), invocationHandler);
        return proxy;
    }
}
