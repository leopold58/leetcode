public class biteweijishu {
    /**
     * 338比特位计数
     * 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
     */
    public int[] countBits(int num){
        int[] res=new int[num+1];
        for (int i = 0; i <= num; i++) {
            res[i] = helper(i);
        }
        return res;
    }
    public int helper(int num){
        int count=0;
        for (;num!=0;count++){
            num &= num-1;
        }
        return count;
    }
}
