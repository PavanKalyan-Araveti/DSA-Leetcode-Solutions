package leetCode.top150IQ.QN73SetMatrixZeroes;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void setZeros(int[][] matrix){
        System.out.println("Input matrix");
        for(int[] row: matrix){
            for(int col: row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int row: rows){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[row][j] = 0;
            }
        }
        for(int col: cols){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][col] = 0;
            }
        }
        System.out.println("After setting zeros");
        for(int[] row: matrix){
            for(int col: row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1,1},{1,0,1,1},{0,1,1,1},{1,1,1,0}};
        setZeros(matrix);
    }
}
