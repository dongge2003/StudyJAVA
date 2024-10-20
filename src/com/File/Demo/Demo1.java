
package com.File.Demo;

import java.io.File;

public class Demo1{
    public static void main(String[] args) {
        /*
        遍历电脑:
         */

        String[] all = all();
        for (String string : all) {
           print(string);
        }


    }

    public static void print(String dir){
        File DIR = new File(dir);
        File[] files = DIR.listFiles();
        if(files != null){
            for (File file : files) {
                // 如果是目录，递归调用
                if (file.isDirectory())
                {

                    System.out.println("目录: " + file.getAbsolutePath());
                    print(file.getAbsolutePath() + "\\"); // 递归进入子目录
                }
                else
                {
                    // 如果是文件，打印文件名

                    System.out.println("文件: " + file.getName());
                }

            }
        }

    }

    public static String[] all(){
        File[] files = File.listRoots();
        String[] arr = new String[files.length];
        int i = 0;
        for (File file : files) {
            arr[i++] = file.toString();
        }
        return arr;
    }
}


