import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2020/1/11 12:15
 * Content: 简单模拟
 */

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {0};
        Solution solution = new Solution();
        System.out.println(solution.missingNumber(a));
    }
}
