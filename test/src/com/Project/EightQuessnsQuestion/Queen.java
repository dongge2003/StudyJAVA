package com.Project.EightQuessnsQuestion;

public class Queen {
    int size = 8, count = 0;   //棋盘大小，摆法数
    boolean[][] chessBoards  = new boolean[size][size];  //棋盘地图
    boolean[] rows = new boolean[size], //行地图
    cols = new boolean[size],      //列地图
    diagonal = new boolean[2 * size],//对角线地图
    antiDiagonal = new boolean[2 * size];//反对角线地图

    public boolean isOccupied(int row, int col) {
        //判断指定格是否可以放置皇后
        boolean isOccupied = chessBoards[row][col]
                || rows[row]
                || cols[col]
                || diagonal[(size - 1) + (row - col)]
                || antiDiagonal[row + col];
        return isOccupied;
    }

    public void setStatus(int row, int col, boolean status) {
        //设定或取消一个皇后的占领区域，本格，本行，本列，正对角线，反对角线
        chessBoards[row][col] = status;
        rows[row] = status;
        cols[col] = status;
        diagonal[(size - 1) + (row - col)] = status;
        antiDiagonal[row + col] = status;
    }

    public void place(int row) {
        for (int col = 0; col < size; col++) {
            // 判断当前格子是否被占领
            if (!isOccupied(row, col)) {        // 未被占领
                setStatus(row,col,true);          // 占领
                if( row < size-1){                // 如果没摆到最后一行
                    place(row+1);                   //    继续摆下一行
                }else{                            // 如果已摆到最后一行
                    count++;                        //    摆法数增1
                }
                setStatus(row,col,false);         // 回溯，撤销摆放
            }
        }
    }

    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.place(0);
        System.out.println(queen.count);
    }

}
