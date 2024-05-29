import java.util.*;
public class subsetsbit {
static    public int beautifulSubsets(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < (1 << nums.length); i++) {
            ArrayList<Integer> a = new ArrayList<Integer>();
            boolean isB = true;
            for (int j = 0; j < nums.length; j++) {
                if (((1 << j) & i) != 0) {
                    int cur = nums[j];
                    if (a.contains(cur - k) || a.contains(cur + k)) {
                        isB = false;
                        break;
                    }
                    a.add(cur);
                }
            }
            count = isB ? count++:count;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {2,4,6};
        int r = beautifulSubsets(a, 2);
        System.out.println(r);
    }
}
