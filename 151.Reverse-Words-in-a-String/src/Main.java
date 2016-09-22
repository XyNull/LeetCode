import java.util.*;

/**
 * Created by XyNull on 2016/9/21.
 */
public class Main {
    public static String reverseWords(String s) {
        s = s.trim();
        if(s.length() == 0 || s.length() == 1)
            return s;

        StringBuffer res = new StringBuffer();
        for (int head = s.length() - 1; head >= 0; head--){
            if(s.charAt(head) == 32) continue;
            int tail = head;
            while (head >= 0 && s.charAt(head) == 32) head--;
            res.append(s.substring(head,tail)).append(" ");
        }
        return res.toString().trim();
    }
}
