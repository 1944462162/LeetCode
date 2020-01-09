import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/1/8 20:22
 * Content:
 */

class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public int threeSumClosest(int[] nums, int target) {
        hepl(nums,0);
        int k = 0;
        hepl(nums,0);
        for (List<Integer> an : ans) {
            k++;
        }
        int[] a = new int[k];
        int J = 0;
        for (List<Integer> an : ans) {
            int sum  = 0;
            for (Integer integer : an) {

                sum += integer;
            }
//            System.out.println(an + " " + sum + " " + " " + (sum - target));
            a[J++] = sum;
        }
        int ff = 999999;
        int aa = 0;
        for (int i = 0; i < J; i++) {
            ff = Math.min(Math.abs(a[i] - target),ff);
        }
        int kk = 999999;
        for (int i = 0; i < J; i++) {
            kk = Math.min(Math.abs(a[i] - target),kk);
            if (kk == ff){
                aa = a[i];
                break;
            }
        }
        return aa;
    }
    void hepl(int[] nums, int index){
        if (index < 0 || index > nums.length || nums.length < 3){
                return;
        }
        if (index == nums.length){
//            System.out.println(Arrays.toString(nums));
            ans.add(Arrays.asList(nums[0],nums[1],nums[2]));
        }
        for (int i = index; i < nums.length; i++) {
            {
                int t = nums[index];
                nums[index] = nums[i];
                nums[i] = t;
            }

            hepl(nums,index+1);
            {
                int t = nums[index];
                nums[index] = nums[i];
                nums[i] = t;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {-1,2,1,-4};
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(a,1));
    }
}
