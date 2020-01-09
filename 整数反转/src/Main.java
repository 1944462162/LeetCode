/**
 * Author: wangJianBo
 * Date: 2019/12/10 9:48
 * Content:
 */

class Solution {
    public static int reverse(int x) {
        try
        {
            int a = x;
            String str = String.valueOf(a);
            String str1 = "";

            if(str.charAt(0) == '-'){
                for(int k = str.length()-1; k > 0; k--)
                {
                    if(str.charAt(k) == '0'){
                        continue;
                    }
                    else{
                        break;
                    }
                }
                str1 = "-";
                for(int k = str.length()-1; k > 0; k--){
                    str1 = str1 + str.charAt(k);
                }
            } else {
                for(int k = str.length()-1; k > 0; k--)
                {
                    if(str.charAt(k) == '0'){
                        continue;
                    }
                    else{
                        break;
                    }
                }
                for(int k = str.length()-1; k >= 0; k--){
                    str1 = str1 + str.charAt(k);
                }
            }
            int ret = Integer.valueOf(str1);

            return ret;
        }catch (Exception e){
            return 0;
        }
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
