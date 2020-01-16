/**
 * Author: wangJianBo
 * Date: 2020/1/15 18:15
 * Content:
 */

class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1){
            return 1;
        }
        int count = 1;
        for (int i = 2; i < 1690; i++) {
            if ( (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) && (i % 7) != 0){
                System.out.println(i);
                count++;
                if (n == count){
                    return i;
                }
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.nthUglyNumber(20);
        System.out.println(i);
    }
}
