package SwordOffer;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 60.n个骰子的点数
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。
 * 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
 * 示例 1:
 * 输入: 1
 * 输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
 * 示例 2:
 * 输入: 2
 * 输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778]
 * 限制：
 * 1 <= n <= 11。
 */
public class Offer60_NumsOfNShaizi {
    public double[] twoSum(int n){
        if (n==0)
            return new double[0];
        int code=6;
        int[][] count=new int[2][n*code+1];
        int flag=0;
        for (int j=1;j<=code;j++)
            count[flag][j] = 1;  //第一枚骰子，i=1
        for (int i = 2; i <= n; i++) { //第二枚到第n枚
            for (int j = 1; j < i; j++) {
                count[1-flag][j] = 0;   //第i~i-置0，第0位没有进行修改过，始终为初始值0；
            }
            for (int j = i; j <= i*code; j++) {
                count[1-flag][j] = 0;
                for (int k=1;k<=6&&j-k>=1;k++){
                    count[1-flag][j] += count[flag][j-k];
                }
            }
            flag = 1-flag;
        }
        double base = Math.pow(code,n);
        double[] p = new double[n*code-n+1];
        for (int j = 0; j < p.length; j++) {
            p[j] = count[flag][n+j]/base;//base已经是double类型了，这里可以不用加（double）转换了
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums=in.nextInt();
        DecimalFormat df=new DecimalFormat("0.000");
        Offer60_NumsOfNShaizi solution = new Offer60_NumsOfNShaizi();
        for (double d:solution.twoSum(nums)) {
            System.out.print(df.format(d)+" ");
        }

    }
}
