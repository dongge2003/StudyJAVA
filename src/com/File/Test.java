package com.File;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        File类:
            路径:
                相对路径:相对当前项目的路径(不带盘符)
                绝对路径:带盘符的路径(带盘符)

           * File对象就是一个路径,可以是文件的路径,也可以是文件夹的路径
           * 这个路径可以是存在的路径,也可以是不存在的

            方法:
                public File(String pathname)                            根据文件路径创建文件对象
                public File(String parent, String child)                根据父路径名字符串和子路径名字符串创建文件对象
                public File(File parent, String child)                  根据父路径对应文件对象和子路径名字符串创建文件对象
         */

        //C:\Users\dong\Desktop

        //1.根据文件路径创建文件对象
        File file = new File("C:\\Users\\dong\\Desktop\\a.txt");
        System.out.println(file);//C:\Users\dong\Desktop\a.txt

        //2.根据父路径名字符串和子路径名字符串创建文件对象
        //用C:\Users\dong\Desktop\a.txt为例
        //父路径:C:\Users\dong\Desktop
        //子路径:a.txt
        File file1 = new File("C:\\Users\\dong\\Desktop", "a.txt");
        System.out.println(file1);//C:\Users\dong\Desktop\a.txt

        //3.根据父路径对应文件对象和子路径名字符串创建文件对象
        File f = new File("C:\\Users\\dong\\Desktop");
        File file2 = new File(f, "a.txt");
        System.out.println(file2);//C:\Users\dong\Desktop\a.txt
        System.out.println("--------------------------------------------------------");





        /*
        File中常见的方法:
                public static File[] listRoots()                            列出可用的文件系统根
                public String[] list()                                      获取当亲该路径下所有内容
                public String[] list(FilenameFilter filter)                 利用文件名过滤器获取当前该路径下所有内容
                public File[] listFiles()                                   获取当亲该路径下所有内容
                public File[] listFiles(FileFilter filter)                  利用文件名过滤器获取当前该路径下所有内容
                public File[] listFiles(FilenameFilter filter)              利用文件名过滤器获取当前该路径下所有内容


        File中常见的方法(判读,获取):
                public boolean isDirectory()                    判断此路径名表示的File是否为文件夹
                public boolean isFile()                         判断此路径名表示的File是否为文件
                public boolean exists()                         判断此路径名表示的File是否存在
                public long length()                            返回文件的大小(字节数量)
                public String getAbsolutePath()                 返回文件的绝对路径
                public String getPath()                         返回定义文件时使用得路径
                public String getName()                         返回文件的名称,带后缀
                public long lastModified()                      返回文件的最后修改时间(时间毫秒值)
         */

        //判断此路径名表示的File...  ->(在桌面创建一个a.tet文件)
        File file3 = new File("C:\\Users\\dong\\Desktop\\a.txt");
        System.out.println(file3.isDirectory());//false
        System.out.println(file3.isFile());//true
        System.out.println(file3.exists());//true

        //返回文件...   ->(a.tet文件写入内容"hello world")
        System.out.println(file3.length());//11
        System.out.println(file3.getAbsolutePath());//C:\Users\dong\Desktop\a.txt
        System.out.println(file3.getPath());//C:\Users\dong\Desktop\a.txt
        System.out.println(file3.getName());//a.txt
        System.out.println(file3.lastModified());//1727536354348
        //把毫秒值转成表示时间
        Date date = new Date();
        date.setTime(file3.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(date));//2024年09月28日 23:16:26
        System.out.println("--------------------------------------------------------");



        /*
        File中常见的方法(创建,删除):
                public boolean createNewFile()              创建一个新的空的文件
                public boolean mkdir()                      创建单级文件夹
                public boolean mkdirs()                     创建多级文件夹
                public boolean delete()                     删除文件,空文件夹
         */

        File file4 = new File("C:\\Users\\dong\\Desktop\\b.txt");
        //file4.createNewFile();//在C:\Users\dong\Desktop目录下创建了一个b.txt的文件
        //file4.mkdir();//在C:\Users\dong\Desktop目录下创建了一个b.txt的文件夹
        //file4.delete();//删除了在C:\Users\dong\Desktop目录下创建了一个b.txt的文件

        File file5 = new File("C:\\Users\\dong\\Desktop\\test//test.txt");
        //file5.mkdirs();//在C:\Users\dong\Desktop目录下创建了一个test的文件夹里面又创建了一个test.txt的文件
        file5.delete();//删除了在C:\Users\dong\Desktop目录下test的文件夹里面的test.txt的文件,但没有删除test的文件夹

        File file6 = new File("C:\\Users\\dong\\Desktop\\test");
        file6.delete();//这才删除了在C:\Users\dong\Desktop的test的文件夹
        System.out.println("--------------------------------------------------------");




        /*
        File中常见的方法(获取并遍历):
                public File[] listFiles()               获取当前该路径下的所有内容
         */

        File file7 = new File("C:\\Users\\dong\\Desktop");
        File[] files = file7.listFiles();
        for (File fff : files) {
            //file就是依次表示C:\Users\dong\Desktop这个路径下的所有内容
            System.out.println(fff);
        }
