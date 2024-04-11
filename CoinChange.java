import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {5, 5, 5, 5, 10, 25, 1}; // Coin denominations in random order
        int target = 30; // Target amount

        int numCoins = findMinimumCoins(coins, target);
        System.out.println("Minimum number of coins needed: " + numCoins);
    }

    public static int findMinimumCoins(int[] coins, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int coin : coins) {
            for (int i = coin; i <= target; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[target] == Integer.MAX_VALUE ? -1 : dp[target];
    }
}
