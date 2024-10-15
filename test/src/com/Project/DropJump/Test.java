package com.Project.DropJump;

public class Test {
    public static void main(String[] args) {
        int testNumber = 100;//测试次数
        int success = 0;//成功次数

        for(int i = 0; i < testNumber; i++){
            if(dropJump()) success++;
        }

        System.out.println("测试了" + testNumber + "次 成功了 " + success + " 次，成功率为 " + ((double) success / testNumber * 100) + "%");
    }

    /**
     * 青蛙跳跃方法(1次)
     *
     * @return 跳跃成功返回true,失败返回false
     */
    public static boolean dropJump(){
        int end = 20;//井的高度    
        int cont = 0;//跳跃次数
        int star = 0;//青蛙的高度

        while (true) {    
            for(int i = 0; i < 3; i++){
                star += (int)(Math.random() * 5 + 1);
            }

            if (star >= end) {
               return true;
            }

            star -= 6;//青蛙下滑6米


            if(cont == 3){
//                if(star >= end){
//                    return true;
//                }
//                return false;
                return star >= end;  // 直接返回高度是否大于井的高度
            }
            cont++;

        }

    }

    public static boolean dropJump2() {
        int end = 20;  // 井的高度
        int cont = 0;  // 跳跃轮次数
        int star = 0;  // 青蛙的当前高度

        // 最多跳3轮
        while (cont < 3) {
            // 每轮跳跃3次
            for (int i = 0; i < 3; i++) {
                star += (int)(Math.random() * 5 + 1);  // 青蛙随机跳1~5米
            }

            // 判断是否已经跳出井
            if (star >= end) {
                return true;  // 成功跳出井，返回成功
            }

            // 跳完3次后下滑6米
            star -= 6;

            // 增加跳跃轮次
            cont++;
        }

        // 如果3轮跳完后青蛙依然没有跳出井，则失败
        return star >= end;  // 如果最终跳出井，返回成功，否则返回失败
    }
}

