package com.MultiThreaded.ThreadPools;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        /*
        线程池:
            在以前,每当有一个任务就要创建一个线程,任务结束,线程销毁

            现在有线程池,当有任务时,线程池自动创建线程,如果有多个任务,也会创建多个线程
            当然可以自定义线程池的最大线程数,当任务超过线程的数量,就要等着,直到有新的线程空了

            Executors: 线程池的工具通过调用方法返回不同类型的线程池对象
                public static ExecutorService newCachedThreadPool()                             创建一个没有上限的线程池
                public static ExecutorService newFixedThreadPool(int nThreads)                  创建有上限的线程池
         */

        //无上限线程池
//        //创建线程池对象
//        ExecutorService pool1 = Executors.newCachedThreadPool();//无上限线程池
//        //提交任务
//        pool1.submit(new Runnable() {
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println(Thread.currentThread().getName() + " :" + i);
//                }
//            }
//        });
//        pool1.submit(new Runnable() {
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println(Thread.currentThread().getName() + " :fasf");
//                }
//            }
//        });
//        //销毁线程池
//        pool1.shutdown();


        //有上限线程池
//        ExecutorService pool2 = Executors.newFixedThreadPool(2);//有上限线程池
//        pool2.submit(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + "_---");
//            }
//        });
//        pool2.submit(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + "_---");
//            }
//        });
//        pool2.submit(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + "_---");
//            }
//        });
//        pool2.shutdown();



        /*
        自定义线程池
            ThreadPoolExecutor threadpoolexecutor = new ThreadPoolExecutor
            (核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);

            参数1:核心线程数量             不能小于0
            参数2:最大线程数               不能小于0,最大数量 >= 核心线程数量
            参数3:空闲线程最大存活时间      不能小于0
            参数4:时间单位                 用TimeUnit指定
            参数5:任务队列                 不能为null
            参数6:创建线程工厂              不能为null
            参数7:任务的拒绝策略             不能为null
         */

        //自定义线程池
        ThreadPoolExecutor myPool = new ThreadPoolExecutor(
                3,//参数1:核心线程数量
                6,//参数2:最大线程数
                60,//参数3:空闲线程最大存活时间
                TimeUnit.SECONDS,//参数4:时间单位
                new ArrayBlockingQueue<>(3),//参数5:任务队列
                Executors.defaultThreadFactory(),//参数6:创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()//参数7:任务的拒绝策略
        );

        //传入任务
        myPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "hello world");
            }
        });

        //销毁线程池
        myPool.shutdown();



        /*
        线程池多大合适?
            cpu密集型运算:       最大并行数 + 1
                并行数:(如:cpu是4核8线程 那最大并行数就是8)  Runtime.getRuntime().availableProcessors(); - 获取电脑cpu线程数


                                                             总时间(cpu计算时间 + 等待时间)
            I/O密集型运算:       最大并行数 * 期望cpu利用率 * --------------------------------
                                                                   cpu计算时间

                                                             cpu的计算时间可以用工具:thread dump
         */

        //利用java获取cpu最大并行数
        int cpu = Runtime.getRuntime().availableProcessors();
        System.out.println("最大并行数为" + cpu);




        /*
        除此之外,还有知识,乐观锁,悲观锁,低沉原理.....
         */

    }
}
