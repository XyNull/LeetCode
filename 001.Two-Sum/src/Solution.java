import java.util.Hashtable;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int Pointer = 0;
		int[] temp = new int[2];
        
        Hashtable<Integer, Integer> Hmap = new Hashtable<Integer, Integer>();
        
        while(Pointer <= nums.length){
        	int temp1 = target - nums[Pointer];
        	if(Hmap.get(temp1) != null){
        		temp[0] = Pointer;
        		temp[1] = Hmap.get(temp1); 
        		return temp;
        	}
        	else{
        		Hmap.put(nums[Pointer], Pointer);
        	}
        	Pointer++;
        }
		return temp;
    }
}