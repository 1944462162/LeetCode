/**
 * Author: wangJianBo
 * Date: 2019/10/30 14:44
 * Content:
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null){
            if(head.val != val){
                break;
            }
            head = head.next;
        }

        ListNode listNode = head;
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.val == val){
                listNode.next = listNode.next.next;
            }
            else{
                listNode = tmp;
            }
            tmp = tmp.next;
        }
        return head;
    }
}
public class Main {
    public static void main(String[] args) {
        // 1->2->6->3->4->5->6
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(1);


        listNode.next = listNode1;
        listNode1.next = null;

        Solution solution = new Solution();
        ListNode listNode7 = solution.removeElements(listNode,1);
        while(listNode7 != null){
            System.out.println(listNode7.val);
            listNode7 = listNode7.next;
        }
    }
}
