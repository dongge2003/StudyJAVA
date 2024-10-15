package com.Stream.MethodReferences;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Test extends supper{
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
        Arrays.sort(arr,Test::subTest);

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

        Integer[] arr2 = {1,34,23,2,4,6,3};
        //引用其他类
        //Arrays.sort(arr2,Method::sub);//这样就会报错,因为没有他的对象
        Arrays.sort(arr2,new Method()::sub3);//要创建他的对象才可以用

        //引用本类
        //Arrays.sort(arr2,this::sub2);//报错,因为静态方法中没有this
        Arrays.sort(arr2,new Test()::sub2);

        //引用父类
        //Arrays.sort(arr2,super::sub);//还是一样,静态方法中不能使用super.this这样的关键字,要创建对象才行
        Arrays.sort(arr2,new supper()::sub);//

        System.out.println(Arrays.toString(arr2));
        System.out.println("---------------------------------------------");



        /*
        类名引用成员方法:
            格式:   类名::成员方法

            局限性:
                1.不能引用所有类中的方法
                2.是跟抽象方法的第一个参数有关,这个参数是什么类型,那么只能引用这个类中的方法
         */

        //把集合中的字符串变成大写
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"aaa","bbb","ccc");
        //匿名内部类
        list2.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);

        //方法引用
        list2.stream().map(String::toUpperCase).forEach(System.out::println);
        /*
        但是这里注意:
        public String toUpperCase() {
            return toUpperCase(Locale.getDefault());
        }
        这是toUpperCase的源码,这里是空参的,而上面的匿名内部类是有参数的String s,但这里没报错
        简单理解就是这里拿着流中的数据去调用String类里面的toUpperCase方法,方法的返回值就是转换之后的结果

         */
        System.out.println("---------------------------------------------");



        /*
        引用数组的方法:
            格式:  数据类型[]::new
            例子:  int[]::new

            细节:数组的类型,需要跟流中的关系保持一致
         */

        //集合中存储一些整数,收集到数组中
        ArrayList<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3,1,2,3,4,5);

        //匿名内部类
        Integer[] arr3 = list3.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[]{value};
            }
        });

        //方法引用
        Integer[] array = list3.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(array));









    }
    public static int subTest(int o1, int o2) {
        return o1 - o2;
    }

    //
    public int sub2(int o1, int o2) {
        return o1 - o2;
    }

}
