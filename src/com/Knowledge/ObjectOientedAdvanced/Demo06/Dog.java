package com.Knowledge.ObjectOientedAdvanced.Demo06;

public class Dog extends Animal implements swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void Eat(){
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim(){
        System.out.println("狗会游泳");
    }

}
