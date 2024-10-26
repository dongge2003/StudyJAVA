package com.MultiThreaded.Demo04;

public class Test {
    public static void main(String[] args) {
        /*
        利用阻塞队列实现Demo03
         */

        Cooker cooker = new Cooker();
        Foodie foodie = new Foodie();
        cooker.setName("厨师");
        foodie.setName("顾客");

        cooker.start();
        foodie.start();
    }
}
