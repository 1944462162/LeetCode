/**
 * Author: wangJianBo
 * Date: 2020/1/27 9:15
 * Content: 大数加法
 */

class Solution {

    public String addStrings(String num1, String num2) {
        if (num1.equals("0") && num2.equals("0")){
            return "0";
        }
        int[] x = new int[Math.max(num1.length(),num2.length())];
        int[] y = new int[Math.max(num1.length(),num2.length())];
        int[] z = new int[num1.length() + num2.length()];
        int i,j,k,l;
        for (k = 0,i = num1.length() - 1; i >= 0; i--){
            x[k++] = num1.charAt(i) - '0';
        }
        for (k = 0,i = num2.length() - 1; i >= 0; i--){
            y[k++] = num2.charAt(i) - '0';
        }
        int a = 0;
        for (l = 0; l < Math.max(num1.length(),num2.length()); l++) {
            z[l] = x[l] + y[l] + a;
            if (z[l] >= 10){
                a = z[l] / 10;
                z[l] %= 10;
            }
            else{
                a = 0;
            }
        }
        z[l] = a;
        while(z[l] == 0){
            l--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (i = l; i >= 0; i--){
            stringBuilder.append(z[i]);
        }
        return stringBuilder.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addStrings("408","5"));
    }
}
