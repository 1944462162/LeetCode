import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2020/1/8 21:19
 * Content: 双指针
 */

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if (nums.length < 3){
            return 0;
        }
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R){
                int sum  = nums[i] + nums[L] + nums[R];
                if (Math.abs(target - sum) < Math.abs(target - ans)){
                    ans =  sum;
                } else if (sum < target) {
                    L++;
                } else if (sum > target){
                    R--;
                }
                else{
                    return ans;
                }
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a =  {1,1,1,0};
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(a,100));
    }
}
