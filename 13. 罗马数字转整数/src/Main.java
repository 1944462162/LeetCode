import java.util.HashMap;
import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/8/8 8:05
 * Content:
 */
public class Main {
    public static int romanToInt(String s) {
//        I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//        X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//        C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
        s += "  ";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        map.put(' ',0);
        int ans = 0;
        for(int i = 0; i  <  s.length(); i++){


                if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                    ans += 4;
                    String str2 = s.substring(i+2,s.length());
                    s = str2 ;
                    i = -1;
                    continue;
                }

                if(s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                    ans += 9;
                    String str2 = s.substring(i+2,s.length());
                    s = str2;
                    i = -1;
                    continue;
                }

                if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                    ans += 40;

                    String str2 = s.substring(i+2,s.length());
                    s = str2;
                    i = -1;
                    continue;
                }

                if(s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                    ans += 90;

                    String str2 = s.substring(i+2,s.length());
                    s = str2;
                    i = -1;
                    continue;
                }

                if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                    ans += 400;
                    String str2 = s.substring(i+2,s.length());
                    s = str2;
                    i = -1;
                    continue;
                }

                if(s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                    ans += 900;
                    String str2 = s.substring(i+2,s.length());
                    s = str2;
                    i = -1;
                    continue;
                }

            ans += map.get(s.charAt(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int ret = romanToInt(str);
        System.out.println(ret);
    }
}
