package com.ProgramException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] args) throws ParseException {
        /*
        异常:
            异常就是程序出现的问题

                                        Error
            java.lang.Throwable ->
                                        Exception ->    RuntimeException ->     ...
                                                  ->    其他异常

            Error:代表的系统级别的错误(属于严重问题)
                系统一但出现问题,sun公司会把这些错误封装成Error对象
                Error是给sun公式自己用的,不是给我们程序员用的
                开发人员不用管他

            Exception:叫做异常,代表程序可能出现的问题
                        我们通常会用Exception以及他的子类来封装程序出现的问题
            运行时异常:RuntimeException及其子类,编译阶段不会出现异常提醒
                        运行时出现的异常(如:数组索引越界异常)
            编译时异常:编译阶段就会出现异常提醒的(如:日期解析异常)
         */

        //编译时异常
//        String time = "2023年1月1日";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//        Date date = sdf.parse(time);
//        System.out.println(date);
        //在编译阶段必须要手动处理,否则代码报错,无法运行
        //public static void main(String[] args) **throws ParseException** - 异常处理

        //运行时异常
//        int[] arr = {1,2,3,4,5};
//        System.out.println(arr[10]);
        //在编译阶段是不需要处理的,也能运行,代码在运行时会报错,
        //java.lang.ArrayIndexOutOfBoundsException

        //java文件   ->       字节码文件       ->      运行
        //         编译时异常              运行时异常
        System.out.println("------------------------------------------------------");





        /*
        异常的作用
            一:异常用来查询bug的关键参考信息
            二:异常可以作为方法内部的一种特殊返回值,以便调用者底层的执行情况
         */

        //异常用来查询bug的关键参考信息
        //System.out.println(10 / 0);
        //报错: Exception in thread "main" java.lang.ArithmeticException: / by zero

        //异常可以作为方法内部的一种特殊返回值,以便调用者底层的执行情况
//        ExceptionTestSum(-20,30);//假如这个方法只能计算大于0的两个数
        //则会报错:Exception in thread "main" java.lang.RuntimeException
        System.out.println("------------------------------------------------------");



        /*
        异常的处理方式:
                1.JVM默认的处理方式
                2.自已处理
                3.抛出异常
         */

        //1.JVM默认的处理方式
        //把异常的名称,异常原因,异常位置打印在控制台
        //程序停止执行,下面的代码不会在运行了
        System.out.println("1");
//        System.out.println(10 / 0);
        System.out.println("2");
        //这时只会输出1,然后出现异常,而2不会输出
        System.out.println("______________________________");

        //2.自已处理
        /*
        格式:
            try{
                可能出现异常的代码
            } catch(异常类型 变量名){
                异常的处理代码
            }

         目的:当代码出现异常时,程序会继续往下执行
         */

        int[] arr2 = {1,2,3};
        try {
            System.out.println(arr2[10]);

            //这里出现异常,则程序就会创建一个异常对象ArrayIndexOutOfBoundsException
            //new ArrayIndexOutOfBoundsException();
            //拿着这个对象去和下面的catch里面的小括号 catch (ArrayIndexOutOfBoundsException e) 进行对比
            //如果两个对象一样,则捕获异常成功,就会执行catch里面的代码
            //当catch里面的代码执行完毕,则会执行try...catch体系下面的代码
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界了");
        }
        System.out.println("try catch 后面代码执行");
        System.out.println("-------------------------------------");

        /*
        问题:
            1.如果try中没有问题,怎么执行?
            2.如果try中有多个问题,怎么执行?
            3.如果try中的问题没有被捕获,怎么执行
            4.如果try中遇到了问题,那么下面的代码还会运行吗
        */

        //1.如果try中没有问题,怎么执行?
        try {
            System.out.println("helllo");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("问题1");
        }
        //如果try中的代码没有问题,则只会执行try中的代码,不会执行catch中代码
        System.out.println("**********1***********");


        //2.如果try中有多个问题,怎么执行?
        int[] arr3 = {1,2,3};
        try {
            System.out.println(10 / 0);
            System.out.println(arr3[10]);
            String s = null;
            s.equals("abc");
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("索引越界了");
        } catch (NullPointerException e){
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        //我么需要用多个catch捕获异常
        //注意,如果这些异常存在父子关系的话,则需要把父类写在最下面
        
        //在JDK7之后,我们可以在catch中捕获多个异常,中间用 | 符号隔开
        //表示如果出现a异常和b异常的话,采取同一种处理方案
        System.out.println("***********2***************");

        //3.如果try中的问题没有被捕获,怎么执行
        try {
//            System.out.println(10 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("问题3");
        }
        //相当于try...catch白写了
        //会调用虚拟机默认的处理方法
        System.out.println("*************3**************");

        //4.如果try中遇到了问题,那么下面的代码还会运行吗
        try {
//            System.out.println(arr3[10]);
            System.out.println("执行了吗>问题4try...catch");//这句是不会执行的
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("问题4");
        }
        //不会执行下面没问题的代码,会直接跳到catch里面的语句
        System.out.println("*********4*********");

        System.out.println("------------------------------------------------");




        /*
        异常的方法:
            public String getMessage()                  返回throwable的详细消息字符串
            public String toString()                    返回此可抛出的简短概述
            public void printStackTrace()               把异常的错误信息输出在控制台
                                                        //细节:仅仅是打印错误信息,不会停止虚拟机
         */

        //
        int[] arr4 = {1,2,3};
        try {
            System.out.println(arr4[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());//Index 10 out of bounds for length 3

            System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3

            //e.printStackTrace();//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
                                //at com.ProgramException.Test.main(Test.java:186)
            //但是

        }
        System.out.println("异常的方法执行了吗");

        //System.out.println("123");//123
        //System.err.println("123");//红色输出的123

        System.out.println("------------------------------------------------");



        /*
        抛出异常:
            throws:
                注意:写在方法定义处,表示声明一个异常,告诉调用者,使用方法体可能会有哪些异常

                格式:public void 方法()throws 异常类名1,异常类名2....{
                        ....
                    }

                * 编译时异常:必须要写
                * 运行时异常:可以不写

           throw:
               注意:写在方法内,结束方法,手动抛出异常对象,交给调用者,方法中下面的代码不再执行了

               格式:public void 方法(){
                        throw new NullPointerException();
                    }
         */

        //如创建一个方法用来求数组的最大值
        int[] arr5 = null;
        //方法体已经处理了有异常的抛出,这里需要捕获异常
        try {
            System.out.println(MaxArr(arr5));
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组为空异常");
        }
        System.out.println("异常捕获成功了吗?");//由于捕获到异常,会运行下面的代码
        System.out.println("------------------------------------------------------");




        /*
        自定义异常:
            1.自定义异常类
            2.写继承关系(运行时异常)(编译时异常)
            3.空参构造
            4.带参构造
         */




        /*
        在捕获异常时可能会出现catch里面不执行的情况,这时需要finally
        格式:
            try{
                可能出现异常的代码
            } catch(异常类型 变量名){
                异常的处理代码
            } finally {
                一定会执行的代码,除非java虚拟机退出
            }
         */

        //如
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
//            fileOutputStream.write(97);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            fileOutputStream.close();//不管捕获到异常没都会执行关闭资源的操作
//        }




    }



    //测试异常的方法,假如这个方法只能计算大于0的两个数
    public static int ExceptionTestSum(int a, int b){
        if(a < 0 || b < 0){
            //1. 向控制台输出错误
            //System.out.println("Error");

            //2. 主动抛出异常
            throw new RuntimeException();
        } else {
            return a + b;
        }
    }


    //抛出异常的方法,用来计算数组的最大值
                                        //由于这些异常时运行时异常,可以省略不写
    public static int MaxArr(int[] arr)/*throws ArrayIndexOutOfBoundsException, NullPointerException*/{
        //1.空指针异常,数组对象没有被创建
        //2.空数组异常,数组的大小为0
        if(arr == null ){
            throw new NullPointerException();
        }
        if(arr.length == 0){
            throw new ArrayIndexOutOfBoundsException();
        }


        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }



}
