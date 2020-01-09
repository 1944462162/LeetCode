import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/12/1 15:07
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        while(n > 0){
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = scanner.nextInt();
            }
            int x = a[0] + a[1];
            if (x == a[2]&& x == a[3]){
                System.out.println(x);
            }else{
                x = a[0] + a[2];
                if (x == a[1]&& x == a[3]){
                    System.out.println(x);
                }else{
                    x = a[0] + a[3];
                    if (x == a[1]&& x == a[2]){
                        System.out.println(x);
                    }else{
                        x = a[1] + a[2];
                        if (x == a[0]&& x == a[3]){
                            System.out.println(x);
                        }
                        else{
                            x = a[2] + a[3];
                            if (x == a[0]&& x == a[1]){
                                System.out.println(x);
                            }
                            else {
                                x = a[1] + a[3];
                                if (x == a[0]&& x == a[2]){
                                    System.out.println(x);
                                }
                                else{
                                    System.out.println(-1);
                                }
                            }
                        }
                    }
                }
            }

            // 0 1 2 3
            // 01 2 3
            // 02 1 3
            // 03 1 2
            // 12 0 3
            // 23 0 1
            // 13 0 2

            n--;
        }
    }
}
