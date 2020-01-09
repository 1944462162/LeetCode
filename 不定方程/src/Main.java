import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/12/1 16:32
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n > 0){
            long x = scanner.nextInt();
            long y = scanner.nextInt();
            long z = gcd(x,y);
            if (z == 1){
                System.out.println(y * z + " " + x * z + " " + x * y);
            }
            else{
                System.out.println(-1);
            }

            n--;
        }
    }
    public static long gcd(long a, long b){
        if (b == 0){
            return a;
        }
        return gcd(b,a % b);
    }
}
