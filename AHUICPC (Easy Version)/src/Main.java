import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/12/1 16:08
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("AHUICPC");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 9){
            System.out.println("AAAHHHUICPC");
        }
        if (n == 10){
            System.out.println("AAAAAHHUICPC");
        }
        if (n <= 8){
            for (int i = 0; i < n-1; i++) {
                s.insert(0, "A");
            }
            System.out.println(s);
        }
    }
}
