public class shuzu_xunzhaochongfushu {
    //287.寻找重复数
    /**
     * 第一种写法
     * @param nums
     * @return
     */
    public static int findDuplicate(int[] nums) {
        if(nums==null)
            return -1;
        int n=nums.length;
        int left=1,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int count=countNum(nums,left,mid);
            if(left==right){
                if(count>1){
                return left;
                }
                else{
                    break;
                }
            }
            if(count>(mid-left+1)){
                right=mid;
            }
            else{
                left=mid+1;
            }

        }
        return -1;
    }
    private static int countNum(int[] nums,int start,int end){
        int cou=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=start&&nums[i]<=end){
                cou++;
            }
        }
        return cou;
    }

    /**
     * 第二种写法
     * @param nums
     * @return
     */
//    public static int findDuplicate(int[] nums){
//        int len=nums.length;
//        int left=1;
//        int right=len-1;
//        while (left<right){
//            int mid=left+(right-left)/2;
//            int count=0;
//            for (int num:nums) {
//                if (num<=mid)
//                    count++;
//            }
//            if (count>mid){
//                right=mid;
//            }
//            else {
//                left=mid+1;
//            }
//        }
//        return left;
//    }
    public static void main(String[] args){
        int[] sum={1,3,4,2,2};
        System.out.println(findDuplicate(sum));
    }
}
