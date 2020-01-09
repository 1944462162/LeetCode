/**
 * Author: wangJianBo
 * Date: 2019/11/4 9:24
 * Content:
 */

class Solution {
    public int minSubArrayLen(int s, int[] nums) {

        //2,3,1,2,4,3
        int i = 0;
        int j = 0;
        int sum  = 0;
        int max = 99999;
        int count = 0;
        int sum1 = 0;
        if (nums.length == 0){
            return 0;
        }
        for (int k = 0; k < nums.length; k++){
            sum1 += nums[k];
        }
        if (sum1 < s){
            return 0;
        }
        while(i <= nums.length){
            if(sum >= s){
                max = Math.min(max,count);
                i++;
                j = i;
                sum = 0;
                count = 0;
            }
            if(sum < s){
                if (j == nums.length){
                    break;
                }
                sum += nums[j++];

                count++;
            }
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {2,3,1,2,4,3};
        Solution solution = new Solution();
        int res  = solution.minSubArrayLen(7,a);
        System.out.println(res);
    }
}
