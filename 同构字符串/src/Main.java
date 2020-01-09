import java.util.HashMap;
/**
 * Author: wangJianBo
 * Date: 2019/11/9 10:14
 * Content:
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashmap = new HashMap<>();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++){
            if (hashmap.containsKey(s.charAt(i))){
                if (hashmap.get(s.charAt(i)) != t.charAt(i)){
                    flag = false;
                }
            }
            else{

                for (Character value : hashmap.values()) {
                    if (value == t.charAt(i)){
                        return false;
                    }
                }
                hashmap.put(s.charAt(i),t.charAt(i));

            }
        }
        return flag;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ans = solution.isIsomorphic("ab","aa");
        System.out.println(ans);
    }
}
