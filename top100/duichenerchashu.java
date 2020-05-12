public class duichenerchashu {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public boolean isSymmetric(TreeNode root){
        if (root==null)
            return true;
        return helper(root.left,root.right);
    }
    public static boolean helper(TreeNode t1,TreeNode t2){
        if (t1==null&&t2==null)
            return true;
        if (t1==null||t2==null){
            return false;
        }
        if (t1.val==t2.val)
            return helper(t1.left,t2.right)&&helper(t1.right,t2.left);
        return false;
    }
}
