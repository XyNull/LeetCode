/**
 * Created by XyNull on 2016/9/15.
 */
public class Main {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0 || n == 1) return 0;
        int[] dp = new int[n];
        dp[0] = 0;

        int min = prices[0];
        for(int i = 1; i < n;i++){
            if(dp[i-1] == 0){
                if(prices[i] - min > 0)
                    dp[i] = prices[i] - min;
                else dp[i] = 0;
            }
            else dp[i] = Math.max(prices[i] - min,dp[i-1]);

            if(prices[i] < min)
                min = prices[i];
        }
        return dp[n-1];
    }
}
