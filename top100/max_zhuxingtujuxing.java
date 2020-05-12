public class max_zhuxingtujuxing {
//    public static int calculateArea(int[] heights, int start, int end) {
//        if (start > end)
//            return 0;
//        int minindex = start;
//        for (int i = start; i <= end; i++)
//            if (heights[minindex] > heights[i])
//                minindex = i;
//        return Math.max(heights[minindex] * (end - start + 1),
//                Math.max(calculateArea(heights, start, minindex - 1),
//                        calculateArea(heights, minindex + 1, end)));
//    }
//    public static int largestRectangleArea(int[] heights) {
//        return calculateArea(heights, 0, heights.length - 1);
//    }
    public static void main(String[] args){
        int[] heights={2,1,5,6,2,3};
        int mm=largestRectangleArea(heights);
        System.out.println(mm);
    }
    public static int largestRectangleArea(int[] heights){
        int len=heights.length;
        if (len==0)
            return 0;
        int res=0;
        for (int i = 0; i < len; i++) {
            int left=i;
            int curHeight=heights[i];
            while (left>0&&heights[left-1]>=curHeight){
                left--;
            }
            int right=i;
            while (right<len-1&&heights[right+1]>=curHeight){
                right++;
            }
            int width=right-left+1;
            res=Math.max(res,width*curHeight);
        }
        return res;
    }
}