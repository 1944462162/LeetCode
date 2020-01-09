import java.util.*;


/**
 * Author: wangJianBo
 * Date: 2019/10/10 21:14
 * Content: Map 排序
 */

class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
//        根据map的key排序
//        Map<Integer, Integer> map = new TreeMap<>(  Comparator.reverseOrder());
        Map<Integer,Integer> map = new TreeMap<>();
//        将出现的次数存放到数组中
        for (int i = 0; i < nums.length; i++){
            int now = nums[i];
            if(map.containsKey(now)){
                map.put(now,map.get(now)+1);
            }
            else{
                map.put(now,1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(map.entrySet());
//排序
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> map1, Map.Entry<Integer, Integer> map2) {
                return (map2.getValue() - map1.getValue());
            }
        });


        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> integerIntegerEntry : arrayList) {
            list.add(integerIntegerEntry.getKey());
            k--;
            if (k == 0){
                break;
            }
        }

        return list;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {1,1,1,2,2,3,3,3,3};
        Solution solution = new Solution();
        List<Integer> ss = solution.topKFrequent(a,2);
        for (Integer s : ss) {
            System.out.println(s);
        }
    }
}
