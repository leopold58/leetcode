import java.util.ArrayList;
import java.util.List;

public class zimuyiweici438 {
    /**
     *
     * 438找到字符串中所有字母异位词
     * 给定一个字符串 s 和一个非空字符串 p，找到 s 中所有是 p 的字母异位词的子串，返回这些子串的起始索引。
     * 字符串只包含小写英文字母，并且字符串 s 和 p 的长度都不超过 20100。
     * 说明:
     * 字母异位词指字母相同，但排列不同的字符串。
     * 不考虑答案输出的顺序。
     * @param s
     * @param p
     * @return
     */

    //滑动窗口
    public List<Integer> findAnagrams(String s,String p){
        List<Integer> list = new ArrayList<>();
        if (s==null||s.length()==0||p==null||p.length()==0)
            return list;
        int[] hash=new int[256];
        for (char c:p.toCharArray()) {
            hash[c]++;
        }
        int left=0;
        int right=0;
        int count=p.length();
        while(right<s.length()){
            if (hash[s.charAt(right)]>0){
                count--;
            }
            hash[s.charAt(right)]--;
            right++;
            if (count==0){
                list.add(left);
            }
            if (right-left==p.length()){
                if (hash[s.charAt(left)] >= 0){
                    count++;
                }
                hash[s.charAt(left)]++;
                left++;
            }
        }
        return list;
    }
}
