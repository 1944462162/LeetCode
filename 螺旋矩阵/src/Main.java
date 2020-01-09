import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/11/3 19:30
 * Content:
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
       int di = 0,c = 0,r = 0;
       int R = matrix.length;
       int C = matrix[0].length;
       boolean[][] seen = new boolean[R][C];
       int[] dr = {0,1,0,-1};
       int[] dc = {1,0,-1,0};
        for (int i = 0; i < R * C; i++) {
            list.add(matrix[r][c]);
            seen[r][c] = true;
            int mr = r + dr[di];
            int mc = c + dc[di];
            if(mr >= 0 && mr < R && mc >= 0 && mc < C && !seen[mr][mc]){
                r = mr;
                c = mc;
            }
            else{
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return list;
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
                };
        Solution solution = new Solution();
        List<Integer> list = solution.spiralOrder(a);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
