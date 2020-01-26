/**
 * Author: wangJianBo
 * Date: 2020/1/26 12:06
 * Content: 字符串
 */


class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).substring(1,(s+s).length() - 1).contains(s);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatedSubstringPattern("abab"));
    }
}