//        C:\Users\dong\Desktop\Clash Verge.lnk
//        C:\Users\dong\Desktop\DataGrip 2024.2.2.lnk
//        C:\Users\dong\Desktop\desktop.ini
//        C:\Users\dong\Desktop\Eclipse IDE for Java Developers - 2024-09.lnk

        //重点:
        //1.当File表示的路径不存在时,返回null
        //2.当File表示的路径是文件是,返回null
        //3.当File表示的路径是一个空的文件夹时,返回一个长度为0的数组
        //4.当File表示的路径时一个有隐藏文件夹时,将里面所有的文件和文件夹的路径放在File数组中返回,包含隐藏文件
        //5.当File表示的路径是需要权限才能访问的文件夹时,返回null
        System.out.println("--------------------------------------------------------");




        /*
        File中常见的方法(获取并遍历):
                public static File[] listRoots()                                    列出可用的文件系统根(盘符)
                public String[] list()                                              获取当前该路径下的所有内容
                public String[] list(FilenameFilter filter)                         利用文件名过滤器获取当前该路径下所有内容
                public File[] listFiles()                                           获取当前该路径下所有内容
                public File[] listFiles(FileFilter filter)                          利用文件名过滤器获取当前该路径下所有内容
                public File[] listFiles(FilenameFilter filter)                      利用文件名过滤器获取当前该路径下所有内容
         */

        //1.列出可用的文件系统根
        System.out.println(Arrays.toString(File.listRoots()));//[C:\, D:\, E:\]
        System.out.println("______________________");

        File file8 = new File("C:\\Users\\dong\\Desktop");
        //2.获取当前该路径下的所有内容(仅能获取名字)
        String[] arr = file8.list();
        for (String string : arr) {
            System.out.println(string);
        }
        System.out.println("______________________");

        //3.利用文件名过滤器获取当前该路径下所有内容 -  public String[] list()
        //如:要获取C:\Users\dong\Desktop下的所有的txt文件

        //(1).匿名内部类
        //accept方法的形参:依次表示C:\Users\dong\Desktop文件夹下面的每一个文件或者文件夹的路径
        //参数一: 父级路径
        //参数二: 子级路径
        //返回值: 返回值为true,表示当前路径保留
        //        如果返回值为false,就表示当前路径舍弃不要
        String[] a1 = file8.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if("aaa.txt".equals(name)){
                    return true;
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(a1));

        //(2).Lambda表达式
        String[] a2 = file8.list((dir,name) -> "aaa.txt".equals(name));
        System.out.println(Arrays.toString(a2));
        System.out.println("______________________");

        //4.利用文件名过滤器获取当前该路径下所有内容 -  public File[] listFiles()
        File[] files1 = file8.listFiles();
        for (File fff : files1) {
            //file9依次表示该路径下的每一个文件或者文件夹
            if(fff.isFile() && fff.getName().endsWith(".txt")){
                System.out.println(fff);//C:\Users\dong\Desktop\aaa.txt
            }
        }
        System.out.println("______________________");

        //5.利用文件名过滤器获取当前该路径下所有内容 -  public File[] listFiles(FileFilter filter)
        //(1).匿名内部类
        File[] files3 = file8.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                //
                return file.getName().endsWith(".txt");
            }
        });
        for (File file9 : files3) {
            System.out.println(file9);
        }
        System.out.println("______________________");



        //6.利用文件名过滤器获取当前该路径下所有内容 -  public File[] listFiles(FilenameFilter filter)
        //(1).匿名内部类
        File[] files2 = file8.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });
        for (File file9 : files2) {
            System.out.println(file9);
        }


    }
}
