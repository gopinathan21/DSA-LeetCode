public class CompareVersionNumbers {
        public int compareVersion(String version1, String version2) {
    
         int i = 0;
         int j = 0;
         
         while(i < Math.max(version1.length() , version2.length()) || j < Math.max(version1.length() , version2.length()))
         {
            String a = "";
            String b = "";
            while(i < version1.length() && version1.charAt(i) != '.'  )
            {
                a += version1.charAt(i);
                i++;
            }
            i++;
            int num1 = a.length() > 0 ? Integer.parseInt(a) : 0;
    
            while( j < version2.length() && version2.charAt(j) != '.' )
            {
                b += version2.charAt(j);
                j++;
            }
            j++;
            int num2 = b.length() > 0 ? Integer.parseInt(b) : 0;
    
            if(num1 > num2) return 1;
            if(num2 > num1) return -1;
         }
         return 0;
        }

        public static void main(String[] args) {
            CompareVersionNumbers c = new CompareVersionNumbers();
            System.out.println(c.compareVersion("1.0.0", "1.2"));        }
    }

