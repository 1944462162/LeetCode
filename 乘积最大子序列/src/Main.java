/**
 * Author: wangJianBo
 * Date: 2019/10/8 19:43
 * Content:
 */

class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int max = -99999;
        int tmp = 1;
        for(int i = 0; i < nums.length-1; i++){
            for (int j = i; j < nums.length; j++){
                tmp *= nums[j];
                if(tmp > max){
                    max = tmp;
                }
                if(nums[j] > max){
                    max = nums[j];
                }
            }
            tmp = 1;
        }
        return  max;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {-2,3,-4};
        Solution solution = new Solution();
        int ret = solution.maxProduct(a);
        System.out.println(ret);
    }
}
