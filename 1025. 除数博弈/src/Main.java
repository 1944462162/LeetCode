/**
 * Author: wangJianBo
 * Date: 2019/12/19 14:13
 * Content:
 */

class Solution {
    public boolean divisorGame(int N) {
        return N % 2 != 0;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.divisorGame(3));
    }
}
