
public class Traversal {
    public int findMin(int[] n) {
    	int length = n.length;
        if(length == 1) return n[0];
        
        for(int i = 0; i < length-1; i++){
        	if(n[i] <= n[i+1]) continue;
        	else return n[i+1];
        }
        
        return n[0];
    }
}
