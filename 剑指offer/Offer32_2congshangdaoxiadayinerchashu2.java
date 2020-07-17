package SwordOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer 32 - II. 从上到下打印二叉树 II (层序打印)
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */
public class Offer32_2congshangdaoxiadayinerchashu2 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    //队列 把一层的放到一个队列里面去
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if (root!=null) queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }
    //递归
//    private List<List<Integer>> ret;
//    public List<List<Integer>> levelOrder(TreeNode root){
//        ret=new ArrayList<>();
//        dfs(0,root);
//        return ret;
//    }
//    private void dfs(int depth,TreeNode root){
//        if (root==null) return;
//        if (ret.size()==depth)
//            ret.add(new ArrayList<>());
//        ret.get(depth).add(root.val);
//        dfs(depth+1,root.left);
//        dfs(depth+1,root.right);
//    }

}
