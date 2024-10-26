package com.MultiThreaded.thread.Mythreaded;

public class Mythreaded1 {
    public static void main(String[] args) {
        /*
        1.继承Thread类的方式进行实现
         */

        myThread m1 = new myThread();
        m1.setName("线程1:");
        m1.start();

        myThread m2 = new myThread();
        m2.setName("线程2:");
        m2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "hello world");
        }
    }
}
