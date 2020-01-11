import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/1/11 19:18
 * Content:
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {

    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        Solution solution = new Solution();
        List<List<Integer>> subsets = solution.subsets(a);
        for (List<Integer> subset : subsets) {
            for (Integer integer : subset) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
