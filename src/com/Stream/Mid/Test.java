package com.Stream.Mid;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
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


        //filter - 过滤
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd","afafaf");

        // Stream<T> filter(Predicate<? super T> predicate);
        //public interface Predicate<T> 
        //所以Predicate是一个函数接口,需要用匿名内部类,或者Lambda表达式

        //1.比如要去掉长度大于3的字符串 - 匿名内部类
        // list.stream().filter(new Predicate<String>() {
        //     @Override
        //     public boolean test(String s){
        //         //s表示流中的数据
        //         //true表示留下,false表示去除

        //         if(s.length() > 3) {
        //              return false;
        //         } else {
        //             return true;
        //         }
        //     }
        // }).forEach(s -> System.out.println(s));

        //2. 去掉等于ccc的字符串 - Lambda表达式
        list.stream().filter(s -> {if(s.equals("aaa")) return false; else {return true;}}).forEach(s -> System.out.println(s));

        //注意: 修改Stream流中的数据,不会影响原来集合或数组中的数据
        System.out.println(list);//[aaa, bbb, ccc, ddd, afafaf] - 还是没变所以流不会改原来得数据
        System.out.println("--------------------------------------------------------");



        //limit - 获取前几个元素
        //skip - 跳过前几个元素
        
        //获取前3个元素打印
        list.stream().limit(3).forEach(s -> System.out.println(s));//aaa bbb  ccc

        //跳过4个元素打印
        list.stream().skip(4).forEach(s -> System.out.println(s));//afafaf
        System.out.println("--------------------------------------------------------");



        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,1111,2222,3333,4444,1111,2222,3333,4444);

        //distinct - 元素去重,依赖(hashCode和equals方法)

        //去除重复的元素
        list2.stream().distinct().forEach(s -> System.out.println(s));//1111 2222 3333 4444
        System.out.println("--------------------------------------------------------");
        


        //concat(Stream a, Stream b)  合并a和b两个流成为一个流

        Stream.concat(list.stream(), list2.stream()).forEach(s -> System.out.println(s));
        //如上: 两个流的数据类型不一样,则会用他们共同的父类,如Object
        //如果两个流一样,就会用相同的数据类型
        System.out.println("--------------------------------------------------------");



        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"张三-20","李四-22","王五-25");
        //map(Function<T, R> mapper)    转换流中的数据类型
        //把所有的数字单独拿出来

        //1.匿名内部类
        //                          <原来数据类型, 要变成的数据类型>
        list3.stream().map(new Function<String,Integer>() {
            @Override
            //                    s表示流上的每一个数据
            public Integer apply(String s){
                String[] arr = s.split("-");//这是字符串分割的方法,返回一个数组0索引表示分隔符之前,1索引表示分割符之后
                String ageStr = arr[1];//把每一个年龄拿出来
                int age = Integer.parseInt(ageStr);//把每一个年龄字符串转换成int类型
                return age;
            }
        }).forEach(s -> System.out.println(s));//20 22 25
        
        //2.Lambda表达式
        list3.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));//20 22 25
        /*
         * 首先s.split("-") 会返回一个数组
         * s.split("-")[1] 这表示返回那个数组的1索引
         * Integer.parseInt(s.split("-")[1])  把返回那个数组的1索引转换成int类型
         * 因为方法体只有一行.所以return省略 - return Integer.parseInt(s.split("-")[1]);
         */


         
        


        





        







    }

}
