/**
 * Created by XyNull on 2016/9/19.
 */
public class Main {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return n;
        int[] dp = new int[n];
        dp[0] = 1;
        int res = 0;

        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if(nums[i] > nums[j] && dp[j] > max)
                    max = dp[j];
            }
            dp[i] = max + 1;
            if(dp[i] > res)
                res = dp[i];
        }
        return res;
    }
}
