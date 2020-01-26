import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2020/1/26 19:45
 * Content: 字符串
 */

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map = new HashMap<>();
        String[] s = str.split(" ");
        if (pattern.length() != s.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))){
                if (!map.get(pattern.charAt(i)).equals(s[i])){
                    return false;
                }
            }
            else{
                if (map.containsValue(s[i])){
                    return false;
                }
                else{
                    map.put(pattern.charAt(i),s[i]);
                }
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("aa","dog dog dog dog"));
    }
}
