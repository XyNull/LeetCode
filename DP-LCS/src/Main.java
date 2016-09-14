/**
 * Created by XyNull on 2016/9/14.
 */
public class Main {
    public static void main(String[] args){
        String a = "asdftfg";
        String b = "qwertyu";
        findLCS(a,7,b,7);
    }
    public static int findLCS(String a, int n, String b, int m){
        int[][] dp = new int[n][m];

        //init
        boolean same = false;
        for(int i = 0; i < n; i++){
            if(same || a.charAt(i) == b.charAt(0)) {
                same = true;
                dp[i][0] = 1;
            }
            else dp[i][0] = 0;
        }

        same = false;
        for(int j = 0; j < m; j++){
            if(same || b.charAt(j) == a.charAt(0)){
                same = true;
                dp[0][j] = 1;
            }
            else dp[0][j] = 0;
        }

        //generate
        for(int i = 1; i < n; i++){
            for (int j = 1; j < m; j++){
                if(a.charAt(i) == b.charAt(j))
                    dp[i][j] = dp[i-1][j-1] + 1;
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n-1][m-1];
    }
}
