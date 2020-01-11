/**
 * Author: wangJianBo
 * Date: 2020/1/11 18:12
 * Content: 三指针问题
 */
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3){
            return false;
        }
        int i = 0;
        int j = 1;
        int k = 2;
        while(i < nums.length - 2){
            if (k == nums.length){
                j++;
                k = j + 1;
            }
            if (j >= nums.length - 1 ){
                i++;
                j = i + 1;
                k = j + 1;
            }
            if (i == nums.length - 2){
                break;
            }

            if (nums[i] < nums[j] && nums[j] < nums[k]){
                return true;
            }

            if (nums[j] <= nums[i]){
                j++;
                k++;
                continue;
            }

            if (nums[k] <= nums[j]){
                k++;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        Solution solution = new Solution();
        System.out.println(solution.increasingTriplet(a));
    }
}
