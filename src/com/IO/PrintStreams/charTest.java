package com.IO.PrintStreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class charTest {
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
        字符打印流(PrintWriter):
            构造方法:
                public PrintWriter(OutputStream/File/String)                                            关联字节输出流/文件/文件路径
                public PrintWriter(String fileName, Charset charset)                                    指定字符编码
                public PrintWriter(OutputStream out, boolean autoFlush)                                 自动刷新
                public PrintWriter(OutputStream out, boolean autoFlush, String encoding)                指定字符编码且自动刷新

                字符底层流是有缓冲区的,想要自动刷新需要开启

            成员方法:
                public void write(int b)                                        常规方法:规则跟之前一样,将指定的字节写出
                public void println(Xxx xx)                                     特有方法:打印任意数据,自动刷新,自动换行
                public void print(Xxx xx)                                       特有方法:打印任意数据,不换行
                public void printf(String format, Object... args)               特有方法:带有占位符的打印语句,不换行

         */

        PrintWriter pw = new PrintWriter(new FileWriter("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\PrintStreams\\PrintWriter.txt"));

        pw.write("Hello World");
        pw.println();
        pw.print("Hello World");
        pw.println();
        pw.printf("%s:是字符串","abcd");

        pw.close();


        //因此System.out.println();是将System.out传入进了打印流,他不是指向文件,而是指向控制台
        //public final class System{      public static final PrintStream out = null;   }
        //有于out是静态的,所以可以用类名直接调用方法System.out
        //如:
        PrintWriter sys = new PrintWriter(System.out);
        sys.println("Hello World");//控制台:Hello World
        sys.close();

        sys.println("检验关闭");//可见由于流关闭了,所以控制台并没有打印
    }
}
