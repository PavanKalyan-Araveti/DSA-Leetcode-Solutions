package leetCode.top150IQ.QN289GameOfLife;

public class Solution {
    public static void gameOfLife(int[][] board){
        int[] row = {-1,-1,-1,0,0,1,1,1};
        int[] col = {-1,0,1,-1,1,-1,0,1};
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                int count = 0;
                for(int d = 0; d < 8; d++){
                    int r = i + row[d], c = j + col[d];
                    if(r >= 0 && r < board.length && c >= 0 && c < board[0].length && (board[r][c] == 1 || board[r][c] == 2)) count++;
                    }
                if(board[i][j] == 1 && (count < 2 || count > 3)) board[i][j] = 2;
                else if(board[i][j] == 0 && count == 3) board[i][j] = 3;
                }
            }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 2) board[i][j] = 0;
               else if (board[i][j] == 3) board[i][j] = 1;
            }
        }

        System.out.println("Final game board");
        for(int[] h: board){
            for(int v: h){
                System.out.print(v+"\t");
            }
            System.out.println();
        }
        }

    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
    }
}
