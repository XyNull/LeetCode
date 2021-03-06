
public class Main {
	public static void main(String[] args){
		countPrimes(5);
	}

	public static int countPrimes(int n) {
		if(n==0) return 0;
		int i, tmp = 0;
		boolean nums[] = new boolean[n + 1];
		nums[0] = nums[1] = true;

		for (i = 2; i * i < n; i++) {
			if (!nums[i]) {
				for (int j = 2; i * j < n; j++) {
					nums[i * j] = true;
				}
			}
		}

		for (i = 0; i < n; i++)
			if (!nums[i])
				tmp++;

		return tmp;
	}

}
