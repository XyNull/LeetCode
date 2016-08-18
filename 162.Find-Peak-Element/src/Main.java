
public class Main {
    public int findPeakElement(int[] n) {
    	int start = 0, end = n.length-1;
    	if(end == 0) return 0;
    	if(end == 1){
    		if(n[0] > n[1]) return 0;
    		else return 1;
    	}
    	
    	while(true){
    		int mid = (start + end) / 2;
    		if(mid == start) break;
    		
    		if(n[mid] > n[mid+1] && n[mid] > n[mid-1])
    			return mid;
    		else if(n[mid] < n[mid+1] && n[mid] > n[mid-1])
    				start = mid;
    			 else if(n[mid] > n[mid+1] && n[mid] < n[mid-1])
    				 end = mid;
    			 else start = mid;
    	}
    	
    	if(n[start] > n[end]) return start;
		else return end;
    }
}
