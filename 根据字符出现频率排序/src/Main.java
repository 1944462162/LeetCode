import com.sun.javafx.collections.MappingChange;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * Author: wangJianBo
 * Date: 2020/1/12 19:25
 * Content: map的根据value排序
 */

class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
            }
        }

        StringBuilder s1 = new StringBuilder();
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Character, Integer> characterIntegerEntry : list) {
            for (int i = 0; i < characterIntegerEntry.getValue(); i++) {
                s1.append(characterIntegerEntry.getKey());
            }
        }

        return s1.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.frequencySort("Aabb");
        System.out.println(s);
    }
}
