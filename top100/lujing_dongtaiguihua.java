public class lujing_dongtaiguihua {
    public int uniquePaths(int m,int n){
        int[][] space=new int[m][n];
        for (int i = 0; i <m; i++) {
            space[0][i]=1;
        }
        for (int i = 0; i < n ; i++) {
            space[i][0]=1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j <n; j++) {
                space[i][j]=space[i-1][j]+space[i][j-1];
            }
        }
        return space[m-1][n-1];
    }
}
