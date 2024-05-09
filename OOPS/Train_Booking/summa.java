import java.util.ArrayList;

public class summa {
    
    public int numRescueBoats(int[] people, int limit) {
        int[] buckets = new int[limit+1];

        for(int p : people) buckets[p]++;

        // System.out.println(Arrays.toString(buckets));

        int start = 0;
        int end = buckets.length - 1;
        int boats = 0;

        while(start <= end) {
            //make sure the start always point to a valid number
            while(start <= end && buckets[start] <= 0) start++;

            //make sure end always point to valid number
            while(start <= end && buckets[end] <= 0) end--;

            //no one else left on the ship, hence break.
            if(buckets[start] <= 0 && buckets[end] <= 0) break;

            boats++;

            // both start and end can carry on the boat
            if(start + end <= limit) buckets[start]--; 
            
            buckets[end]--;
        }
        return boats;
    }
    public static void main(String[] args) {
        summa s = new summa();
        int[] a = {3,8,7,1,4};
        int limit = 9;
        //s.numRescueBoats(a, limit);
        System.out.println(s.numRescueBoats(a, limit));
    }
}
