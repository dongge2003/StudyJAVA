package com.Knowledge.ObjectOientedAdvanced.Demo03;

import com.Knowledge.ObjectOientedAdvanced.Demo02.Zi;

public class ZI extends FU {
    //空参构造
    public ZI() {
        //先要写父类的空参构造
        super();
        System.out.println("子类空参构造");
    }
    public ZI(String name , int age){
        super(name,age);
    }

}
