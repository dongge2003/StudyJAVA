package com.Knowledge.ObjectOientedAdvanced.Demo02;

public class Zi extends Fu{
    String name = "ZI";
    public void zishou(){
        String name = "zishou";
        System.out.println(name);//zishou
        System.out.println(this.name);//ZI
        System.out.println(super.name);//FU
    }
}
