/**
 * Author: wangJianBo
 * Date: 2019/11/7 16:53
 * Content:
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
        {
            return false;
        }
        sum -= root.val;
        if (root.right == null && root.left == null){
            return (sum == 0);
        }
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(8);
        TreeNode treeNode3 = new TreeNode(11);
        TreeNode treeNode4 = new TreeNode(13);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(7);
        TreeNode treeNode7 = new TreeNode(2);
        TreeNode treeNode8 = new TreeNode(1);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left = treeNode3;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode5.right = treeNode8;

        Solution solution = new Solution();
        System.out.println(solution.hasPathSum(treeNode, 22));

    }
}
