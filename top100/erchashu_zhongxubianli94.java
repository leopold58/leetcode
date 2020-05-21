import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 94二叉树的中序遍历
 * 给定一个二叉树，返回它的中序遍历。
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){val=x;}
}
public class erchashu_zhongxubianli94 {
    //递归法
    public List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root){
        if (root==null)
            return list;
        helper(root);
        return list;
    }
    public void helper(TreeNode root){
        if (root==null)
            return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }

    //迭代法
//    public List<Integer> list=new ArrayList<>();
//    public Stack<TreeNode> stack=new Stack<>();
//    public List<Integer> inorderTraversal(TreeNode root){
//        TreeNode rt=root;
//        while (rt!=null||!stack.empty()){
//            while (rt!=null){
//                stack.push(rt);
//                rt=rt.left;
//            }
//            rt=stack.pop();
//            list.add(rt.val);
//            rt=rt.right;
//        }
//        return list;
//    }
}
