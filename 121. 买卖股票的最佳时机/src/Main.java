import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/12/16 15:18
 * Content:
 */

class Solution {
    public int solve(int[] prices,int index){

        if (index+1 >= prices.length){
            return 0;
        }
        int max = prices[prices.length-1];
        for (int i = index+1; i < prices.length; i++) {
            max = Math.max(max,prices[i]);
        }
        return Math.max(max - prices[index],solve(prices,index+1));
    }
    public int maxProfit(int[] prices) {
        return solve(prices,0);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {7,1,5,3,6,4};
        Solution solution = new Solution();
        int res = solution.maxProfit(a);
        System.out.println(res);
    }
}
