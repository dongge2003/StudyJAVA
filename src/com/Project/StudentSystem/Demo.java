package com.Project.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> liststu = new ArrayList<>();
        Student stu = new Student();

        //给while循环起个名字方便结束循环
        loop: while (true){
            menu();
            System.out.print("请选择功能>");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            sc.nextLine(); // 清理输入缓冲区
            switch (choose){
                case 1:
                    add(liststu );
                    break;
                case 2:
                    delete(liststu);
                    break ;
                case 3:
                    change(liststu);
                    break ;
                case 4:
                    find(liststu);
                    break ;
                case 5:
                    show(liststu);
                    break ;
                case 0:
                    break loop;
                default:
                    System.out.println("选择错误!!!");
                    break ;
            }

        }


    }


    //打印菜单

    public static void menu(){
        System.out.println("*****************************");
        System.out.println("***1.增加           2.删除***");
        System.out.println("***3.改变           4.查询***");
        System.out.println("***5.展示           0.退出***");
        System.out.println("*****************************");

    }
    public static void add(ArrayList<Student> liststu ){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入ID：");
        String id = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        sc.nextLine(); // 清理输入缓冲区
        System.out.println("请输入住址：");
        String address = sc.nextLine();

        Student stu = new Student(name, id, age, address);
        liststu.add(stu);
        System.out.println("添加完毕!!!");
    }
    public static void delete(ArrayList<Student> liststu){
        if(liststu.isEmpty()){
            System.out.println("当前没有学生可以删除");
        }
        else {
            System.out.println("请删除你要删除的ID");
            Scanner sc = new Scanner(System.in);
            String ID = sc.nextLine();
            boolean dele = false;
            for (int i = 0; i < liststu.size(); i++) {
                Student stu = liststu.get(i);
                String deleid = stu.getId();

                if (deleid.equals(ID)) {
                    liststu.remove(i);
                    System.out.println("删除成功!!!");
                    dele = true;
                    break;

                }

            }
            if(!dele){
                System.out.println("不存在此学生");
            }
        }
    }

    public static void changemenu(){
        System.out.println("**********************");
        System.out.println("***1.姓名      2.ID***");
        System.out.println("***3.年龄      4.地址**");
        System.out.println("**********************");
    }
    public static void change(ArrayList<Student> liststu){
        if(liststu.isEmpty()){
            System.out.println("当前没有学生");

        }else {
            System.out.println("请输入你要修改人的ID");
            Scanner sc = new Scanner(System.in);
            String ID = sc.nextLine();
            boolean change = false;


            for (int i = 0; i < liststu.size(); i++) {
                Student stu = liststu.get(i);
                String chanegid = stu.getId();
                if(chanegid.equals(ID)){
                    foor:while (true){
                        changemenu();
                        System.out.println("请输入你要修改的属性");
                        int choose = sc.nextInt();
                        sc.nextLine(); // 消耗掉换行符
                        switch (choose){
                            case 1:
                                System.out.println("请输入修改后的名字");
                                String cname = sc.nextLine();
                                stu.setName(cname);
                                System.out.println("修改成功");
                                change = true;
                                break foor;
                            case 2:
                                System.out.println("请输入修改后的ID");
                                String cid = sc.nextLine();
                                stu.setId(cid);
                                System.out.println("修改成功");
                                change = true;
                                break foor;
                            case 3:
                                System.out.println("请输入修改后的年龄");
                                int cage = sc.nextInt();
                                sc.nextLine(); // 再次消耗换行符
                                stu.setAge(cage);
                                System.out.println("修改成功");
                                change = true;
                                break foor;
                            case 4:
                                System.out.println("请输入修改后的地址");
                                String cadd = sc.nextLine();
                                stu.setAddress(cadd);
                                System.out.println("修改成功");
                                change = true;
                                break foor;
                            default:
                                System.out.println("选择错误");
                                break ;
                        }
                    }
                }
            }

            if(!change){
                System.out.println("没有找到此学生");
            }
        }

    }
    public static void find(ArrayList<Student> liststu){
        //当前集合为空
        if(liststu.isEmpty()){
            System.out.println("当前没有学生");
        }
        else {
            System.out.print("请输入要查找学生的ID:");
            Scanner sc = new Scanner(System.in);
            String ID = sc.nextLine();
            boolean found = false;
            //遍历整个集合
            for (int i = 0; i < liststu.size(); i++) {
                Student stu = liststu.get(i);
                String finid = stu.getId();
                if(finid.equals(ID)){
                    System.out.println("姓名>"+stu.getName() +" " + "年龄>"+stu.getAge() +" " + "住址>"+stu.getAddress());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("没有找到ID为 " + ID + " 的学生");
            }

        }
    }


    public static void show(ArrayList<Student> liststu) {
        if (liststu.isEmpty()) {
            System.out.println("当前没有学生");
            return;
        }

        // 打印表头
        System.out.printf("%-15s %-10s %-5s %-20s%n", "Name", "ID", "Age", "Address");
        System.out.println("-------------------------------------------------------------");

        // 打印每个学生的信息
        for (Student stu : liststu) {
            System.out.printf("%-15s %-10s %-5d %-20s%n", stu.getName(), stu.getId(), stu.getAge(), stu.getAddress());
        }
    }

}
