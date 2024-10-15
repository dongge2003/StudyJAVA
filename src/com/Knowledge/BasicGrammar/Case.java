package com.Knowledge.BasicGrammar;
import java.util.Arrays;
import java.util.Scanner;


public class Case {
    public static void main(String[] args) {
        //1.数值拆分

        /*int num = 987;
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num /100 % 10;

        System.out.println("个位为:" + ge);
        System.out.println("十位为:" + shi);
        System.out.println("百位为" + bai);*/


        //2.当+号遇到字符串,就不算是算数+了,而是字符串连接符号

        /*System.out.println("hello" + "world");//helloworld
        System.out.println("dong" + 666);//dong666
        System.out.println(1 + 56 + "dong");//57dong
        System.out.println("5+5=" + 5 + 5);//5+5=55
        System.out.println("5+5=" + (5 + 5));//5+5=10*/


        //3.一张纸对折几次能到珠峰的高度

       /* int paper = 2;//毫米
        int monuten = 8848000;//米

        int cont = 0;//计数
        while (paper <= monuten){
            paper = paper * 2;
            cont++;

        }
        System.out.println(cont);*/


       /*4.定义一个数组,存储1.2.3.4.5.6.7.8.9.10
        遍历每一个数组元素
        要求:
            1.如果是奇数,则将当前数字扩大两倍
            2.如果是偶数,则将当前数字缩小两倍
        */
        /*
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] %2 == 0){
                arr[i] = arr[i] / 2;
            }
            else {
                arr[i] = arr[i] * 2;
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
            system.out.println(arr[i]);

        }
        */




        /*
         已知数组元素为{33,5,22,44,55}
         求元素最大的,打印出来
         */
        //int[] arr = new int[];
        /*int arr[] = {33,5,22,44,55};
        int max = 0;
        //arr.length - 计算数组长度 - ****.length        for(int i = 0; i < arr.length ;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);*/



        /*
        猜数字小游戏
         */
        /*Scanner sc = new Scanner(System.in);//创建键盘对象
        System.out.println("请输入一个整数，范围在1-100之间：");
        Random r = new Random();
        int suji = r.nextInt(101);//(100)是生成0-99的随机数,要加1


        System.out.println("要猜的数是:" + suji);
        while (true) {
            int cai = sc.nextInt();

            if (cai > suji) {
                System.out.println("猜大了");
            }
            else if(cai == suji){
                System.out.println("猜中了");
                System.out.println("游戏结束");
                break;
            }
            else {
                System.out.println("猜小了");
            }
        }*/



        /*
        生成10个一到100之间的随机数存入数组
        1.求出所有数组的和
        2.求出数组的平均数
        3.统计有几个数超过平均数
         */
        /*int[] arr = new int[10];
        Random r = new Random();
        for(int i = 0 ; i < arr.length ;i++){
            arr[i] = r.nextInt(101);
            System.out.printf("%d ",arr[i]);
        }
        System.out.printf("\n");

        //求和:
        int sum = 0;
        for(int i = 0 ; i < arr.length ;i++){
            sum += arr[i];
        }
        System.out.printf("数组和为:%d\n",sum);

        //求平均数:
        int average = sum / arr.length;
        System.out.printf("平均数为:%d\n",average);

        //计算有几个大于平均数:
        int cont = 0;
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] > average){
                cont++;
            }
        }
        System.out.printf("有%d个数大于平均数\n",cont);*/



        /*
        描述
        编写一个方法，该方法的返回值是两个不大于100的正整数的最小公倍数
        输入描述：
        两个int类型变量作为方法的参数
        输出描述：
        int类型的变量，值为两个数的最小公倍数
         */
        /*int sum = 0;
        int i = 9;
        int p = 9;
        int cheng = 10;
        int n = 9;
        while(i > 0){
            System.out.println(n);
            n = 9 * cheng + n;
            cheng *= 10;
            i--;
        }*/



        /*
        描述
        一球从h米高度自由落下，每次落地后反弹回原高度的一半再落下，求它在第n次落地时共经过了多少米？第n次反弹多高？
        输入描述：
        输入小球的初始高度和落地的次数（先输入小球初始高度再输入反弹次数）。
        输出描述：
        输出小球反弹的高度和经过的距离（先输出反弹的高度再输出经过的距离，中间用空格隔开）。
        */
        /*double sum = 0;
        for(int i = 0;i < n;i++){
            sum += h;
            h = h /2;
            sum +=h;
        }
        sum -= h;


        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));*/



        /*
        描述
        将用户输入的六个数字填入数组并找出数组中最大值和最小值
        输入描述：
        随机输入的6个整数
        输出描述：
        输出数组中的最大值，最小值(最大值最小值之间用空格隔开。若有多个最大值或最小值，输出一次即可，如样例2所示)
         */
        /*int[] ary = new int[6];
        int max;
        int min;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <ary.length ; i++) {
            ary[i]=scanner.nextInt();
        }

        //c语言的思维:
        *//*max = ary[0];
        min = ary[0];
        for(int i = 0 ; i < ary.length ; i++){
            if(ary[i] >= max){
                max = ary[i];
            }

        }
        for(int i = 0 ; i < ary.length ; i++){
            if(ary[i] <= min){
                min = ary[i];
            }

        }*//*

        //直接调用数组排序的方法:
        Arrays.sort(ary);
        max = ary[5];
        min = ary[0];


        System.out.println(max+" "+min);*/





        /*
        输入任意年份，输出该年份各月天数（请使用 Calendar 类中的方法）
         */
//        Scanner console = new Scanner(System.in);
//        int year = console.nextInt();
//
//        //write your code here......
//        boolean isrun = isyear(year);
//        for(int i = 1 ; i <= 12 ; i++){
//            int mon = i;
//            //前半年
//            if(mon <= 7){
//                //偶数月
//                if(mon % 2 == 0){
//                    //是2月
//                    if(mon == 2){
//                        //是闰年
//                        if(isrun){
//                            System.out.println(year + "年" + i + "月:" + "29天");
//                        }
//                        else{
//                            System.out.println(year + "年" + i + "月:" + "28天");
//                        }
//                    }
//                    //不是2月
//                    else{
//                        System.out.println(year + "年" + i + "月:" + "30天");
//                    }
//                }
//                //奇数月
//                else{
//                    System.out.println(year + "年" + i + "月:" + "31天");
//                }
//            }
//            //后半年
//            else{
//                //偶数月
//                if(mon % 2 == 0){
//                    System.out.println(year + "年" + i + "月:" + "31天");
//                }
//                //奇数月
//                else{
//                    System.out.println(year + "年" + i + "月:" + "30天");
//                }
//            }
//        }






        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length() ;i++){
            int cont = 0;
            for(int j = 0 ; j < str.length();j++){

                if(str.charAt(i) == str.charAt(j)){
                    cont++;
                }
                //if(cont != 0)break;

            }
            if(cont == 0){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);

    }

    //判断是否为闰年
    public static boolean isyear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        else{
            return false;
        }
    }


    
}

