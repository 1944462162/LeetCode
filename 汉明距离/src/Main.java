/**
 * Author: wangJianBo
 * Date: 2020/1/11 11:41
 * Content: 二进制
 */

class Solution {
    public int hammingDistance(int x, int y) {
        String s1 = Integer.toString(x,2);
//        System.out.println(s1);
        String s2 = Integer.toString(y,2);
//        System.out.println(s2);
        int count = 0;
        int i = 0;
        if (s1.length() > s2.length()){
            for ( i = 0; i < s1.length() - s2.length(); i++) {
                if (s1.charAt(i) == '1'){
                    count++;
                }
            }
            int j = 0;
            while(i < s1.length()){
                if (s1.charAt(i) != s2.charAt(j)){
                    count++;
                }
                i++;
                j++;
            }
        }
        if (s2.length() > s1.length()){
            for ( i = 0; i < s2.length() - s1.length(); i++) {
                if (s2.charAt(i) == '1'){
                    count++;
                }
            }
            int j = 0;
            while(i < s2.length()){
                if (s1.charAt(j) != s2.charAt(i)){
                    count++;
                }
                j++;
                i++;
            }
        }
        if (s1.length() == s2.length()){
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(j) != s2.charAt(j)){
                    count++;
                }
            }
        }

        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(93,72));
    }
}
