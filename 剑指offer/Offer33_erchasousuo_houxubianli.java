package SwordOffer;

import java.util.Stack;

/**
 *33.二叉搜索树的后序遍历序列
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 */
public class Offer33_erchasousuo_houxubianli {
    //递归
    public boolean verifyPostorder(int[] postorder){
        if (postorder==null)
            return false;
        return helper(postorder,0,postorder.length-1);
    }
    private boolean helper(int[] postorder,int i,int j){
        if (i>=j)
            return true;
        int p=i;
        while (postorder[p]<postorder[j])
            p++;
        int m=p;
        while (postorder[p]>postorder[j])
            p++;
        return p==j&&helper(postorder,i,m-1)&&helper(postorder,m,j-1);
    }
    //栈
//    public boolean verifyPostorder(int[] postorder){
//        Stack<Integer> stack = new Stack<>();
//        int root = Integer.MAX_VALUE;
//        for (int i = postorder.length-1; i >=0 ; i++) {
//            if (postorder[i]>root) return false;
//            while (!stack.isEmpty()&&stack.peek()>postorder[i])
//                root = stack.pop();
//            stack.add(postorder[i]);
//        }
//        return true;
//    }
}
