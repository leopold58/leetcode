import java.util.Scanner;
//012 荷兰三色国旗问题
public class yansefeilei {
    public static void sortColors(int[] nums) {
        int left=0,right=nums.length-1;
        int curr=0,temp=0;
        while(curr<=right){
            if(nums[curr]==0){
                temp=nums[curr];
                nums[curr]=nums[left];
                nums[left]=temp;
                curr++;
                left++;
            }
            else if (nums[curr]==2){
                temp=nums[curr];
                nums[curr]=nums[right];
                nums[right]=temp;
                right--;
            }
            else {
                curr++;
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int[] nums=new int[num];
        for (int i = 0; i < num; i++) {
            nums[i]=in.nextInt();
        }
//        int[] nums={1,0,0,2};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
