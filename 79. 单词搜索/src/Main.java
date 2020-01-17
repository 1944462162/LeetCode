/**
 * Author: wangJianBo
 * Date: 2020/1/17 16:48
 * Content: 搜索
 */


class Solution {

    private boolean[][] book;
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)){
                    book = new boolean[board.length][board[0].length];
                    book[i][j] = true;
                    boolean res = hepl(i, j, word.substring(1), board);
                    if (res){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean hepl(int i, int j, String word,char[][] map) {
        int[][] next = {{0,1},{0,-1},{1,0},{-1,0}};

        if (word.length() == 0){
            return true;
        }
        for (int k = 0; k < 4; ++k) {
            int x = i + next[k][0];
            int y = j + next[k][1];
            if (x < 0 || x >= map.length || y < 0 || y >= map[0].length){
                continue;
            }
            if (map[x][y] == word.charAt(0) && !book[x][y]){
                book[x][y] = true;
                boolean res = hepl(x, y, word.substring(1), map);
                if (res){
                    return true;
                }
                book[x][y] = false;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        char[][] a = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        };
        Solution solution = new Solution();
        System.out.println(solution.exist(a,"AAB"));
    }
}
