/**
 * Author: wangJianBo
 * Date: 2019/12/19 14:42
 * Content:
 */
class Solve{
    public int BF(int n,int m){
        if (n == 0 || m == 0){
            return 1;
        }
        if (n < 0 || m < 0){
            return 0;
        }
       return  BF(n-1,m) + BF(n, m-1);
    }
}
public class Main {
    public static void main(String[] args) {
        Solve solve = new Solve();
        System.out.println(solve.BF(2,2));
    }
}
