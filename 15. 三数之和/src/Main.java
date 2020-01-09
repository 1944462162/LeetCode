import java.util.*;

/**
 * Author: wangJianBo
 * Date: 2020/1/8 18:32
 * Content: 双指针
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int L = i + 1;
            int R = nums.length - 1;
            while (L < R){
                if (nums[i] + nums[L] + nums[R] == 0){
                    ans.add(Arrays.asList(nums[i] , nums[L] , nums[R]));
                    L++;
                    R--;
                }
                else if (nums[i] + nums[L] + nums[R] < 0){
                    L++;
                }
                else if (nums[i] + nums[L] + nums[R] > 0){
                    R--;
                }
            }
        }
        Set<List<Integer>> set = new HashSet<>(ans);

        return new ArrayList<>(set);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {-1, 0, 1, 2, -1, -4};
        Solution solution = new Solution();
        List<List<Integer>> res = solution.threeSum(a);
        for (List<Integer> re : res) {
            for (Integer integer : re) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }
}
