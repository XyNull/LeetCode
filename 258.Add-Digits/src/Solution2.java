
public class Solution2 {
	    public static int addDigits(int num) {
	    	int num2 = 0;
	    	int temp = 0;
	    	
	        if(num< 10){
	        	return num;
	        }
	        
	        else{
				for(num2 = num % 10 ; num >= 10 ; ){
					num = num / 10 ;
					temp = num % 10;
					num2 += temp;
				}
				
				if(num2 >= 10) num2 = addDigits(num2); 
		        return num2;
	        
	   }
	}
}