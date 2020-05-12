import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ziji_buchongfuziji {
//    public static List<List<Integer>> subsets(int[] nums){
//        List<List<Integer>> res=new ArrayList<>();
//        for (int i = 0; i <= nums.length; i++) {
//            List<Integer> list=new ArrayList<>();
//            zijipailie(nums,i,list);
//            res.add(list);
//        }
//        return res;
//    }
//    private static void zijipailie(int[] nums,int num,List<Integer> list){
//        if (num==0){
//            list.add(null);
//            return;
//        }
//        int[] res=new int[num];
//        for (int i = 1; i <= num; i++) {
//
//            list.add()
//        }
//
//    }


    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> output=new ArrayList<>();
        output.add(new ArrayList<Integer>());
        for (int num:nums){
            List<List<Integer>> newSubsets=new ArrayList<>();
            for (List<Integer> curr:output){
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr:newSubsets){
                output.add(curr);
            }
        }
        return output;
    }
    public static void main(String[] args){
        List<List<Integer>> result=new ArrayList<>();
//        Scanner in=new Scanner(System.in);
//        int numlength=in.nextInt();
//        int[] nums=new int[numlength];
//        for (int i = 0; i < numlength; i++) {
//            nums[i]=in.nextInt();
//        }
        int[] nums={1,2,3};
        result=subsets(nums);
        System.out.println(result);
    }
}
