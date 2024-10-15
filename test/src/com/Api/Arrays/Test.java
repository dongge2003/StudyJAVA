package com.Api.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        /*
        public static String toString(数组)                           把数组拼接成一个字符串
        public static int binarySearch(数组, 查找的元素)               二分查找查找元素
        public static int[] copyOf(原数组, 新数组长度)                 拷贝数组
        public static int[] copyOfRange(原数组, 起始索引, 结束索引)    拷贝数组(指定范围)
        public static void fill(数组, 元素)                            填充数组
        public static void sort(数组)                                 按照默认方式进行数组排序
        public static void sort(数组, 排序规则)                       按照指定规则排序
         */


        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};


        //public static String toString(数组)
        System.out.println("--------toString---------");
        System.out.println(Arrays.toString(arr));

        //public static int binarySearch(数组, 查找的元素)
        System.out.println("--------binarySearch---------");
        System.out.println(Arrays.binarySearch(arr, 3));

        //public static int[] copyOf(原数组, 新数组长度)
        System.out.println("--------copyOf-------");
        int arr2[] = new int[5];
        arr2 = Arrays.copyOf(arr,5);
        System.out.println(Arrays.toString(arr2));

        //public static int[] copyOfRange(原数组, 起始索引, 结束索引)
        System.out.println("--------copyOfRange-------");
        int arr3[] = new int[5];
        arr3 = Arrays.copyOfRange(arr,2,7);
        System.out.println(Arrays.toString(arr3));

        //public static void fill(数组, 元素)
        System.out.println("--------fill-------");
        int arrr[] = new int[20];
        Arrays.fill(arrr, 1000);
        System.out.println(Arrays.toString(arrr));


        //public static void sort(数组)
        System.out.println("--------sort-------");
        int arr4[] = new int[arr.length];
        arr4 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        //public static void sort(数组, 排序规则)
        System.out.println("--------sort(自定义)-------");
        //只能用引用数据类型进行排序,转换对应的包装类
        Integer[] arr5 = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        /*
        第二个参数是一个接口,调用方法的时候,需要传递这个接口的实现类对象,作为排序的规则
        规则:
         */
        Arrays.sort(arr5,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;//降序
                //return o1 - o2;//升序
            }
        });

        System.out.println(Arrays.toString(arr5));



    }
}
