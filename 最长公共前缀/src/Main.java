/**
 * Author: wangJianBo
 * Date: 2019/11/6 11:08
 * Content:
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String ans;
        int tmp = 0;
        loop:
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {

                if(i >= strs[j].length()){
                    tmp = i;
                    break loop;
                }
                if (strs[0].charAt(i) != strs[j].charAt(i)){
                    tmp = i;
                    break loop;
                }
            }
        }
        ans = strs[0].substring(0,tmp);
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strings = {"a","a"};
        Solution solution = new Solution();
        String str = solution.longestCommonPrefix(strings);
        System.out.println(str);
    }
}
