import java.util.Scanner;

/**
 * Author: wangJianBo
 * Date: 2019/12/1 16:54
 * Content:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = x * (x/(x + y)) + y * (y / (x + y));
        System.out.println(z);
    }
}
