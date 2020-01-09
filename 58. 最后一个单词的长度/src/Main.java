import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/8/9 9:08
 * Content:
 */
public class Main {
    public static int lengthOfLastWord(String s) {
        if(s.equals("")){
            return 0;
        }
        if(s.charAt(s.length()-1) == ' '){
            for(int i = s.length()-1; i >=0; i--){
                if(s.charAt(i) != ' ')
                {
                    s = s.substring(0,i+1);
                    break;
                }
            }
        }


        int k = 0;
        String string = "";
        while (s.indexOf(' ',k) != -1){
            k = s.indexOf(' ',k) + 1;

            if(s.indexOf(' ',k) == -1){
                 string = s.substring(k);
            }
        }
        if(k == 0){
            return s.length();
        } else {
            return string.length();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ss = scanner.nextLine();
        int ret = lengthOfLastWord(ss);
        System.out.println(ret);
    }
}
