/**
 * Author: wangJianBo
 * Date: 2019/10/8 20:25
 * Content:
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length-1; i++){
            for (int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,1,1,3,3,4,3,2,4,2};
        Solution solution = new Solution();
        boolean ret = solution.containsDuplicate(a);
        System.out.println(ret);
    }
}
