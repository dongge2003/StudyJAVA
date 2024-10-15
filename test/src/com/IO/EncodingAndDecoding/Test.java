package com.IO.EncodingAndDecoding;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        /*
        字节流读取中文会出现乱码

        字符集:
            如ASCII(英文) , GBK(英文,中文) , Unicode(英文,中文)

            GBK编码:
                英文:一个英文字母一个字节,二进制第一位是0 (如一个英文:01000101)
                中文:一个中文汉字两个字节,二进制第一位是1 (如一个中文:10110000 11100111)

            Unicode编码:
                UTF 是 Unicode Transfer Format的缩写

                UTF-32:固定使用4个字节保存
                UTF-16:用2~4个字节保存
                UTF-8:用1~4个字节保存  (英文1个字节,中文3个字节)



        为什么会有乱码?
            1.读取数据时为读取完整个汉字
            2.编码和解码的规则不统一



        java中编码的方法:
            String类中的方法:
                public byte[] getBytes()                                    使用默认方式进行编码
                public byte[] getBytes(String charsetName)                  使用指定方式进行编码

        java中解码的方法:
            String类中的方法:
                String(byte[] bytes)                                        使用默认方式进行编码
                String(byte[] bytes, String charsetName)                    使用指定方法进行解码

         */

        //文本内容: 中文乱码
//        FileInputStream Fchines = new FileInputStream("C:\\Users\\dong\\Desktop\\chinese.txt");
//
//        int b;
//        while((b = Fchines.read("UTF-8")) != -1){
//            System.out.print((char)b);
//        }
//        //结果 ä¸­æä¹±ç 
//
//        Fchines.close();
        System.out.println("----------------------------------");



        //编码
        String str = "学习JAVA";
        byte[] bytes = str.getBytes();//默认UTF-8
        System.out.println(Arrays.toString(bytes));
        //[-27, -83, -90(学),    -28, -71, -96(习),    74(J),    65(A),    86(V),    65(A)]

        byte[] bytes2 = str.getBytes("GBK");//指定使用GBK编码
        System.out.println(Arrays.toString(bytes2));
        //[-47, -89(学),    -49, -80(习),    74(J),    65(A),    86(V),    65(A)]
        System.out.println("__________________");

        //解码
        System.out.println(new String(bytes));//默认使用UTF-8    学习JAVA
        System.out.println(new String(bytes,"GBK"));//指定GBK解码   瀛︿範JAVA

        System.out.println(new String(bytes2));//ѧϰJAVA
        System.out.println(new String(bytes2,"GBK"));//学习JAVA
        System.out.println("----------------------------------");






    }
}
