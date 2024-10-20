package com.Api.Object;

/*
    Cloneable
    如果一个接口没有抽象方法
    表示当前接口是一个标记性接口
    现在Cloneable表示一但实现,那么当前类的对象可以被克隆
    如果没有实现,当前类的对象不能被克隆
 */
public class User implements Cloneable{
    private int age;
    private String name;
    private String key;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public User(int age, String name, String key) {
        this.age = age;
        this.name = name;
        this.key = key;
    }

    public User() {
    }
    //

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", key='" + key + '\'' +
                '}';
    }


    //重写clone方法 - 浅克隆

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        return super.clone();
    }

    //重写clone方法 - 深克隆
    /*@Override
    protected Object clone() throws CloneNotSupportedException {
        String name = this.name;
        String newName = name;


        return

    }*/
}
