package com.MultiThreaded.thread.Mythread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Mythreaded3 {
    public static void main(String[] args)throws InterruptedException, ExecutionException {
        /*
        3.利用Callable接口和Future接口方式实现

        前面两种实现方法不能或取到多线程运行的结果

         */
        //创建任务对象
        MyCallable callable = new MyCallable();
        //创建用来管理多线程结果的对象
        FutureTask<Integer> f = new FutureTask<>(callable);
        //创建多线程对象
        new Thread(f).start();

        //获取运行的结果
        Integer result = f.get();
        System.out.println(result);//4950


    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //计算1-100的结果
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}
