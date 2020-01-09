/**
 * Author: wangJianBo
 * Date: 2019/11/4 9:09
 * Content:
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        Solution solution = new Solution();
        solution.removeElement(a,2);
    }
}
