/**
 * Author: wangJianBo
 * Date: 2020/1/14 20:57
 * Content: 动态规划
 */

class Solution {
    private int[][] f;
    public int hepl(int m, int n){
        if (m == 0 && n == 0){
            return 1;
        }
        if (m < 0 || n < 0){
            return 0;
        }
        if (f[m][n] >= 0){
            return f[m][n];
        }
        return f[m][n] = hepl(m - 1, n) + hepl(m, n - 1);
    }
    public int uniquePaths(int m, int n) {
        f = new int[n + 5][m + 5];
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[0].length; j++) {
                f[i][j] = -1;
            }
        }
        return hepl(n - 1, m - 1);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.uniquePaths(1, 10);
        System.out.println(res);
    }
}
