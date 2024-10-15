package com.Api.Packaging;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //包装类
        /*
        byte	Byte
        short	Short
        int	    Integer
        long	Long
        float	Float
        double	Double
        char	Character
        boolean	Boolean
         */

        /*
        Integer
            public Integer(int value)	根据 int 值创建 Integer 对象(过时)
            public Integer(String s)	根据 String 值创建 Integer 对象(过时)
            public static Integer valueOf(int i)	返回表示指定的 int 值的 Integer 实例
            public static Integer valueOf(String s)	返回保存指定String值的 Integer 对象
            static string tobinarystring(int i)	得到二进制
            static string tooctalstring(int i)	得到八进制
            static string toHexstring(int i)	得到十六进制
            static int parseInt(string s)	将字符串类型的整数转成int类型的整数
         */

        //JDK5以前的方式
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(123);

        //两种方式获取对象的区别
        Integer i3 = Integer.valueOf(127);
        Integer i4 = Integer.valueOf(127);
        System.out.println(i3 == i4);//true

        Integer i5 = Integer.valueOf(128);
        Integer i6 = Integer.valueOf(128);
        System.out.println(i5 == i6);//false
        /*
        -127 - 128
        超越范围了,所以创建了一个新的对象
         */
        System.out.println("---------------------------------");
        
        Integer i7 = new Integer(127);
        Integer i8 = new Integer(127);
        System.out.println(i7 == i8);//false

        Integer i9 = new Integer(128);
        Integer i10 = new Integer(128);
        System.out.println(i9 == i10);//false
        /*
        这里用到了new关键字,都是新的对象,所以地址值不同
         */
        System.out.println("---------------------------------");


        //以前包装类的计算
        Integer ii1 = Integer.valueOf(10);
        int result = ii1.intValue();//把包装类转换成基本数据类型int进行计算
        System.out.println(result + 1);//11
        System.out.println("---------------------------------");
        /*
        以前的创建对象和计算的方法都很麻烦
        所以在之后更简便
         */


        //JDK5之后的创建对象的方式
        //自动装箱,自动拆箱(把基本数据类型自动转换其对应的包装类)

        //自动装箱
        Integer I1 = 123;//在底层中,会自动调用valueOF方法

        //自动拆箱
        int ii = I1;
        System.out.println(ii + 1);//124
        System.out.println("---------------------------------");


        //Integer方法
        /*
            static string tobinarystring(int i)	得到二进制
            static string tooctalstring(int i)	得到八进制
            static string toHexstring(int i)	得到十六进制
            static int parseInt(string s)	将字符串类型的整数转成int类型的整数
         */
        //得到二进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);//1100100

        //得到八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);//144

        //得到十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);//64
        System.out.println("---------------------------------");

        //将字符串类型的整数转成int类型的整数
        //java是强类型语言,不同类型的数据不能计算
        int add = Integer.parseInt("123");
        System.out.println(add + 1);//124



        //键盘录入
        //以前
        Scanner sc = new Scanner(System.in);
        //int i = sc.nextInt();
        //System.out.println(i);
        //但是这种方式有弊端,nextINT,nextDOUBLE....遇到空格,回车,制表符后,都会停止

        //以后都用nextLine方法,这种方法只有遇到回车才会停止
        //String line = sc.nextLine();
        //System.out.println(line);

        //如果需要相加,则需要转换对应的包装类
        String add1 = sc.nextLine();
        String add2 = sc.nextLine();
        //int sum1 = Integer.parseInt(add1) + Integer.parseInt(add2);
        double sum2 = Double.parseDouble(add1) + Double.parseDouble(add2);
        System.out.println("两个包装类相加和为:" + sum2);







    }
}
