
public class SolutionA {
	
	public static void main(String[] args){
	int[] nums = new int[8];
	nums[0]=1;
	nums[1]=2;
	nums[2]=3;
	nums[3]=4;
	nums[4]=5;
	nums[5]=6;
	nums[6]=7;
	nums[7]=8;
	rotate(nums,6);
	}
	
    public static void rotate(int[] nums, int k) {
    	int legth = nums.length;
    	if(legth==0)return;
    	
        k = k%legth;
        if(k==0)return;
        
        for(int i=k, j=0; i>0; i--){
        	int tmp = nums[j] ;
        	nums[j] = nums[legth-i];
        	nums[legth-i] = tmp;
        	j++;
        }
        
        int[] rear = new int[legth-k];
        for(int i=0; i<legth-k;i++){
        	rear[i]=nums[k+i];
        }
        
        if(rear.length>1) {
        	rotate(rear,k);
        	for(int i=0;i<legth-k;i++){
        		nums[k+i]=rear[i];
        	}
        }
    }
}
