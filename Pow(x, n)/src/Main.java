/**
 * Author: wangJianBo
 * Date: 2020/1/11 21:11
 * Content: 快速幂
 */

class Solution {

    private  double fastPow(double x, long n){
        if (n == 0){
            return 1;
        }
        double half = fastPow(x,n / 2);
        if (n % 2 == 1){
            return half * half * x;
        }
        else{
            return  half * half;
        }
    }

    public double myPow(double x, int n) {

        long N = n;
        if (N < 0){
            x = 1 / x;
            N = -N;
        }
        return fastPow(x,N);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(2.0,-10));
        System.out.println(Math.pow(2.0,-10));
    }
}
