package com.IO.OutInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteTest {
    public static void main(String[] args) throws IOException {
        /*
        IO: 存储和读取数据的解决方案
            *读取和写入是以程序为参考位置的

            IO流的分类:
                流的方向  ->  输入流
                         ->  输出流

                             ->   字节流(所有类型的文件)
               操作文件类型
                             ->   字符流(文本文件)

                                                         ->  OutputStream((抽象类)字节输出流)
                             ->   字节流(所有类型的文件)  ->  InputStream((抽象类)字节输入流)
                 IO流体系
                             ->   字符流(文本文件)   ->  Reader((抽象类)字符输出流)
                                                    ->  Writer((抽象类)字符输入流)
         */



        /*
                                   ->  OutputStream(字节输出流)  -> FileOutputStream(操作文件的字节输出流)
             字节流(所有类型的文件)  ->  InputStream(字节输入流)  ->  FileInputStream(操作文件的字节输入流)
         */

        //FileOutputStream: 可以把程序中的数据写到本地文件中
        //1.创建对象
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\dong\\Desktop\\test.txt");
        //2.写入数据
//        fos.write(97);
        //3.关闭资源
//        fos.close();
        //细节:
        //创建对象:
        //1.参数是字符串类型表示的路径或者是File对象都可以
        //2.如果文件不存在会创建一个新的文件,但要保证父级路径是存在的
        //3.如果文件已经存在,则会清空文件
        //写数据:
        //write方法的参数是整数,实际对应到ASCII上的字符
        //释放资源:
        //每次使用完都要释放资源




        /*
        FileOutputStream写数据的3种方式:
                void write(int b)                                       一次写一个字节的数据
                void write(byte[] b)                                    一次写一个字节数组的数据
                void write(byte[] b, int off, int len)                  一次写一个字节数组的部分数据
                           数组       起始位置    个数
         */
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\dong\\Desktop\\test.txt");
////        fos.write(97);//a
//
////        byte[] bytes = {97,98,99};
////        fos.write(bytes);//abc
//
//        byte[] bytes2 = {97,98,99,100,101};
//        fos.write(bytes2,2,2);//cd
//        fos.close();




        /*
        换行和续写:
            换行:
                Windows: \r\n
                linux:  \n
                Mac:    \r

            续写:
                public FileOutputStream(File file, boolean append)
                参数append就是续写(追加模式)操作的开关,默认是关闭的

         */

//        FileOutputStream fos = new FileOutputStream("C:\\Users\\dong\\Desktop\\test.txt", false);
        //写入一串字符数据
//        String str = "hello world";
//        byte[] bytes = str.getBytes();
//        fos.write(bytes);

        //换行
//        fos.write("\r\n".getBytes());

//        fos.write("DiErHang".getBytes());

//        fos.write("\r\n".getBytes());

//        fos.write("第二行".getBytes("UTF-8"));//使用中文时要注意编码问题,

//        fos.close();
//        hello world
//        DiErHang
//        第二行
        System.out.println("----------------------------------------------------");




        /*
        FileInputStream:
            操作本地文件的字节输入流,可以把本地文件的数据读取到程序中来
         */

        //**文件内容:abcde**
        //1.创建字节输入流对象
//        FileInputStream fis = new FileInputStream("C:\\Users\\dong\\Desktop\\aaa.txt");
        //2.读取数据
        //public int read() throws IOException {}
//        int a = fis.read();
//        System.out.println(a);//97
//        System.out.println(fis.read());//98
//        System.out.println(fis.read());//99
//        System.out.println((char) fis.read());//d
//        System.out.println((char) fis.read());//e
//        System.out.println(fis.read());//-1  -- 文件没有内容了,则此时的值为-1

//        while (fis.read() != -1) {
//            System.out.print((char) fis.read());//abcde
//        }
        //3.释放资源
//        fis.close();
        //细节:
        //  1.如果该文件不存在,则会报错
        //  2.文件内容到末尾了,则会return -1;(空格的ASCII值为32, -1的话会先读负号,然后读1数字)
        System.out.println("----------------------------------------------------");



        /*
        FileInputStream的循环读取:
            上面的操作太麻烦了,需要一个一个字符的读
         */
//        FileInputStream fis = new FileInputStream("C:\\Users\\dong\\Desktop\\aaa.txt");
        //错误的
//        while (fis.read() != -1); {
//            System.out.print((char) fis.read());
//        }
        //read方法会读取当前数据并指针后移,由于while循环体中read方法已经执行,sout中read方法又执行了一遍

        //真确的
//        int temp;
//        while (( temp = fis.read()) > 0) {
//            System.out.print((char) temp);
//        }
        //需要中间变量来接受read方法的返回值,防止重复执行read方法
//        fis.close();
        System.out.println("----------------------------------------------------");




        /*
        FileInputStream读取的问题:
            如果文件内容很大 - 则会很慢

        FileInputStream一次读取多个字节:
            public int read()                               一次读一个字节数据
            public int read(byte[] buffer)                  一次读取一个字节数组数据
            注意: 一次读取一个字节数组的数据,每次读取尽可能把数组装满
         */

        //文本内容abcde
//        FileInputStream fff = new FileInputStream("C:\\Users\\dong\\Desktop\\新建 文本文档.txt");
//        byte[] bytes1 = new byte[3];

        //read返回值为-1时文件内容结束
//        int len = fff.read(bytes1);
//        System.out.println(len);//3
//        System.out.println(new String(bytes1));//abc

//        int len2 = fff.read(bytes1);
//        System.out.println(len2);//2
//        System.out.println(new String(bytes1));//dec
        //这里数组的内容是dec的原因是只读取到了de两个字符,而数组原本中存在abc三个字符,这里只覆盖了两个字符,第三个字符没有覆盖

//        int len3 = fff.read(bytes1);
//        System.out.println(len3);//2
//        System.out.println(new String(bytes1,0,len3));//de
        //new String(bytes1,0,len3) - 从bytes数组当中从0索引处开始把len3个元素的数据转成String
        System.out.println("----------------------------------------------------");










    }
}
