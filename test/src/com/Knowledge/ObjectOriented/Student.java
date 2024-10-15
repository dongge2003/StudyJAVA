package com.Knowledge.ObjectOriented;

public class Student {
    private String name;
    private int age;

    //无参数
    public Student(){

    }
    //全部参数
    public Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }

    public void setage(int age){
        if(age < 0 && age > 150){
            System.out.println("无效的年龄");
        }
        else {
            this.age = age;
        }
    }
    public int getage(){
        return age;
    }



}
