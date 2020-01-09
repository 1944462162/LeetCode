import java.util.HashSet;
import java.util.Set;

/**
 * Author: wangJianBo
 * Date: 2019/11/18 15:08
 * Content:
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
       int max = 0;
       int i = 0,j = 0;
       int n = s.length();
       while(i < n && j < n){
           if(!set.contains(s.charAt(j))){
               set.add(s.charAt(j++));
               max = Math.max(set.size(),max);
           }
           else{
               set.remove(s.charAt(i++));
           }
       }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.lengthOfLongestSubstring("pwwkew");
        System.out.println(ans);
    }
}
