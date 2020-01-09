import java.util.BitSet;
import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/12/1 14:22
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(n > 0){
            int m = scanner.nextInt();
            System.out.println(getS(m));
            n--;
        }
    }
    public static int getS(int m)
    {
        int count = 0;
        BitSet flag = new BitSet(m);
        for (int i = 0; i <= m; i++) {
            flag.set(i);
        }
        int i  = 2;
        while(i * i <= m){
            if (flag.get(i)){
                count++;
                int k = i * 2;
                while(k <= m){
                    flag.clear(k);
                    k += i;
                }
            }
            i++;
        }
        while(i <= m){
            if (flag.get(i)){
                count++;
            }
            i++;
        }
        return count;
    }

}
