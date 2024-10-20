package com.Stream.End;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        /*
         * Stream流中的终结方法:
         *      void forEach(Consumer action)           遍历
         *      long count()                            统计流中数据的个数
         *      toArray()                               收集流中的数据,放到数组中
         *      collect(Collector collector)            收集流中的数据,放到集合中
        */ 

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd","afafaf");

        //forEach - 遍历
        list.stream().forEach(s -> System.out.println(s));//遍历打印
        System.out.println("----------------------------------------");


        //count - 统计
        System.out.println(list.stream().count());//5
        System.out.println("----------------------------------------");


        //toArray - 收集流中的数据,放到数组中

        

        //1.匿名内部类
        //toArray方法体参数的作用: 创建指定类型的数组
        //toArray方法的底层: 会依次得到流中的数据,并把他方法数组中
        //toArray方法的返回值: 是一个装着流中所有数据的数组

        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            /**
             * IntFunction<String[]>()的泛型: 具体类型的数组
             *
             * @param value 流中的数据个数,要跟数组的长度保持一致
             * @方法体 就是创建数组
             * @return 具体类型的数组,数组的长度要跟流中的数据个数一致
             */
            @Override
            public String[] apply(int value){
                return new String[value];
            }
        });

        //2.Lambda表达式
        String[] arr2 = list.stream().toArray(val -> new String[val]);


        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr1的 " + i + "索引= " + arr[i]);
        }
        System.out.println("___________");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr2的 " + i + "索引= " + arr[i]);
        }
        /*
        arr1的 0索引= aaa .....

        arr2的 0索引= aaa ......
         */
        System.out.println("-------------------------------------------");



        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"张三-男-20","李四-女-22","王五-男-25","赵敏-女-26","张强-男-23");

        //collect(Collector collector) - 收集流中的数据,放到集合中

        //1.把所有的男性收集到List集合当中
        List<String> newlist = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newlist);//[张三-男-20, 王五-男-25, 张强-男-23]
        System.out.println("__________________________");

        //2.把所有的女性收集到Set集合当中
        Set<String> newlist2 = list2.stream()
                .filter(s -> "女".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
        System.out.println(newlist2);
        System.out.println("__________________________");


        //3.把所有的男性收集到Map集合当中
        //键:姓名  值:年龄
        //3.1 - 匿名内部类
        Map<String,Integer> map = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                /*
                toMap:
                    参数 - 参数一:表示生成键的规则
                           参数二:生成值的规则


                参数一:
                    泛型 - 泛型一:表示流中的数据类型
                           泛型二:表示生成Map集合中*值*的数据类型

                    apply方法:
                        形参:依次表示流中的每一个数据
                        方法体:生成值的代码
                        返回值:生成的值

                 参数二:
                    泛型 - 泛型一:表示流中的数据类型
                           泛型二:表示生成Map集合中*值*的数据类型

                    apply方法:
                        形参:依次表示流中的每一个数据
                        方法体:生成值的代码
                        返回值:生成的值
                 */
                .collect(Collectors.toMap(
                        //键(姓名)
                        new Function<String, String>() {
                            @Override
                            public String apply(String s) {
                                //键得生成规则
                                String[] arr = s.split("-");
                                String key = arr[0];
                                return key;
                            }
                        },
                        //值(年龄)
                        new Function<String,Integer>() {
                            @Override
                            public Integer apply(String s) {
                                //值得生成规则
                                String[] arr = s.split("-");
                                int value = Integer.parseInt(arr[2]);
                                return value;
                            }
                        }
                ));

                map.forEach((k,v) -> System.out.println(k + "=" + v));

                //("张三-男-20","李四-女-22","王五-男-25","赵敏-女-26","张强-男-23"); - 如果此时将集合变成->
                //("张三-男-20","李四-女-22","王五-男-25","赵敏-女-26","张强-男-23","张三-男-87");
                // Duplicate key 张三 (attempted merging values 20 and 87) - 就会报错,因为键不能重复
        System.out.println("______________________");

        //3.2 - Lambda表达式
        Map<String,Integer> map2 = list2.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(
                        //Lambda表达式
                        s -> s.split("-")[0],
                        s -> Integer.valueOf(s.split("-")[2])
                ));
        System.out.println(map2);






        

    }


}
