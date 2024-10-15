package com.Gather.DoubleColumns;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.Api.Object.Student;

public class Test {
    public static void main(String[] args) {
        //双列集合

        /*
                HashMap ->  LinkedHashMap
        Map ->
                TreeMap
         */

        /*
        双列集合:
            类似哈希表:有:键值对 或者 键值对对象  java中又叫Entry
            例如:键   值
                脉动  5元
                红茶  3元

        特点:
            1.双列集合一次需要存一对数据,分别为键和值
            2.键不能重复,值可以重复
            3.键和值是一一对应的,每一个键只能找到自己对应的值
            4.键 + 值这个整体 称为"键值对" 或者 "键值对对象" java中叫做"Entry对象"
         */

        /*
        Map的API:
            Map是双列集合中的顶层接口,它的功能是全部双列集合都可以继承使用的
            V put(K key, V value)                       添加元素
            V remove(Object key)                        根据键删除值对元素
            void clear()                                移除所有的键值对元素
            boolean containsKey(Object key)             判断集合是否包含指定的键
            boolean containsValue(Object value)         判读集合是否包含指定的值
            boolean isEmpty()                           判读集合是否为空
            int size()                                  集合的长度,也就是集合中键值对的个数
         */

        //创建双列集合对象
        Map<String,String> map = new HashMap<>();

        //添加元素
        map.put("A","aaa");
        map.put("B","bbb");
        map.put("C","ccc");

        //打印集合
        System.out.println(map);// {A=aaa, B=bbb, C=ccc}

        map.put("C","ccccccccc");
        System.out.println(map);//{A=aaa, B=bbb, C=ccccccccc} 一旦添加了之后把原来键值对给覆盖了
        //在添加数据的时候,如果键不存在,那么把键值对对象添加到Map集合中
        //在添加元素的时候,如果键存在,那么会把原来的键值对队像给覆盖,返回新的键值对对象

        //删除指定键的值
        System.out.println(map.remove("C"));

        //清空集合
        //map.clear();
        System.out.println(map);//{}

        //判读是否包含键
        System.out.println(map.containsKey("A"));//true
        System.out.println(map.containsKey("G"));//false

        //判读是否包含值
        System.out.println(map.containsValue("aaa"));//true
        System.out.println(map.containsValue("dddd"));//false

        //判断是否为空
        System.out.println(map.isEmpty());//false
        map.clear();
        System.out.println(map.isEmpty());//true

        //集合的长度
        System.out.println(map.size());//0
        map.put("F", "fff");
        System.out.println(map.size());//1
        map.put("G", "ggg");
        System.out.println(map.size());//2
        System.out.println("------------------------------------------");
        

        /*
        Map的遍历方式:
        */

        Map<String,String> m1 = new HashMap<>();
        m1.put("A","aaa");
        m1.put("B","bbb");
        m1.put("C","ccc");
        m1.put("D","dddd");

        //1.通过把所有的键加入到一个单列集合中,通过单列集合里面的键寻找双列集合里的值
        Set<String> jian = m1.keySet();
        //1.1 - 增强for
       for (String key : jian) {
            String s = m1.get(key);
            System.out.println("键:" + key + "值:" + s);
       }

       //1.2 - 迭代器
       Iterator<String> iterator = jian.iterator();
       while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
       }

       //1.3 - Lanmbda表达式
       jian.forEach((str) -> System.out.println(str));

       //1.4 - 匿名内部类
       jian.forEach(new Consumer<String>() {
           @Override
           public void accept(String s) {
               System.out.println(s);
           }
       });

        System.out.println("---------------------------------------");


       //2.通过一个方法获取所有的键值对对象,返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //2.1 - 增强for遍历
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + " + value:" + value);
        }

        //2.2 - 迭代器
        Iterator<Map.Entry<String, String>> iterator2 = entries.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, String> str = iterator2.next();
            System.out.println(str);
        }

        //2.3 - lambda表达式
        entries.forEach((Map.Entry<String,String> str) -> System.out.println(str));

        //2.4 - 匿名内部类
        entries.forEach(new Consumer<Map.Entry<String,String>>() {
            @Override
            public void accept(Map.Entry<String, String> str) {
                System.out.println(str);
            }
        });

        System.out.println("---------------------------------------");

        //3.Lambda表达式
        //default void forEach(BiConsumer<? super K, ? super V> action)
        //简化
        map.forEach((key, value) -> {System.out.println(key + ":" + value);});
        System.out.println("---------------------------------------");




        /*
        HashMap的特点:
            1.HashMap是Map里面的一个实现类
            2.由键决定:无序,不重复,无索引
            3.HashMap和HashSet的底层原理是一样的,都是哈希表结构
        */




        /*
        LinkedHashMap:
            1.由键决定:有序,不重复,无索引 - (这里的有序指的是保证存储和取出的元素顺序一致)
            2.原理:底层的数据结构依然是哈希表,只是没个键值对元素又额外多了一个双链表的机制记录存储的顺序
         */




        /*
        TreeMap:
            1.TreeMap根TreeSet底层原理一样,都是红黑树结构的
            2.有键决定特性:不重复,无索引,可排序 - (可排序:对键进行排序)
            3.注意:默认按照从小到大进行排序,也可以自己规定键的排序规则
         */




        /*
        可变参数:
            格式:数据类型... 参数名称
            例如:public static int sum(int... arr){ }
            默认会创建一个数组

            注意:一个方法只能有一个可变参数
                且必须放在参数的最后一个
         */
        int sum = sum(1,2,3,4,5,6,7,8,9,10);
        System.out.println(sum);//55





        /*
        Collections:
            java.util.Collections:是集合工具类
            作用:Collections不是集合,而是集合的工具类

            常用API:
                public static <T> boolean add(Collection<T> c, T...elements)                    批量添加元素
                public static void shuffle(List<?> list)                                        打乱LIst集合元素的顺序
                public static <T> void sort(List<T> list)                                       排序
                public static <T> void sort(List<T> list, Comparator<T> c)                      根据指定规则进行排序
                public static <T> int binarySearch(List<T> list, T key)                         以二分法查找元素
                public static <T> void copy(List<T> dest, List<T> src)                          拷贝集合中的元素
                public static <T> int fill(List<T> list, T obj)                                 使用指定的元素填充集合
                public static <T> void max/min(Collection<T> coll)                              根据默认的自然排序获取最大/最小值
                public static <T> void swap(List<?> list, int i, int j)                         交换集合中指定位置的元素
         */















    }

    //可变参数的方法
    public static int sum(int... arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    
}
