package com.Api.Runtime;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //获取Runtime对象
        Runtime r = Runtime.getRuntime();

        //exit - 停止虚拟机  0:正常  非0:异常

        //availableProcessors - 获取cpu线程数
        System.out.println("cpu线程数" + r.availableProcessors());//20

        //maxMemory - 虚拟机能从内存中获取的内存大小
        //单位:byte字节
        System.out.println("虚拟机能从内存中获取的内存大小(gb)" + r.maxMemory() / 1024 /1024 /1024);//3

        //totalMemory - 已经从内存中获取的内存大小
        //单位:byte字节
        System.out.println("已经从内存中获取的内存大小(mb)" + r.totalMemory() / 1024 /1024);//252

        //freeMemory - 剩余内存的大小
        //单位:byte字节
        System.out.println("剩余内存的大小(mb)" + r.freeMemory() /1024/1024);//246

        //运行cmd命令
        //r.exec("notepad");//打开记事本
        r.exec("ping www.biadu.com");//



    }
}
