/**
 * Author: wangJianBo
 * Date: 2019/8/9 8:46
 * Content:
 */
public class Main {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for( i = 0; i< nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int ret = searchInsert(nums,7);
        System.out.println(ret);
    }
}
