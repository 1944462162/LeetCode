import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/11/1 10:16
 * Content:
 */

class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length <= 1){
            return 0;
        }
        int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
             nums1[i] = nums[i];
        }
        Arrays.sort(nums);
        boolean flag = false;
        if (nums[nums.length - 1] >= nums[nums.length - 2] * 2) {
            flag = true;
        }
        if (flag) {
            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] == nums[nums.length - 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        Solution solution = new Solution();
        int res =solution.dominantIndex(a);
        System.out.println(res);
    }
}
