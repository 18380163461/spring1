package com.example.jdbcxml;

public class User {
    private int id;
    private String name;
    private String departmentid;
    private int money;

    public User() {
    }

    public User(int id, String name, String departmentid, int money) {
        this.id = id;
        this.name = name;
        this.departmentid = departmentid;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setId(int id) {
        this.id = id;
    }
}
