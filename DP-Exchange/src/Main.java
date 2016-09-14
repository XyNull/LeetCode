/**
 * Created by XyNull on 2016/9/12.
 */
public class Main {
    public static void main(String[] args){
        int[] a = {3,4,7};
        countWays(a,3,33);
    }

    public static int countWays(int[] penny, int n, int aim) {
        int[][] dp = new int[n][aim+1];
        int i = n-1;
        //init
        while(i >= 0){
            dp[i--][0] = 1;
        }
        i = aim;
        while(i > 0){
            dp[0][i] = i--%penny[0] == 0? 1: 0;
        }

        //generate
        for(i = 1; i < n;i++){
            for(int j = 1;j <= aim;j++){
                int temp = j-penny[i];
                dp[i][j] = temp >= 0? dp[i-1][j] + dp[i][temp]: dp[i-1][j];
            }
        }

        return dp[n-1][aim];
    }
}
