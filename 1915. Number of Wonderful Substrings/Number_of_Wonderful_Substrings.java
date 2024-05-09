import java.util.*;
public class Number_of_Wonderful_Substrings {
        public long wonderfulSubstrings(String word) {
            int[] count = new int[1024]; // 2^10 to store bitmask frequencies
        count[0] = 1;
        long result = 0;
        int bitmask = 0;

        for (char ch : word.toCharArray()) {
            int charIndex = ch - 'a';
            bitmask ^= 1 << charIndex;
            result += count[bitmask];
            for (int i = 0; i < 10; i++) {
                result += count[bitmask ^ (1 << i)];
            }
            count[bitmask]++;
        }

        return result;
        }                
        public static void main(String args[])
        {
            String s = "aabb";
            Number_of_Wonderful_Substrings n = new Number_of_Wonderful_Substrings();
            long result = n.wonderfulSubstrings(s);
            System.out.println(result);
        }                                                                             
}


//Time limit exceeded
// long count = 0;
//             for(int i = 0 ; i < word.length() ; i++)
//             {
//                 HashSet<Character> sett = new HashSet<>(); 
//                 for(int j = i; j < word.length() ; j++)
//                 {
//                     char c = word.charAt(j);
//                     if(sett.contains(c))
//                     {
//                         sett.remove(c);
//                     }
//                     else
//                     {
//                         sett.add(c);
//                     }
//                     count = sett.size() <= 1? count + 1: count; 
//                 }
                
//             }
//             return count;