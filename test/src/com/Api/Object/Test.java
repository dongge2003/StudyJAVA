package com.Api.Object;

import com.Api.Object.Student;

import java.util.Objects;

public class Test {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) throws CloneNotSupportedException {

        //toString - 返回对象的字符串
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@10f87f48

        Student s = new Student();
        String str2 = s.toString();
        System.out.println(str2);//com.Project.StudentSystem.Student@2f4d3709
        //System.out.println(s);//com.Project.StudentSystem.Student@2f4d3709
        System.out.println("*******************************************");


        //System:类名
        //out:静态变量
        //System.out:获取打印对象
        //println();:方法
        //参数:打印内容
        //System.out.println();
        //核型逻辑:
        //当我们答应一个对象的时候,会调用toString方法,把对象变成字符串


        //Object 中的地址值是没什么意义的
        //可以对Object中的toString方法重写
        /*
        @Override
    public String toString() {
        return name + "," + age;
    }
         */
        System.out.println(s);//null,0
        System.out.println("*******************************************");




        //equals - 比较两个对象是否相等
        String s1 = "dong";
        StringBuilder s2 = new StringBuilder("dong");
        System.out.println(s2.equals(s1));//false
        //equals是被s2调用的,而s1是字符串
        //这里的equals是调用StringBuilder中的equals方法,只要不是StringBuilder就返回false
        String s3 = s2.toString();
        System.out.println(s3.equals(s1));//true - 转换成字符串就行了
        System.out.println("*******************************************");






        //clone - 对象克隆
        //默认:浅克隆
        User u1 = new User(18,"dong","123456");
        User u2 =(User) u1.clone();
        //(User) - 强转
        System.out.println(u1);
        System.out.println(u2);
        /*
        User{age=18, name='dong', key='123456'}
        User{age=18, name='dong', key='123456'}
        克隆成功
         */

        System.out.println("*******************************************");
        u1.setName("ddongjajngagj");
        System.out.println(u1);
        System.out.println(u2);
        /*
        User{age=18, name='ddongjajngagj', key='123456'}
        User{age=18, name='dong', key='123456'}
         */



        //isNull - 对象内容为null,返回true,反之
        //nonNull - 对象内容为null,返回false,反之

        Student s5 = new Student(18,"zhang");
        Student s4 = null;

        //System.out.println(s4.equals(s5));//报错 : (Object)" because "s4" is null - 调用者为空

        //所以要加判断
        /*if(s4 == null){
            System.out.printf("调用者为空");
        }else {
            System.out.println(s4.equals(s5));
        }
*/
        //或者用方法
        if(Objects.isNull(s4)){
            System.out.println("调用者为空");
        }else {
            System.out.println(s4.equals(s5));
        }



    }
}
