package com.Knowledge.ObjectOientedAdvanced.Demo08;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oin = new Outer().new Inner();
        oin.show();
    }
}
