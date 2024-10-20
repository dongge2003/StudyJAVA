package com.Api.Math;

public class Test {
    public static void main(String[] args) {

        //PI - 3.14...
        int r = 2;
        System.out.println("圆的面积" + Math.PI * r * r);

        //ceil - 向上取整
        //floor - 向下取整
        double c1 = 12.3;
        double c2 = -12.3;
        System.out.println("向上取整" + Math.ceil(c1));//13.0
        System.out.println("向上取整" + Math.ceil(c2));//-12.0

        double f1 = 12.3;
        double f2 = -12.3;
        System.out.println("向下取整" + Math.floor(f1));//12.0
        System.out.println("向下取整" + Math.floor(f2));//-13.0


        //round - 四舍五入
        double rr = 15.6;
        System.out.println("四舍五入" + Math.round(rr));//16

        //max - 较大值
        System.out.println("较大值" + Math.max(13,16));//16

        //random - 返回值为double的随机值,范围[0.0 , 1.0)
        System.out.println("随机值" + Math.random());//0.4360270884601971

        //pow - 获取a的b次幂
        System.out.println("a的b次幂" + Math.pow(2,3));//8.0
        System.out.println("a的b次幂" + Math.pow(2,0.5));//1.4142135623730951
        System.out.println("a的b次幂" + Math.pow(2,-2));//0.25

        //sqrt - 开平方根
        System.out.println("开根号" + Math.sqrt(9));//3.0
        System.out.println("开根号" + Math.sqrt(16));//4.0

        //abs - 绝对值
        System.out.println("绝对值" + Math.abs(5));//5
        System.out.println("绝对值" + Math.abs(-5));//5
        System.out.println("绝对值" + Math.abs(-3.89));//3.89

        //获取0 - 100 的随机数
        System.out.println("0 - 100随机数" + (int) (Math.random() * 100 + 1));//16
        System.out.println("0 - 100随机数" + Math.ceil(Math.random() * 100 + 1));//29.0




    }
}
