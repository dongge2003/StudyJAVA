package com.IO.BufferStream;

import java.io.*;

public class characterTest {
    public static void main(String[] args)throws IOException {
        /*
        字节缓冲流:
                底层: 底层自带了长度为8192的缓冲区提高性能

                方法:
                    public BufferedReader(Reader r)              把基本流变成高级流
                    public BufferedWriter(Writer os)             把基本流变成高级流\

                字符缓冲流特有的方法:
                    输入流特有方法:
                        public String readLine()                读取一行数据,如果没有数据可读了,会返回null
                    输出流特有方法:
                        public void newLine()                   跨平台换行
                        因为:Windows:\r\n  Mac:\r  linux:\n

         */

//        //创建字符缓冲流对象
//        BufferedReader br = new BufferedReader(new FileReader("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\BufferStream\\BufferedRead.txt"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\BufferStream\\BufferedWrite.txt"));
//        //读取写入数据
//        String line;
//        while ((line = br.readLine()) != null) {
//            bw.write(line);
//            bw.newLine();
//        }
//
//        //关闭流
//        br.close();
//        bw.close();


    }
}
