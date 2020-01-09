import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/10/10 20:47
 * Content:
 */

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int count = 0;
        int[] a = new int[matrix.length * matrix[0].length];
        int c = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++)
            {
                a[c++] = matrix[i][j];
            }
        }
        Arrays.sort(a);
        return a[k-1];
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] a;
        a = new int[][]{
                {1, 2},
                {1, 2},

        };
        int k = 2;
        Solution solution = new Solution();
        int ret = solution.kthSmallest(a,k);
        System.out.println(ret);
    }
}
