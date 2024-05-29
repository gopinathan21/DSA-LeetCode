import java.util.*;

public class PalindromPartioning {
    static public List<List<String>> partition(String s) {
            List<List<String>> result =  new ArrayList<List<String>>(); 
            bt(result , new ArrayList<String>(), s , 0);
            return result;
        }

   static public void bt(List<List<String>> result , List<String> temp , String s , int start  )
        {
            if(start == s.length()){
                result.add(new ArrayList<>(temp));
            }
            for(int i = 0 ; i < s.length() ; i++)
            {
                String sub = s.substring(i , i+1);
                if(isPalindrome(sub))
                {
                    temp.add(sub );
                    bt(result , temp , s , i+1 );
                    temp.remove(temp.size()-1);
                } 
            }
        }

   static public boolean isPalindrome(String s) {
        int r = s.length() - 1;
        int l = 0;
        while (l < r) {
            if (!(s.charAt(l) == s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

   public static void main(String[] args) {
        String s = "aabb";
        partition(s);
    }

}
