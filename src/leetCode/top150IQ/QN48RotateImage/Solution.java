package leetCode.top150IQ.QN48RotateImage;

public class Solution {
    public static void rotateMatrix(int[][] matrix){
        if(matrix.length != matrix[0].length) return;
        System.out.println("Input matrix: ");
        for(int[] row: matrix){
            for(int col: row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("Transpose matrix");
        for(int[] row: matrix){
            for(int col: row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }
        /*
        for(int i = 0;  i < matrix.length; i++){
            int left = 0;
            int right = matrix.length - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

         */
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        System.out.println("Image matrix");
        for(int[] row: matrix){
            for(int col: row){
                System.out.print(col+"\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix(matrix);
    }
}
