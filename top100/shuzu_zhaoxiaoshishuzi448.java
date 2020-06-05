import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class shuzu_zhaoxiaoshishuzi448 {
    /**
     *448找到所有数组中消失的数字
     * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
     * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
     * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
     * @param nums
     * @return
     */
//    public List<Integer> findDisappearedNumbers(int[] nums){
//        List<Integer> list=new ArrayList<>();
//        HashMap<Integer,Boolean> map = new HashMap<>();
//        for(int num:nums){
//            map.put(num,true);
//        }
//        for(int i=1; i <= nums.length;i++){
//            if(!map.containsKey(i)){
//                list.add(i);
//            }
//        }
//        return list;
//    }
    public List<Integer> findDisappearedNumbers(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i])-1;
            if (nums[newIndex]>0){
                nums[newIndex] *= -1;
            }
        }
        List<Integer> res=new LinkedList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i-1]>0){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        shuzu_zhaoxiaoshishuzi448 mp=new shuzu_zhaoxiaoshishuzi448();
        List<Integer> res=new ArrayList<>();
        res = mp.findDisappearedNumbers(nums);
        System.out.println(res);
    }

}
