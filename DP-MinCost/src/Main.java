/**
 * Created by XyNull on 2016/9/15.
 */
public class Main {
    public int findMinCost(String A, int n, String B, int m, int insert, int delete, int replace) {
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i <= n; i++){
            dp[i][0] = delete * i;
        }
        for(int j = 0; j <= m; j++){
            dp[0][j] = insert * j;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(a[i-1] == b[j-1])
                    dp[i][j] = dp[i-1][j-1];
                else dp[i][j] = dp[i-1][j-1] + replace;
                dp[i][j] = Math.min(Math.min(dp[i][j-1] + insert, delete + dp[i-1][j]),dp[i][j]);
            }
        }
        return dp[n][m];
    }
}
