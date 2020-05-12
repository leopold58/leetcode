public class max_zixulie {
    public static int maxSubArray(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int left=0,max=0,sum=0;
        while(left<nums.length){
            sum=sum+nums[left];
            max=Math.max(sum,max);
            if(sum<=0){
                left++;
                sum=0;
            }
            else{
                left++;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
