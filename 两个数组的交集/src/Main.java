import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: wangJianBo
 * Date: 2019/11/9 9:46
 * Content:
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        int[] ans = new int[Math.min(set1.size(),set2.size())];
        int k = 0;
        for (Integer integer : set1) {
            for (Integer integer1 : set2) {
                if (integer.equals(integer1)){
                    ans[k++] = integer1;
                }
            }
        }
        int[] ans1 = Arrays.copyOf(ans,k);

        return ans1;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        Solution solution = new Solution();
        int[] c = solution.intersection(a,b);
        for (int i : c) {
            System.out.println(i);
        }
    }
}
