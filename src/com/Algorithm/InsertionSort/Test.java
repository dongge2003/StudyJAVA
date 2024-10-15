package com.Algorithm.InsertionSort;

public class Test {
    public static void main(String[] args) {
        //插入排序
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.printf("排序前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();

        /*
        把数组分为有序和无序两种,从0索引开始遍历,从哪个索引值开始变的无序就从哪分开
        3,44:有序
        38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48:无序
        然后把无序的数,38,5....依次到有序的里面(从后往前)依次比对,插入进去
        3,38,44
        3,5,38,44
        .....
         */

        //获取无序的索引
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]){
                startIndex = i = 1;
                break;
            }
        }

        InsertSort(arr,startIndex);

        System.out.printf("排序后:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

    }

    /**
     * 插入排序方法
     *
     * @param arr 要进行排序的数组
     */
    public static void InsertSort(int[] arr,int startIndex) {
        for(int i = startIndex; i < arr.length; i++) {
            int j = i;

            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
