/**
 * Created by XyNull on 2016/9/22.
 */
public class Main {
    public int getSum(int a, int b) {
        if(a == 0 || b == 0) return a|b;
        int carry = a & b;
        carry <<= 1;
        return getSum(a^b,carry);
    }
}
