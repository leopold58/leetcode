package SwordOffer;

/**
 *54二叉搜索树的第k大节点
 */
public class Offer54_erchasousuo_dikdajiedian {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
    int res,k;
    public int kthLargest(TreeNode root,int k){
        this.k=k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root){
        if (root==null)
            return;
        dfs(root.right);
        if (k==0)
            return;
        if (--k==0)
            res=root.val;
        dfs(root.left);
    }
}
