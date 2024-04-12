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

        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }


    public static void main(String[] args) {
        String s = "357224";
        RemoveKDigits r = new RemoveKDigits();
        String re = r.removeKdigits(s, 3);
        System.out.println(re);

    };
}
// // Another logic
// if (num.length() <= k)
// return "0";
// int j = 1;
// StringBuilder sb = new StringBuilder(num);
// while (k > 0 && sb.length() >= 2) {
// char one = sb.charAt(0);
// char two = sb.charAt(j);
// int oneD = Character.getNumericValue(one);
// int twoD = Character.getNumericValue(two);
// if (twoD > oneD) {
// sb.deleteCharAt(j);
// k--;
// j--;
// } else if (twoD == oneD)
// j++;
// else {
// sb.deleteCharAt(0);
// k--;
// j--;
// }
// }
// if (sb.length() != 1) {
// for (int i = 0; i < sb.length(); i++) {
// if (Character.getNumericValue(sb.charAt(0)) != 0) {
// break;
// }
// sb.deleteCharAt(0);
// i = 0;
// }
// }
// return sb.toString();
