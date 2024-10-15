package com.Knowledge.ObjectOientedAdvanced.Demo04;

public class test {
    public static void main(String[] args) {
        jingli jl = new jingli("456","fjasjg0",3000,500);
        System.out.println(jl.getId() + jl.getName() + jl.getMoney() + jl.getJiangjing());
        jl.work();
        jl.eat();

        Cook ck = new Cook("789","cook",6000);
        System.out.println(ck.getId() + ck.getName() + ck.getMoney());
        ck.work();
        ck.eat();
    }

}
