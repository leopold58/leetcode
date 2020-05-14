public class shuzu_sousuo {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0)
            return false;
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0){
            if(matrix[row][col]>target){
                col--;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                return true;
            }
        }
        return false;
    }
//    public static boolean searchMatrix(int[][] matrix, int target) {
//    // start our "pointer" in the bottom-left
//        int row = matrix.length-1;
//        int col = 0;
//
//        while (row >= 0 && col < matrix[0].length) {
//            if (matrix[row][col] > target) {
//                row--;
//            } else if (matrix[row][col] < target) {
//                col++;
//            } else { // found it
//                return true;
//            }
//        }
//
//        return false;
//    }

    public static void main(String[] args){
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        System.out.println(searchMatrix(matrix, target));
    }
}
