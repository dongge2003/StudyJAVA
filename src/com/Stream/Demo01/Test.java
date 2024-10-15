package com.Stream.Demo01;

import java.util.stream.Collectors;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*
        定义一个集合,存放整数1,2,3,4,5,6,7,8,9,10
        过滤奇数,留下偶数
        将结果保存起来
         */

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5,6,7,8,9,10);

        List<Integer> newlist = list.stream().filter(s -> {
            if(s % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(newlist);//[2, 4, 6, 8, 10]

    }
}
