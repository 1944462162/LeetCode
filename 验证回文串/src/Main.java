/**
 * Author: wangJianBo
 * Date: 2019/10/5 9:32
 * Content:
 */
class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z')|| (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')|| (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                str += s.charAt(i) + "";
            }
        }
        str = str.toLowerCase();

        int k = str.length() -1;
        boolean flag = true;
        for (int i = 0; i < str.length()/2; i++){

            if (str.charAt(i) != str.charAt(k--)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean f = solution.isPalindrome("0p");
        System.out.println(f);
    }
}
