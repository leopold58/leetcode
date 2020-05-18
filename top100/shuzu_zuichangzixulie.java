public class shuzu_zuichangzixulie {
    /**
     * 300，最长上升子序列
     */
    //动态规划
//    public int lengthOfLIS(int[] nums){
//        if (nums.length==0){
//            return 0;
//        }
//        int[] dp=new int[nums.length];
//        dp[0]=1;
//        int imax=1;
//        for (int i = 0; i < dp.length; i++) {
//            int jmax=0;
//            for (int j = 0; j < i; j++) {
//                if (nums[i]>nums[j]){
//                    jmax=Math.max(jmax,dp[j]);
//                }
//            }
//            dp[i]=jmax+1;
//            imax=Math.max(imax,dp[i]);
//        }
//        return imax;
//    }
    //贪心算法+动态规划
    public int lengthOfLIS(int[] nums){
        int len=nums.length;
        if (len<=1){
            return len;
        }
        int[] help=new int[len];
        help[0]=nums[0];
        int end=0;
        for (int i = 0; i < len; i++) {
            if (nums[i]>help[end]){
                end++;
                help[end]=nums[i];
            }
            else{
                int left=0;
                int right=end;
                while (left<right){
                    int mid=left+(right-left)/2;
                    if (help[mid]>=nums[i]){           //注意二分法中遍历到help[mid]==nums[i]的情况
                        right=mid;
                    }
                    else {
                        left=mid+1;
                    }
                }
                help[left]=nums[i];
            }
        }
        end++;
        return end;
    }


}
