import java.util.*;

/**
 * Author: wangJianBo
 * Date: 2020/1/15 14:03
 * Content: 暴搜 + 记忆化
 */

class Solution {
    public boolean hepl(String s, List<String> wordDict, int index, Boolean[] f){
        if (index == s.length()){
            return true;
        }
        if (f[index] != null){
            return f[index];
        }
        for (int i = index; i <= s.length(); i++) {
//            System.out.println(s.substring(index,i));
            if (wordDict.contains(s.substring(index,i)) && hepl(s, wordDict, i, f)){
                return f[index] = true;
            }
        }
        return f[index] = false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return hepl(s, wordDict,0,new Boolean[s.length()]);
    }
}


public class Main {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>();
        word.add("a");
        word.add("aa");
        word.add("aaa");
        word.add("aaaa");
        Solution solution = new Solution();
        boolean applepenapple = solution.wordBreak("aaam", word);
        System.out.println(applepenapple);
    }
}
