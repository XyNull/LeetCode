import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int[] a = {1,2,-2,-1};
		threeSum(a);
	}
	
    public static List<List<Integer>> threeSum(int[] n) {
    	int length = n.length;
    	if(length < 3) return new ArrayList();
    	
    	Arrays.sort(n);
    	List<List<Integer>> res = new ArrayList();
    	
loopi:   for(int i = 0; i < length; i++){ 	
        	int p = i+1,q = p+1;
        	
loopp:    	for(;p <= length-2; p++){
				q = p+1;
loopq:			while(q <= length-1){
    				if(n[q]+n[p]+n[i] == 0){
    					List<Integer> three = new ArrayList();
    					three.add(n[i]);
    					three.add(n[p]);
    					three.add(n[q]);
    					res.add(three);
    				}
    				
    				if(q == length-1) break;
    				//q去重
					while(n[q] == n[q+1]){
						q++;
						if(q > length-2) break loopq;
					}
    				q++;
        		}
        	
			//p去重
				while(n[p] == n[p+1]){
					p++;
					if(p > length-2) break loopp;
				}
        	}
        	
        	if(i >= length-1) break;
			//i去重
			while(n[i] == n[i+1]){
				i++;
				if(i > length-2) break loopi;
			}
        }
        
        return res;
    }
}
