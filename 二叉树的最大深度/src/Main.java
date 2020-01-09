/**
 * Author: wangJianBo
 * Date: 2019/11/7 16:42
 * Content:
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    int ans = 0;
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        help(root,1);
        return ans;
    }
    public void help(TreeNode root, int depth){
        if (root == null){
            return;
        }
        if (root.right == null && root.left == null){
            ans = Math.max(ans,depth);
        }
        help(root.left,depth+1);
        help(root.right,depth+1);
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
        System.out.println(solution.maxDepth(treeNode));
    }
}
