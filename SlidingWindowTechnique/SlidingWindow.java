import java.util.Arrays;

public class SlidingWindow {
    static public int naiveMax(int[] arr , int k )
    {
        int n = arr.length;
        int maxSum = 0;
        for(int i = 0 ; i <= n - 3; i++  )
        {
            int sum = 0;
            for(int j = i ; j < i + k ; j++)
            {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
        static public int maxSum(int[] arr , int k)
        {
            int maxSum = 0;
            int start = 0;
            int end = 0;
            int n = arr.length;
            int windowSum = 0;
            // First window sum
            while(end < k )
            {
                windowSum += arr[end++];
            }
            maxSum = Math.max(maxSum, windowSum);
            // consective window sum
            while(end < n )
            {
                //Subtract the previous value 
                windowSum -= arr[start++];
                windowSum += arr[end++];
                maxSum = Math.max(maxSum, windowSum);
            }
            return maxSum;
        }

        static public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = -1;
        int max = nums[1];
        int min = nums[0];
        int maxLength = 0;
       // 1,2,2,2,3,4,5,7
        for (int i = 2; i < nums.length; i++) {
            if (max - min == 1 ) {
                //System.out.println(left);
                maxLength = Math.max(maxLength, i - left + 1 );

            }
            if(max - min > 1){
                left++;
            }
           // System.out.println(maxLength);
           //System.out.println(max);
            max = Math.max(max, nums[i]);
            min = Math.min(nums[left], nums[i]);
        }
        return maxLength;
    }
    
        public static void main(String[] args)
        {
            StringBuilder s = new StringBuilder();
            s.de
            // int[] arr = {1,2,3,4,5,6};
            // int k = 3;
            // int result = maxSum(arr, k);
            // System.out.println(result);
            // int r = naiveMax(arr, k);
            // System.out.println(r);

            int[] arr = {1,2,2,2,2,2,2,2};
            int r = findLHS(arr);
            System.out.println(r);
        }
    
    
}
