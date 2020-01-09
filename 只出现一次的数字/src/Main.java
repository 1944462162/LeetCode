import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/10/5 8:13
 * Content:
 */
class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int res = -1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length-1; i++){
            if (nums[i] == nums[i+1] || nums[i] == nums[i-1]){
                continue;
            }
            res = nums[i];
        }
        if(nums[0] != nums[1])
        {
            res = nums[0];
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            res = nums[nums.length-1];
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a =  {4,1,2,1,1,2}; // 1 1 1 2 2 4
        Solution solution = new Solution();
        int ret  = solution.singleNumber(a);
        System.out.println(ret);
    }
}
