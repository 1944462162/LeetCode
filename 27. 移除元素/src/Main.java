

/**
 * Author: wangJianBo
 * Date: 2019/8/9 7:26
 * Content:
 */
public class Main {
    static int[] a = {3,2,2,3};

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }
        return  k;
    }
    public static void main(String[] args) {
        int val = 3;
        int ret = removeElement(a, val);
        for (int i = 0 ; i < ret; i++){
            System.out.print(a[i] + " ");
        }
    }
}
