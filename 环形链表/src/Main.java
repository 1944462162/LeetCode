/**
 * Author: wangJianBo
 * Date: 2019/10/13 21:02
 * Content:  双指针法
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);

        listNode1.next = listNode2;
        listNode2.next = null;
        Solution solution = new Solution();
        boolean res = solution.hasCycle(listNode1);
        System.out.println(res);
    }
}
