package com.Project.ThreeChess;

import com.Project.ThreeChess.chess;

import java.util.Scanner;

public class three_chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        chess tc = new chess();

        tc.menu();
        switch (sc.nextInt()){
            case 1:
                System.out.printf("游戏开始\n");
                game();
                break;
            case 2:
                break;
            default:
                System.out.printf("选择错误\n");
                break;
        }



    }

    public static void game(){
        Scanner sc = new Scanner(System.in);
        chess tc = new chess();

        tc.intiboard();//初始化棋盘
        tc.setplayer(1);//初始玩家为玩家1
        while (tc.chekwin() ){
            tc.printboard();//打印棋盘
            System.out.println("当前是玩家:" + tc.getPlayer());//打印玩家
            System.out.println("请输入你要下棋的位置: 行: 列:");
            int row ,col;
            row = sc.nextInt();
            col = sc.nextInt();
            tc.setboard(row , col);
            tc.switchplayer();//切换玩家

        }
        System.out.println("游戏结束!!!");
    }
}
