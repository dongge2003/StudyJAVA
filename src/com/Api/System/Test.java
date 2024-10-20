package com.Api.System;

public class Test {
    public static void main(String[] args) {

        //计算机的时间原点:1970年1月1日 00:00:00
        //1秒 = 1000毫秒   1毫秒 = 1000微秒  ....

        //currenTimeMillis - 从计算机时间原点开始一共过了几微秒
        System.out.println(System.currentTimeMillis());//1723911483774

        //计算过了几年
        long l = System.currentTimeMillis();
        l /= 1000;//换算秒
        l = l / 60 /60;//小时
        l /= 24;//天
        l /= 365;//年
        System.out.println("从计算机原点开始,一共过了" + l + "年");

        //计算程序时间
        long star = System.currentTimeMillis();
        long sum = 0;
        for(int i = 0;i < 100000000;i++){
            sum += i;
        }
        //System.out.println(sum);
        long end = System.currentTimeMillis();

        System.out.println("运行时间:" + (end - star));


        //exit - 终止当前虚拟机
        //方式的形参:
        //状态码: 0:表示正常停止虚拟机   非0:表示异常停止

//        System.exit(1);
//        System.out.println("看看执行了吗");//没执行



        //拷贝数组
        //public static void arraycopy(数据源数组 , 起始索引 , 目的地数组 , 起始索引 , 拷贝个数)

        int arr1[] = {1,2,3,4,5,6,7,8,9,10};
        int arr2[] = new int[10];
//        //1.全部拷贝
//        System.arraycopy(arr1 , 0 ,arr2,0,arr1.length);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.printf("%d ",arr2[i]);
//        }

        //把arr2变成0002345000
//        System.arraycopy(arr1,2-1,arr2,3,4);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.printf("%d ",arr2[i]);
//        }





    }
}
