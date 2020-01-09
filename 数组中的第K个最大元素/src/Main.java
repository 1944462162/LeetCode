import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/10/10 9:41
 * Content:
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        Solution solution = new Solution();
        int re = solution.findKthLargest(a,k);
        System.out.println(re);
    }
}
