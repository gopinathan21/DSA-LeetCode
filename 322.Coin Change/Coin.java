import java.util.Arrays;

public class Coin {

    public int coinChange(int[] coins, int amount) 
    {
        if (amount < 0) return -1; // Edge case
        if (amount == 0) return 0; // Base case

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE); // Initialize with a large value

        dp[0] = 0; // 0 coins needed to make amount 0

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] a = {5,6,9};
        Coin c = new Coin();
        int r = c.coinChange(a, 11);
        System.out.println(r);
    }
}

//The code written

// if(amount < 1) return 0;
//       int[] dp = new int[amount+1];

//       for(int i = 0 ; i <= amount ; i++)
//       {
//         int min = Integer.MAX_VALUE;
//         for(int j = 0; j < coins.length ; j++)
//         {
//             int iMin = Integer.MAX_VALUE;
//             int remaning = i;
//             if(coins[j] <= i)
//             {

//                 remaning -= coins[j];
//                 iMin = 1;
//                 while (remaning != 0) 
//                 {
//                     if(dp[remaning] > 0)
//                     {
//                         iMin += dp[remaning];
//                         remaning -= remaning;
//                     }   
//                     else{
//                         iMin = Integer.MAX_VALUE;
//                         break;
//                     }
//                 }
//             }
//             min = Math.min(min , iMin );
            
//         }
//         dp[i] = min!=Integer.MAX_VALUE ? min:-1;
//       }

//       return dp[amount];