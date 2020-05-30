public class erchashu_zhijing543 {
    /**
     * 543二叉树的直径
     * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
     * 注意：两结点之间的路径长度是以它们之间边的数目表示。
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    int res;
    public int diameterOfBinaryTree(TreeNode root){
        res=0;
        helper(root);
        return res;
    }
    public int helper(TreeNode node){
        if (node==null)
            return 0;
        int L=helper(node.left);
        int R=helper(node.right);
        res=Math.max(res,L+R);
        return Math.max(L,R)+1;
    }
}
