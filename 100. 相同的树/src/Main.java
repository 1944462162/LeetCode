import java.util.ArrayList;

/**
 * Author: wangJianBo
 * Date: 2019/9/25 17:43
 * Content:
 */

class TreeNode {
     int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

class Solution {
    boolean flage = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        hepl(p,q);
        return flage;
    }
    void hepl(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 == null){
            return;
        }
        if (root1 == null || root2 == null){
            flage = false;
            return;
        }
        hepl(root1.left,root2.left);
        if (root1.val != root2.val){
            flage = false;
        }
        hepl(root1.right,root2.right);
    }
}

/**
 *            1         1
 *           / \       / \
 *          2   3     2   3
 *
 */
public class Main {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(3);
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        Solution solution = new Solution();
        System.out.println(solution.isSameTree(treeNode,treeNode3));

    }
}
