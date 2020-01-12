/**
 * Author: wangJianBo
 * Date: 2020/1/12 16:36
 * Content:
 */
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
       Solution solution = new Solution();
        System.out.println(solution.trailingZeroes(5));
    }
}
