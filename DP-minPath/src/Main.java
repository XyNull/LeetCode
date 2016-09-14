/**
 * Created by XyNull on 2016/9/12.
 */
public class Main {
    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        getMin(a,3,3);
    }

    public static int getMin(int[][] map, int n, int m) {
        int[][] dp = new int[n][m];
        dp[0][0] = map[0][0];

        //init
        for(int i = 1; i < n; i++){
            dp[i][0] = map[i][0] + dp[i-1][0];
        }
        for(int j = 1; j < m;j++){
            dp[0][j] = dp[0][j-1] + map[0][j];
        }

        //generate
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                dp[i][j] = map[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }

        return dp[n-1][m-1];
    }
}
