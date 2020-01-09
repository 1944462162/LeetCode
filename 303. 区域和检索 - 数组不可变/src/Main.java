import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/12/16 16:19
 * Content:
 */

class NumArray {
    private int[] a;
//    private int[][] result;
    public NumArray(int[] nums) {
        a = Arrays.copyOf(nums,nums.length);
//        result = new int[a.length][a.length];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                result[i][j] = -9999999;
//            }
//        }
    }

    public int sumRange(int i, int j) {
        int sum  = 0;
//        if (result[i][j] != -9999999){
//            return result[i][j];
//        }
        for (int k = i; k <= j; k++) {
            sum += a[k];
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(a);
        System.out.println(numArray.sumRange(0,2));
    }
}
