import com.sun.javafx.collections.MappingChange;

import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/10/29 15:24
 * Content:
 */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode listNode= new ListNode(-1);
        while()
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = null;

        Solution solution = new Solution();
        ListNode listNode = solution.sortList(listNode1);

        while(listNode != null)
        {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}
