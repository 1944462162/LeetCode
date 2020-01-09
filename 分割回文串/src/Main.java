import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/10/5 15:24
 * Content:
 */
class Solution {
    public List<List<String>> partition(String s) {
        int index = 0;
        String str;
        String str1;
        for (int i = s.length(); i >= index; i--) {
            str = s.substring(index,i);
            if(isHui(str)){
                str1 = s.substring();
            }
        }
    }

    public boolean isHui(String s){
        if (s.length() == 1){
            return true;
        }
        int k = s.length()-1;
        boolean flag = true;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(k--)){
                flag = false;
            }
        }
        return flag;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<String>> s = solution.partition("aab");
        for (List<String> list : s) {
            for (String s1 : list) {
                System.out.print(s1);
            }
            System.out.println();
        }
    }
}
