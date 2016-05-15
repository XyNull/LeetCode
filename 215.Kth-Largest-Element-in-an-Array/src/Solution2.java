import java.util.Arrays;

public class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        return nums[nums.length - k ];
    }
}