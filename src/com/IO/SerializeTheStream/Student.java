package com.IO.SerializeTheStream;

import java.io.Serializable;

/*
Serializable接口面是没有抽象方法的, 这种接口叫做标记型接口
一旦实现了这种接口,那么表示当前的Student类可以被序列化

标记型接口可以理解为一种商品的合格证
有合格证才能被出售
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;//版本号

    private String name;
    private int age;
    //transient: 顺态关键字
    //作用: 不会把当前属性序列化到本地文件中去
    private transient String address;
    private String sex;

    public Student() {}
    public Student(String name, int age, String address, String sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }
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
        return "Student [name=" + name + ", age=" + age + ", address=" + address + ", sex=" + sex + "]";
    }

}
