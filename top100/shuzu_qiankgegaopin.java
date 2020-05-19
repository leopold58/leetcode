import java.util.*;

public class shuzu_qiankgegaopin {
    /**
     * 347前k个高频元素
     * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
     * 要求：你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
     *      你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
     *      题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。
     *      你可以按任意顺序返回答案。
     */
    public List topKFrequent(int[] nums,int k){
        HashMap<Integer,Integer> count = new HashMap<>();
        for (int n:nums ) {
            count.put(n,count.getOrDefault(n,0)+1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1,n2)->( count.get(n1) - count.get(n2) ));

        for (int n:count.keySet() ) {
            heap.add(n);
            if (heap.size() > k){
                heap.poll();
            }
        }
        List<Integer> res = new LinkedList<>();
        while (!heap.isEmpty()){
            res.add(heap.poll());
        }
        Collections.reverse(res);
        return res;
        /*  如果输出要求数组，改变写法为
        int[] res=new int[k];
        while (!heap.isEmpty()&&k>=0){
            res[--k]=heap.poll();
        }
        return res;
         */
    }

}
