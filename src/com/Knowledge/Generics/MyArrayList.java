package com.Knowledge.Generics;

import java.util.Arrays;

//泛型类的书写
//当编写一个类时,如果不确定类型,那么这个类型可以定义为泛型类
public class MyArrayList<E>{
    Object[] objects = new Object[10];
    int size = 0;

   public boolean add(E e){
       objects[size] = e;
       size++;
       return true;
   }

   public E get(int index){
        return (E)objects[index];
   }

   @Override
   public String toString(){
        return Arrays.toString(objects);
   }
}
