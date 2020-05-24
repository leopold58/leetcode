import java.util.Stack;

public class erchashu_zhuanhuanleijiashu {
    /**
     * 538把二叉搜索树转换为累加树
     * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
     * 链接：https://leetcode-cn.com/problems/convert-bst-to-greater-tree
     */
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //回溯法
    private int sum=0;
    public TreeNode convertBST(TreeNode root){
        if (root==null)
            return null;
        convertBST(root.right);
        sum+=root.val;
        root.val=sum;
        convertBST(root.left);
        return root;
    }
    //栈+迭代法
//    public TreeNode convertBST(TreeNode root){
//        Stack<TreeNode> stack=new Stack<>();
//        int sum=0;
//        TreeNode node=root;
//        while (!stack.isEmpty()||node!=null){
//            while (node!=null){
//                stack.push(node);
//                node=node.right;
//            }
//            node=stack.pop();
//            sum+=node.val;
//            node.val=sum;
//            node=node.left;
//        }
//        return root;
//    }
}
