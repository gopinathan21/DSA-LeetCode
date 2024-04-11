public class RemoveKDigits {

    public String removeKdigits(String num, int k) {
        if (num.length() <= k)
        return "0";
    
    StringBuilder sb = new StringBuilder(num);
    int i = 0;
    
    while (k > 0 && i < sb.length() - 1) {
        if (sb.charAt(i) > sb.charAt(i + 1)) {
            sb.deleteCharAt(i);
            if (i > 0)
                i--;
            k--;
        } else {
            i++;
        }
    }
    
    // If k is not exhausted, remove the remaining k digits from the end
    while (k > 0 && sb.length() > 0) {
        sb.deleteCharAt(sb.length() - 1);
        k--;
    }
    
    // Remove leading zeros
    while (sb.length() > 1 && sb.charAt(0) == '0') {
        sb.deleteCharAt(0);
    }
    
    return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String s = "112";
        RemoveKDigits r = new RemoveKDigits();
        String re = r.removeKdigits(s, 2);
        System.out.println(re);
    }
};
