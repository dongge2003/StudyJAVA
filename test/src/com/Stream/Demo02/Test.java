package com.Stream.Demo02;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        /*
        定义两个ArrayList集合:
        第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。
        姓名和年龄中间用逗号隔开。比如:张三,23要求完成如下的操作:
        1，男演员只要名字为2个字的前两人
        2，女演员只要姓杨的，并且不要第一个
        3，把过滤后的男演员姓名和女演员姓名合并到一起
        4，将上一步的演员信息封装成Actor对象。
        5，将所有的演员对象都保存到List集合中。
        备注:演员类Actor，属性有:name，age
        */

        ArrayList<String> nan = new ArrayList<>();
        ArrayList<String> nv = new ArrayList<>();
        Collections.addAll(nan, "张三,23","李啊四,24","王五,14");
        Collections.addAll(nv, "李琴,24","杨华,19","周书童,25");

        // nan.stream().limit(2).filter(s -> s.split(",")[0].length() == 2);
        // nv.stream().skip(1).filter(s -> (s.startsWith("杨")));

        List<Actor> newlist = 
        Stream.concat(nan.stream().limit(2).filter(s -> s.split(",")[0].length() == 2),
                    nv.stream().skip(1).filter(s -> (s.startsWith("杨"
                    )))).
        map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1]))).
        collect(Collectors.toList());

        System.out.println(newlist);


        


        

    }
}
