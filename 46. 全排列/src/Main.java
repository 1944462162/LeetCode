import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/1/8 21:48
 * Content:
 */

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        hepl(nums,0);
        return ans;
    }
    void hepl(int[] nums, int index){
        if (index < 0 || index > nums.length){
            return;
        }
        if (index == nums.length){
            List<Integer> res = new ArrayList<>(nums.length);
            for (int num : nums) {
                res.add(num);
            }
            ans.add(res);
            return;
        }
        for (int i = index; i < nums.length; i++){
            {
                int t = nums[index];
                nums[index] = nums[i];
                nums[i] = t;
            }
            hepl(nums, index+1);
            {
                int t = nums[index];
                nums[index] = nums[i];
                nums[i] = t;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.permute(a);
        for (List<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }
}
