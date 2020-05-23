/**
 * 312戳气球
 *
 * 有 n 个气球，编号为0 到 n-1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
 * 现在要求你戳破所有的气球。每当你戳破一个气球 i 时，你可以获得 nums[left] * nums[i] * nums[right] 个硬币。 
 * 这里的 left 和 right 代表和 i 相邻的两个气球的序号。注意当你戳破了气球 i 后，气球 left 和气球 right 就变成了相邻的气球。
 * 求所能获得硬币的最大数量。
 */
public class shuzu_chuoqiqiu312 {
    //动态规划
    public int maxCoins(int[] nums){
        int n=nums.length+2;
        int[] new_nums=new int[n];
        for (int i = 0; i < nums.length; i++) {
            new_nums[i+1]=nums[i];
        }
        new_nums[0]=new_nums[n-1]=1;
        int[][] memo=new int[n][n];

        return dp(memo,new_nums,0,n-1);
    }
    public int dp(int[][] memo,int[] nums,int left,int right){
        if (left+1==right)
            return 0;
        if (memo[left][right]>0)
            return memo[left][right];

        int ans=0;
        for (int i = left+1; i < right; i++) {
            ans=Math.max(ans,nums[left]*nums[i]*nums[right]+dp(memo, nums, left, i)+dp(memo, nums, i, right));
        }
        memo[left][right]=ans;
        return ans;
    }
}
