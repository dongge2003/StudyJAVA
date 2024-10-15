package com.Knowledge.Generics;

import java.util.ArrayList;

public class GenericsTest {
    public static void main(String[] args) {
        //泛型类的使用
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("aaa");
        myArrayList.add("bbb");
        myArrayList.add("ccc");

        System.out.println(myArrayList);
        //[aaa, bbb, ccc, null, null, null, null, null, null, null]

        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(1111);
        myArrayList2.add(2222);
        myArrayList2.add(3333);

        System.out.println(myArrayList2);
        //[1111, 2222, 3333, null, null, null, null, null, null, null]

        System.out.println(myArrayList2.get(0));//1111
        System.out.println(myArrayList2.get(1));//2222
        System.out.println(myArrayList2.get(2));//3333



        /*
        泛型方法:
            方法参数不确定时
            格式: 修饰符<类型>返回值类型 方法名(类型 变量名){ }
            例子:public <T>void(E e){ }
        */
        ArrayList<String> list = new ArrayList<>();
        ListUtil.add(list, "aaa", "bbb", "ccc", "ddd","eee");// 调用了泛型方法
        System.out.println(list);//[aaa, bbb, ccc]



        /*
         * 泛型接口:
         *      格式:修饰符 interface 接口名<类型>{ }
         *      例子:public interface List<E>{ }
         * 
         * 1.实现类不确定泛型
         * 2.实现类给出具体类型
         */
        //public class MyArrayList2 implements List<String>{}  2.实现类给出具体类型
        //public class MyArrayList3<E> implements List<E>{}    1.实现类不确定泛型





        /*
         * 泛型方法:
         *          1.能接受指定引用数据类型的方法
         *          2.能接受所有引用数据类型的方法
         *          3.能接受限定引用数据类型的方法 - 使用通配符:?
         */ 

        //创建集合的对象
        ArrayList<Fu> l1 = new ArrayList<>();
        ArrayList<Zi> l2 = new ArrayList<>();
        ArrayList<Sun> l3 = new ArrayList<>();
        ArrayList<Student> l4 = new ArrayList<>();

        //1.接受指定类型
        method1(l1);
        //method1(l2);//报错
        //method1(l3);//报错

        //2.接受所有类型
        method2(l1);
        method2(l2);
        method2(l3);
        method2(l4);


        //3.接受限定类型
        //如果此时想传入FU , Zi , Sun 但不想传入Student 就可以用通配符 ? (是否继承...)
        //格式:? extends E   ? super E
        //例如:public static void method3 (ArrayList<? extends Fu>  list){}
        method3(l1);
        method3(l2);
        method3(l3);
        //method3(l4);//报错





        


    }

    //泛型方法
    public static void method1 (ArrayList<Fu> list){

    }
    public static <E> void method2 (ArrayList<E> list){

    }
    public static void method3 (ArrayList<? extends Fu>  list){

    }
    

}

class Fu{}
class Zi extends Fu{}
class Sun extends Zi{}
class Student{}
