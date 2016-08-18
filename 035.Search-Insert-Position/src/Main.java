
public class Main {
    public int searchInsert(int[] n, int t) {
        int start = 0, end = n.length-1;
        if(t < n[0]) return 0;
        if(t > n[end]) return end+1;
        
        while(true){
        	int mid = (start + end) / 2;
        	
        	if(mid == start){
        		if(n[start] == t) return start;
        		else if(n[end] == t) return end;
        		else break;
        	}
        	
        	if(n[mid] > t) end = mid;
        	else if(n[mid] < t) start = mid;
        	else return mid;
        }
        
        return start+1;
    }
}
