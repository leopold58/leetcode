public class shuzu_dajiajieshe_198 {
    public int rob(int[] nums){
        if (nums.length==0)
            return -1;
        if (nums.length==1)
            return nums[0];
        if (nums.length==2)
            return Math.max(nums[0],nums[1]);
        int first=nums[0];
        int second=Math.max(nums[0],nums[1]);
        int sum=0;
        for (int i = 2; i < nums.length; i++) {
            sum=Math.max(first+nums[i],second);
            first=second;
            second=sum;
        }
        return sum;
    }
}
