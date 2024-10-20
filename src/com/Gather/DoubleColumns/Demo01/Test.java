package com.Gather.DoubleColumns.Demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        /*
         * 创建一个HashMap集合,键是学生对象Student,值是籍贯String
         * 存储三个键值对元素,并遍历
         * 
         * 要求:
         * 同姓名,同年龄认为是同一个学生
         */

        //创建集合对象
        HashMap<Student, String> hashMap = new HashMap<>();

        //创建学生对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",34);
        Student s3 = new Student("王五",23);

        //添加元素
        hashMap.put(s1, "深圳");
        hashMap.put(s2, "山东");
        hashMap.put(s3, "广东");

        //遍历集合
        //1.用单列集合把键添加进去
        //1.1 增强for
        Set<Student> keys = hashMap.keySet();
        for(Student key : keys){
            String value = hashMap.get(key);
            System.out.println(key + " = " + value);
        }

        //1.2 lanmbda
        hashMap.forEach(((student, s) -> System.out.println(student + " = " + s)));

        //1.3 匿名内部类
        hashMap.forEach(new BiConsumer<Student, String>() {
            @Override
            public void accept(Student student, String s){
                System.out.println(student + " = " + s);
            }
        });

        System.out.println("--------------------------------------------");

        //2.把键值对放在一个双列集合
        Set<Map.Entry<Student, String>> entries = hashMap.entrySet();
        //2.1 - 增强for
        for(Map.Entry<Student, String> entry : entries){
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        //2.2 匿名内部类
        entries.forEach(new Consumer<Map.Entry<Student, String>>() {
            @Override
            public void accept(Map.Entry<Student, String> entry) {
                Student key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " = " + value);
            }
        });

        //2.3 lambda
        entries.forEach((Map.Entry<Student, String> entry) -> {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        });
        
        





    }

}
