/**
 * Created by XyNull on 2016/9/18.
 */
public class Main {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int max = nums[0], global = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tmp = max;
            max = Math.max(Math.max(nums[i], max * nums[i]), min * nums[i]);
            min = Math.min(Math.min(nums[i], tmp * nums[i]), min * nums[i]);
            global = Math.max(global,max);
        }
        return global;
    }
}
