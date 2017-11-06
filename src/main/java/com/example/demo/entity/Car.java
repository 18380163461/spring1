package com.example.demo.entity;

public class Car {
    private String name;
    private int peice;
    private String color;
    public Car() {
    }

     Car(String name, int peice) {
        this.name = name;
        this.peice = peice;
    }

/*    public Car(int peice, String color) {
        this.peice = peice;
        this.color = color;
    }*/

    public Car(String name, int peice, String color) {
        this.name = name;
        this.peice = peice;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeice() {
        return peice;
    }

    public void setPeice(int peice) {
        this.peice = peice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", peice=" + peice +
                '}';
    }
}
