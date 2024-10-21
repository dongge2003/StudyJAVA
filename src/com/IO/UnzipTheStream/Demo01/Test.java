package com.IO.UnzipTheStream.Demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test {
    public static void main(String[] args)throws IOException {
        /*
        解压一个压缩包
         */

        String src = "D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\UnzipTheStream\\Demo01\\Desktop.zip";
        String dest = "D:\\CODE\\java\\javase\\StudyJava\\src\\com\\IO\\UnzipTheStream\\Demo01\\Unpack";

        File source = new File(src);
        File destFile = new File(dest);

        unpack(source, destFile);
    }

    //解压一个压缩文件方法
    public static void unpack(File source, File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(source));

        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null){
            if(entry.isDirectory()){
                System.out.println("文件夹:" + entry.getName());
                //在dest处创建一个同样的文件夹
                new File(dest, entry.getName()).mkdirs();
            } else {
                System.out.println("文件:" + entry.getName());
                //复制文件
                File dir = new File(dest, entry.getName());
                FileOutputStream fos = new FileOutputStream(dir);
                int ch;
                while ((ch = zis.read()) != -1) {
                    fos.write(ch);
                }
                fos.close();
                zis.closeEntry();
            }
        }
    }
}
