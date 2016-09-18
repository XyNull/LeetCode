/**
 * Created by XyNull on 2016/9/18.
 */
public class Main {
    public static void main(String[] args){
        int[] a = {2,1,2,0,1};
        maxProfit(a);
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0 || n == 1) return 0;
        int[] dp = new int[n];
        dp[0] = 0;

        int min = prices[0];
        for (int i = 1; i < n; i++) {
            if(prices[i] - min > 0){
                dp[i] = dp[i-1] + (prices[i] - min);
                min = prices[i];
            }
            else dp[i] = dp[i-1];

            if(prices[i] < min)
                min = prices[i];
        }
        return dp[n-1];
    }
}
