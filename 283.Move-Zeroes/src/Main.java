
public class Main {
	
	public static void main(String[] args) {
		int[] a={2,0,1,0,3} ;
		moveZeroes(a);
	}
	
    public static void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        
        if(nums != null){
        while(fast < nums.length-1 && slow < nums.length-1 ){
    		while(nums[slow] != 0 &&  slow < nums.length-1) slow++; //slow to zero
    		fast = slow; //fast always after slow
        	while(nums[fast] == 0 && fast < nums.length-1) fast++; //fast to non-zero
        	
        		if(slow != fast){
        			nums[fast] += + nums[slow];
        			nums[slow] =nums[fast] - nums[slow];
        			nums[fast] -= nums[slow];
    			}
        	}
        }
    }
}