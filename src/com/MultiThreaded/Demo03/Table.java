package com.MultiThreaded.Demo03;

public class Table {
    public static boolean isFood;//桌子上是否有食物
    public static int foodCount = 10;//总共有几碗食物
    public static int foodNow = 0;//现在吃了几碗
    public static Object lock = new Object();
}