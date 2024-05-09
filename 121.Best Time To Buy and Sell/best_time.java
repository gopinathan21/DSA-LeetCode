//This is DP approach

/**
 * best_time
 */
public class best_time {

    public int bst(int[] prices)
    {
        int min = prices[0];
        int n = prices.length;
        int[] dp = new int[n]; // to store the maximum profit
        
        for(int i = 1 ; i < n ; i++)
        {
            dp[i] = Math.max( dp[i-1] , prices[i] - min);
            min = Math.min(prices[i] , min);
        }

        return dp[n-1];
    }
    public static void main(String[] args) {
        int[] arr = {7 , 1, 3, 5, 6, 4};
        best_time b = new best_time();
        int r =  b.bst(arr);
        System.out.println(r);
    }
}