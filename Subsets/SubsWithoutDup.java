import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsWithoutDup {
  static  public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        bt(result , new ArrayList<Integer>() , nums ,0);
        return result;
    }
   static public void bt( List<List<Integer>> result , List<Integer> temp , int[] nums , int start)
    {
        result.add(new ArrayList<Integer>(temp)); 
        
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            bt(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1); 
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,2,2};
        subsetsWithDup(nums);
    }

}
