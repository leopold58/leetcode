import sun.reflect.generics.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class erchashu_xuliehua {
    /**
     * 297.二叉树的序列化与反序列化
     * Your Codec object will be instantiated and called as such:
     * Codec codec = new Codec();
     * codec.deserialize(codec.serialize(root));
     */
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){ val = x; }
    }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return helper1(root, new StringBuilder());
    }

    private String helper1(TreeNode root, StringBuilder sb) {
        // terminator
        if (root == null) {
            sb.append("#,");
        } else {
            // process
            sb.append(root.val).append(",");
            // drill down
            helper1(root.left, sb);
            helper1(root.right, sb);
        }
        // return states
        return sb.toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_String = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(data_String));
        return helper2(list);
    }

    private TreeNode helper2(List<String> list) {
        // terminator
        if (list.get(0).equals("#")) {
            list.remove(0);
            return null;
        }
        // process
        TreeNode root = new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        // drill down
        root.left = helper2(list);
        root.right = helper2(list);
        // return states
        return root;
    }
}
