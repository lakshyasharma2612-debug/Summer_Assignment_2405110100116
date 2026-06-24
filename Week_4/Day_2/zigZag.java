package Week_4.Day_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class zigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        int state = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> r = new ArrayList<>();
            int len = q.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = q.poll();
                r.add(temp.val);
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            if (state % 2 != 0) {
                Collections.reverse(r);
            }
            res.add(r);
            state += 1;
        }
        return res;
    }
}
