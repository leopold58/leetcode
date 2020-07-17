package SwordOffer;

import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 55 - I. 二叉树的深度
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度
 */
public class Offer55_1erchashu_shendu {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    //后序遍历 DFS
    public int maxDepth(TreeNode root){
        if (root==null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
    //层序遍历 BFS
//    public int maxDepth(TreeNode root){
//        if (root==null) return 0;
//        List<TreeNode> queue = new LinkedList() {{add(root);}},tmp;
//        int res=0;
//        while (!queue.isEmpty()){
//            tmp = new LinkedList<>();
//            for (TreeNode node:queue) {
//                if (node.left!=null) tmp.add(node.left);
//                if (node.right!=null) tmp.add(node.right);
//            }
//            queue = tmp;
//            res++;
//        }
//        return res;
//    }
}
