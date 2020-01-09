import java.util.Arrays;
import java.util.Map;

/**
 * Author: wangJianBo
 * Date: 2019/10/5 8:36
 * Content:
 */
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        Arrays.sort(nums);
        int max = -1;
        int count = 1;
        int num = -999999;
        for (int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
            else{
                max = Math.max(max,count);
                if(max == count){
                    num = nums[i];
                }
                count = 1;
            }
            if(i + 2 == nums.length){
                max = Math.max(max,count);
                if(max == count){
                    num = nums[i];
                }
            }
        }
        return num;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2}; // 1 1 1 2 2 2 2
        Solution solution = new Solution();
        int ret = solution.majorityElement(a);
        System.out.println(ret);
    }
}
