import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/1/27 10:16
 * Content: 回溯
 */
class Solution {
    private List<List<Integer>> lists =  new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        hepl(candidates,target,new ArrayList<Integer>(),0);
        return lists;
    }

    private void hepl(int[] candidates, int target, ArrayList<Integer> arrayList, int start) {
        if (target == 0){
            lists.add( new ArrayList<>(arrayList));
            return ;
        }
        if (target < 0){
            return ;
        }
        for (int i = start; i < candidates.length; i++) {
            arrayList.add(candidates[i]);
            hepl(candidates, target - candidates[i], arrayList,i);
            arrayList.remove(arrayList.size() - 1);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2,3,6,7},7));
    }
}
