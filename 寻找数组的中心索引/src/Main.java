/**
 * Author: wangJianBo
 * Date: 2019/11/1 9:53
 * Content:
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        int sum = 0;
        boolean flag = false;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int i;
        for (i = 0; i < nums.length; i++){
            sum1 += nums[i];
            if (sum1 - nums[i] == sum - sum1){
                flag = true;
                break;
            }
        }
        if (flag){
            return i;
        }
        else{
            return -1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 7, 3, 6, 5, 6};
        Solution solution = new Solution();
        int res = solution.pivotIndex(a);
        System.out.println(res);
    }
}
