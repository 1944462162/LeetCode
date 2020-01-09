import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2019/10/9 9:29
 * Content: 算法不够优化！！！
 */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList arrayList = new ArrayList();
        int longnum2 = nums2.length;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < longnum2; j++){
                if (nums1[i] == nums2[j]){
                    arrayList.add(nums1[i]);
                    for (int k = j; k < longnum2-1; k++){
                        nums2[k] = nums2[k+1];
                    }
                    longnum2-=1;
                    break;
                }
            }
        }
        int[] res = new int[arrayList.size()];
        int k = 0;
        for (Object o : arrayList) {
            res[k++] = (int)o;
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {4,9,5};
        int[] b = {9,4,9,8,4};
        Solution solution = new Solution();
        int[] res = solution.intersect(a,b);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
