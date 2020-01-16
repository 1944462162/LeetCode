/**
 * Author: wangJianBo
 * Date: 2020/1/15 18:46
 * Content:
 */

class Solution {
    public boolean isUgly(int num) {
        if (num <= 0){
            return false;
        }
        while (num != 1){
            if (num % 2 == 0){
                num /= 2;
                continue;
            }

            if (num % 3 == 0){
                num /= 3;
                continue;
            }

            if (num % 5 == 0){
                num /= 5;
                continue;
            }
            return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 1; i < 20; i++) {
            boolean ugly = solution.isUgly(i);
            System.out.println(ugly + "   " + i);
        }

    }
}
