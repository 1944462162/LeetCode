import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2019/10/30 21:04
 * Content:
 */

class TreeNode {
     int val;
    TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        helper(root,list);
        return list;
    }

    private void helper(TreeNode root, List<Integer> list) {

        if(root.left != null){
            helper(root.left,list);
        }

        if(root.right != null){
            helper(root.right,list);
        }
        list.add(root.val);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = null;
        treeNode.right = treeNode1;
        treeNode1.left = treeNode2;
        treeNode2.right = null;
        List list = solution.preorderTraversal(treeNode);
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
