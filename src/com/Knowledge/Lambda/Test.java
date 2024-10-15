package com.Knowledge.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        /*
        Lambda表达式:
            简化函数式接口匿名内部类的书写

            前提:必须是接口的匿名内部类,接口只能有一个抽象方法
         */

        //用匿名内部类:
        demo(new swim() {
            @Override
            public void swiming(){
                System.out.println("匿名内部类");
            }
        });

        //Lanmbda表达式(标准)
        demo(() -> {
                System.out.println("Lambda表达式标准");
            }
        );
        
        //Lanmbda表达式(简化)
        demo(() -> System.out.println("Lanmbda表达式(简化)"));



        //Lanmbda表达式(简化)
        //规则:1.参数类型可以省略不写
        //     2.如果只有一个参数,参数类型可以省略,同时()也可以省略
        //     3.如果Lambda表达式方法体只有一行,大括号分号,return可以省略不写,需要同时省略


        Integer[] arr = {2,3,4,2,6,7,1,5};
        
        //1.匿名内部类
        // Arrays.sort(arr, new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer o1, Integer o2){
        //         return o1 - o2;
        //     }
        // });

        //2.Lambda表达式标准
        // Arrays.sort(arr, (Integer o1, Integer o2) -> {
        //         return o1 - o2;
        // });

        //3.Lambda表达式简化
        Arrays.sort(arr, (o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));//[1, 2, 2, 3, 4, 5, 6, 7]
        
        
        
    }
        
    
    public static void demo (swim s){
        s.swiming();
    }

}

@FunctionalInterface
interface swim{
    public abstract void swiming();
}
