/**
 * Author: wangJianBo
 * Date: 2019/11/18 15:02
 * Content:
 */

class Solution {
    public int numJewelsInStones(String J, String S) {
        int ans  = 0;
        for (int i = 0; i < J.length(); i++){
            for (int j = 0; j < S.length(); j++) {
                if (J.charAt(i) == S.charAt(j)){
                    ans++;
                }
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int sum  = solution.numJewelsInStones("aA","aAAbbbb");
        System.out.println(sum);
    }
}
