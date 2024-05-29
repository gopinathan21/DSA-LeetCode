import java.util.*;

public class subsets {
   static public int subsetXORSum(int[] nums) {
        ArrayList<ArrayList<Integer>> i = new ArrayList<ArrayList<Integer>>();
        bt(i , new ArrayList<Integer>() , nums , 0);
        int sum = 0;
        for(ArrayList<Integer> each : i )
        {
            int subXOR = 0;
            for(int j : each)
            {
                subXOR ^= j;
            }
            sum += subXOR;
        }
        return sum;
    }
   static public void bt( ArrayList<ArrayList<Integer>> res ,ArrayList<Integer> t , int[] nums , int start )
    {
        res.add(new ArrayList<>(t));
        for(int i = start ; i < nums.length; i++)
        {
            t.add(nums[i] );
            bt(res ,t , nums , i+1 );
            t.remove(t.size() -1 );
        }   
    }

    static public 

    public static void main(String[] args) {
        int[] i = {1,3};
        subsetXORSum(i);
    }
}
