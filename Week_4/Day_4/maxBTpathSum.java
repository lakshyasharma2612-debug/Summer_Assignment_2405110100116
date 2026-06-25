package Week_4.Day_4;

import javax.swing.tree.TreeNode;

public class maxBTpathSum {
    public int maxPathSum(TreeNode root) {
        int[] res = { root.val };
        dfs(root, res);
        return res[0];
    }

    private int dfs(TreeNode node, int[] res) {
        if (node == null) {
            return 0;
        }
        int left = Math.max(0, dfs(node.left, res));
        int right = Math.max(0, dfs(node.right, res));

        res[0] = Math.max(res[0], left + right + node.val);

        return Math.max(left, right) + node.val;
    }  
}
