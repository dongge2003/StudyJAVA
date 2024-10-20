package com.Knowledge.ObjectOientedAdvanced.Demo07;

public class BasPlayer extends People implements English{
    @Override
    public void action(){
        System.out.println("学篮球");
    }

    @Override
    public void say(){
        System.out.println("说英语");
    }
}
