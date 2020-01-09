import java.util.*;

/**
 * Author: wangJianBo
 * Date: 2019/11/11 9:35
 * Content:
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List> map = new HashMap<>();
        for (String s : strs) {
            char[] ss = s.toCharArray();
            Arrays.sort(ss);
            String string = String.valueOf(ss);
            if (!map.containsKey(string)){
                map.put(string,new ArrayList());
            }
            map.get(string).add(s);
        }
        return new ArrayList(map.values());
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution solution = new Solution();
        List<List<String>> ans = solution.groupAnagrams(strings);
        for (List<String> an : ans) {
            for (String string : an) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
