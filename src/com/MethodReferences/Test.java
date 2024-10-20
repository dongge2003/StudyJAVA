package com.MethodReferences;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        /*
        方法引用
            把已经存在的方法拿过来直接用,当做函数式接口里抽象方法的方法体

            符号:  类::方法名

            注意:1.需要有函数式接口
                2.引用的方法必须存在
                3.被引用的方法体的返回值必须与抽象方法保持一致
                4.被引用的方法的功能要满足当前需求

        
        */

        //如:
        Integer[] arr = {1,34,23,2,4,6,3};
        //1.匿名内部类
//        Arrays.sort(arr,new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2){
//                return o1 - o2;
//            }
//        });

        //2.Lambda表达式
//        Arrays.sort(arr,(o1, o2) -> o1 - o2);

        //3.方法引用
        Arrays.sort(arr,Test::sub);

        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------------------------");



        /*
        引用静态方法:
            格式:   类名:方法名
            例子:   Integer::parseInt
        */

        //如:把集合中的字符串变成Int类型
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        //1.匿名内部类
        list.stream().map(new Function<String,Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }
        }).forEach(s->System.out.println(s));
        System.out.println("_____________________________________");

        //2.方法引用
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        System.out.println("---------------------------------------------");



        /*
        引用成员方法:
            格式:   对象::成员方法
                1.引用其他类:   其他类对象::方法名
                2.引用本类:     this::方法名
                3.引用父类:     super::方法名
         */

         //引用其他类
         








    }

    //方法引用的方法
    public static int sub(int o1, int o2) {
        return o1 - o2;
    }

}
