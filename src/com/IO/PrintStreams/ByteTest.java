package com.IO.PrintStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class ByteTest {
    public static void main(String[] args)throws IOException {
        /*
        打印流:
            分类:打印流一般是指: PrintStream, PrintWriter两个类

            特点1: 打印流只操作文件目的地,不操作数据源
            特点2: 特有的写出方法可以实现,数据源样写出
                列如:打印:97    文件中:97
                     打印:true   文件中:true
            特点3: 特有的写出方法,可以实现自动刷新,自动换行
                    打印一次数据 = 写出 + 换行 + 刷新
         */

        /*
        字节打印流(PrintStream):
            构造方法:
                public PrintStream(OutputStream/File/String)                                            关联字节输出流/文件/文件路径
                public PrintStream(String fileName, Charset charset)                                    指定字符编码
                public PrintStream(OutputStream out, boolean autoFlush)                                 自动刷新
                public PrintStream(OutputStream out, boolean autoFlush, String encoding)                指定字符编码且自动刷新

                字节底层流是没有缓冲区的,开不开自动刷新都一样

            成员方法:
                public void write(int b)                                        常规方法:规则跟之前一样,将指定的字节写出
                public void println(Xxx xx)                                     特有方法:打印任意数据,自动刷新,自动换行
                public void print(Xxx xx)                                       特有方法:打印任意数据,不换行
                public void printf(String format, Object... args)               特有方法:带有占位符的打印语句,不换行
         */

        PrintStream out = new PrintStream(new FileOutputStream("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\PrintStreams\\PrintStream.txt"));

        out.write(97);
        out.println();
        out.println("println");
        out.print("print");
        out.println();
        out.printf("%d 是整数",9);

        out.close();
    }
}
