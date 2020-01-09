/**
 * Author: wangJianBo
 * Date: 2019/10/29 21:40
 * Content:
 */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode listNode = head;
        if(head != null)
        {
            while(listNode.next != null){
                ListNode tmp = listNode.next;
                listNode.next = listNode.next.next;
                tmp.next = head;
                head = tmp;
            }
        }
        return head;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        ListNode listNode = solution.reverseList(listNode1);

        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
