package com.IO.BufferStream;

public class byteTest {
    public static void main(String[] args)throws Exception {
        /*
                                                        基本流                                 高级流(缓冲流)

                                                ->  OutputStream((抽象类)字节输出流)  ->  BufferedInputStream(字节缓冲输入流)
                     ->   字节流(所有类型的文件)  ->  InputStream((抽象类)字节输入流)  ->  BufferedOutStream(字节缓冲输出流)
          IO流体系
                     ->   字符流(文本文件)   ->  Reader((抽象类)字符输出流)            -> BufferedReader(字符缓冲输入流)
                                            ->  Writer((抽象类)字符输入流)            -> BufferedWriter(字符缓冲输出流)



           字节缓冲流:
                底层: 底层自带了长度为8192的缓冲区提高性能

                方法:
                    public BufferedInputStream(InputStream is)              把基本流包装成高级流,提高读取数据的性能
                    public BufferedOutputStream(OutputStream os)            把基本流包装成高级流,提高写出数据的性能
         */

//        //创建字节缓冲流对象
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("文件地址"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("文件地址"));
//        //读取写入数据
//        byte[] buf = new byte[1024];
//        int len;
//        while ((len = bis.read(buf)) != -1){
//            bos.write(buf,0,len);
//        }
//        //关闭流
//        bis.close();
//        bos.close();


        /*
        原理:
            底层会创建一个缓冲区,在读取数据时,会在内存中创建一个变量(int 或者 byte[])来进行输入输出中的数据交换

                                                                内存
            硬盘(数据源) -> 缓冲流基本流 ->   |  [缓冲区]  <-  int 或者 byte[]  ->   [缓冲区]  |   -> 缓冲流基本流  ->  硬盘(目的地)
         */






    }
}
