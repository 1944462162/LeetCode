import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: wangJianBo
 * Date: 2020/1/25 19:38
 * Content: 可以用红黑树时间复杂度 O(n)
 */
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] a = new int[set.size()];
        int k = 0;
        for (Integer integer : set) {
            a[k++] = integer;
        }
        Arrays.sort(a);
        if (a.length < 3){
            return a[a.length - 1];
        }
        return a[a.length - 3];
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.thirdMax(new int[]{3,2,2}));
    }
}
