import sun.plugin.javascript.navig.LinkArray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2019/10/31 9:55
 * Content:
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> anslist = new ArrayList<>();
        if(root == null){
            return anslist;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> ans = new  ArrayList();
            for (int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                assert node != null;
                ans.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }

                if(node.right != null){
                    queue.add(node.right);
                }
            }
            anslist.add(ans);
        }
        return anslist;
    }
}

/**
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;

        Solution solution = new Solution();
        List<List<Integer>> lists = solution.levelOrder(treeNode);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }
}
