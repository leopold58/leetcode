import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class erchashu_zhongxubianli {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        helper(root,res);
        return res;
    }
    public static void helper(TreeNode root,List<Integer> res){
        if (root!=null){
            if (root.left!=null){
                helper(root.left,res);
            }
            res.add(root.val);
            if(root.right!=null){
                helper(root.right,res);
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        TreeNode root=new TreeNode(1);
        TreeNode node1=new TreeNode(2);
        TreeNode node2=new TreeNode(3);
        root.right=node1;
        node1.left=node2;
        System.out.println(inorderTraversal(root));
    }
}
