package Week_4.Day_3;

import javax.swing.tree.TreeNode;

public class binarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null)
            return null;

        if (val == root.val)
            return root;

        if (val < root.val)
            return searchBST(root.left, val);

        return searchBST(root.right, val);
    }
}
