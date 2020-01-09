import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/11/24 21:07
 * Content:
 */
class Solution {
    public List<String> letterCombinations(String digits) {

        String[] strings = {"!@#","-", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> strings1 = new ArrayList<>();
        if (digits.length() == 0){
            return strings1;
        }
        strings1.add("");
        for (int i = 0; i < digits.length(); i++) { //查询输入的数字
            String s = strings[digits.charAt(i) - '0'];
            int res = strings1.size();
            for (int j = 0; j < res; j++) {  // 查询对应的数组
                String string = strings1.remove(0);
                for (int k = 0; k < s.length(); k++) {  //
                    strings1.add(string + s.charAt(k));
                }
            }
        }
        return strings1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
    }
}
