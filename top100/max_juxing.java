import java.util.Scanner;

public class max_juxing {
    public static int maximalRectangle(char[][] matrix){
        if (matrix.length==0)
            return 0;
        int maxarea=0;
        int[][] dp=new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]=='0'){
                    dp[i][j]=j==0? 0:dp[i][j-1]+1;
                    int width=dp[i][j];
                    for (int k = i; k >= 0; k--) {
                        width=Math.min(width,dp[k][j]);
                        maxarea=Math.max(width*(j-k+1),maxarea);
                    }
                }
            }
        }
        return maxarea;
    }
    //  字符矩形的输入。
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        char[][] chars=new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                chars[i][j]="in.nextInt()+'0'";
            }
        }
//        maximalRectangle()
    }
}
