/**
 * Author: wangJianBo
 * Date: 2020/1/27 10:10
 * Content: 模拟
 */
class Solution {
    public int game(int[] guess, int[] answer) {
        int count  = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]){
                count++;
            }
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.game(new int[]{1,2,3},new int[]{3,2,1}));
    }
}
