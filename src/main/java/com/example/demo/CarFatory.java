package com.example.demo;

import com.example.demo.entity.Car;

import java.util.HashMap;
import java.util.Map;

public class CarFatory {
    private static Map<String, Car> map = new HashMap();

    static {
        map.put("aodi", new Car("aodi", 999, "red"));
    }

    public static Car getCar(String name) {
        Car car=map.get(name);
        return  car;
    }
}
