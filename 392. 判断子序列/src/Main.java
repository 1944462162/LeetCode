import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2019/12/16 16:32
 * Content:
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        if (queue.isEmpty()){
            return true;
        }
        for (int i = 0; i < t.length(); i++) {
            if (queue.peek() == t.charAt(i)){
                queue.poll();
            }
            if (queue.isEmpty()){
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("","ahbgdc"));
    }
}
