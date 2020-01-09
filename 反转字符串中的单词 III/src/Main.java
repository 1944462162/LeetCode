/**
 * Author: wangJianBo
 * Date: 2019/11/6 10:40
 * Content:
 */

class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0){
            return "";
        }
        String[] strings = s.split(" ");

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {

            for (int j = strings[i].length() - 1; j >= 0; j--) {
//                System.out.print(string.charAt(j));
                ans.append(strings[i].charAt(j));
            }
//            System.out.print(" ");
            if(i != strings.length -1){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords( "Let's take LeetCode contest"));
    }
}
