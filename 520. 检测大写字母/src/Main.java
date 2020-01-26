/**
 * Author: wangJianBo
 * Date: 2020/1/26 20:10
 * Content: 模拟
 */

class Solution {
    public boolean detectCapitalUse(String word) {
        String[] s = word.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > 2){
                // 第一个是小的
                if ('a' <= s[i].charAt(0) && 'z' >= s[i].charAt(0)){
                    for (int j = 1; j < s[i].length(); j++) {
                        if ('a' > s[i].charAt(j) || 'z' < s[i].charAt(j)){
                            return false;
                        }
                    }
                }
                // 第一个是大的
                else {
                    // 第二个是小的
                    if ('a' <= s[i].charAt(1) && 'z' >= s[i].charAt(1)){
                        for (int j = 2; j < s[i].length(); j++) {
                            if ('a' > s[i].charAt(j) || 'z' < s[i].charAt(j)){
                                return false;
                            }
                        }
                    }
                    // 第二个是大的
                    if ('A' <= s[i].charAt(1) && 'Z' >= s[i].charAt(1)){
                        for (int j = 2; j < s[i].length(); j++) {
                            if ('A' > s[i].charAt(j) || 'Z' < s[i].charAt(j)){
                                return false;
                            }
                        }
                    }
                }
            }
            else if (s[i].length() == 2 &&('a' <= s[i].charAt(0) && 'z' >= s[i].charAt(0)) && ('A' <= s[i].charAt(1) && 'Z' >= s[i].charAt(1))){
                return false;
            }
        }

        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.detectCapitalUse("FFf"));
    }
}
