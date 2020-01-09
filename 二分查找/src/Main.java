/**
 * Author: wangJianBo
 * Date: 2019/11/18 16:25
 * Content:
 */

class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        if (target > nums[right] || target < nums[left]){
            return -1;
        }
        while(right >= left){
            int mid  = (right + left) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            }
            else if (nums[mid] > target){
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        Solution solution = new Solution();
        int ans = solution.search(nums,9);
        System.out.println(ans);
    }
}
