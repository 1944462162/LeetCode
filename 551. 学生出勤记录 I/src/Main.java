/**
 * Author: wangJianBo
 * Date: 2020/1/29 19:09
 * Content: 简单的模拟
 */

class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A'){
                countA++;
            }
            if (s.charAt(i) == 'L'){
                countL++;
            }
            else {
                if (countL > 2){
                    flag = false;
                }
                else{
                    countL = 0;
                }
            }
        }
        if (countA <= 1 && flag && countL <= 2){
            return true;
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean ppallp = solution.checkRecord("PPALLSL");
        System.out.println(ppallp);
    }
}
