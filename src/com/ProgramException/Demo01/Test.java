package com.ProgramException.Demo01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        定义一个Student类
        姓名的长度在3-10之间
        年龄的范围在18-40之间
        超出范围的是异常,不能进行赋值,需要重新录入,直到录入成功为止
         */

        Scanner sc = new Scanner(System.in);
        boolean exception;
        Student s = new Student();

        do {
            exception = false;
            try{
                System.out.println("输入姓名:");
                String name = sc.nextLine();
                s.setName(name);
                System.out.println("输入年龄:");
                int age = sc.nextInt();
                sc.nextLine(); // 处理换行符
                s.setAge(age);
            }catch (AgeFormatException e){
                System.out.println("年龄格式错误");
                exception = true;
                System.out.println("请重新输入");
            } catch (NameFormatException e){
                System.out.println("姓名格式错误");
                exception = true;
                System.out.println("请重新输入");
            }
        } while (exception);

        System.out.println(s.toString());
        sc.close(); // 关闭Scanner
    }
}
