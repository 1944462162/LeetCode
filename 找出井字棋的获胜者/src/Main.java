/**
 * Author: wangJianBo
 * Date: 2019/12/1 10:39
 * Content:
 */
class Solution {
    public String tictactoe(int[][] moves) {
        int[][] flag = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
                if (i % 2 == 0){
                   flag[moves[i][0]][moves[i][1]] = 1;

                }
                else{
                    flag[moves[i][0]][moves[i][1]] = 2;

                }
        }


        for (int i = 0; i < 3; i++){
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < 3; j++) {
                if (flag[i][j] == 1){
                    count1++;
                }
                if (flag[i][j] == 2){
                    count2++;
                }
            }
            if (count1 == 3){
                return "A";
            }
            if (count2 == 3) {
                return "B";
            }
        }
        for (int j = 0; j < 3; j++) {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < 3; i++) {
                if (flag[i][j] == 1){
                    count1++;
                }
                if (flag[i][j] == 2){
                    count2++;
                }
            }
            if (count1 == 3){
                return "A";
            }
            if (count2 == 3) {
                return "B";
            }
        }
        boolean f = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (flag[i][j] == 0){
                    f = false;
                }
            }
        }
        if (flag[0][0] == 1 && flag[1][1] == 1 && flag[2][2] == 1){
            return "A";
        }
        if (flag[0][0] == 2 && flag[1][1] == 2 && flag[2][2] == 2){
            return "B";
        }
        if (flag[0][2] == 1 && flag[1][1] == 1 && flag[2][0] == 1){
            return "A";
        }
        if (flag[0][2] == 2 && flag[1][1] == 2 && flag[2][0] == 2){
            return "B";
        }

        if (f){
            return "Draw";
        }
        return "Pending";
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] a = {{0,0},
                {2,0},
                {1,1},
                {2,1},
                {2,2}};
        Solution solution = new Solution();
        System.out.println(solution.tictactoe(a));
    }
}
