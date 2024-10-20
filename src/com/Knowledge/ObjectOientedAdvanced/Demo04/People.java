package com.Knowledge.ObjectOientedAdvanced.Demo04;

public class People {
    private String id;
    private String name;
    private double money;

    public People() {
    }

    public People(String id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void work(){
        System.out.println("员工工作");
    }
    public void eat(){
        System.out.println("吃米饭");
    }
}
