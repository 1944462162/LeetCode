/**
 * Author: wangJianBo
 * Date: 2019/11/18 16:44
 * Content:
 */

class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while(left <= right){
            int mid  = (left + right) / 2;
            if (Math.pow(mid,2) < x && Math.pow(mid+1,2) > x || Math.pow(mid,2) == x){
                 return mid;
            }
            else if (Math.pow(mid,2) < x){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.mySqrt(11);
        System.out.println(ans);
    }
}
