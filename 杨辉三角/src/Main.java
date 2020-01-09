import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/11/5 9:23
 * Content:
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0){
            return ans;
        }
        int[][] a = new int[numRows+5][numRows+5];
        for (int i = 0; i < numRows; i++) {
            a[i][0] = 1;
            a[i][i] = 1;
        }
        for (int i = 2; i < numRows; i++){
            for (int j = 1; j < i; j++){
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }

        for(int i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                list.add(a[i][j]);
            }
            ans.add(list);
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.generate(0);
        for (List<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
