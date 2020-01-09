/**
 * Author: wangJianBo
 * Date: 2019/12/19 10:30
 * Content:
 */

class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int[] result = new int[cost.length];
        result[0] = cost[0];
        result[1] = cost[1];

            for (int i = 2; i < cost.length; i++) {
                result[i] += Math.min(cost[i] + result[i-1],cost[i] + result[i-2]);
            }
        return Math.min(result[cost.length-1],result[cost.length-2]);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] a = {9,6,5};
        Solution solution = new Solution();
        System.out.println(solution.minCostClimbingStairs(a));
    }
}
