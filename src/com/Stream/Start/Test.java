package com.Stream.Start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

import com.Knowledge.ObjectOientedAdvanced.Demo04.jingli;

public class Test {
    public static void main(String[] args) {
        /* 
        Stream流:
            流 - 流水线

            使用方法:
            1.先得到一条Stream流,把数据放上去
            2.使用中间方法对流水线的数据进行操作
            3.是用终结方法对流水线的数据进行操作

            (获取方式)        (方法名)                                                  (说明)
            单列集合        default Stream<E>stream()                           Collection中的默认方法
            双列集合        无                                                  无法直接使用Stream流
            数组            public static <T>Stream<T>stream(T[] array)         Arrays工具类中的静态方法
            零散数据        public static <T>Stream<T>of(T... values)           Stream接口中的静态方法

         */
        

        //单列集合:
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a","b","c","d");
        
        //获取一条流水线,并把集合中的数据放到流水线上
        Stream<String> stream1 = list.stream();

        //使用终结方法打印流水线上的数据
        stream1.forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------");
    


        
        //双列集合
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("aaa",111);
        hashMap.put("bbb",222);
        hashMap.put("ccc",333);

        //1.因为双列集合没有Stream流,所以要先提取键用keySet方法,转换成单列集合
        hashMap.keySet().stream().forEach(s -> System.out.println(s));//链式编程,先提取键转换成单列集合,然后加入流水线,循环

        //2.提取键值对,加入单列集合
        hashMap.entrySet().forEach(s -> System.out.println(s));

        System.out.println("----------------------------------------");




        //数组
        //1.基本数据类型
        int[] arr = {1,2,3};
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        //2.引用数据类型
        String[] arr2 = {"a","b","c"};
        Arrays.stream(arr2).forEach(s -> System.out.println(s));


        System.out.println("--------------------------------");





        //零散数据
        Stream.of(1,2,3).forEach(s -> System.out.println(s));
        Stream.of("a","b","c").forEach(s -> System.out.println(s));


        //注意:
        /* Stream接口中静态方法of的细节
        方法的形参是可变参数,可以传递一堆参数,也可以传递数组
        但是数组必须是引用数据类型的,如果是基本数据类型,是会把整个数组当成一个整体,放到Steam流中 
        */
        int[] arr3 = {1,2,3};
        Stream.of(arr3).forEach(s -> System.out.println(s));//[I@31befd9f






        /*
         Stream流中的中间方法:
            Stream<T> filter(Predicate<? super T>predicate)             过滤
            Stream<T> limit(long maxSize)                               获取前几个元素
            Stream<T> skip(long n)                                      跳过前几个元素
            Stream<T> distinct()                                        元素去重,依赖(hashCode和equals方法)
            static <T>Stream<T> concat(Stream a, Stream b)              合并a和b两个流成为一个流
            Stream<R> map(Function<T, R> mapper)                        转换流中的数据类型

        注意:
            1.中间方法,会返回新的Stream流,原来得Stream流只能用一次,建议使用链式编程
            2.修改Stream流中的数据,不会影响原来集合或数组中的数据
         
         */

        




            
    }
}
