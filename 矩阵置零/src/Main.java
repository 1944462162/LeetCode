/**
 * Author: wangJianBo
 * Date: 2020/1/11 17:59
 * Content: 方法不好暴力破解 O(n3)
 */

class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] a = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0){
                    a[i][j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (a[i][j]){
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;
                    }
                    for (int k = 0; k < matrix[0].length; k++) {
                        matrix[i][k] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[][]  a = {
                {1,1,1,1},
                {3,4,0,2},
                {1,3,1,5}
            };
        Solution solution = new Solution();
        solution.setZeroes(a);
    }
}
