package com.Knowledge.ObjectOientedAdvanced.Demo07;

public class PingPlayer extends  People implements English{
    @Override
    public void action(){
        System.out.println("学兵乓球");
    }
    @Override
    public void say(){
        System.out.println("说英语");
    }

}
