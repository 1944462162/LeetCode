import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/11/5 9:49
 * Content:
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list = new ArrayList<>();

        int[][] a = new int[35][35];
        for (int i = 0; i < 35; i++) {
            a[i][0] = 1;
            a[i][i] = 1;
        }
        for (int i = 2; i < 35; i++){
            for (int j = 1; j < i; j++){
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }

        for (int i = 0; i <= rowIndex; i++) {
            list.add(a[rowIndex][i]);
        }
        return list;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> ans = solution.getRow(33);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
