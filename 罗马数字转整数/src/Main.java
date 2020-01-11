import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2020/1/11 11:08
 * Content: 简单模拟
 */

class Solution {
    public int romanToInt(String s) {

        int sum  = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M'){
                sum += 1000;
            }
            if (s.charAt(i) == 'D'){
                sum += 500;
            }
            if (s.charAt(i) == 'L'){
                sum += 50;
            }
            if (s.charAt(i) == 'V'){
                sum += 5;
            }
            if (s.charAt(i) == 'C'){
                if (i != s.length() - 1){
                    if (s.charAt(i + 1) == 'D'){
                        sum += 400;
                        i++;
                    }
                    else if (s.charAt(i + 1) == 'M'){
                        sum += 900;
                        i++;
                    }
                    else {
                        sum += 100;
                    }
                }
                else{
                    sum += 100;
                }
            }
            if (s.charAt(i) == 'X'){
                if (i != s.length() - 1){
                    if (s.charAt(i + 1) == 'L'){
                        sum += 40;
                        i++;
                    }
                    else if (s.charAt(i + 1) == 'C'){
                        sum += 90;
                        i++;
                    }
                    else {
                        sum += 10;
                    }
                }
                else{
                    sum += 10;
                }
            }


            if (s.charAt(i) == 'I'){
                if (i != s.length() - 1){
                    if (s.charAt(i + 1) == 'V'){
                       sum += 4;
                       i++;
                    }
                    else if (s.charAt(i + 1) == 'X'){
                        sum += 9;
                        i++;
                    }
                    else {
                        sum += 1;
                    }
                }
                else{
                    sum += 1;
                }
            }

        }
        return sum;
    }
}

/**
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int sum = solution.romanToInt("MDLXX");
        System.out.println(sum);
    }
}
