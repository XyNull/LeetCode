
public class better {	
	
	public static void main(String[] args){
		int[] a = {1,1,1,2,2,2};
		removeDuplicates(a);
	}
	
	public static int removeDuplicates(int[] nums){
    	int length = nums.length;
        if(nums.length == 0|| nums.length == 1) return length;
        
        int i = 0,times = 0;
        for(int j = 1; j < length; j++){
        	if(nums[j] == nums[i]){
        		times++;
        		if(times<2) nums[++i] = nums[j];
        	}
        	
        	else{
        		nums[++i] = nums[j];
        		times = 0;
        	}
        }
        return i+1;
	}
}
