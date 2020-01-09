import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/8/9 15:22
 * Content:
 */
public class Main {
    public static String addBinary(String a, String b) {
        if(a.equals("0") && b.equals("0")){
            return "0";
        }
        int[] x = new int[Math.max(a.length(),b.length())];
        int[] y = new int[Math.max(a.length(),b.length())];
        int[] z = new int[a.length() + b.length() +1];
        int i,j,k;
        for(k = 0, i = a.length() - 1; i >= 0; i--){
            x[k++] = a.charAt(i) - '0';
        }
        for(k = 0, i = b.length() - 1; i >= 0; i--){
            y[k++] = b.charAt(i) - '0';
        }
        int m = 0;
        for(i = 0; i < Math.max(a.length(),b.length()); i++){
            z[i] = x[i] + y[i] + m;
            if(z[i] >= 2){
                m = z[i] / 2;
                z[i] %= 2;
            } else {
                m = 0;
            }
        }
        z[i] = m;
        j =  Math.max(a.length(),b.length());
        while(z[j] == 0){
            j--;
        }
        String ans = "";
        for(k = j; k >= 0; k--){
            ans += z[k];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string1 = in.next();
        String string2 = in.next();
        String string = addBinary(string1,string2);
        System.out.println(string);
    }
}
