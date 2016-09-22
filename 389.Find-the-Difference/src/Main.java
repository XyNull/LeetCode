/**
 * Created by XyNull on 2016/9/22.
 */
public class Main {
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int sSum = 0, tSum = 0;
        for (int i :
                ss) {
            sSum ^= i;
        }
        for (int i :
                tt) {
            tSum ^= i;
        }
        sSum ^= tSum;
        char res = (char) sSum;
        return res;
    }
}
