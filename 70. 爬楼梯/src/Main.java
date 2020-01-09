/**
 * Author: wangJianBo
 * Date: 2019/8/9 16:36
 * Content:
 */
public class Main {
    public static int climbStairs(int n) {
        int[] a = new int[n+1];
        a[1] = 1;
        if(n > 1){
            a[2] = 2;
            if(n > 2){
                for(int i = 3; i <= n; i++){
                    a[i] = a[i -1] + a[i - 2];
                }
            }
        }

        return a[n];
    }
    public static void main(String[] args) {
        int ret = climbStairs(3);
        System.out.println(ret);
    }
}
