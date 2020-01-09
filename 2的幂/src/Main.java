/**
 * Author: wangJianBo
 * Date: 2019/11/20 10:06
 * Content:
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < n; i++){
            if (n > Math.pow(2,i) && n < Math.pow(2,i+1)){
                return false;
            }
            if (n == Math.pow(2,i)){
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean bb = solution.isPowerOfTwo( 218);
        System.out.println(bb);
    }
}
