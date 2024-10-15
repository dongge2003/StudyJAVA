package com.Algorithm.BinarySearch;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //二分查找
        int[] arr = {-1,0,3,5,9,12};

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int result = BinarySearch(arr,number);

        if(result == -1){
            System.out.println("没找到");
        }
        else {
            System.out.println("找到了:该值的索引为:" + result);
        }


    }

    /**
     * 二分查找方法
     * @param arr 任意整形类型的数组
     * @param number 要查找的数
     * @return  找到返回该值的索引,没找到返回-1
     */
    public static int BinarySearch(int[] arr, int number) {
        int left = 0; // 左边界
        int right = arr.length - 1; // 右边界

        // 当左边界小于等于右边界时继续循环
        while (left <= right) {
            int mid = left + (right - left) / 2; // 计算中间位置，防止溢出

            if (arr[mid] == number) {
                // 找到目标值，返回索引
                return mid;
            } else if (arr[mid] < number) {
                // 如果中间值小于目标值，说明目标值在右半部分
                left = mid + 1;
            } else {
                // 如果中间值大于目标值，说明目标值在左半部分
                right = mid - 1;
            }
        }

        // 没找到目标值，返回-1
        return -1;

    }


}
