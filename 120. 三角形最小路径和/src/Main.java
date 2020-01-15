/**
 * Author: wangJianBo
 * Date: 2020/1/15 10:26
 * Content: 动态规划
 */

import java.util.*;

/**
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 */

class Solution {
//    public int[][] f;
//    public int hepl(List<List<Integer>> triangle, int x, int y){
//        if (x == triangle.size() - 1){
//            return triangle.get(x).get(y);
//        }
//        if (f[x][y] >= 0){
//            return f[x][y];
//        }
//        int a = hepl(triangle,x + 1,y);
//        int b = hepl(triangle, x + 1, y + 1);
//        return f[x][y] = Math.min(a,b) + triangle.get(x).get(y);
//    }
//    public int minimumTotal(List<List<Integer>> triangle) {
//       f = new int[triangle.size()][triangle.size()];
//        for (int i = 0; i < f.length; i++) {
//            for (int j = 0; j < f[0].length; j++) {
//                f[i][j] = -1;
//            }
//        }
//       return hepl(triangle,0,0);
//    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int i = 0; i < triangle.get(triangle.size() - 1).size(); i++) {
            dp[triangle.size() - 1][i] = triangle.get(triangle.size() - 1).get(i);
        }
        for (int i = triangle.size() - 2 ; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j],dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {2},{3,4},{6,5,7},{4,1,8,3}
        };
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(a[0][0]));
        triangle.add(Arrays.asList(a[1][0],a[1][1]));
        triangle.add(Arrays.asList(a[2][0],a[2][1],a[2][2]));
        triangle.add(Arrays.asList(a[3][0],a[3][1],a[3][2],a[3][3]));
        Solution solution = new Solution();
        int i = solution.minimumTotal(triangle);
        System.out.println(i);

    }
}
