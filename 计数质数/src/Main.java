import java.util.BitSet;

/**
 * Author: wangJianBo
 * Date: 2020/1/10 14:55
 * Content: 素数筛选
 */

class Solution {
    public int countPrimes(int n) {
        BitSet bitSet = new BitSet(n);
        for (int i = 0; i < n; i++) {
            bitSet.set(i);
        }
        int i = 2;
        int count = 0;
        while(i * i <= n){
            if (bitSet.get(i)){
                count++;
            }
            int k = i;
            while (k <= n){
                bitSet.clear(k);
                k += i;
            }
            i++;
        }
        while(i <= n){
            if (bitSet.get(i)){
                count++;
            }
            i++;
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countPrimes(100));
    }
}
