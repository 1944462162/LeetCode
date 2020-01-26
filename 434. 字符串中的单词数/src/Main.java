import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2020/1/26 11:45
 * Content: 分割字符串
 */


class Solution {
    public int countSegments(String s) {
        String[] ss = s.split(" ");
        int ans = 0;
        for (int i = 0; i < ss.length; i++) {
            if (!ss[i].equals("")){
                ans++;
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.countSegments("");
        System.out.println(i);
    }
}
