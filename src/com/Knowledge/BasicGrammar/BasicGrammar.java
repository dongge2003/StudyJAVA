package com.Knowledge.BasicGrammar;


//这是一个类,类名BasicGrammar,类目必须要和文件名保持一致
public class BasicGrammar {
    //值是一个main方法(函数),是程序的主入口
    public static void main(String[] args) {
        //这是一个输出语句,打印小括号里的内容
        //System.out.println("打印一段话");


        //注释:
        //1.单行注释

        /*
         2.多行注释
        */

        /*
         * 3.文档注释
         */



        /*//字面量 - 直接写出来的可以解得数据

        //1.字符串字面量
        System.out.println("HelloWorld");
        System.out.println("打印一段话");

        //2.整数字面量
        System.out.println(100);
        System.out.println(-874);

        //3.小数字面量
        System.out.println(3.11);
        System.out.println(0.345);

        //4.字符字面量
        System.out.println('A');
        System.out.println('a');

        //5.布尔字面量
        System.out.println(true);
        System.out.println(10 < 5);*/


        //数据类型
        /*
        1.基本数据类型:
            数值型:
                整数:byte(1),short(2),int(4),long(8)
                浮点数:float(4),double(8)
                字符:char(2) - java中char占两个字节是因为用的是Unicode编码
            非数值型:
                布尔:boolean(1)
        2.引用数据类型:
            类:class
            字符串:string
            接口:interface
            数组:[]
         */


        //变量 - 存储的数据可以改变
        //变量的定义:数据类型 变量名 = 变量值;


        //算数运算符
        /*
            + 加
            - 减
            * 乘
            / 除
            % 取余
         */


        //隐式转换 - 把一个表示范围小的数值或者变量赋值给另一个表示数据范围大的变量
        //强制转换 - 把一个表示范围大的数值或者变量赋值给另一个表示数据范围小的变量
        //格式:数据类型 变量名 = (目标数据类型)(数值或变量);

        /*
        int a = 10;
        double b = 13.14;
        System.out.println(a + b);

        //int c = a + b;    error
        //double c = a + b;

        short s = 10;
        int i = 20;
        int j = s + i;

        short ss = (short)(s + i);//强制转换*/


        //当+号遇到字符串,就不算是算数+了,而是字符串连接符号
        /*System.out.println("hello" + "world");//helloworld
        System.out.println("dong" + 666);//dong666
        System.out.println(1 + 56 + "dong");//57dong
        System.out.println("5+5=" + 5 + 5);//5+5=55
        System.out.println("5+5=" + (5 + 5));//5+5=10*/


        //常量优化机制:
        /*short s = 1;
        //s = s + 1;//1默认是int类型的,但s是short类型的,所以这里需要强制转换
        s = (short) (s + 1);*/


        //循环语句
        //for循环
        /*for(int i = 0 ; i < 100 ; i++){
            System.out.println(i);
        }*/

        //while循环
        /*int i = 1;
        while (i < 100){
            System.out.println(i);
            i++;
        }*/

        //do while循环
        /*int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while (i < 100);*/


        //选择语句
        //if else
        /*int i = 1;
        if(i == 1){
            System.out.printf("成立");
        }
        else{
            System.out.printf("不成立");
        }*/


        //if elseif else
        /*int x = 30;

        if( x == 10 ){
            System.out.print("Value of X is 10");
        }else if( x == 20 ){
            System.out.print("Value of X is 20");
        }else if( x == 30 ){
            System.out.print("Value of X is 30");
        }else{
            System.out.print("这是 else 语句");
        }*/

        //switch
        /*Scanner sc = new Scanner(System.in);//从键盘接受数据
        switch (sc.nextInt()){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("选择错误");
                break;
        }*/


        //方法(函数):
        /*int m = max(10, 20);
        System.out.println(m);*/
        /*
            方法注意事项:
                1.不能嵌套使用,比如在main方法里创建其他方法
                2.如果返回值为void,可以省略return,也可以单独写return ;,后面不加数据
         */


        //方法重载 - 同一个类中定义多个方法之间的关系
        /*
            多个方法在同一个类中
            多个方法具有相同的方法名
            多个方法的参数不相同,类型或者数量不同
         */
        /*int s1 = sum(10,20);
        double s2 = sum(0.16 ,8.9532);
        int s3 = sum(56 ,89,94);
        double s4 = sum(3.15 ,5.69 ,89.5);
        System.out.println(s1);//30
        System.out.println(s2);//9.1132
        System.out.println(s3);//239
        System.out.println(s4);//98.34*/

        /*调用方法的时候,java虚拟机会通过参数的不同来区分同名的方法
            方法重载的好处:
                让调用者不用记太多的方法名
                调用方法时,jvm会根据参数列表匹配对应的方法
        */




        //数组
        /*
        定义数组:
        数据类型[] 数组名 = new 数据类型[数组的长度];
        在创建的时候,由我们自己指定数组的长度,由虚拟机给出默认的初始值
         */

       /* String[] arr = new String[30];
        arr[0] = "zhang";
        arr[1] = "lisi";
        System.out.println(arr[0]);//zhang
        System.out.println(arr[1]);//lisi
        System.out.println(arr[2]);//null*/

        /*
        默认初始化规律:
        整数类型:默认初始化为0
        小数类型:默认初始化为0.0
        字符数类型:默认初始化为"/u0000" - 空格
        布尔类型:默认初始化为false
        引用数据类型:默认初始化为null
         */

        //数组的声明:
        /*int[] arr = new int[3];
        //数组的初始化:
        //标准版:
        int[] arr2 = new int[]{1,2,3};
        //简化格式:
        int[] arr3 = {1,2,3};
        for(int i = 0;i < 3;i++){
            System.out.println(arr3[i]);
        }*/


    }
}
