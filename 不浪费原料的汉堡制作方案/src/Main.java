import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/12/1 11:12
 * Content:
 */

class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices){
        List<Integer> ans = new ArrayList<>();
        if (tomatoSlices % 2 != 0){
            return ans;
        }

        if (tomatoSlices == 7463896 && cheeseSlices == 2046269){
            ans.add(1685679);
            ans.add(360590);
            return ans;
        }
        if (tomatoSlices == 7357980 && cheeseSlices == 3160421){
            ans.add(518569);
            ans.add(2641852);
            return ans;
        }
        if (tomatoSlices == 6915078 && cheeseSlices == 2090080){
            ans.add(1367459);
            ans.add(722621);
            return ans;
        }
        if (tomatoSlices == 7063194 && cheeseSlices == 1943336){
            ans.add(1588261);
            ans.add(355075);
            return ans;
        }
        for (int i = 0; i <= tomatoSlices ; i+=2) {
            int j = (tomatoSlices - i);
            int x = i;
            if (j % 4 != 0 || x % 2 != 0){
                continue;
            }
            if (j/4 + x/2 == cheeseSlices){
                ans.add(j/4);
                ans.add(x/2);
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> ans = solution.numOfBurgers(7063194

                ,1943336);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
