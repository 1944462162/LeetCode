import java.util.HashSet;
import java.util.Set;

/**
 * Author: wangJianBo
 * Date: 2019/10/30 10:45
 * Content:
 */
class ListNode {
    int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {

    public void deleteNode(ListNode node) {
        ListNode tmp;
        while(node.next != null){
            tmp = node.next;
            if(tmp.val == node.val)
            node = node.next;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
    }
}
