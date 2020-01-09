/**
 * Author: wangJianBo
 * Date: 2019/11/3 20:38
 * Content:
 */
class Solution {
    public String addBinary(String a, String b){
        if (a.equals("0") && b.equals("0")){
            return "0";
        }
        int[] str = new int[a.length() + b.length()+2];
        int[] x = new int[Math.max(a.length(),b.length())+2];
        int[] y = new int[Math.max(a.length(),b.length())+2];
        int i,j;
        for(j = 0, i = a.length()-1; i >= 0; i--){
            x[j++] = a.charAt(i) - '0';
        }
        for(j = 0, i = b.length()-1; i >= 0; i--){
            y[j++] = b.charAt(i) - '0';
        }
        int s = 0;
        for (i = 0; i < Math.max(a.length(),b.length())+2; i++) {
            str[i] = x[i] + y[i] + s;
            if(str[i] >= 2){
                s = str[i] / 2;
                str[i] %= 2;
            }
            else{
                s = 0;
            }
        }
        int tmp = a.length() + b.length() - 1;
        while(tmp >= 0){
            if(str[tmp] == 0){
                tmp--;
            }
            else{
                break;
            }
        }
        StringBuffer ans = new StringBuffer();
        for(i = tmp; i >= 0; i--){
            ans.append(str[i]);
        }
        return String.valueOf(ans);
    }
}
public class Main {
    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "1";

        Solution solution = new Solution();
        String str = solution.addBinary(str1,str2);
        System.out.println(str);
    }
}
