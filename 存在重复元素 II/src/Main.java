import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2019/11/11 9:16
 * Content:
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {};
        Solution solution = new Solution();
        boolean ans = solution.containsNearbyDuplicate(a,0);
        System.out.println(ans);
    }
}
