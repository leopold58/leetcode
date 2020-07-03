package SwordOffer;

import java.util.Scanner;

/**
 * 65.不用加减乘除做加法
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 * 示例:
 * 输入: a = 1, b = 1
 * 输出: 2
 */
public class Offer65_add_none {
    public int add(int a,int b){
        int sum=1,carry=0;
        while(b!=0){
            sum=a^b;
            carry=(a&b)<<1;
            a=sum;
            b=carry;
        }
        return a;
    }

    public static void main(String[] args) {
        Offer65_add_none solution = new Offer65_add_none();
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(solution.add(a, b));
    }
}
