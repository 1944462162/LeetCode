/**
 * Author: wangJianBo
 * Date: 2020/1/17 20:23
 * Content: 斐波那契数
 */


class Solution {
    public int fib(int N) {
        int[] a = new int[N + 5];
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i <= N; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[N];
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.fib(4);
    }
}
