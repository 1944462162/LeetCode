/**
 * Author: wangJianBo
 * Date: 2019/11/24 11:27
 * Content:
 */

class Solution {
    public int countServers(int[][] grid) {
        boolean[][] flag = new boolean[grid.length][grid[0].length];
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            int count = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    flag[i][j] = true;
                    count++;
                }
            }
            if (count >= 2) {
                ans+= count;
            } else {
                for (int j = 0; j < grid[i].length; j++) {
                    flag[i][j] = false;
                }
            }
        }
        for (int j = 0; j < grid[0].length; j++) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1){
                    count++;
               }
            }
            if (count >= 2){
                for (int k = 0; k < grid.length; k++){
                    if (grid[k][j] == 1 && flag[k][j]){
                        count--;
                    }
                }
                ans+= count;
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,0},{1,1}};
        Solution solution = new Solution();
        System.out.println(solution.countServers(a));
    }
}
