package SwordOffer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *剑指 Offer 32 - III. 从上到下打印二叉树 III
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 */
public class Offer32_3congshangdaoxiadayinerchashu3 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new LinkedList();
        LinkedList<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean sym=true;
        while(!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode node = queue.poll();
                if(sym)
                    list.addLast(node.val);
                else
                    list.addFirst(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(list);
            sym=!sym;
        }
        return res;
    }
}
