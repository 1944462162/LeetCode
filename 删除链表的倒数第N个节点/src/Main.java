/**
 * Author: wangJianBo
 * Date: 2019/10/30 17:12
 * Content:
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        ListNode pre = listNode;
        ListNode cur = listNode;

        for(int i = 1; i <= n +1; i++){
            pre = pre.next;
        }

        while (pre != null){
            cur = cur.next;
            pre = pre.next;
        }

        cur.next = cur.next.next;
        return listNode.next;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = new ListNode(1);
        listNode.next = null;
        solution.removeNthFromEnd(listNode,1);
    }
}
