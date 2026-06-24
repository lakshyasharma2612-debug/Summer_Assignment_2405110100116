package Week_4.Day_2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class LevelOrder {
     public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>>list=new ArrayList<>();
        pre(root,0,list);
        return list;
    }

    public static void pre(TreeNode root,int l,List<List<Integer>>list)
    {
        if(root==null)
            return;
        if(list.size()==l)
        {
            List<Integer>li=new ArrayList<>();
            li.add(root.val);
            list.add(li);
        }
        else
            list.get(l).add(root.val);
        pre(root.left,l+1,list);
        pre(root.right,l+1,list);
    } 
}
