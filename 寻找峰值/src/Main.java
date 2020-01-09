/**
 * Author: wangJianBo
 * Date: 2019/11/19 9:41
 * Content:
 */

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid =  left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {2,1};
        Solution solution = new Solution();
        int ans = solution.findPeakElement(a);
        System.out.println(ans);
    }
}
