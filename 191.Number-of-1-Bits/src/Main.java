
public class Main {
    // you need to treat n as an unsigned value
	public static void main(String[] args){
		long a = 858993459;
		a *= 5;
 		hammingWeight(a);
	}
	
    public static int hammingWeight(long n) {
        int res = 0;
        while(n != 0){
        	res += n & 1;
        	n >>>= 1;
        }
        return res;
    }
}
