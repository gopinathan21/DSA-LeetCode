import java.util.*;
public class wordBreak1 {
    static public boolean wordBreak(String s, List<String> wordDict) {
        return recursion(s, wordDict, 0, new Boolean[s.length()]);
    }

    static public boolean recursion(String s, List<String> dict, int start, Boolean[] memo) {
        if (start == s.length())
        
        {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String currentSubstring = s.substring(start, end);
            if (dict.contains(currentSubstring) ) {
                if(recursion(s, dict, end, memo))
                {
                memo[start] = true;
                return true;
                }
            }
        }
        
        memo[start] = false;
        return false;
    }
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
s.add("cats");
s.add("and");
s.add("cat");
s.add("sand");
s.add("dog");

        String si = "catsandog";
        boolean r = wordBreak(si, s);
        System.out.println(r);
    }
}
