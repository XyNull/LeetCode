/**
 * Created by XyNull on 2016/9/14.
 */
public class Main {
    public static void main(String[] args){
        int[] a = {1,2,3};
        maxValue(a,a,3,6);
    }
    public static int maxValue(int[] weight, int[] value, int n, int cap){
        int[][] dp = new int[n+1][cap+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= cap; j++){
                dp[i][j] = j - weight[i-1] < 0?
                        dp[i-1][j]: Math.max(dp[i-1][j],dp[i-1][j-weight[i-1]]+value[i-1]);
            }
        }
        return dp[n][cap];
    }
}