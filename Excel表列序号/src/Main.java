import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2019/10/13 21:46
 * Content:
 */

class Solution {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A',1);
        map.put('B',2);
        map.put('C',3);
        map.put('D',4);
        map.put('E',5);
        map.put('F',6);
        map.put('G',7);
        map.put('H',8);
        map.put('I',9);
        map.put('J',10);
        map.put('K',11);
        map.put('L',12);
        map.put('M',13);
        map.put('N',14);
        map.put('O',15);
        map.put('P',16);
        map.put('Q',17);
        map.put('R',18);
        map.put('S',19);
        map.put('T',20);
        map.put('U',21);
        map.put('V',22);
        map.put('W',23);
        map.put('X',24);
        map.put('Y',25);
        map.put('Z',26);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int pos = (int)Math.pow(26,s.length()-i-1);
            int tmp = map.get(s.charAt(i));
            ans += pos * tmp;
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int res = solution.titleToNumber("ZY");
        System.out.println(res);
    }
}
