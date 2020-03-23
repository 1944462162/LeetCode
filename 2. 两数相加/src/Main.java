import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2019/9/26 15:00
 * Content: 链表写大数
 */


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null){
            return null;
        }
       int l1Length = 0;
       int l2Length = 0;
       ListNode L1 = l1;
       ListNode L2 = l2;
       while(l1 != null){
           l1Length++;
           l1 = l1.next;
       }
       while (l2 != null){
           l2Length++;
           l2 = l2.next;
       }
       int a = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
       for (int i = 0; i < Math.max(l1Length, l2Length); i++) {
           int sum;
           if (L1 == null){
                sum = L2.val + a;
           }
           else if (L2 == null){
                sum = L1.val + a;
           }
           else {
                sum = L1.val + L2.val + a;
           }
           a = sum / 10;
           arrayList.add(sum % 10);
           if (L1 != null){
               L1 = L1.next;
           }
           if (L2 != null){
               L2 = L2.next;
           }
       }
       arrayList.add(a);
       int k = 0;
        for (int i = arrayList.size() - 1; i >=0 ; i--) {
            if (arrayList.get(i) != 0){
                break;
            }
            else {
                k++;
            }
        }
        ListNode ans = new ListNode(0);
        if (arrayList.size() == k && arrayList.get(0) == 0){
            return ans;
        }
        ListNode head = ans;
        for (int i = 0; i < arrayList.size() - k; i++) {
            ans.next = new ListNode(arrayList.get(i));
            ans = ans.next;
        }
        return head.next;
    }
}
public class Main {
    public static void main(String[] args) {
//        [9]
//[1,9,9,9,9,9,9,9,9,9]
        ListNode listNode1 = new ListNode(0);

        ListNode listNode4 = new ListNode(0);
//        ListNode listNode5 = new ListNode(9);
//        ListNode listNode6 = new ListNode(9);
//        ListNode listNode7 = new ListNode(9);
//        ListNode listNode8 = new ListNode(9);
//        ListNode listNode9 = new ListNode(9);
//        ListNode listNode10 = new ListNode(9);
//        ListNode listNode11 = new ListNode(9);
//        ListNode listNode12 = new ListNode(9);
//        ListNode listNode13 = new ListNode(9);


        listNode1.next = null;

//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;
//        listNode7.next = listNode8;
//        listNode8.next = listNode9;
//        listNode9.next = listNode10;
//        listNode10.next = listNode11;
//        listNode11.next = listNode12;
//        listNode12.next = listNode13;
//        listNode13.next = null;


        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(listNode1,listNode4);
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}
