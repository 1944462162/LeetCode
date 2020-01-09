import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/11/24 10:37
 * Content:
 */
class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        //["mobile","moneypot","monitor","mouse","mousepad"]

        List<List<String>> list1 = new ArrayList<>();
        int count;
        for (int i = 0; i < searchWord.length(); i++) {
            List<String> list = new ArrayList<>();
            count = 0;
            for(int j = 0; j < products.length; j++){

                if (i+1 > products[j].length() || i +1 >searchWord.length() ){
                    continue;
                }
                if (products[j].substring(0,i+1).equals(searchWord.substring(0,i+1))){
                    list.add(products[j]);
                    count++;
                }
                if (count == 3){
                    break;
                }
            }
            list1.add(list);
        }
        return list1;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strings = {"bags","baggage","banner","box","cloths"};
        Solution solution = new Solution();
        List<List<String>> ans  =  solution.suggestedProducts(strings, "tatiana");
        for (List<String> an : ans) {
            for (String string : an) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}
