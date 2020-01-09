/**
 * Author: wangJianBo
 * Date: 2019/10/30 15:55
 * Content:
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        if(head.next == null)
            return head;

        ListNode listNode = head;
        int count = 0;
        while (listNode != null){
            count++;
            listNode = listNode.next;
        }
        int c = k % count;
        if(c == 0)
            return head;
        int num = 0;
        ListNode node = head;
        while (node != null){
            num++;
            if(num == (count - c)){
                break;
            }
            node = node.next;
        }
        ListNode node1 = node;
        ListNode head1 = node1.next;
        while (node1.next != null){
            node1 = node1.next;
        }
        node.next = null;
        node1.next = head;
        return head1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //1->2->3->4->5
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        listNode1.next =  null;
        ListNode listNode5 = solution.rotateRight(listNode,2);
        while(listNode5 != null){
            System.out.println(listNode5.val);
            listNode5 =listNode5.next;
        }
    }
}
