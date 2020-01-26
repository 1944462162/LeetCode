import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/1/26 12:19
 * Content: 字符串
 */
class Solution {
    public String reverseVowels(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        int f = 0;
        int e = s.length() - 1;
        while (f < e){
            if (!list.contains(s.charAt(f))){
                f++;
                continue;
            }
            if (!list.contains(s.charAt(e))){
                e--;
                continue;
            }
            char tmp = s.charAt(f);
            stringBuilder.setCharAt(f,s.charAt(e));
            stringBuilder.setCharAt(e,tmp);
            f++;
            e--;
        }
        return stringBuilder.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = s.reverseVowels("eio");
        System.out.println(s1);
    }
}
