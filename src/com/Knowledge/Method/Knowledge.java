package com.Knowledge.Method;

public class Knowledge {
    public static void main(String[] args) {
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



        //


    }
}
