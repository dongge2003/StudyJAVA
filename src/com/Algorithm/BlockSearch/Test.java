package com.Algorithm.BlockSearch;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //分块查找
        int[] arr = {16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};

        //1.分块 - 总数的开根号块
        /*
        1.-  16, 5, 9, 12, 21, 18,
        2.-  32, 23, 37, 26, 45, 34,
        3.-  50, 48, 61, 52, 73, 66;
         */

        //2.创建三个块的对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        //3.定义一个数组来管理三个块的对象[索引表]
        Block[] blockArr = {b1,b2,b3};

        //输入一个变量记录查找的元素
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int number = Integer.parseInt(str);
        int number = sc.nextInt();
        System.out.println(number);


        //调用方法
        int index = getIndex(blockArr,arr,number);

        //打印
        if(index == -1){
            System.out.println("没找到该数");
        }else{
            System.out.println("该数的索引是:" + index);
        }



    }

    /**
     * 查找number的索引
     * @param blockArr 索引表
     * @param arr 原始数据数组
     * @param number 要查找的元素
     * @return 找到该数返回该数在数组中的索引,没找到返回-1
     */
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //1.调用方法看number在哪一块中
        int IndexBlock = findIndexBlock(blockArr,number);

        //2.
        if(IndexBlock == -1){
            return -1;//不在索引表中
        }

        //获取这一块的起始索引和结束索引
        int start = blockArr[IndexBlock].getStartIndex();
        int end = blockArr[IndexBlock].getEndIndex();
        for(int i = start; i <= end; i++){
            if(number == arr[i]){
                return i;
            }
        }

        return -1;

    }

    /**
     * 返回number在索引表的索引值
     * @param blockArr 索引表
     * @param number 要查找的数字
     * @return 找到返回索引表的索引值,找不到返回-1
     */
    public static int findIndexBlock(Block[] blockArr, int number) {

        ///每个块都有最大值,如果number比块中的最大值小,那number就在这一块中
        for (int i = 0; i < blockArr.length; i++) {
            if(number <= blockArr[i].getMax()){
                return i;
            }
        }

        return -1;
    }

}



class Block{
    private int max;//最大值
    private int startIndex;//起始索引
    private int endIndex;//结束索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
