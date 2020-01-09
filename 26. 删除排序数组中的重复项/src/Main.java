import java.util.*;

/**
 * Author: wangJianBo
 * Date: 2019/8/8 17:08
 * Content:
 */
public class Main {
    public static int removeDuplicates(int[] nums) {
        Set set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }

        int k = 0;
        for(Iterator iterator = set.iterator(); iterator.hasNext();){
            int a = (int)iterator.next();
            nums[k++] = a;
        }
        Arrays.sort(nums,0,set.size());

        return set.size();
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ret = removeDuplicates(nums);
        System.out.println(ret);
    }
}
