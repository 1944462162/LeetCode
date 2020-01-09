import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/11/5 9:58
 * Content:
 */

class Solution {
    public String reverseWords(String s) {

        if(s.equals(""))
        {
            return "";
        }
        boolean flag = false;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                flag = true;
            }
        }
        if (!flag){
            return "";
        }
        int frist = 0;
        int secound = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' '){
                frist = i;
                break;
            }
        }
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                secound = i+1;
                break;
            }
        }
        s = s.substring(frist,secound);
        String[] strings = s.split(" ");

        StringBuilder ans = new StringBuilder();
        for (int i = strings.length-1; i >= 0; i--){
            if(strings[i].equals("")){
                continue;
            }
            if(i == 0){
                ans.append(strings[i]);
            }
            else{
                ans.append(strings[i]).append(" ");
            }

        }
        return String.valueOf(ans);
    }
}
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String ans = solution.reverseWords(" a   ns ");
        System.out.println(ans);
    }
}
