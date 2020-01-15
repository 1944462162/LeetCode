/**
 * Author: wangJianBo
 * Date: 2020/1/15 10:04
 * Content:
 */

class Solution {
    private int[][] f;
    public int hepl(int[][] grid, int m, int n){
        if (m == 0 && n == 0){
            return grid[m][n];
        }
        if (m < 0 || n < 0){
            return 999999;
        }
        if (f[m][n] >= 0){
            return f[m][n];
        }
        return f[m][n] = Math.min(hepl(grid, m - 1, n) + grid[m][n],hepl(grid, m, n - 1)  + grid[m][n]);
    }
    public int minPathSum(int[][] grid) {
        f = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                f[i][j] = -1;
            }
        }
       return hepl(grid,grid.length - 1,grid[0].length - 1);
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,1},
            {1,5,1},
            {4,2,1}
        };
        Solution solution = new Solution();
        int sum = solution.minPathSum(a);
        System.out.println(sum);
    }
}
