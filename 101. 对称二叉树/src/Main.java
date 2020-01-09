import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2019/11/6 15:57
 * Content:
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
    TreeNode(int x) { val = x; }
 }

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue1.add(root);
        queue1.add(root);

        while(!queue1.isEmpty()){
            TreeNode treeNode1 = queue1.poll();
            TreeNode treeNode2 = queue1.poll();
            if (treeNode1 == null && treeNode2 == null){
               continue;
            }
            if (treeNode1 == null || treeNode2 == null){
                return false;
            }

            if (treeNode1.val != treeNode2.val){
                return false;
            }
            queue1.add(treeNode1.left);
            queue1.add(treeNode2.right);
            queue1.add(treeNode1.right);
            queue1.add(treeNode2.left);

        }
        return true;

    }
}
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(3);

        /**
         *     1
         *    / \
         *   2   2
         *  / \ / \
         * 3  4 4  3
         */
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode2.right = treeNode6;
        treeNode2.left= treeNode5;

        Solution solution = new Solution();
        System.out.println(solution.isSymmetric(treeNode));
    }
}
