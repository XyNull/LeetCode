
public class Main {
	public static void main(String[] args){
		int[] a = {1,3,5,0,0,0};
		int[] b = {0,2,4};
		merge(a,3,b,3);
	}
	
	public static void merge(int[] n1, int m, int[] n2, int n){
		if(n == 0)return;
		
		int i = m-1,j = n-1,k = m+n-1;
		while(i >= 0 && j >= 0){
			if(n1[i] < n2[j]){
				n1[k--] = n2[j--];
			}
			else{
				n1[k--] = n1[i--];
			}
		}
		if(j >= 0){
			while(j >= 0){
				n1[k--] = n2[j--];
			}
		}
	}
}
