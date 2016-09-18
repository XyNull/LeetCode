/**
 * Created by XyNull on 2016/9/17.
 */
public class Main {
    public int maxSubArray(int[] nums) {
        int currect = nums[0], overall = nums[0];
        for(int i = 1; i < nums.length; i++){
            currect = Math.max(nums[i], currect + nums[i]);
            overall = Math.max(currect, overall);
        }
        return overall;
    }
}
