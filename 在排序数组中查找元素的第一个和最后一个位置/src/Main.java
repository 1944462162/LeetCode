import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2020/1/11 20:28
 * Content: 排序
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        Arrays.sort(nums);
        int S = -1;
        int E = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                S = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target){
                E = i;
                break;
            }
        }
        int[] ans = new int[2];
        ans[0] = S;
        ans[1] = E;
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1};
        Solution solution = new Solution();
        int[] res = solution.searchRange(a,1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
