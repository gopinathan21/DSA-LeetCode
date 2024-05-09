public class GCDofStrings {
    public int gcd(int a, int b) {
        int gcd = 1;
        for(int i = 1 ; i <= a && i <=b ; i++)
        {
            if(a % i == 0 && b % i == 0)
            {
                gcd = i;
            }
        }
        return gcd;
    }

    public String gcdOfStrings(String str1, String str2) {
        int gcd = gcd(str1.length(), str2.length());
        String s1 = str1.substring(0, gcd);
        if (str1.equals(s1.repeat(str1.length() / gcd)) && str2.equals(s1.repeat(str2.length() / gcd))) {
            return s1.toString();
        } else {
            return "";
        }
    }

    public static void main(String args[]) {
        String s2 = "ABC";
        String s1 = "ABCABC";

        GCDofStrings g = new GCDofStrings();
        String s = g.gcdOfStrings(s1, s2);
        System.out.println(s);
    }
}

// // My solution but worst
// public int gcd(int a , int b)
// {
// int gcd = 1;
// for (int i = 1 ; i <= a && i<= b; i++)
// {
// if(a % i == 0 && b % i == 0)
// {
// gcd = i;
// }
// }
// return gcd;
// }
// public String gcdOfStrings(String str1, String str2) {
// StringBuilder s = new StringBuilder();
// int i = 0;
// int len = gcd(str1.length() , str2.length());
// while (i < len && i < str1.length() && i < str2.length()) {
// if (str1.charAt(i) == (str2.charAt(i))) {
// s.append(str1.charAt(i));
// } else {

// break;
// }
// i++;
// }
// i = 0;
// int inner = 0;
// if (s.length() != 0) {
// while (i < str1.length()) {
// if (inner < s.length()) {
// if (s.charAt(inner) == str1.charAt(i)) {
// inner++;
// }
// else{
// s.setLength(0);
// return s.toString();

// }
// }
// if (inner >= s.length()) {
// inner = 0;
// }
// i++;
// }
// i = 0;
// inner = 0;
// while (i < str2.length()) {
// if (inner < s.length()) {
// if (s.charAt(inner) == str2.charAt(i)) {
// inner++;
// }
// else{
// s.setLength(0);
// return s.toString();

// }
// }
// if (inner >= s.length()) {
// inner = 0;
// }
// i++;
// }
// }

// return s.toString();
// }