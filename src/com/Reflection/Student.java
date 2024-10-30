package com.Reflection;

public class Student extends People {
    private String name;
    private int age;
    public String test;
    protected boolean test2;

    //公共构造方法
    public Student() {
    }
    private Student(String name){
        this.name = name;
    }

    //
    protected Student(int age){
        this.age = age;
    }

    //私有构造方法
    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int test1(int a){
        return a;
    }


    private boolean test3(boolean b){
        return b;
    }

    private void eat(String s){
        System.out.println(s);
    }
    private String eat(String s, int i)throws Exception{
        System.out.println(i + "岁的学生在吃" + s);
        return "返回值";
    }
}
