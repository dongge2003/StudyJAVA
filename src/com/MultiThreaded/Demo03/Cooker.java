package com.MultiThreaded.Demo03;

public class Cooker extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Table.lock) {
                if(Table.foodNow == Table.foodCount){
                    break;
                } else {
                    if(Table.isFood){
                        try {
                            Table.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        System.out.println(Thread.currentThread().getName() + "做了一碗食物");
                        Table.isFood = true;
                        Table.foodNow++;
                        Table.lock.notify();
                    }
                }
            }
        }
    }
}
