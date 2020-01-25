/**
 * Author: wangJianBo
 * Date: 2020/1/25 18:42
 * Content: 查找
 */


class Solution {
    public String getHint(String secret, String guess) {
        int gcount = 0;
        int mcount = 0;
        int i  = 0,j = 0;
        while (i < Math.min(secret.length(),guess.length()) || j < Math.min(secret.length(),guess.length()))
        {
            if (secret.charAt(i) == guess.charAt(j)){
                secret = secret.substring(0,i) + secret.substring(i + 1);
                guess = guess.substring(0,j) + guess.substring(j + 1);
                gcount++;
            }
            else{
                i++;
                j++;
            }
        }
        for (int k = 0; k < secret.length(); k++){
            for (int l = 0; l < guess.length(); l++) {
                if (secret.charAt(k) == guess.charAt(l)){
                    guess = guess.substring(0,l) + guess.substring(l + 1);
                    mcount++;
                    break;
                }
            }
        }
        return gcount + "A" + mcount + "B";
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getHint("011","110"));
    }
}
