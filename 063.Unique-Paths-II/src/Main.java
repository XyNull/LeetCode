/**
 * Created by XyNull on 2016/9/16.
 */
public class Main {
    public int uniquePathsWithObstacles(int[][] obs) {
        int m = obs[0].length, n = obs.length;
        if(m == 1 && n == 1) return obs[0][0] == 1? 0: 1;
        int[][] dp = new int[n][m];

        boolean shutdown = false;
        for(int i = 0; i < n; i++){
            if(obs[i][0] != 1 && !shutdown)
                dp[i][0] =1;
            else {
                dp[i][0] = -1;
                shutdown = true;
            }
        }

        shutdown = false;
        for(int j = 0; j < m; j++){
            if(obs[0][j] != 1 && !shutdown)
                dp[0][j] =1;
            else {
                dp[0][j] = -1;
                shutdown = true;
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(obs[i][j] == 1)
                    dp[i][j] = -1;
                else {
                    if(dp[i][j-1] == -1)
                        dp[i][j] = dp[i-1][j] == -1? -1: dp[i-1][j];
                    else dp[i][j] = dp[i-1][j] != -1? dp[i-1][j] + dp[i][j-1]: dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1] == -1? 0: dp[n-1][m-1];
    }
}
