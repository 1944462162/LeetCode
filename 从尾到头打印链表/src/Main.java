import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2019/12/6 16:37
 * Content:
 */


class ListNode {
   int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> linkedList = new ArrayList<>();
        if (listNode == null){
            return linkedList;
        }
        StringBuilder stringBuffer = new StringBuilder();
        while(listNode != null) {
            stringBuffer.append(listNode.val).append(" ");
            listNode = listNode.next;
        }
        String s = stringBuffer.toString();
        String[] strings = s.split(" ");
        for (int i = strings.length-1; i >= 0 ; i--) {
            linkedList.add(Integer.valueOf((strings[i])));
        }
        return linkedList;
    }
}
public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(67);
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(24);
        ListNode listNode3 = new ListNode(58);
//67,0,24,58
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;

        Solution solution = new Solution();
        ArrayList<Integer> list = solution.printListFromTailToHead(listNode);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
