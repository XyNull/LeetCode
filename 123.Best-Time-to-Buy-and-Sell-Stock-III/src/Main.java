/**
 * Created by XyNull on 2016/9/18.
 */
public class Main {
    public static void main(String[] args){
        int[] a = {1,4,2};
        maxProfit(a);
    }
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0 || n == 1) return 0;

        int[] head = new int[n];
        int[] tail = new int[n];
        int min = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] - min > head[i-1])
                head[i] = prices[i] - min;
            else
                head[i] = head[i-1];
            if(prices[i] < min)
                min = prices[i];
        }

        int max = prices[n-1];
        for (int i = n-2; i >= 0; i--) {
            if(max - prices[i] > tail[i+1])
                tail[i] = max - prices[i];
            else
                tail[i] = tail[i+1];
            if(max < prices[i])
                max = prices[i];
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, head[i]+tail[i]);
        }
        return res;
    }
}
