package com.IO.OutInputStream;

public class CharacterTest {
    public static void main(String[] args) {
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
    }
}
