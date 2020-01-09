/**
 * Author: wangJianBo
 * Date: 2019/10/12 19:54
 * Content:
 */

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0){
            int[] b= {};
            return b;
        }
        int kk = k;
        int s = 0;
        int tmp = nums[0];
        int[] res = new int[nums.length-kk+1];
        res[0] = tmp;
        for (int i = 0; i < nums.length ; i++){
            tmp = Math.max(tmp,nums[i]);
            k--;
            if(k == 0){
                i = i - kk +1;
                k = kk;
                res[s++] = tmp;
                tmp =-99999;
            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,3};
        Solution solution = new Solution();
        int[] res = solution.maxSlidingWindow(a,1);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
