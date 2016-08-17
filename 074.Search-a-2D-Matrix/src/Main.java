
public class Main {
	public static void main(String[] args){
		int[][] a = {{1,1}};
		searchMatrix(a,0);
	}
    public static boolean searchMatrix(int[][] m, int t) {
    	int por = m.length-1;
    	int lat = m[0].length-1;
    	if(por == 0 && lat == 0) return m[0][0] == t;
    	
    	while(t < m[0][lat]){
    		lat--;
    		if(lat <= 0) break;
    	}
    	
    	while(t < m[por][0]){
    		por--;
    		if(por <= 0) break;
    	}
    	
    	if(por >= 0 && lat >= 0){
    		if(t >= m[0][lat] && t <= m[por][lat]){
        		for(int i = 0; i <= por; i++){
        			if(m[i][lat] == t) return true;
        		}
        	}
        		
        	if(t >= m[por][0] && t <= m[por][lat]){
        		for(int i = 0; i <= lat; i++){
        			if(m[por][i] == t) return true;
        		}
        	}
    	}
    		
    	return false;
    }
}
