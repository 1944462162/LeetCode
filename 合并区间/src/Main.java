import java.util.*;

/**
 * Author: wangJianBo
 * Date: 2020/1/12 11:07
 * Content: 排序模拟
 */
class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int  i = 0;
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0){
            return res.toArray(new int[0][]);
        }
        while(i < intervals.length){
            int L = intervals[i][0];
            int R = intervals[i][1];
            while(i < intervals.length - 1 && R >= intervals[i + 1][0]){
                R = Math.max(R,intervals[i+1][1]);
                i++;
            }
            res.add(new int[]{L,R});
            i++;
        }
        return res.toArray(new int[0][]);
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] a = {

        };
        Solution solution = new Solution();
        int[][] res  = solution.merge(a);
        for (int[] re : res) {
            for (int i : re) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
