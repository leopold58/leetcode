import java.util.ArrayList;
import java.util.List;

public class erchashu_cengxubianli {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    List<List<Integer>> levels=new ArrayList<>();
    public void helper(TreeNode node,int level){
        if (levels.size()==level)
            levels.add(new ArrayList<>());
        levels.get(level).add(node.val);
        if (node.left!=null)
            helper(node.left, level+1);
        if (node.right!=null)
            helper(node.right, level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null)
            return levels;
        helper(root,0);
        return levels;
    }
    public int maxDepth(TreeNode root){
        if (root==null)
            return 0;
        else{
            int lefth=maxDepth(root.left);
            int righth=maxDepth(root.right);
            return Math.max(lefth,righth)+1;
        }
    }
}
