/**
 * Author: wangJianBo
 * Date: 2020/1/10 13:57
 * Content: 数论
 */

class Solution {
    public boolean isPowerOfThree(int n) {

        return n > 0 && 1162261467 % n == 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(45));
    }
}
