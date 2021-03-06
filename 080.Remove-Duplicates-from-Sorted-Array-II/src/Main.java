
public class Main {
	public static void main(String[] args){
		int[] a = {1,1,1,2};
		removeDuplicates(a);
	}
	
    public static int removeDuplicates(int[] nums) {
    	int length = nums.length;
        if(nums.length == 0|| nums.length == 1) return length;
        
        int i = 0;
        for(int j = 1; j < length;){
        	int times = 0;
        	while(nums[j] == nums[i]){
        		j++;
        		times++;
        		if(j > length-1) break;
        	}
        	
        	if(j > length-1){
        		if(j-i == 1) break;
        		else return i+2;
        	}
        	
        	switch(times){
        	case 0:{i++;
        			j++;
        			break;
        		}
        	
        	case 1:{i = j;
        			j++;
        			break;
        		}
        	
        	default:{i += 2;
        			int tempi = i, tempj = j;
        			while(tempj < length){
        				nums[tempi] = nums[tempj];
        				tempi++;
        				tempj++;
        			}
        			length -= j-i;
        			j = i+1;
        			break;
        		}
        	}
        }
        
        return i+1;
    }
}
