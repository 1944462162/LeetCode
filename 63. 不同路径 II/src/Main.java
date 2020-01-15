/**
 * Author: wangJianBo
 * Date: 2020/1/15 9:26
 * Content: 动态规划
 */

class Solution {
    private int f[][] = new int[105][105];
    public int hepl(int[][] obstacleGrid, int m, int n){

        if (m < 0 || n < 0){
            return 0;
        }
        if (obstacleGrid[m][n] == 1){
            return 0;
        }
        if (m == 0 && n == 0){
            return 1;
        }
        if (f[m][n] >= 0){
            return f[m][n];
        }
        return f[m][n] = hepl(obstacleGrid, m - 1, n) + hepl(obstacleGrid, m, n - 1);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                f[i][j] = -1;
            }
        }

        return hepl(obstacleGrid,obstacleGrid.length - 1,obstacleGrid[0].length - 1);
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] a = {{0,1}};
        Solution solution = new Solution();
        int res = solution.uniquePathsWithObstacles(a);
        System.out.println(res);
    }
}
