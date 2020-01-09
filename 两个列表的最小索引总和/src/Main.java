import java.util.HashMap;

/**
 * Author: wangJianBo
 * Date: 2019/11/11 8:46
 * Content:
 */

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }
        HashMap<String,Integer> map1 = new HashMap<>();
        for (int i = 0; i < list2.length; i++) {
            map1.put(list2[i],i);
        }
        int min = list1.length + list2.length + 5;

        for (String s : map.keySet()) {
            if (map1.containsKey(s)){
                min = Math.min(map.get(s)+map1.get(s),min);
            }
        }
        String[] strings = new String[list1.length + list2.length + 5];
        int k = 0;
        for (String s : map.keySet()) {
            if (map1.containsKey(s)){
                if (map.get(s)+map1.get(s) == min){
                  strings[k++] = s;
                }
            }
        }
        String[] strings1 = new String[k];
        for (int i = 0; i < k; i++) {
            strings1[i] = strings[i];
        }
        return strings1;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strings = {""};
        String[] strings1 = {""};
        Solution solution = new Solution();
        String[] strings2 = solution.findRestaurant(strings,strings1);
        for (String s : strings2) {
            System.out.println(s);
        }
    }
}
