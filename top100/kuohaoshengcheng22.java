import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 22括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */
public class kuohaoshengcheng22 {
    public List<String> generateParenthesis(int n){
        List<String> lists=new ArrayList<>();
        if(n==0)
            return lists;
        dfs("",n,n,lists);
        return lists;
    }
    private void dfs(String curStr,int left,int right,List<String> res){
        if(left==0&&right==0){
            res.add(curStr);
            return;
        }
        if(left>right)
            return;
        if(left>0){
            dfs(curStr+'(',left-1,right,res);
        }
        if(right>0){
            dfs(curStr+")",left,right-1,res);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        kuohaoshengcheng22 solution=new kuohaoshengcheng22();
        System.out.println(solution.generateParenthesis(num));
    }
}
