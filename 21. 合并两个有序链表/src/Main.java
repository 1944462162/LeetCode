import java.util.LinkedList;

/**
 * Author: wangJianBo
 * Date: 2019/8/8 16:47
 * Content: java
 */


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        ListNode temp = new ListNode(-1);
        ListNode l3 = temp;
        while(true){
            if(l1 == null){ // 4
                break;
            }
            while(true){
                if(l2 == null){
                    break;
                }
                ListNode node = null;
                if(l1.val >= l2.val)
                {
                     node = new ListNode(l2.val);
                }
                else{
                    break;
                }

                l3.next = node; //  4
                l3 = l3.next;

                l2 = l2.next;

            }

            l3.next = l1; // 1 1 2
            l3 = l3.next;
            l1 = l1.next;
        }
        while(true){
            if(l2 == null){
                break;
            }
            l3.next = l2; // 1 1 2
            l3 = l3.next;
            l2 = l2.next;
        }
        l3 = temp.next;
        return l3;
    }
}
class Main{
    public static void main(String[] args) {
        //创建链表一的节点
        ListNode listNode1 = new ListNode(1);

        //创建链表二的节点
        ListNode listNode4 = new ListNode(2);

        listNode1.next = null;

        listNode4.next = null;

        Solution solution = new Solution();
        ListNode res = solution.mergeTwoLists(listNode1,listNode4);
        while(true){
            if(res ==  null){
                break;
            }
            System.out.println(res.val);
            res = res.next;
        }

    }
}
