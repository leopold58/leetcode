import java.util.Scanner;

public class yidongling {
    //283.移动零
    public static void moveZeros(int[] nums){
        if (nums==null)
            return;
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0)
                nums[k++]=nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            nums[i]=0;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int[] nums=new int[len];
        for (int j = 0; j < len; j++) {
            nums[j]=in.nextInt();
        }
        moveZeros(nums);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
