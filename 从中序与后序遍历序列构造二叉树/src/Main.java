/**
 * Author: wangJianBo
 * Date: 2019/11/8 9:52
 * Content:
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

class Solution {
    int index;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       index = inorder.length-1;
       return help(inorder,postorder, 0, inorder.length-1);
    }
    public TreeNode help(int[] inorder, int[] postorder, int begin, int end){
        if(begin > end){
            return null;
        }
        int val = postorder[index--];
        for (int i = begin; i <= end; i++) {
            if (val == inorder[i]){
                TreeNode root = new TreeNode(val);
                root.right = help(inorder,postorder,i+1,end);
                root.left = help(inorder,postorder,begin,i-1);
                return root;
            }
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {9,3,15,20,7};
        int[] b = {9,15,7,20,3};
        Solution solution = new Solution();
        TreeNode treeNode = solution.buildTree(a,b);
        help(treeNode);
    }
    public static void help(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        help(root.left);
        help(root.right);
    }
}
