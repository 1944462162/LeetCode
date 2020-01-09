import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2019/10/15 11:30
 * Content:
 *  思路：
 *  统计前两个循环之和
 *  统计后两个相反的个数
 */

class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
//        统计出现的次数，以及前两个数之和
        for (int i1 = 0; i1 < A.length; i1++){
            for (int i2 = 0; i2 < B.length; i2++){
                map.put((A[i1] + B[i2]),map.getOrDefault((A[i1] + B[i2]),0)+1);
            }
        }

        for (int i3 = 0; i3 < C.length; i3++){
            for (int i4 = 0; i4 < D.length; i4++){
                int tmp = -(C[i3]+D[i4]);
               ans += map.getOrDefault(tmp,0);
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        /**
         * [-1,-1]
         * [-1,1]
         * [-1,1]
         * [1,-1]
         */
        int[] A = {-1, -1};
        int[] B = {-1,1};
        int[] C = {-1, 1};
        int[] D = {1,-1};
        Solution solution = new Solution();
        int res = solution.fourSumCount(A,B,C,D);
        System.out.println(res);
    }
}
