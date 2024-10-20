package com.Api.Biglnteger;

import java.math.BigInteger;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //int - 4 个字节
        //long - 8 个字节
        //但是如果想表示一个比long还大的数字 : 银行卡卡号就不行
        //比如: 46564341645644146546416441964961319684946496416531361361 - 这样的数就不行了



        /*
        public BigInteger(int num, Random rnd) 		//获取随机大整数，范围：[0 ~ 2的num次方-1]的数
        public BigInteger(String val) 				//获取指定的大整数
        public BigInteger(String val, int radix) 	//获取指定进制的大整数

        下面这个不是构造，而是一个静态方法获取BigInteger对象
        public static BigInteger valueOf(long val) 	//静态方法获取BigInteger的对象，内部有优化
         */


        //1.创建对象
        Random r = new Random();
        BigInteger big = new BigInteger(100 ,r);
        System.out.println(big);//476676493531856323353470279358


        //创建指定数字
        BigInteger b1 = new BigInteger("959416136161613");
        System.out.println(b1);//959416136161613
        //"":只能为数字不能为其他否则会报错


        //获取指定进制的大整数
        BigInteger b2 = new BigInteger("100",2);//2进制的100 就是4
        System.out.println(b2);


        //静态方法
        BigInteger b3 = BigInteger.valueOf(46135498);
        System.out.println(b3);//46135498
        //只能在long的取值范围

        System.out.println("###########################################################################");

        /*public BigInteger add(BigInteger val)					//加法
        public BigInteger subtract(BigInteger val)				//减法
        public BigInteger multiply(BigInteger val)				//乘法
        public BigInteger divide(BigInteger val)				//除法
        public BigInteger[] divideAndRemainder(BigInteger val)	 //除法，获取商和余数
        public  boolean equals(Object x) 					    //比较是否相同
        public  BigInteger pow(int exponent) 					//次幂、次方
        public  BigInteger max/min(BigInteger val) 				//返回较大值/较小值
        public  int intValue(BigInteger val) 					//转为int类型整数，超出范围数据有误*/


        //加法
        BigInteger add1 = new BigInteger("261641641641646464646464");
        BigInteger add2 = new BigInteger("16416163163456136131");
        System.out.println("加法:" + add1.add(add2));

        //减法
        BigInteger sub1 = new BigInteger("261641641641646464646464");
        BigInteger sub2 = new BigInteger("16416163163456136131");
        System.out.println("减法:" + sub1.subtract(sub2));

        //乘法
        BigInteger mul1 = new BigInteger("261641641641646464646464");
        BigInteger mul2 = new BigInteger("16416163163456136131");
        System.out.println("乘法:" + mul1.multiply(mul2));

        //除法
        BigInteger div1 = new BigInteger("261641641641646464646464");
        BigInteger div2 = new BigInteger("16416163163456136131");
        System.out.println("除法:" + div1.divide(div2));

        //获取商和余数
        BigInteger rem1 = new BigInteger("261641641641646464646464");
        BigInteger rem2 = new BigInteger("16416163163456136131");
        BigInteger arr[] = rem1.divideAndRemainder(rem2);
        System.out.println("商:" + arr[0] + "余数:" + arr[1]);

        //次幂
        BigInteger pow = new BigInteger("1641616");
        System.out.println("次幂:" + pow.pow(3));

        //返回较大值/较小值
        BigInteger bd1 = new BigInteger("261641641641646464646464");
        BigInteger bd2 = new BigInteger("16416163163456136131");
        System.out.println("较大值:" + bd1.max(bd2) + "较小值:" + bd1.min(bd2));

        //转为int类型整数
        BigInteger int2 = new BigInteger("1136131");
        int i = int2.intValue();
        System.out.println("int整数" + i);

        /*
        对于计算机而言，其实是没有数据类型的概念的，都是0101010101，数据类型是编程语言自己规定的，所以在实际存储的时候，先把具体的数字变成二进制，每32个bit为一组，存储在数组中。

        数组中最多能存储元素个数：21亿多

        数组中每一位能表示的数字：42亿多

        理论上，BigInteger能表示的最大数字为：42亿的21亿次方。

        但是还没到这个数字，电脑的内存就会撑爆，所以一般认为BigInteger是无限的。
         */












    }
}
