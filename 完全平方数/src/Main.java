/**
 * Author: wangJianBo
 * Date: 2020/1/16 19:17
 * Content: 动态规划
 */

class Solution {
//    private int[] f;
//    public int hepl(int n){
//        if (n == 0){
//            return 1;
//        }
//        if (n < 0){
//            return 99999999;
//        }
//        if (f[n] >= 0){
//            return f[n];
//        }
//        int res = 999999;
//        for (int i = 1; i * i <= n; i++) {
//           res  = Math.min(hepl(n - i * i) + 1,res);
//        }
//        return  f[n] = res;
//    }
//    public int numSquares(int n) {
//        f = new int[n + 5];
//        for (int i = 0; i < n + 5; i++) {
//            f[i] = -1;
//        }
//        return hepl(n) - 1;
//    }
    public int numSquares(int n) {
        int[] f = new int[n + 5];
        for (int i = 0; i < n + 5; i++) {
            f[i] = i;
        }
        for (int j = 2; j <= n; j++) {
            for (int i = 1; i * i <= j; i++) {
              f[j]  = Math.min(f[j - i * i] + 1,f[j]);
            }
        }
        return f[n];
    }

}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.numSquares(12);
        System.out.println(i);
    }
}
