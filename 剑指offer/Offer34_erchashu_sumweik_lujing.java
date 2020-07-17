package SwordOffer;

import java.util.LinkedList;
import java.util.List;

/**
 * 34二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 */
public class Offer34_erchashu_sumweik_lujing {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    List<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        helper(root,sum);
        return res;
    }
    void helper(TreeNode root,int k){
        if (root==null)
            return;
        path.add(root.val);
        k=k-root.val;
        if (k==0&&root.left==null&&root.right==null)
            res.add(new LinkedList(path));
        helper(root.left,k);
        helper(root.right,k);
        path.removeLast();
    }
}
