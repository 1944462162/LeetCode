import java.math.BigInteger;

/**
 * Author: wangJianBo
 * Date: 2019/12/10 9:53
 * Content:
 */

class Solution {
    public int myAtoi(String str) {

        boolean falg = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' '){
                falg = true;
            }
        }
        if (!falg){
            return 0;
        }
        while (str.charAt(0) == ' ') {
            str = str.replaceFirst(" ", "");
        }

        if (str.length() == 1 && (str.charAt(0) == '+' || str.charAt(0) == '-')){
            return 0;
        }
        if (str.charAt(0) != '+' && str.charAt(0) != '-' && (str.charAt(0) < '0' || str.charAt(0) > '9')) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean F = true;
        for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '+' || str.charAt(i) == '-' || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                    if ((str.charAt(i) == '+' || str.charAt(i) == '-' )&& !F){
                        break;
                    }
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                        F = false;
                    }
                    stringBuilder.append(str.charAt(i));
                } else {
                    break;
                }

        }
        String ss = stringBuilder.toString();
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                if (i > 1){
                   return 0;
                }
                else{
                    break;
                }
            }
        }

        BigInteger ls =  new BigInteger(ss);
        if (ls >  BigInteger.valueOf()) {
            return Integer.MAX_VALUE;
        }
        if (ls < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(ls.toString());
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi( "20000000000000000000"));
    }
}
