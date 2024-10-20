package com.Knowledge.Lambda.Demo01;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        /*
         * 定义数组存储字符串,利用Arrays中的sort方法进行排序
         * 
         * 要求:
         * 按照字符串的长度进行排序,短的在前,长的在后
         */

        String[] arr = {"a","aaa","aaaaaaaa","aaaaa","aa"};

        //匿名内部类
        // Arrays.sort(arr, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2){
        //         return o1.length() - o2.length();
        //     }
        // });

        //Lanmbda标准
        // Arrays.sort(arr, (String o1, String o2) -> {
        //     return o1.length() - o2.length();
        // });

        //Lanmbda简化
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));//[a, aa, aaa, aaaaa, aaaaaaaa]

    }

}
