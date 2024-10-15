package com.Knowledge.ObjectOientedAdvanced.Polymorphism;

public class Dog extends Animal{
    @Override
    public void eat(){
        //对父类animal.eat方法的重写
        System.out.println("狗吃骨头");
    }

}
