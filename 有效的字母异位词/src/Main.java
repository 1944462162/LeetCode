import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/10/9 20:23
 * Content:年少无知
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1,t1);
    }
}
public class Main {
    public static void main(String[] args) {
        String s = "aa";
        String t = "b";
        Solution solution  = new Solution();
        boolean res = solution.isAnagram(s,t);
        System.out.println(res);
    }
}
