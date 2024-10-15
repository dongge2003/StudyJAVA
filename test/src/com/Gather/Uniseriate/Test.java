package com.Gather.Uniseriate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        //单列集合

        /*
         *                                  -> ArrayList
         *                      -> List     -> LinkedList
         *                                  -> Vector
         * 集合 -> Collection
         * 
         *                                  -> HashSet      -> LinkedHashSet
         *                      -> set 
         *                                  -> TreeSet
         */


        /*
        List系列集合:
            添加的元素是有序的,可重复,有索引

         Set系列集合:
            添加的元素是无序的,不重复,无索引
         */



        //Collection - 接口 - 单列集合的祖宗接口
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





        /*
        集合的遍历方式:
            迭代器遍历 - 迭代器是不依赖索引的 - 迭代器是集合专用的遍历方法
            增强for遍历
            lambda表达式遍历
         */

        //迭代器
        /*
        Iterator<E> iterator()      返回迭代器对象,默认指向当前集合的0索引
        boolean hasNext()           判断当前位置是否有元素,有元素返回true,没有元素返回false
        E next()                    获取当前位置的元素,并将迭代器对象移动到下一个位置
        remove()                    删除当前元素
         */

        //创建集合
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("aaa");
        collection2.add("bbb");
        collection2.add("ccc");
        collection2.add("ddd");
        //System.out.println(collection2);
        //
//        Iterator<String> iterator = collection2.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //注意1:循环只能调用1次next方法
        //next方法:1.获取元素2.移动指针
//        Iterator<String> iterator = collection2.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            System.out.println(iterator.next());
//            //会报错:NoSuchElementException
//        }

        //注意2:迭代器遍历时不能用集合的方法进行增加和删除
//        Iterator<String> iterator = collection2.iterator();
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            if("bbb".equals(s)){
//                collection2.remove("bbb");//集合里的方法
//            }
//            System.out.println(s);
//            //会报错:ConcurrentModificationException - 并发修改异常
//        }

        //remove() - 迭代器里的方法
        //如果要删除就要用迭代器里的方法 - remove()
        Iterator<String> iterator = collection2.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if("bbb".equals(s)){
                iterator.remove();//迭代器里的方法
            }
        }
        System.out.println(collection2);//[aaa, ccc, ddd] - 删除成功
        System.out.println("------------------------------");




        /*
        增强for遍历:
            增强for遍历在底层就是迭代器,只是简化了书写
            所有的单列集合和数组才能用增强for遍历

            格式:
                for(元素的数据类型 变量名 : 数组或者集合){

                }
         */

        Collection<String> collection3 = new ArrayList<>();
        collection3.add("zhangsan");
        collection3.add("lisi");
        collection3.add("wangwu");

        //增强for遍历
        for(String s : collection3){
            System.out.println(s);
        }
        //collection3.forEach(System.out::println);//Lambda表达式遍历 -idea快捷遍历方式:集合名.for


        for(String s : collection3){
            s = "qqq";
        }
        System.out.println(collection3);//[zhangsan, lisi, wangwu]
        //在增强for中的变量,不会修改原本集合里的数据
        System.out.println("--------------------------------");


        /*
        Lambda表达式遍历
         */

        //创建集合添加元素
        Collection<String> collection4 = new ArrayList<>();
        collection4.add("zhangsan");
        collection4.add("lisi");
        collection4.add("wangwu");

        //利用匿名内部类的形式
        /*
        底层原理:
            依次遍历集合,得到的每一个元素传递給下面的accept方法
         */
        collection4.forEach(new Consumer<String>() {
            @Override
            //s依次表示集合中的每一个数据
            public void accept(String s){
                System.out.println(s);
            }
        });
        System.out.println("--------------------------------");

        //Lambda表达式
        //() -> {}

        //1标准
        collection4.forEach((String s) -> {
                System.out.println(s);
            }
        );
         
        //2简写
        collection4.forEach(s -> System.out.println(s));





        /*
        List系列集合:
        1.ArrayList  2.LinkedList  3.Vector
        
        特点:添加的元素是有序的,可重复,有索引

        方法:
            void add(int index, E element)      在此集合中的指定为值插入指定元素
            E remove(int index)                 删除指定索引处的元素,返回被删除的元素
            E set(int index, E element)         修改指定索引处的元素,返回被修改的元素
            E get(int index)                    返回指定索引处的元素
        */

        //创建集合
        List<String> list = new ArrayList<String>();
        
        //添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
            
        System.out.println("----------add---------------");
        //在指定位置插入指定元素
        //细节:原来索引处的元素依次往后移动
        list.add(1, "qqq");
        System.out.println(list);//[aaa, qqq, bbb, ccc]


        System.out.println("----------remove---------------");
        //删除元素
        list.remove(3);
        System.out.println(list);

        System.out.println("----------set---------------");
        //修改元素
        list.set(2, "fffff");
        System.out.println(list);

        System.out.println("----------get---------------");
        //获取元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        


        








    }
}
