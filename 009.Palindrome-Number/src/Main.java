
public class Main {
    public boolean isPalindrome(int x) {
    	if(x<0) return false;
    	if(x<10) return true;
    	int temp = x,i = 0;
    	
        while(true){
        	i += x%10;
        	x /= 10;
        	i *= 10;
        	if(x < 10) break;
        }
        i += x;
        return i == temp;
    }
}
