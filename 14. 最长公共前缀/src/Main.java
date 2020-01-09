import java.util.*;

/**
 * Author: wangJianBo
 * Date: 2019/8/8 15:48
 * Content:
 */
public class Main {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        int i ;
        loop1:
        for(i = 0; i < strs[0].length(); i++){
            for(int j = 1; j< strs.length; j++){
                if(strs[j].length()-1 < i){
                    break loop1;
                }
                if(strs[0].charAt(i) != strs[j].charAt(i)){
                    break loop1;
                }
            }
        }
        if(i == 0){
            return "";
        }else{
            String retStr = strs[0].substring(0,i);
            return retStr;
        }
    }
    public static void main(String[] args) {
        String[] strings = new String[2];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 2; i++)
        {
            strings[i] = in.next();
        }
        String string = longestCommonPrefix(strings);
        System.out.println(string);
    }
}
