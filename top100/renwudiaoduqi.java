import java.util.Arrays;

public class renwudiaoduqi {
    /**
     * 621任务调度器
     * 给定一个用字符数组表示的 CPU 需要执行的任务列表。其中包含使用大写的 A - Z 字母表示的26 种不同种类的任务。
     * 任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。CPU 在任何一个单位时间内都可以执行一个任务，或者在待命状态。
     * 然而，两个相同种类的任务之间必须有长度为 n 的冷却时间，因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。
     * 你需要计算完成所有任务所需要的最短时间。
     */
    public int leastInterval(char[] tasks,int n){
        int[] map=new int[26];
        for (char c: tasks) {
            map[c-'A']++;
        }
        Arrays.sort(map);   //排序之后，从最大的开始
        int time=0;
        while (map[25]>0){
            int i=0;
            while (i <= n){
                if (map[25] == 0)
                    break;
                if (i<26 && map[25-i] > 0)
                    map[25 - i]--;
                time++;
                i++;
            }
            Arrays.sort(map);    //次数多的为0之后，重新排序，此时数组最后为剩余的最大数
        }
        return time;
    }
}
