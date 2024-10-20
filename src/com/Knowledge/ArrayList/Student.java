package com.Knowledge.ArrayList;

public class Student {
    //标准的javabean

    //私有的成员变量
    private String name;
    private int age;


    //空参构造方法
    public Student(){

    }

    //全部参数构造方法
    public Student(String name , int age){
        this.age = age;
        this.name = name;
    }

    //get,set方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
