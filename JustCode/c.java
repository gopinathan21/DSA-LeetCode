import java.util.*;
 class c {
        public String reverseVowels(String s) {
            StringBuilder sb = new StringBuilder();
            ArrayList<Character> a = new ArrayList<>();
            a.add('a');
            a.add('e');
            a.add('i');
            a.add('o');
            a.add('u');
            char[] arr = new char[s.length()];
            for(int i = 0 ; i < s.length() ; i++)
            {
                if(a.contains(Character.toLowerCase(s.charAt(i)) ))
                {
                    arr[i] = s.charAt(i);
                    sb.append('0');
                }
                else
                {
                    sb.append(s.charAt(i));
                }   
            }
            int l = 0;
            int r = arr.length -1;
            while(l < sb.length())
            {
                if(sb.charAt(l) == '0')
    
                {
                    while(!a.contains(Character.toLowerCase(arr[r])))
                    {
                        System.out.println(arr[r]);
                        r--;
                    }
                    System.out.println(arr[r]);
                    sb.deleteCharAt(l);
                    sb.insert(l ,arr[r]);
                    r--;
                }
                l++;
            }
            return sb.toString();
        }
        public static void main(String[] a)
        {
            String s = "aA";
            c q = new c();
            String r =  q.reverseVowels(s);
            System.out.println(r);
        }
    }

