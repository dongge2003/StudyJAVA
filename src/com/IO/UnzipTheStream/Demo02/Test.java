package com.IO.UnzipTheStream.Demo02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test {
    public static void main(String[] args)throws Exception {
        //把a.txt压缩成一个压缩包
        File src = new File("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\UnzipTheStream\\Demo02\\a.txt");
        File dest = new File("D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\UnzipTheStream\\Demo02");

        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws Exception {
        //创建压缩流对象 并关联压缩位置
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(new File(dest,"compress.zip")));

        //创建ZipEntry对象,表示压缩包里的每一个文件和文件夹
        System.out.println(src.getName());
        ZipEntry Entry = new ZipEntry("a.txt");

        //把zipEntry对象方法压缩包中
        zipOutputStream.putNextEntry(Entry);

        //目录都创建好了,可数据并没有写入
        //写入数据
        FileInputStream in = new FileInputStream(src);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) > 0) {
            zipOutputStream.write(buffer, 0, length);
        }
        in.close();

        zipOutputStream.closeEntry();
        zipOutputStream.close();

    }
}
