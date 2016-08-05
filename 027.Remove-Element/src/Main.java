
public class Main {
	public static void main(String[] args){
		int[] a = {3,2,2,3};
		int b = removeElement(a,3);
	}
	
    public static int removeElement(int[] nums, int val) {
    	for(int i = 0;i <= nums.length-1;i++){
    		if(nums.length == 1) break;
    		
    		if(nums[i] != val && i !=0 ){
    			int j = i;
    			for(int k = i-1;k >= 0; k--){
    				nums[k] = nums[k] + nums[j];
    				nums[j] = nums[k] - nums[j];
    				nums[k] = nums[k] - nums[j];
    				j--;
    			}
    		}
    	}
    	
    	int res = 0;
    	for(int i:nums){
    		if(i == val) break;
    		res++;
    	}
    	
        return res;
    }
}
