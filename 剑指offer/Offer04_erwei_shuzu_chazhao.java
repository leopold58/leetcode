package SwordOffer;

/**
 * 剑指 Offer 04. 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Offer04_erwei_shuzu_chazhao {
    public boolean findNumberIn2DArray(int[][] matrix,int target){
        if (matrix==null||matrix.length==0||matrix[0].length==0) return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=n-1;
        while (j>=0&&i<m){
            if (matrix[i][j]>target)
                j--;
            else if (matrix[i][j]<target)
                i++;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Offer04_erwei_shuzu_chazhao solution = new Offer04_erwei_shuzu_chazhao();
        System.out.println(solution.findNumberIn2DArray(matrix, 17));
    }
}
