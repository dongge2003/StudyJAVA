package com.Knowledge.ObjectOientedAdvanced.Demo06;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    //重写抽象方法
    @Override
    public  void Eat(){
        System.out.println("羊吃草");
    }





}
