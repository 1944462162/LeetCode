/**
 * Author: wangJianBo
 * Date: 2020/1/23 10:14
 * Content: 链表 递归
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {

    public ListNode hepl(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode listNode = head;
        ListNode tmp = listNode.next;
        listNode.next = listNode.next.next;
        tmp.next = listNode;
        head = tmp;
        head.next.next = hepl(head.next.next);
        return head;
    }
    public ListNode swapPairs(ListNode head) {
       return hepl(head);
    }
}

public class Main {
    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        Solution solution = new Solution();
        ListNode listNode = solution.swapPairs(null);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
