import java.nio.file.LinkOption;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: wangJianBo
 * Date: 2019/9/25 15:14
 * Content:
 */


class ListNode {
      int val;
      ListNode next;
 ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        while (tmp != null && tmp.next != null){
            if(tmp.next.val == tmp.val){
                tmp.next = tmp.next.next;
            }else{
                tmp = tmp.next;
            }
        }
        return head;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(3);
        ListNode listNode5 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5 = null;

        Solution solution = new Solution();
        ListNode res = solution.deleteDuplicates(listNode5);
        while(true){
            if(res == null){
                break;
            }
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
