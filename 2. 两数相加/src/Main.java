import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.math.BigInteger;

/**
 * Author: wangJianBo
 * Date: 2019/9/26 15:00
 * Content:
 */


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger ans1 = BigInteger.valueOf(0);
        BigInteger ans2 = BigInteger.valueOf(0);
        BigInteger cnt = BigInteger.valueOf(1);
        while(true){   // 243
            if(l1 == null){
                break;
            }
            ans1 =  ans1.add(cnt.multiply(BigInteger.valueOf(l1.val)));
            cnt = cnt.multiply(BigInteger.valueOf(10));
            l1 = l1.next;
        }

        cnt = BigInteger.valueOf(1);
        while(true){  //564
            if(l2 == null){
                break;
            }
            ans2 =  ans2.add(cnt.multiply(BigInteger.valueOf(l2.val)));
           // System.out.println(ans2);
            cnt = cnt.multiply(BigInteger.valueOf(10));
            l2 = l2.next;
        }
//        System.out.println(" ------ "+ ans1 + " "  + ans2);
        BigInteger ans = ans1.add(ans2);  // 807
        System.out.println(ans);
        ListNode head = new ListNode(-1);
        ListNode listNode = head;
        while(true){   // 8
            //BigInteger tmp = ans.remainder(BigInteger.valueOf(10)); // 0
            Integer tmp = Integer.valueOf(ans.remainder(BigInteger.valueOf(10)).toString());
            listNode.val = tmp;
            ans = ans.divide(BigInteger.valueOf(10));
            if(ans.equals(0)){
                break;
            }
            ListNode listNode1 = new ListNode(-1);
            listNode.next = listNode1;
            listNode = listNode.next;

        }
        return head;
    }
}
public class Main {
    public static void main(String[] args) {
//        [9]
//[1,9,9,9,9,9,9,9,9,9]
        ListNode listNode1 = new ListNode(9);

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(9);
        ListNode listNode6 = new ListNode(9);
        ListNode listNode7 = new ListNode(9);
        ListNode listNode8 = new ListNode(9);
        ListNode listNode9 = new ListNode(9);
        ListNode listNode10 = new ListNode(9);
        ListNode listNode11 = new ListNode(9);
        ListNode listNode12 = new ListNode(9);
        ListNode listNode13 = new ListNode(9);


        listNode1.next = null;

        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;
        listNode10.next = listNode11;
        listNode11.next = listNode12;
        listNode12.next = listNode13;
        listNode13.next = null;


        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(listNode1,listNode4);
        while(true){
            if(listNode == null){
                break;
            }
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }
}
