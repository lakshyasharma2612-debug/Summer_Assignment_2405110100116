package Week_4.Day_5;

import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreeNode;

public class BTfromInandPreorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length != inorder.length)
            return null;
        
        int n = inorder.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        return buildTreeHelper(preorder, 0, n - 1, inorder, 0, n - 1, map);
    }

    private TreeNode buildTreeHelper(int[] preorder, int preStart, int preEnd,
                                     int[] inorder, int inStart, int inEnd, 
                                     Map<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd)
            return null;
        
        int rootVal = preorder[preStart];
        TreeNode rootNode = new TreeNode(rootVal);
        
        int inPos = map.get(rootVal);
        int leftTotal = inPos - inStart;
    

        rootNode.left = buildTreeHelper(preorder, preStart + 1, preStart + leftTotal,
                                        inorder, inStart, inPos - 1, map);
                                        

        rootNode.right = buildTreeHelper(preorder, preStart + leftTotal + 1, preEnd,
                                         inorder, inPos + 1, inEnd, map);
        
        return rootNode;
    }
}
