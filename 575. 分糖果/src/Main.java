import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Author: wangJianBo
 * Date: 2020/1/29 19:37
 * Content: 简单的模拟
 */

class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }

        return Math.min(set.size(),candies.length / 2);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.distributeCandies(new int[]{1, 1, 1, 1, 2, 3});
        System.out.println(i);
    }
}

