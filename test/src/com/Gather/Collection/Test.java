package com.Gather.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        //Collection - 接口 - 单列集合的祖宗接口 - 集合的工具类
        /*
        public boolean add(E e)                     把给定的对象添加到集合中
        public void clear()                         清空集合中所有的元素
        public boolean remove(E e)                  把给定的对象在当前集合中删除
        public boolean contains(Object obj)         判断当前集合中是否包含给定的对象
        public boolean isEmpty()                    判断集合是否为空
        public int size()                           返回集合中元素的个数
         */

         //Collection是一个接口,不能直接创建他的对象,要用实现类,如ArrayList
        Collection<String> collection = new ArrayList<String>();

        //1.添加元素
        /*
        返回值:
            List系列集合,永远返回true - 允许重复
            Set系列集合,当添加元素已经存在,则返回false - 不允许重复
         */
        collection.add("aaaa");
        System.out.println(collection);//[aaaa]

        //2.清空元素
        //collection.clear();
        //System.out.println(collection);//[]

        //3.删除元素
        collection.add("bbbb");
        System.out.println(collection.remove("aaa"));//false
        System.out.println(collection.remove("aaaa"));//true
        System.out.println(collection);//true
        //删除成功返回true,失败返回false

        //4.判断元素是否包含
        /*
        底层是依赖equals方法进行判断是否存在的
        如果集合中存储的是自定义对象,也想通过collection方法来判断是否包含,那么在javabean中,一定要重写equals方法
         */
        System.out.println(collection.contains("bbbb"));//true
        System.out.println(collection.contains("aaaa"));//false

        //5.查看集合长度
        System.out.println(collection.size());//1
        collection.add("dddd");
        collection.add("cccc");
        System.out.println(collection.size());//3

        //6.判断是否为空
        System.out.println(collection.isEmpty());//false
        collection.clear();
        System.out.println(collection.isEmpty());//true
        System.out.println("------------------------------");
    }

}
