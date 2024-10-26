package com.MultiThreaded.Demo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        /*
        总共有100张票,设置3个窗口同时卖
         */

//        sell s1 = new sell("窗口1");
//        sell s2 = new sell("窗口2");
//        sell s3 = new sell("窗口3");
//
//        s1.start();
//        s2.start();
//        s3.start();

        //窗口3 正在卖第0票
        //窗口3 正在卖第1票
        //窗口3 正在卖第2票
        //窗口1 正在卖第0票
        //窗口2 正在卖第0票
        //可以发现有卖重复的票,窗口123都卖了第0张票

        /*
        @Override
        public void run() {
        while(true){
            if(ticket < 100){
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " 正在卖第" + ticket + "票");
                ticket++;
            } else {
                break;
            }
        }

        }
         */
//        在这段代码块中,当线程1抢到执行权时,开始执行代码,但当遇到sleep()时,它会让出执行权,从而其他线程也能抢到执行权
//        当线程2抢到执行权时,进入代码块时,会遇到同样的问题,遇到sleep()会让出执行权,其他线程同理
//        在线程1sleep()休眠截止时,也要抢夺执行权,其他线程同理,但此时的ticket为0,然后线程1和其他线程抢到执行权,基本同时执行代码块,ticket没变的

        //为了解决次问题,此时就要加锁,在有线程执行代码块的时候,其他线程不能进来执行代码块,只有该线程执行完毕时,其他线程才能通过抢到执行权,执行代码块
//        同步代码块:
//        把操做共享的数据锁起来
//
//        格式:synchronized (锁){
//            操作共享数据的代码
//        }
//
//        特点1:锁默认打开,有一个线程进去了,锁自动关闭
//        特点2:里面的代码全部执行完毕,线程出来,锁自动打开


        //利用同步方法和创建多线程方法二的方法卖票
//        sell2 run = new sell2();
//
//        Thread t1 = new Thread(run);
//        Thread t2 = new Thread(run);
//        Thread t3 = new Thread(run);
//        t1.start();
//        t2.start();
//        t3.start();



        //利用lock锁
        sell3 s1 = new sell3();
        sell3 s2 = new sell3();
        sell3 s3 = new sell3();
        s1.start();
        s2.start();
        s3.start();

    }
}

//同步代码块
class sell extends Thread{
    //表示所有这个类的对象共享ticket这个数据
    static int ticket = 0;//票是总共100张,不是每个窗口100张,所以要加static关键字
    static Object lock = new Object();//锁对象

    public sell() {
    }

    public sell(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (lock){
                if(ticket <= 100){
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " 正在卖第" + ticket + "票");
                    ticket++;
                } else {
                    break;
                }
            }
        }

    }
}

//同步方法
class sell2 implements Runnable{
    int ticket = 0;

    @Override
    public void run() {
        while(true){
            if(method()) break;
        }
    }

    //同步方法
    private synchronized boolean method() {
        if(ticket == 100){
            return true;
        } else {
            System.out.println(Thread.currentThread().getName() + " 正在卖第" + ticket + "票");
            ticket++;
        }
        return false;
    }
}

//Lock锁
class sell3 extends Thread{
    static int ticket = 0;

    //创建手动锁对象
    //因为要创建多个对象,其中锁lock的对象都不同,所以要加static关键字,共享同一个lock锁对象
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            lock.lock();
            try {
                if(ticket <= 100){
                    sleep(100);
                    System.out.println(Thread.currentThread().getName() + " 正在卖第" + ticket + "票");
                    ticket++;
                } else {
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();//不管怎么样都会关闭锁
            }
        }
    }
}
