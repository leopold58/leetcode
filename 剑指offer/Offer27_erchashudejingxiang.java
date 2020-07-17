package SwordOffer;

import java.util.Stack;

/**
 * 剑指 Offer 27. 二叉树的镜像
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
public class Offer27_erchashudejingxiang {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode mirrorTree(TreeNode root){
        helper(root);
        return root;
    }
    void helper(TreeNode root){
        if (root==null) return;
        if (root.left==null&&root.right==null) return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if (root.left!=null) helper(root.left);
        if (root.right!=null) helper(root.right);
    }
    //辅助栈（或队列）
//    public TreeNode mirrorTree(TreeNode root) {
//        if(root == null) return null;
//        Stack<TreeNode> stack = new Stack() {{ add(root); }};
//        while(!stack.isEmpty()) {
//            TreeNode node = stack.pop();
//            if(node.left != null) stack.add(node.left);
//            if(node.right != null) stack.add(node.right);
//            TreeNode tmp = node.left;
//            node.left = node.right;
//            node.right = tmp;
//        }
//        return root;
//    }
}

