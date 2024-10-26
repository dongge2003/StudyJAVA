package com.MultiThreaded.Demo03;

public class Test {
    public static void main(String[] args) {
        /*
        有厨师和吃货和桌子
        用桌子当第三者,控制其他线程
        当桌子有吃的,吃货吃,没有,则等待厨师做
        假设总共有10碗饭
         */

        //创建线程对象
        Cooker cooker = new Cooker();
        Foodie foodie = new Foodie();
        cooker.setName("厨师");
        foodie.setName("吃货");

        cooker.start();
        foodie.start();
    }
}
