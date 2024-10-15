package com.Knowledge.ObjectOientedAdvanced.Polymorphism;

public class Cat extends Animal{
    @Override
    public void eat(){
        //对父类animal.eat方法的重写
        System.out.println("狗吃骨头");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
