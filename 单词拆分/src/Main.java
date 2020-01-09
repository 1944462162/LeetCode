import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/10/10 8:36
 * Content: DP 不会
 */

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        String s1 = "";
        String s2 = "";
        String sss = s;
        for (String ss : wordDict) {
            while(true){
                int re = s.indexOf(ss);
                if (re == -1){
                    break;
                }
                s1 = s.substring(0,re);
                s2 = s.substring(re + ss.length());
                s = s1 + s2;
                s1 = "";
                s2 = "";
            }
        }
        for (int i = wordDict.size()-1; i >= 0; i--){
            while(true){
                int re = sss.indexOf(wordDict.get(i));
                if (re == -1){
                    break;
                }
                s1 = sss.substring(0,re);
                s2 = sss.substring(re + wordDict.get(i).length());
                sss = s1 + s2;
                s1 = "";
                s2 = "";
            }
//            System.out.println(wordDict.get(i));
        }
        if(s.length() == 0 || sss.length() == 0){
            return true;
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> words = new ArrayList<>();
        words.add("car");
        words.add("ca");
        words.add("rs");
        boolean res = solution.wordBreak("cars",words);
        System.out.println(res);
    }
}
