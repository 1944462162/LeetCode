import java.util.*;

/**
 * Author: wangJianBo
 * Date: 2020/1/9 9:35
 * Content:
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> ansList = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null){
            return ansList;
        }
        hepl(root);
        Collections.reverse(ansList);
        return ansList;
    }
    void hepl(TreeNode root){
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList arrayList = new ArrayList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                arrayList.add(treeNode.val);
                if (treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }
            ansList.add(arrayList);
        }
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
        List<List<Integer>> ans = solution.levelOrderBottom(treeNode);
        for (List<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
