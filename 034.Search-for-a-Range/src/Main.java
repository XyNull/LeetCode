
public class Main {
	public static void main(String[] args){
		int[] a = {1,2};
		searchRange(a,2);
	}
	
    public static int[] searchRange(int[] n, int t) {
        int start = 0, end = n.length-1;
        int[] error = {-1,-1};
        
        if(t < n[0] || t > n[end]) return error;
        
        while(true){
        	int mid = (start + end) / 2;
        	
        	if(n[mid] == t) {
        		start = end = mid;
        		break;
        	}
        	
        	if(end - start <= 1) {
        		if(n[start] == t) end = start;
        		else if(n[end] == t) start = end;
        			else return error;
        		break;
        	}
        	
        	if(n[mid] > t) end = mid;
        	else start = mid;
        }
        
        while(start > 0 && n[start-1] == t)
        	start--;
            
        while(end < n.length-1 && n[end+1] == t) 
        	end++;
        
        int[] res = {start,end};
        return res;
    }
}
