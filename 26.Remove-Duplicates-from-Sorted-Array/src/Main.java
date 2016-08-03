
public class Main {
	public static void main(String[] args){
		int[] a = {1,2,3};
		removeDuplicates(a);
	}
	
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0|| nums.length == 1) return nums.length;
        
        int i = 0;
        for(int j = 1; j < nums.length;){
        	while(nums[j] == nums[i]){
        		j++;
        		if(j > nums.length-1) break;
        	}
        	
        	if(j > nums.length-1) break;
        	
        	nums[i+1] = nums[j];
        	i++;
        	
        	if(i == j) j = i+1;
        	else j++;
        }
        return i+1;
    }
}
