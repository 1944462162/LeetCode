/**
 * Author: wangJianBo
 * Date: 2019/10/9 19:58
 * Content:
 */

class Solution {
    public void reverseString(char[] s) {

        char tmp;
        int sLong = s.length;
        for (int i = 0; i < s.length/2; i++){
             tmp = s[i];
             s[i] = s[sLong-i-1];
            s[sLong-i-1] = tmp;
        }
        for (int i = 0; i < s.length; i++){
            if(i == 0){
                System.out.print("[");
            }
            if(i == s.length-1){
                System.out.println("\""+s[i]+"\"" + "]");
            }
            else{
                System.out.print("\""+s[i]+"\""+",");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        char[] a = {'H','a','n','n','a','h'};
        Solution solution = new Solution();
        solution.reverseString(a);
    }
}
