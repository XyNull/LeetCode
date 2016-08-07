import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int pointer = 0;
		int[] temp = new int[2];
        
        Hashtable<Integer, Integer> Hmap = new Hashtable<Integer, Integer>();
        
        while(pointer <= nums.length){
        	int temp1 = target - nums[pointer];
        	if(Hmap.get(temp1) != null){
        		temp[0] = pointer;
        		temp[1] = Hmap.get(temp1); 
        		return temp;
        	}
        	else{
        		Hmap.put(nums[pointer], pointer);
        	}
        	pointer++;
        }
		return temp;
    }
}