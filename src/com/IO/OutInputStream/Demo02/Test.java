package com.IO.OutInputStream.Demo02;

import java.io.*;

public class Test {
    public static void main(String[] args) throws Exception {
        //拷贝文件夹
        //源文件夹地址: "C:\Users\dong\Desktop\score"
        //拷贝到:"C:\Users\dong\Desktop\"

        String oldpath = "C:\\Users\\dong\\Desktop\\score";
        String newpath = "C:\\Users\\dong\\Desktop\\copy";

        copyDir(oldpath,newpath);

        System.out.println("复制完成");

    }

    public static void copyDir(String oldpath,String newpath) throws IOException {
        File oldFile = new File(oldpath);
        File newFile = new File(newpath);

        newFile.mkdirs();//创建复制的路径文件夹

        File[] oldfiles = oldFile.listFiles();
        if (oldfiles == null) return;  // 如果为空则直接返回

        for (File file : oldfiles) {
            File newTarget = new File(newFile, file.getName());//表示复制文件的路径

            if(file.isDirectory()){
                copyDir(file.getAbsolutePath(),newTarget.getAbsolutePath());//递归进入文件夹
            } else {
                //用文件后缀判断文件是否为二进制文件
                if(file.getName().endsWith(".txt")){
                    copyTextFile(file.getAbsolutePath(),newTarget.getAbsolutePath());
                } else {
                    copyBinaryfile(file.getAbsolutePath(),newTarget.getAbsolutePath());
                }
            }

        }
    }

    //复制文本文件
    public static void copyTextFile(String oldfile,String newfile)throws IOException {
        FileReader fr = new FileReader(oldfile);
        FileWriter fw = new FileWriter(newfile);

        char[] buf = new char[1024];
        int len;
        while ((len = fr.read(buf)) != -1){
            fw.write(buf, 0, len);
        }

        fr.close();
        fw.close();
    }

    //复制二进制文件
    public static void copyBinaryfile(String oldfile, String newfile)throws IOException {
        FileInputStream fis = new FileInputStream(oldfile);
        FileOutputStream fos = new FileOutputStream(newfile);

        byte[] buffer = new byte[1024 * 1024 * 5];
        int len = fis.read(buffer);
        while (len != -1){
            fos.write(buffer,0,len);
            len = fis.read(buffer);
        }

        fis.close();
        fos.close();
    }
}
