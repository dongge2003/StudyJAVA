package com.Knowledge.ObjectOientedAdvanced.Demo04;

public class Cook extends People{
    public Cook() {
    }

    public Cook(String id, String name, double money) {
        super(id, name, money);
    }

    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
