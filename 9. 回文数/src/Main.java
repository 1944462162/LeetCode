import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/8/8 7:47
 * Content:
 */
public class Main {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        boolean flag = true;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1 - i)){
                flag = false;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean b = isPalindrome(a);
        System.out.println(b);
    }
}
