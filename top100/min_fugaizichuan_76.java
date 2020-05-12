import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class min_fugaizichuan_76 {
    public static String minWindow(String s,String t){
        if(s.length()==0||t.length()==0){
            return "";
        }
        Map<Character,Integer> dictT=new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            int count=dictT.getOrDefault(t.charAt(i),0);
            dictT.put(t.charAt(i),count+1);
        }
        int required=dictT.size();
        int l=0,r=0;
        int formed=0;
        Map<Character,Integer> windowCounts=new HashMap<Character,Integer>();
        int[] ans={-1,0,0};
        while (r<s.length()){
            char c=s.charAt(r);
            int count=windowCounts.getOrDefault(c,0);
            windowCounts.put(c,count+1);

            if (dictT.containsKey(c)&&windowCounts.get(c).intValue()==dictT.get(c).intValue()){
                formed++;
            }

            while (l<=r&&formed==required){
                c=s.charAt(l);
                if (ans[0]==-1||r-l+1<ans[0]){
                    ans[0]=r-l+1;
                    ans[1]=l;
                    ans[2]=r;
                }

                windowCounts.put(c,windowCounts.get(c)-1);
                if (dictT.containsKey(c)&&windowCounts.get(c).intValue()<dictT.get(c).intValue()){
                    formed--;
                }

                r++;
            }
        }
        return ans[0]==-1? "":s.substring(ans[1],ans[2]+1);
    }
    //优化 滑动窗口
//    public static String minWindow(String s, String t) {
//        if (s == null || s == "" || t == null || t == "" || s.length() < t.length()) {
//            return "";
//        }
//        //用来统计t中每个字符出现次数
//        int[] needs = new int[128];
//        //用来统计滑动窗口中每个字符出现次数
//        int[] window = new int[128];
//
//        for (int i = 0; i < t.length(); i++) {
//            needs[t.charAt(i)]++;
//        }
//
//        int left = 0;
//        int right = 0;
//
//        String res = "";
//
//        //目前有多少个字符
//        int count = 0;
//
//        //用来记录最短需要多少个字符。
//        int minLength = s.length() + 1;
//
//        while (right < s.length()) {
//            char ch = s.charAt(right);
//            window[ch]++;
//            if (needs[ch] > 0 && needs[ch] >= window[ch]) {
//                count++;
//            }
//
//            //移动到不满足条件为止
//            while (count == t.length()) {
//                ch = s.charAt(left);
//                if (needs[ch] > 0 && needs[ch] >= window[ch]) {
//                    count--;
//                }
//                if (right - left + 1 < minLength) {
//                    minLength = right - left + 1;
//                    res = s.substring(left, right + 1);
//
//                }
//                window[ch]--;
//                left++;
//
//            }
//            right++;
//
//        }
//        return res;
//    }
}
