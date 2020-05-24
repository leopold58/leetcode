import java.util.Stack;

public class shuzu_meiriwendu {
    /**
     * 739每日温度
     * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
     * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
     */
    //暴力解法
//    public int[] dailyTemperatures(int[] T) {
//        int[] res=new int[T.length];
//        if (T==null)
//            return res;
//        int n=T.length;
//        for(int i=0;i<n;i++){
//            int k=i;
//            for (; k < n; k++) {
//                if (T[k]>T[i])
//                    break;
//            }
//            if (k==n)
//                k=k-1;
//            if(T[k]>T[i])
//                res[i]=k-i;
//            else
//                res[i]=0;
//        }
//        return res;
//    }
    //栈1
//    public int[] dailyTemperatures(int[] T) {
//        int[] ans = new int[T.length];
//        Stack<Integer> stack = new Stack();
//        for (int i = T.length - 1; i >= 0; --i) {
//            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) stack.pop();
//            ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;
//            stack.push(i);
//        }
//        return ans;
//    }
    //栈2
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int length = T.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int pre = stack.pop();
                result[pre] = i - pre;
            }
            stack.add(i);

        }
        return result;
    }



    public static void main(String[] args) {
        shuzu_meiriwendu solution = new shuzu_meiriwendu();
        int[] temp={73, 74, 75, 71, 69, 72, 76, 73};
        int[] res=solution.dailyTemperatures(temp);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
