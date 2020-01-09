import java.util.Arrays;

/**
 * Author: wangJianBo
 * Date: 2019/8/9 16:47
 * Content:
 */
public class Main {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,k;
        for(k = 0, i = m; i < m+n; i++){
            nums1[i] = nums2[k++];
        }
        Arrays.sort(nums1);
        System.out.print("[");
        for( i = 0; i < nums1.length; i++){
            if(i == nums1.length-1){
                System.out.print(nums1[i]);
            }else{
                System.out.print(nums1[i] + ",");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1,m,nums2,n);
    }
}
