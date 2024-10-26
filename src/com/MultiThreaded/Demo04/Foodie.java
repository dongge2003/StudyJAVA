package com.MultiThreaded.Demo04;

public class Foodie extends Thread implements Util{
    @Override
    public void run() {
        while(true){
            try {
                String str = getQueue.take();
                System.out.println(Thread.currentThread().getName() + "吃" + str);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
