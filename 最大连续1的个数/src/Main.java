/**
 * Author: wangJianBo
 * Date: 2019/11/4 9:14
 * Content:
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cont = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                cont++;
                max = Math.max(max,cont);
            }
            else{
                cont = 0;
            }
        }
        return max;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,1};
        Solution solution = new Solution();
        int res  = solution.findMaxConsecutiveOnes(a);
        System.out.println(res);
    }
}
