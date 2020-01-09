import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/8/9 8:43
 * Content:
 */
public class Main {
    public static int strStr(String haystack, String needle) {
        return  haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner in = new Scanner(System.in);
        str1 = in.next();
        str2 = in.next();
        int ret = strStr(str1,str2);
        System.out.println(ret);
    }
}
