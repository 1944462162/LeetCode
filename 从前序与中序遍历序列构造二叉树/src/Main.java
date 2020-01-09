/**
 * Author: wangJianBo
 * Date: 2019/11/8 10:33
 * Content:
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

class Solution {
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return help(preorder,inorder,0,preorder.length-1);
    }
    public TreeNode help(int[] preorder, int[] inorder, int begin, int end){
        if (begin > end){
            return null;
        }
        int val = preorder[index++];
        for (int i = begin; i <= end; i++) {
            if (val == inorder[i]){
                TreeNode root = new TreeNode(val);
                root.left = help(preorder,inorder,begin,i-1);
                root.right = help(preorder,inorder,i+1,end);

                return root;
            }
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {3,9,20,15,7};
        int[] b = {9,3,15,20,7};
        Solution solution = new Solution();
        TreeNode root = solution.buildTree(a,b);
        help(root);
    }

    private static void help(TreeNode root) {
        if (root == null){
            return;
        }
        System.out.println(root.val);
        help(root.left);
        help(root.right);
    }
}
