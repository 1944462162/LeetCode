import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/11/1 10:32
 * Content:
 */

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

    }
}
public class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        Solution solution = new Solution();
        int[] res = solution.findDiagonalOrder(a);
        for (int re : res) {
            System.out.println(re + " ");
        }
    }
}
