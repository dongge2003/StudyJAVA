package com.IO.OutInputStream.Demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception {
        /*
        练习:文件拷贝:
            读取"D:\CODE\markdown\StudyAlgorithm\README.md"文件,
            在桌面创建一个copy.txt文件,并把内容拷贝到里面去
         */

        String Source = "D:\\新建文件夹\\New Boy - 房东猫.mp3";//源文件地址
        String Copy = "C:\\Users\\dong\\Desktop\\copy.mp3";//复制地址

        //如果是一首歌
        //copyChar(Source,Copy);//用时24679毫秒
        //copyArr(Source, Copy);//用时17毫秒

        copyException(Source, Copy);
        //可以捕获到异常
        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.io.FileInputStream.close()" because "fis" is null



    }

    //一个一个字节copy
    public static void copyChar(String source, String copy) throws Exception {
        FileInputStream fis = new FileInputStream(source);//源文件地址
        FileOutputStream fos = new FileOutputStream(copy,true);//复制地址

        // 获取开始时间戳（毫秒）
        long start = System.currentTimeMillis();

        int tmp;
        while ((tmp = fis.read()) != -1){
            fos.write(tmp);
        }

        long end = System.currentTimeMillis();

        System.out.println("用时" + (end - start) + "毫秒");
        System.out.println("文件拷贝完成");

        //先开先关闭资源
        fis.close();
        fos.close();
    }

    //一个一个字节数组copy
    public static void copyArr(String source, String copy) throws Exception {
        FileInputStream fis = new FileInputStream(source);//源文件地址
        FileOutputStream fos = new FileOutputStream(copy,true);//复制地址

        // 获取开始时间戳（毫秒）
        long start = System.currentTimeMillis();

        byte[] buffer = new byte[1024 * 1024 * 5];//5mb的数组
        int len = fis.read(buffer);
        while (len != -1){//len = -1时文件内容结束
            fos.write(buffer,0,len);//从buffer数组当中从0索引处开始把len3个元素的数据写入文件
            len = fis.read(buffer);//继续读取数据
        }


        long end = System.currentTimeMillis();

        System.out.println("用时" + (end - start) + "毫秒");
        System.out.println("文件拷贝完成");

        //先开先关闭资源
        fis.close();
        fos.close();

    }

    //用try...catch...finally捕获文件代码中的异常
    public static void copyException(String source, String copy){
            FileInputStream fis = null;
            FileOutputStream fos = null;
        try {
            fis = new FileInputStream(source);//源文件地址
            fos = new FileOutputStream(copy,true);//复制地址

            // 获取开始时间戳（毫秒）
            long start = System.currentTimeMillis();

            byte[] buffer = new byte[1024 * 1024 * 5];//5mb的数组
            int len = fis.read(buffer);
            while (len != -1){//len = -1时文件内容结束
                fos.write(buffer,0,len);//从buffer数组当中从0索引处开始把len3个元素的数据写入文件
                len = fis.read(buffer);//继续读取数据
            }

            long end = System.currentTimeMillis();

            System.out.println("用时" + (end - start) + "毫秒");
            System.out.println("文件拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //异常嵌套
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //JDK9中IO流中捕获异常的方法
    public static void copyIoStream(String source, String copy) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(source);//源文件地址
        FileOutputStream fos = new FileOutputStream(copy,true);//复制地址

        //这样就会自动关闭资源
        try (fis;fos){
            // 获取开始时间戳（毫秒）
            long start = System.currentTimeMillis();

            byte[] buffer = new byte[1024 * 1024 * 5];//5mb的数组
            int len = fis.read(buffer);
            while (len != -1){//len = -1时文件内容结束
                fos.write(buffer,0,len);//从buffer数组当中从0索引处开始把len3个元素的数据写入文件
                len = fis.read(buffer);//继续读取数据
            }


            long end = System.currentTimeMillis();

            System.out.println("用时" + (end - start) + "毫秒");
            System.out.println("文件拷贝完成");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
