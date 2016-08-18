
public class Main {
	public static void main(String[] args){
		int[] a = {1,0};
		missingNumber(a);
	}
    public static int missingNumber(int[] n) {
    	if(n.length == 1) 
    		if(n[0] == 0)return 1;
    		else return 0;
    	
        int xor = n[0];
        
        for(int i = 1; i < n.length; i++){
        	xor ^= n[i];
        }
        
        int fullXor = 0;
        for(int i = 1; i <= n.length; i++){
        	fullXor ^= i;
        }
        
        return xor^fullXor;
    }
}
