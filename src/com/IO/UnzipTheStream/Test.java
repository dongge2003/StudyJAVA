package com.IO.UnzipTheStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        解压缩流:
           解压属于输入流
         */

        //创建解压缩流对象
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("C:\\Users\\dong\\Desktop\\Desktop.zip"));

        //获取压缩包里面的一个个文件 - ZipEntry对象
        ZipEntry Entry;
        while ((Entry = zipInputStream.getNextEntry()) != null) {
            System.out.println(Entry);
        }

        zipInputStream.close();



        /*
        压缩流:
            压缩输入输出流

         */



    }
}
