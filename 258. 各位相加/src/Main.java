/**
 * Author: wangJianBo
 * Date: 2020/1/24 17:08
 * Content: 模拟
 */

class Solution {
    public int addDigits(int num) {
        int sum  = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
            if (num == 0){
                if (sum / 10 == 0){
                    break;
                }
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigits(19));
    }
}
