
public class Main {
    public int[] plusOne(int[] d) {
    	int length = d.length;
    	if(length == 0) return d;
    	
    	if(length == 1){
    		if(d[0] == 9){
    			int[] alone = {1,0};
    			return alone;
    			}
    		
    		else{
    			d[0]++;
    			return d;
    		}
    	}
    	
    	d[length-1]++;
    	
    	for(int i = length-1;i>0;i--){
    		if(d[i] == 10){
    			d[i] = 0;
    			d[i-1]++;
    			if(d[i-1] < 10) break;
    		}
    		else break;
    	}
    	
    	if(d[0] == 10){
    		int[] res = new int[length+1];
    		res[0] = 1;
    		int i = 1;
    		for(int j:d){
    			res[i] = j;
    		}
    		return res;
    	}
    	
    	return d;
    }
}
