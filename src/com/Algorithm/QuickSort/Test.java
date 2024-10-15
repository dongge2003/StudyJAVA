package com.Algorithm.QuickSort;

public class Test {
    public static void main(String[] args) {
        //快速排序
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.printf("排序前:");
        printArray(arr);
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.printf("排序后:");
        printArray(arr);
    }

    /**
     * 快速排序的主方法
     * @param arr 要排序的数组
     * @param low 数组的左边界
     * @param high 数组的右边界
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 获取分区点
            int pi = partition(arr, low, high);

            // 递归地对分区两边进行排序
            quickSort(arr, low, pi - 1); // 左侧排序
            quickSort(arr, pi + 1, high); // 右侧排序
        }
    }

    /**
     * 分区方法，将数组分为两部分
     * @param arr 数组
     * @param low 左边界
     * @param high 右边界
     * @return 分区后的中间点索引
     */
    public static int partition(int[] arr, int low, int high) {
        // 选择最右边的元素作为基准
        int pivot = arr[high];
        int i = low - 1; // i是较小元素的索引

        // 遍历数组，将小于基准的元素移到左边
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // 交换 arr[i] 和 arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 将基准元素放到正确的位置
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // 返回分区点
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }
}
