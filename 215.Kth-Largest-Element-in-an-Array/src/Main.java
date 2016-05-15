
public class Main {
	public int[] quickSort(int[] nums , int x , int y){
        if(x<y){		
        	int i = x,j = y; 
        	int tmp = nums[x]; 
        	
        	while(i< j){
        		tmp = nums[i];
        			while(i < j && nums[j] >= tmp) j--;
        					if(i < j) nums[i++] = nums[j];
        			while(i < j && nums[i] < tmp) i++;
        					if(i < j) nums[j--] = nums[i];
        }
        	nums[i] = tmp;
        	
        	if( i-1 >= 0 ) quickSort(nums,x,i-1);
        	if( i+1<= nums.length-1 ) quickSort(nums,i+1,y);
        	return nums;
        }
        
        return nums;
	}
	
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 1) return nums[0];
        quickSort(nums ,0 ,nums.length-1);
        return nums[nums.length - k ];
    }
}
