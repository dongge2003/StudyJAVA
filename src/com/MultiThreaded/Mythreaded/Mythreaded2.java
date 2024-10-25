package com.MultiThreaded.Mythreaded;

public class Mythreaded2 {
    public static void main(String[] args) {
        /*
        2.实现Runnable接口的方式进行实现
         */
        //创建任务对象
        MyRun mr = new MyRun();

        //创建线程对象,并把任务传给他
        Thread t1 = new Thread(mr,"线程1:");
        Thread t2 = new Thread(mr,"线程2:");


        t1.start();
        t2.start();




    }
}

class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "hello world");
        }
    }
}
