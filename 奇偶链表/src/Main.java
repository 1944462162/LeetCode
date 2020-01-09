/**
 * Author: wangJianBo
 * Date: 2019/10/29 22:11
 * Content:
 */


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
       ListNode listNode = head;
       ListNode listNode1 = head.next;

       ListNode nextNode = head.next;
       while(listNode1 != null && listNode1.next != null){
            listNode.next = listNode.next.next;
            listNode = listNode.next;

            listNode1.next = listNode1.next.next;
            listNode1 = listNode1.next;
       }
       listNode.next = nextNode;
       return head;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(7);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = null;

        Solution solution = new Solution();
        ListNode listNode7 = solution.oddEvenList(listNode);
        while(listNode7.next != null){
            System.out.println(listNode7.val);
            listNode7 = listNode7.next;
        }
    }
}
