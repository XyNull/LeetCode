
public class BinarySearch {
    public int findMin(int[] n) {
    	int length = n.length;
    	if(length == 1) return n[0];
    	if(length == 2) return Math.min(n[0],n[1]);

    	int start = 0, end = length-1;
    	
    	while(start < end-1){ //此处-1为了防止比较队列中只剩下两个值
    		if(n[end] > n[start]) break;
    		
        	int mid = (start + end) / 2;
        	if(n[mid] < n[start]) end = mid;
        	if(n[mid] > n[start]) start = mid;
        	while(n[mid] == n[start] && start < mid) start++;
    	}
    	
    	return Math.min(n[start], n[end]);
    }
}
