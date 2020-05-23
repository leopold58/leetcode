import java.util.Arrays;

public class shuzu_lingqianduihuan322 {
    /**
     * 322零钱兑换
     *给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
     * 如果没有任何一种硬币组合能组成总金额，返回 -1。
     * @param coins
     * @param amount
     * @return
     */
    //动态规划，42mm
//    public int coinChange(int[] coins,int amount){
//        if (amount<1)
//            return 0;
//        return coinChange(coins,amount,new int[amount]);
//    }
//    private int coinChange(int[] coins,int rem, int[] count){
//        if (rem<0)
//            return -1;
//        if (rem==0)
//            return 0;
//        if (count[rem-1]!=0)
//            return count[rem-1];
//        int min=Integer.MAX_VALUE;
//        for (int coin:coins ) {
//            int res=coinChange(coins,rem-coin,count);
//            if (res>=0&&res<min)
//                min=1+res;
//        }
//        count[rem-1]=(min==Integer.MAX_VALUE)? -1:min;
//        return count[rem-1];
//    }
    //dfs，3mm
    private int min=Integer.MAX_VALUE;
    public int coinChange(int[] coins,int amount){
        if (coins==null||coins.length==0)
            return -1;
        if (amount == 0)
            return 0;
        Arrays.sort(coins);
        dfs(coins,coins.length-1,amount,0);
        return min==Integer.MAX_VALUE? -1:min;
    }
    private void dfs(int[] coins,int start,int amount,int curVal){
        int coin=coins[start];
        if (start==0){
            if (amount % coin ==0)
                min=Math.min(min,curVal+amount/coin);
            return;
        }
        int j=amount/coin;
        while (j>0&&curVal+j<min){
            dfs(coins, start-1, amount-coin, curVal+j);
            j--;
        }
    }
}
