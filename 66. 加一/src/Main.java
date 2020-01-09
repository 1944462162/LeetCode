import java.math.BigInteger;
import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/8/9 9:54
 * Content:
 */
public class Main {
    public static int[] plusOne(int[] digits) {

        int[] arr = new int[digits.length+1];
        for (int i = digits.length-1; i >= 0; i--) {
            arr[i+1] = digits[i];
        }
        int a = 0;

        for (int i = arr.length - 1; i >= 0; i--){
            arr[i] = arr[i] + a;
            if(i == arr.length - 1) {
                arr[arr.length - 1] = arr[arr.length - 1] + 1;
            }
            if (i == 1 && arr[i] < 10){
                break;
            }
            if (arr[i] >= 10){
                a = arr[i] / 10;
                arr[i] = arr[i] % 10;
            }
            else {
                a = 0;
            }

        }
        if (arr[0] == 0){
            for (int i = arr.length-1; i >= 1; i--){
                digits[i-1] = arr[i];
            }
            return digits;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] a = {2,4,9,3,9};
        int[] ret = plusOne(a);
        System.out.println(Arrays.toString(ret));
    }
}
