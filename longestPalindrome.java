import java.util.HashMap;

public class longestPalindrome {
        public int longestPalindromeS(String s) {
            int count = 0;
            boolean oddFound = false;
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (int i : map.values()) {
                if(i >= 2 )
                {
                    if (i % 2 == 0)
                   { count = count + i;}
                    else
                    {
                        count = count + i - 1;
                        i = 1;
                        
                    }
                }
                
                if (i == 1 && !oddFound) {
                    count++;
                    oddFound = true;
                }
    
            }
    
            return count;
        }
        public static void main(String[] args)
        {
            String s= "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
            longestPalindrome l = new longestPalindrome();
            int result = l.longestPalindromeS(s);
            System.out.println(result);
        }
    }

