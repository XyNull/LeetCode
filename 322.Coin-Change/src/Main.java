import java.util.Arrays;

/**
 * Created by XyNull on 2016/9/12.
 */
public class Main {
    public static void main(String[] args){
        int[] a = {3,4,7};
        coinChange(a,33);
    }

    public static int coinChange(int[] penny, int aim){
        if(aim == 0) return 0;
        int n = penny.length;
        int[][] dp = new int[n][aim+1];
        int i = n-1;
        //init
        while(i >= 0){
            dp[i--][0] = 0;
        }
        i = aim;
        while(i >= 0){
            dp[0][i] = i%penny[0] == 0? i/penny[0]: aim+1;
            i--;
        }

        //generate
        for(i = 1; i < n; i++){
            for(int j = 1; j <= aim; j++){
                dp[i][j] = aim+1;
                if(penny[i] > j) dp[i][j] = dp[i-1][j];
                else dp[i][j] = Math.min(dp[i-1][j],dp[i][j-penny[i]]+1);
            }
        }
        return dp[n-1][aim] == aim+1? -1 : dp[n-1][aim];
    }
}
