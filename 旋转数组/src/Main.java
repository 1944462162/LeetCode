/**
 * Author: wangJianBo
 * Date: 2019/10/8 20:03
 * Content:
 */
class Solution {
    public void rotate(int[] nums, int k) {
        for(int i = 0; i < k; i++){
            int tmp = nums[nums.length-1];
            for(int j = nums.length-1; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = tmp;
        }
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                System.out.print("[");
            }

            if(i == nums.length-1){
                System.out.print(nums[i]);
                System.out.println("]");
            }
            else{
                System.out.print(nums[i] + ",");
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int k = 3;
        Solution solution = new Solution();
        solution.rotate(a,k);
    }
}
