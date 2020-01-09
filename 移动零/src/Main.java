/**
 * Author: wangJianBo
 * Date: 2019/10/9 9:03
 * Content:
 */

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i = nums.length -1; i >= 0; i--) {
            if(nums[i] == 0){
                for(int j = i; j <  nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = 0;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                System.out.print("[");
            }
            if (i == nums.length-1){
                System.out.println(nums[i] + "]");
            }
            else{
                System.out.print(nums[i] + ",");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        Solution solution = new Solution();
        solution.moveZeroes(a);
    }
}
