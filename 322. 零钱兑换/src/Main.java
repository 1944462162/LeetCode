import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2020/1/14 19:58
 * Content:  动态规划，二维数组动态设置内存
 */

class Solution {

    private static int MaxViue = 999999999;
    private static int[][] s;
    public int search(int index,int amount,int[] coins){
        if (amount == 0){
            return 0;
        }
        if (index >= coins.length){
            return MaxViue;
        }
        if (amount < 0){
            return MaxViue;
        }
        if (s[index][amount] >= 0){
            return s[index][amount];
        }
        int a = search(index, amount - coins[index], coins);
        int b = search(index + 1, amount, coins);
        s[index][amount] = Math.min(a + 1, b);
        return Math.min(a + 1, b);
    }
    public int coinChange(int[] coins, int amount) {
        int tmp = 100;
        for (int i = 0; i < coins.length; i++) {
            if (tmp < coins[i] && coins[i] <= amount){
                tmp = coins[i];
            }
        }
        s = new int[tmp][amount + 5];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s[i][j] = -1;
            }
        }
        int res = search(0,amount,coins);
        if (res >= MaxViue){
            return -1;
        }
        else {
            return res;
        }
    }
}
public class Main {
    public static void main(String[] args) {

        int[] a = {2147483647};
        Solution solution = new Solution();
        int res = solution.coinChange(a,2);
        System.out.println(res);
    }
}
