package Week_4.Day_1;

import javax.swing.tree.TreeNode;

public class invertTree {
     public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);
        root.left = r;
        root.right= l;
        return root;
    }
}
