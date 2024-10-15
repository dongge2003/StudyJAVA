package com.Knowledge.ArrayList;

import java.util.ArrayList;

public class Knowledge {
    public static void main(String[] args) {
        //集合
            //长度: 数组的长度是固定的,而集合的长度是可变的
            //存储类型: 数组可以存基本数据类型,引用数据类型
                    // 集合可以存引用数据类型,但基本数据类型要变成 - > 包装类

        /*
        ArrayList<E> - 类 - java.util
                <E>存储的数据类型

         */


        //创建集合的对象
        //<>泛型 限定集合中存储的数据类型
        //ArrayList<String> list = new ArrayList<String>();
        //只能存String这样的字符串
        //JDK7:之前是这样写的

        //JDK7之后的版本
        //ArrayList<String> list = new ArrayList<>();
        //System.out.println(list);//[] - 内容为空,
        //这个类型在底层做了处理
        //打印对象不是地址值,而是集合中的数据内容
        //在展示时会用[]对数据进行包裹


        /*
        方法:
            增:boolean add(E e) - 添加元素,返回值表示是否添加成功
            删1:boolean removeL(E e) - 删除指定元素,返回值便是是否删除成功
            删2:E removeL(int index) - 删除指定索引的元素,返回被删除的元素
            改:E set(int index , E e) - 修改指定索引的元素,返回原来的元素
            查1:E get(int index) - 获取指定索引元素
            查2:int size() - 集合的长度,也就是集合中元素的个数
         */

        /*//增加元素
        list.add("aaa");
        System.out.println(list);//[aaa]
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);//[aaa, bbb, ccc, ddd]

        //删除元素
        list.remove("aaa");
        System.out.println(list);//[bbb, ccc, ddd]

        list.remove(2);
        System.out.println(list);//[bbb, ccc]

        //修改元素
        list.set(0,"aaa");
        System.out.println(list);//[aaa, ccc]

        //查找元素
        String str = list.get(1);
        System.out.println(str);//ccc
        int sz = list.size();
        System.out.println(sz);//2*/



        /*
        基本数据类型对应包装类:
            byte - Byte
            short - Short
            char - Character
            int - Integer
            long - Long
            float - Float
            double - Double
            boolean - Boolean
         */

        /*//创建集合
        ArrayList<Integer> list = new ArrayList<>();
        //Integer: int 的包装类 -Integer

        //添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //遍历集合
        //System.out.println(list);//[1,2,3,4]

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.print("]");
        //[1,2,3,4]*/





        //创建自定义类型元素 - Student类

        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan",18);
        Student s2 = new Student("lisi",20);
        Student s3 = new Student("dongjiancheng",60);

//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
        //System.out.println(list);//[com.Knowledge.ArrayList.Student@6acbcfc0,
                                // com.Knowledge.ArrayList.Student@5f184fc6,
                                 // com.Knowledge.ArrayList.Student@3feba861]


        //遍历
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            System.out.println("第" + i + "个:" + "姓名:" + stu.getName() + "年龄:" + stu.getAge());
//        }
        //第0个:姓名:zhangsan年龄:18
        //第1个:姓名:lisi年龄:20
        //第2个:姓名:dongjiancheng年龄:60








    }
}
