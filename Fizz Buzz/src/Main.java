import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/1/10 15:15
 * Content:
 */

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                ans.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                ans.add("Fizz");
            }
            else if (i % 5 == 0){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.fizzBuzz(15);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
