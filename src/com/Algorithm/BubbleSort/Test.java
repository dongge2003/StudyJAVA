package com.Algorithm.BubbleSort;

public class Test {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {101,30,49,498,2908,20,10,48,20,10};

        //冒泡排序
        System.out.println("排序前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        bubbleSort(arr);

        System.out.println("排序后:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }



    }

    /**
     * 冒泡排序方法
     *
     * @param arr 要进行排序的数组
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
