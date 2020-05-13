import java.util.ArrayDeque;

public class max_huadongchuangkou {
    //239滑动窗口最大值
//    public static ArrayDeque<Integer> deq=new ArrayDeque<Integer>();
//    public static int[] nums;
//    public static int[] maxSlidingWindows(int[] nums,int k){
//        int n=nums.length;
//        if (n*k==0)
//            return new int[0];
//        if (k==1)
//            return nums;
//        int max_index=0;
//        for (int i = 0; i < k; i++) {
//            clean_deque(i,k);
//            deq.addLast(i);
//            if (nums[i]>nums[max_index])
//                max_index=i;
//        }
//        int[] output=new int[n-k+1];
//        output[0]=nums[max_index];
//
//        for (int i = k; i < n; i++) {
//            clean_deque(i,k);
//            deq.addLast(i);
//            output[i-k+1]=nums[deq.getFirst()];
//        }
//        return output;
//    }
//    public static void clean_deque(int i,int k){
//        if (!deq.isEmpty()&&deq.getFirst()==i-k)
//            deq.removeFirst();
//        while (!deq.isEmpty()){
//            if (nums[i]>nums[deq.getLast()])
//                deq.removeLast();
//        }
//
////        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])                           deq.removeLast();
//    }
    public static void main(String[] args){
        int k=3;
        int[] ar={1,3,-1,-3,5,3,6,7};
        int[] res=maxSlidingWindow(ar,k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        int [] left = new int[n];
        left[0] = nums[0];
        int [] right = new int[n];
        right[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            // from left to right
            if (i % k == 0) left[i] = nums[i];  // block_start
            else left[i] = Math.max(left[i - 1], nums[i]);

            // from right to left
            int j = n - i - 1;
            if ((j + 1) % k == 0) right[j] = nums[j];  // block_end
            else right[j] = Math.max(right[j + 1], nums[j]);
        }

        int [] output = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++)
            output[i] = Math.max(left[i + k - 1], right[i]);

        return output;
    }
}
