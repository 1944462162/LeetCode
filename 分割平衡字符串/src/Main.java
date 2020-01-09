import java.util.Stack;

/**
 * Author: wangJianBo
 * Date: 2019/11/24 20:17
 * Content:
 */

class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int lnum = 0;
        int rnum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R'){
                rnum++;
            }
            else{
                lnum++;
            }
            if (rnum == lnum){
                ans++;
                rnum = 0;
                lnum = 0;
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.balancedStringSplit("RLLLLRRRLR"));
    }
}
