package com.IO.OutInputStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;

public class CharacterTest {
    public static void main(String[] args) throws IOException {
        /*
        字符流:
            字符流的底层就是字节流
            字符流 = 字节流 + 字符集

            特点:
                输入流:一次读取一个字节,遇到中文时,一次读取多个字节(取决于字符集)
                输出流:底层会把数据按照指定的方式进行编码,变成字节再写到文件中

            使用场景:
                对于纯文本的文件进行读写操作

         */

        /*
        字符流(文本文件)   ->  Reader((抽象类)字符输出流)   ->  FileReader(操作本地文件的字符输入流)
                          ->  Writer((抽象类)字符输入流)   ->  FileWriter(操作本地文件的字符输出流)
         */

        /*
        FileReader方法:
                1.创建字符输入流对象
                public FileReader(File file)                    创建字符输入流关联本地文件
                public FileReader(String pathname)              创建字符输入流关联本地文件
                细节: 如果读取的文件不存在,则会直接报错

                2.读取数据
                public int read()                               读取数据,读到末尾return -1(空参)
                public int read(char[] buffer)                  读取多个数据,读到末尾return -1(有参)
                细节1: 按字节进行读取,遇到中文,一次读取多个文件,读取后解码,返回一个整数
                细节2: 读到文件末尾了,read方法返回-1

                3.释放资源
                public int close()                              释放资源/关流
         */

        //空参read方法
        //文本内容:红豆生南国，春来发几枝。
        //愿君多采撷，此物最相思。
        //1.创建字符输入流对象
//        FileReader test = new FileReader("C:\\Users\\dong\\Desktop\\FileReaderTest.txt");
        //2.读取数据
//        int tmp;
//        while ((tmp = test.read()) != -1){
            //System.out.print(tmp + " ");
            //32418 35910 29983 21335 22269 65292 26149 26469 21457 20960 26525 12290 13 10 24895 21531 22810 37319 25783 65292 27492 29289 26368 30456 24605 12290
            //1.read方法默认是一个一个字节的读,如果遇到中文就会一次读取多个(GBK:2个字节  UTF-8:3个字节)
            //2.读取之后,方法的底层会进行解码并把它转成十进制,并把这个十进制进行返回

            //例子:
            //遇到英文:文件里的二进制数据 01100001(1字节)
            //          read方法进行读取,然后解码成十进制97返回
            //遇到中文:文件里的二进制数据 11100110 10110001 10001001(3字节)
            //          read方法进行读取,然后解码成十进制27721返回


            //想看到中文,把它强转就行了
//            System.out.print((char)tmp);
            //红豆生南国，春来发几枝。
            //愿君多采撷，此物最相思。
//        }
        //3.关闭资源
//        test.close();
        System.out.println();
        System.out.println("------------------------------------");


        //有参read方法:
//        FileReader test2 = new FileReader("C:\\Users\\dong\\Desktop\\FileReaderTest.txt");
//        char[] tmp = new char[2];
//        int len;
//        //有参read方法的底层:
//        //read(chars) 把读取数据,解码,强转合并了,并把强转之后的字符存到数组中
//        while ((len = test2.read(tmp)) != -1) {
//            System.out.print(new String(tmp, 0, len));//底层自带强转,所以这里不用强转
//        }
//        System.out.println();
//        test2.close();
        System.out.println("------------------------------------");





        /*
        FileWriter构造方法:
            public FileWriter(File file)                                        创建字符输出流关联本地文件
            public FileWriter(String pathname)                                  创建字符输出流关联本地文件
            public FileWriter(File file, boolean append)                        创建字符输出流关联本地文件,续写
            public FileWriter(String pathname, boolean append)                  创建字符输出流关联本地文件,续写

        读取数据:
            void writer(int c)                                              写出一个字符
            void writer(String str)                                         写出一个字符串
            void writer(String str, int off, int len)                       写出一个字符的一部分
            void writer(char[] cbuf)                                        写出一个字符数组
            void writer(char[] cbuf, int off, int len)                      写出一个字符数组的一部分
         */

//        FileWriter test3 = new FileWriter("C:\\Users\\dong\\Desktop\\FileWriterTest.txt");
//
//        test3.write(25105);//我    25105在Unicode中为'我'
//        test3.write("\n");
//        test3.write("This is a 测试\n");//This is a 测试
//        test3.write("测试偏移量\n",2,4);//偏移量
//        char[] chars = {'a','b','c','法','符','罚','\n'};
//        test3.write(chars);//abc法符罚
//        test3.write(chars,2,chars.length - 2);//c法符罚
//
//        test3.close();

        /*
        字符流底层原理:

        字符输入流:
            1.创建字符输入流对象:
                底层:关联文件,并创建缓冲区(长度为8192的字节数组)
            2.读取数据:
                判断缓冲区是否有数据可以读取
                    缓冲区没有数据:就会从文件中获取数据,然后尽可能装满缓冲区
                                  如果文件中也没有数据,则会返回 -1
                    缓冲区有数据:就从缓冲区中读取

                空参的read方法:一次读取一个字节,如果遇到中文就一次读取多个字节,然后字节解码成十进制返回
                有参的read方法:把读取字节,解码,强转合并了,直接返回强转后的结果放到字符数组中

         列如:  文件中有8192个a,和一个b
            FileReader fileReader = new FileReader("C:\\Users\\dong\\Desktop\\FileWriterTest.txt");
            fileReader.read();
            FileWriter fileWriter = new FileWriter("C:\\Users\\dong\\Desktop\\FileWriterTest.txt");
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.println(ch);
            }
            fileWriter.close();
            fileReader.close();

            这段代码中,在read方法之后,创建了FileWriter有于没有开启append操作,则会清空文件,因此后续代码应该不会读取到内容
            **但是**:read方法会创建缓冲区,并把文件中的内容读取到缓冲区中,虽然创建FileWriter后清空了文件,但缓冲区并没有清空
            所以后续读取内容时是读取的缓冲区里面的内容,直到缓冲中的内容读取完毕然后读取文件中的内容,由于文件以清空
            所以返回-1
            则输出的内容是8192个a,那个b并没有读取到


         字符输出流:
            方法:
                public void flush()             将缓冲区中的数据,刷新到本地文件中
                flush刷新:刷新之后,还可以继续往文件写入数据
                public void close()             释放资源,关流
                close关流:断开链接,无法往文件中写入数据

            输出流也是有缓冲区的,长度为8192
            执行writer方法的时候,会先往缓冲区里写入,直到装满才会往文件写入
            如果再还没装满时执行flush方法,则会将为装满的缓冲区写入到文件中
            在执行close方法之前,会将缓冲区的数据写入到文件中
         */




    }
}
