package com.MultiThreaded.Demo03;

public class Foodie extends Thread{
    @Override
    public void run() {
        while (true) {
            synchronized (Table.lock) {
                if(Table.foodNow == Table.foodCount){
                    break;
                } else {
                    if(Table.isFood){
                        //有食物
                        System.out.println(Thread.currentThread().getName() + "在吃,还剩" + (Table.foodCount - Table.foodNow) + "碗食物");
                        Table.isFood = false;
                        Table.lock.notify();
                    } else {
                        //没有食物等待
                        try {
                            Table.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
