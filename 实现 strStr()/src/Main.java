/**
 * Author: wangJianBo
 * Date: 2019/11/5 9:06
 * Content:
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        }
        if (haystack.length() < needle.length()){
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if (i + needle.length() > haystack.length()){
                    return -1;
                }
                String str = haystack.substring(i,i+needle.length());
                if(str.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
