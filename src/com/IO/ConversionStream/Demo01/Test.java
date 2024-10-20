package com.IO.ConversionStream.Demo01;

import java.io.*;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) throws IOException {
        //使用指定编码读取文件
        //D:\CODE\java\javase\StudyJava\src\com\IO\ConversionStream\Demo01\GBK.txt 用了GBK保存的数据

//        //java11之前
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\ConversionStream\\Demo01\\GBK.txt"),
//                                                                          "GBK");
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }
//        isr.close();
//        System.out.println("--------------------------------------");


        //java11之后
        FileReader fr = new FileReader("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\ConversionStream\\Demo01\\GBK.txt",
                                        Charset.forName("GBK"));
        int ch2;
        while ((ch2 = fr.read()) != -1) {
            System.out.print((char) ch2);
        }
        fr.close();



        //使用指定编码写入文件
        //D:\CODE\java\javase\test\src\com\IO\ConversionStream\Demo01\GBK.txt 写入GBk编码的内容
        //故国三千里，深宫二十年。
        //一声何满子，双泪落君前。

//        //java11之前
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\ConversionStream\\Demo01\\GBK.txt"),
//                                            "GBK");
//        String str = "故国三千里，深宫二十年。";
//        String str2 = "一声何满子，双泪落君前。";
//        osw.write(str);
//        osw.write("\n\r");
//        osw.write(str2);
//
//        osw.close();

        //java11之后
        FileWriter fileWriter = new FileWriter("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\ConversionStream\\Demo01\\GBK.txt",
                                                Charset.forName("GBK"));
        String str = "故国三千里，深宫二十年。";
        String str2 = "一声何满子，双泪落君前。";
        fileWriter.write(str);
        fileWriter.write("\n\r");
        fileWriter.write(str2);

        fileWriter.close();
    }
}
