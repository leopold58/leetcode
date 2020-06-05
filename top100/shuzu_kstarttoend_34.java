import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class shuzu_kstarttoend_34 {
    /**
     * 34在排序数组中查找元素的第一个和最后一个位置
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
     * 你的算法时间复杂度必须是 O(log n) 级别。
     * 如果数组中不存在目标值，返回 [-1, -1]。
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        if (nums==null)
            return result;
        int leftindex=findIndex(nums,target,true);
        int rightindex=findIndex(nums,target,false)-1;
        if(rightindex<leftindex){
            return result;
        }
        result[0]=leftindex;
        result[1]=rightindex;
        return result;

    }
    private static int findIndex(int[] nums,int target,boolean sys){
        int left= 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if ((nums[mid] == target &&sys)|| nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
        public static void main (String[]args){
//        Scanner in=new Scanner(System.in);
//        int num=in.nextInt();
//        int[] nums=new int[num];
//        for (int i = 0; i <num; i++) {
//            nums[i]=in.nextInt();
//        }
//        int target=in.nextInt();
            int[] nums = {5, 7, 7, 8, 8, 10};
            int target = 8;
            int[] res=searchRange(nums,target);
            for (int i = 0; i <res.length; i++) {
                System.out.print(res[i]+" ");
            }
        }

}
