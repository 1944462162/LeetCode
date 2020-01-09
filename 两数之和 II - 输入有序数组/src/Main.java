import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/11/3 21:15
 * Content:
 */

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    ans[0] = i+1;
                    ans[1] = j+1;
                }
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        Solution solution = new Solution();
        int[] res = solution.twoSum(a,9);
        System.out.println(Arrays.toString(res));
    }
}
