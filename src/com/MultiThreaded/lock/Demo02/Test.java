package com.MultiThreaded.lock.Demo02;

public class Test {
    public static void main(String[] args) {
        /*
        死锁:
            由于相互等待，两个线程都无法完成，导致死锁。
            程序会在此处卡住，因为两个线程都在等待对方的锁。
         */
        DeadLock d1 = new DeadLock();
        DeadLock d2 = new DeadLock();
        d1.setName("线程A");
        d2.setName("线程B");
        d1.start();
        d2.start();

    }
}

class DeadLock extends Thread {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    @Override
    public void run() {
        if("线程A".equals(Thread.currentThread().getName())){
            synchronized (lock1) {
                System.out.println("次线程拿到1锁,准备拿2锁");
                synchronized (lock2) {
                    System.out.println("执行完毕");
                }
            }
        } else if("线程B".equals(Thread.currentThread().getName())){
            synchronized (lock2) {
                System.out.println("次线程拿到2锁,准备拿1锁");
                synchronized (lock1) {
                    System.out.println("执行完毕");
                }
            }
        }
    }
}
