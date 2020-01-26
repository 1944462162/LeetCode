/**
 * Author: wangJianBo
 * Date: 2020/1/26 20:45
 * Content: 大小写转换
 */

class Solution {
    public String toLowerCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && 'Z' >= str.charAt(i)){
                stringBuilder.append((char)(str.charAt(i) + 32));
            }
            else{
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.toLowerCase("Hello"));
    }
}
