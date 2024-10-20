package com.Stream.Demo02;

public class Actor {
    private String name;
    private int age;

    public Actor() {
    }
    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    @Override
    public String toString() {
        return "Actor [name=" + name + ", age=" + age + "]";
    }

    

}
