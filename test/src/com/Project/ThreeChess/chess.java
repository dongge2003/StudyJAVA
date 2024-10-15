package com.Project.ThreeChess;

public class chess {
   private char[][] board = new char[3][3];
   private int player;

    public void setboard(int row , int col ){
        if(player == 1){
            board[row - 1][col - 1] = 'X';
        }
        else {
            board[row - 1][col - 1] = '#';
        }
    }
    public char getboard(int row , int col){
        return board[row - 1][col - 1];
    }

    public void setplayer(int player){
        if(player == 0 || player == 1){
            this.player = player;
        }
        else {
            System.out.println("玩家错误");

        }
    }
    public int getPlayer(){
        return player;
    }

    //棋盘初始化方法
    public void intiboard() {
        for (int i = 0; i < 3; i++) {
            for(int j = 0;j < 3;j++) {
                board[i][j] = ' ';
            }
        }
    }

    //打印棋盘方法
    public void printboard() {
        System.out.printf("%c|%c|%c\n",board[0][0],board[0][1],board[0][2]);
        System.out.printf("--------\n");
        System.out.printf("%c|%c|%c\n",board[1][0],board[1][1],board[1][2]);
        System.out.printf("--------\n");
        System.out.printf("%c|%c|%c\n",board[2][0],board[2][1],board[2][2]);

    }

    //检查胜利
    public boolean chekwin(){
        if(    board[0][0] == board[0][1] && board[0][2] == board[0][1] && board[0][1] != ' ' ||
               board[1][0] == board[1][1] && board[1][2] == board[1][1] && board[1][1] != ' ' ||
               board[2][0] == board[2][1] && board[2][2] == board[2][1] && board[2][1] != ' '
        )
        {
            System.out.printf("win\n");
            return false;
        }

        //检查列
        else if(board[0][0] == board[1][0] && board[2][0] == board[1][0] && board[1][0] != ' ' ||
                board[0][1] == board[1][1] && board[2][1] == board[1][1] && board[1][1] != ' ' ||
                board[0][2] == board[1][2] && board[2][2] == board[1][2] && board[1][2] != ' '
        )
        {
            System.out.printf("win\n");
            return false;
        }
        //检查对角线
        else if(board[0][0] == board[1][1] && board[2][2] == board[1][1] && board[1][1] != ' ' ||
                board[0][2] == board[1][1] && board[2][0] == board[1][1] && board[1][1] != ' '
        )
        {
            System.out.printf("win\n");
            return false;
        }
        else
        {
            return true;
        }
    }

    //切换玩家
    public void switchplayer(){
        if(player == 1){
            player = 2;
        }
        else {
            player = 1;
        }
    }


    //菜单
    public void menu(){
        System.out.printf("***********************\n");
        System.out.printf("**1.游戏开始  2.退出***\n");
        System.out.printf("***********************\n");
    }


}
