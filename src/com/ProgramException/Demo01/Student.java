package com.ProgramException.Demo01;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        if(name.length() < 3 || name.length() > 10){
            throw new NameFormatException("姓名格式错误");
        }
        if(age < 18 || age > 40){
            throw new AgeFormatException("年龄格式错误");
        }
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.length() < 3 || name.length() > 10){
            throw new NameFormatException("姓名格式错误");
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 18 || age > 40){
            throw new AgeFormatException("年龄格式错误");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名:" + name + "年龄:" + age;
    }
}
