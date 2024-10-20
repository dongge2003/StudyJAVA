package com.Knowledge.ObjectOientedAdvanced.Demo04;

public class jingli extends People {
    private double jiangjing;

    public jingli(){

    }
    public jingli (String id , String name , double money ,double jiangjing){
        super(id ,name ,money);
        this.jiangjing = jiangjing;

    }

    public double getJiangjing() {
        return jiangjing;
    }

    public void setJiangjing(double jiangjing) {
        this.jiangjing = jiangjing;
    }

    @Override
    public void work(){
        System.out.println("管理其他人");
    }

}
