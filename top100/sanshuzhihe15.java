import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sanshuzhihe15 {
    /**
     * 15三数之和
     * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     * 注意：答案中不可以包含重复的三元组。
     * @param args
     */
    public static void main(String[] args){
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        for (int i = 0; i <len; i++) {
            if(nums[0]>0)
                return lists;
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int curr=nums[i];
            int L=i+1,R=len-1;
            while (L<R){
                int sum=nums[i]+nums[L]+nums[R];
                if(sum==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while (L<R&&nums[L+1]==nums[L])
                        L++;
                    while (L<R&&nums[R-1]==nums[R])
                        R--;
                    ++L;
                    --R;
                }
                else if(sum>0){
                    R--;
                }
                else {
                    L++;
                }
            }
        }
        return lists;
    }

}
