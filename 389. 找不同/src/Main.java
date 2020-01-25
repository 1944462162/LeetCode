/**
 * Author: wangJianBo
 * Date: 2020/1/25 19:24
 * Content: 查找
 */

class Solution {
    public char findTheDifference(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)){
                    t = t.substring(0,j) + t.substring(j+1);
                    break;
                }
            }
        }
        return t.charAt(0);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char theDifference = solution.findTheDifference("", "e");
        System.out.println(theDifference);
    }
}
