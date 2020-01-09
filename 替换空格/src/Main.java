/**
 * Author: wangJianBo
 * Date: 2019/12/6 16:28
 * Content:
 */

class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                stringBuffer.append("%20");
            }
            else{
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        StringBuffer stringBuffer = new StringBuffer("");
        String ans  = solution.replaceSpace(stringBuffer);
        System.out.println(ans);
    }
}
