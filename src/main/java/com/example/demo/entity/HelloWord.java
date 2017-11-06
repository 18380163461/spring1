package com.example.demo.entity;

public class HelloWord {
    private String name;

    public HelloWord() {
        System.out.println("HelloWord---- HelloWord()");
    }

    public String getName() {
        Teacher teacher=new Teacher();
        System.out.println("HelloWord----- getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("HelloWord------setName");
        this.name = name;
    }

    public void sayHellow() {
        System.out.println("HelloWord---- sayHellow");
        System.out.println(name);
    }
}
