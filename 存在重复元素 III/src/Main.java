import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2020/1/12 21:00
 * Content:
 */
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int t, int k) {
        if (k < 0){
            return false;
        }
        Queue<Integer> arrayList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {

            if(t == 0){
                if(arrayList.contains(nums[i])){
                    return true;
                }
            }

            for (int j = 0; j < arrayList.size(); j++) {
                if (Math.abs( ((LinkedList<Integer>) arrayList).get(j) - nums[i]) <= t ){
                    return true;
                }
            }

            arrayList.add(nums[i]);

            if (arrayList.size() == k){
                arrayList.poll();
            }


        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {2,1};
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyAlmostDuplicate(a,1,1));
    }
}
