public class erchashu_zhankaiweilianbiao {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public void flatten(TreeNode root){
        while(root!=null){
            if (root.left==null)
                return;
            else{
                if (root.left==null){
                    root=root.right;
                    return;
                }
                else{
                    TreeNode pre=root.right;
                    TreeNode left=root.left;
                    while (left.right!=null){
                        left=left.right;
                    }
                    left.right=pre;
                    root.right=root.left;

                }

            }

        }
    }
}
