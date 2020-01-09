import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: wangJianBo
 * Date: 2019/11/6 11:01
 * Content:
 */
class Solution {
    public int removeDuplicates(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int k = 0;
        for (Integer integer : set) {
            nums[k++] = integer;
        }
        Arrays.sort(nums,0,set.size());
        return set.size();
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        Solution solution = new Solution();
        solution.removeDuplicates(a);
    }
}
