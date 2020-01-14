import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/1/12 20:39
 * Content: 待定
 */
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            ThreeSum(nums,target - nums[i], i + 1);
        }
    }
    int ThreeSum(int[] nums, int target, int l){

    }
    int TwoSum(int nums ,int target, int l){

    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 0, -1, 0, -2, 2};
        Solution solution = new Solution();
        solution.fourSum(a,0);
    }
}
