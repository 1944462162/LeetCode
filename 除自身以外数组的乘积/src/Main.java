/**
 * Author: wangJianBo
 * Date: 2019/10/9 10:22
 * Content:
 * 思路：
 * 先从左向右遍历，将不包括自己本身左边的数字相乘；
 * 再从右向左，将不包括自己本身右面的数相乘；
 * 最后两个数组相乘；
 */

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];
        int[] res = new int[nums.length];
        int temp1 = 1;
        a[0] = temp1;
        int temp2 = 1;
        b[nums.length-1] = temp2;
        for (int i = 1; i < nums.length; i++){
            temp1 *= nums[i - 1];
            a[i] = temp1;
        }

        for (int i = nums.length-2; i >= 0; i--){
            temp2 *= nums[i+1];
            b[i] = temp2;
        }

        for (int i = 0; i < nums.length; i++){
            res[i] = a[i] * b[i];
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        Solution solution = new Solution();
        int[] res = solution.productExceptSelf(a);
        for (int re : res){
            System.out.print(re + " ");
        }
    }
}
