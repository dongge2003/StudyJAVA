package com.Knowledge.Generics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}


    /**
     * 泛型方法
     * 
     * @param <E> 
     * @param list
     * @param e
     */
    public static <E> void add(ArrayList<E> list, E...e){
        //                                        E...e - 可变参数 可以添加一个或多个

        //增强for
        for (E e2 : e) {
            list.add(e2);
        }
    }
}
