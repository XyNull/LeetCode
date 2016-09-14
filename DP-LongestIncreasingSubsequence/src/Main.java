
/**
 * Created by XyNull on 2016/9/12.
 */
public class Main {
    public static void main(String[] args){
        int[] a = {1,3,5,2,4,2,23,23434,2352,23423,3424,53245,23423,23453,57654672,234,2344};
        getLIS(a,a.length);
    }

    public static int getLIS(int[] a, int n){
        int[] dp = new int[n];
        dp[0] = 1;
        int res = 0;

        for(int i = 1; i < n; ++i){
            int max = 0;
            for(int j = i - 1; j >= 0; --j){
                if(dp[j] > max && a[j] < a[i])
                    max = dp[j];
            }
            dp[i] = max + 1;
            if(dp[i] > res)
                res = dp[i];
        }

        return res;
    }
}
