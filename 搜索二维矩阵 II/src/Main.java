/**
 * Author: wangJianBo
 * Date: 2019/10/5 9:02
 * Content:
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(target == matrix[i][j]){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
public class Main {
    public static void main(String[] args) {
        int[][]a = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
                };
        Solution solution = new Solution();
        boolean f = solution.searchMatrix(a,5);
        System.out.println(f);
    }
}
