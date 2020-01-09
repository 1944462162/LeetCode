/**
 * Author: wangJianBo
 * Date: 2019/12/15 20:18
 * Content:
 */

class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        if (nums.length == 1){
            return nums[0];
        }
        int[] result = new int[nums.length];
         result[0] = nums[0];
        result[1] = Math.max(nums[0],nums[1]);
       for (int i = 2; i < nums.length; ++i){
           result[i] = Math.max(nums[i] + result[i-2],result[i-1]);
       }
       return result[nums.length-1];
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        Solution solution = new Solution();
        System.out.println(solution.rob(a));
    }
}
