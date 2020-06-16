import java.util.*;

public class ZiMuYiWeiFenZu49mi {
    /**
     * 49字母异位词分组
     * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
     * 示例:
     * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
     * 输出:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     * @param strs
     * @return
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null)
            return new ArrayList<>();
        Map<String,List> ans = new HashMap<String,List>();
        for(String s:strs){
            char[] chs=s.toCharArray();
            Arrays.sort(chs);
            String Key = String.valueOf(chs);
            if(!ans.containsKey(Key))
                ans.put(Key,new ArrayList());
            ans.get(Key).add(s);
        }
        return new ArrayList(ans.values());
    }
}
