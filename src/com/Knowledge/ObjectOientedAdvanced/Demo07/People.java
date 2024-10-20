package com.Knowledge.ObjectOientedAdvanced.Demo07;

public abstract class People {
    //父类
   private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People() {
    }

    //抽象行为
    public abstract void action();
}

