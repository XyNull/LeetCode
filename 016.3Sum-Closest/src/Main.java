import java.math.*;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		int[] a = {1,1,1,0};
		threeSumClosest(a,100);
	}
	
    public static int threeSumClosest(int[] n, int t) {
    	int length = n.length;
    	if(length <= 3) return n[0]+n[1]+n[2];
    	
    	Arrays.sort(n);
    	int res = 0;
    	int diff = 9999;
    	
loopi:   for(int i = 0; i < length; i++){ 	
        	int j = i+1,k = length-1;
				
loopq:			while(k > j){
    				int cur = n[k]+n[j]+n[i];
    				
    				if(cur == t) return t;
    				
    				if(cur < t){
    					if(Math.abs(cur-t) < diff){
    						diff = Math.abs(cur-t);
    						res = cur;
    					}
    					j++;
    				}
    				
    				else{
    					if(Math.abs(cur-t) < diff){
    						diff = Math.abs(cur-t);
    						res = cur;
    					}
    					k--;
    				}
    				/*qȥ��
					while(n[k] == n[k+1]){
						k++;
						if(k > length-2) break loopq;
					}
    				k++;*/
        		}
        	
			/*pȥ��
				while(n[p] == n[p+1]){
					p++;
					if(p > length-2) break loopp;
				}*/
        	
        	if(i >= length-1) break;
			//iȥ��
			while(n[i] == n[i+1]){
				i++;
				if(i > length-2) break loopi;
			}
        }
        return res;
    }
}
