/**
 * Author: wangJianBo
 * Date: 2019/10/9 20:11
 * Content:
 */

class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++){
            boolean flag = true;
            for (int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j) && i != j){
                    flag = false;
                    break;
                }
            }
            if (flag){
                return i;
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ret = solution.firstUniqChar("ccs");
        System.out.println(ret);
    }
}
