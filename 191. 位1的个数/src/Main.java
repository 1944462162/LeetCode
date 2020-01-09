import org.omg.PortableInterceptor.Interceptor;

import java.math.BigInteger;

/**
 * Author: wangJianBo
 * Date: 2020/1/9 10:07
 * Content: 位运算，通过掩码进行比较
 */

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(long n) {
      int bits = 0;
      int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0){
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(4294967293));
    }
}
