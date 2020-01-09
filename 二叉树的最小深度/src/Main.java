import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: wangJianBo
 * Date: 2019/11/7 15:32
 * Content:
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 1;
        while (!queue.isEmpty()){

            int size  = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();

                assert treeNode != null;
                if(treeNode.left != null){
                    queue.add(treeNode.left);
                }

                if (treeNode.right != null){
                    queue.add(treeNode.right);
                }
                if (treeNode.right == null && treeNode.left == null){
                    return depth;
                }

            }
            depth += 1;
        }

        return depth;
    }
}
public class Main {
    public static void main(String[] args) {

        /**
         *     3
         *    / \
         *   9  20
         *     /  \
         *    15   7
         */
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(7);

//        treeNode.left = treeNode1;

        Solution solution = new Solution();
        System.out.println( solution.minDepth(treeNode));
    }
}
