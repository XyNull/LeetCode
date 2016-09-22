import java.util.HashMap;

/**
 * Created by XyNull on 2016/9/21.
 */
public class Main {
    public static void main(String[] args){
        String s = "ab";
        String b = "ca";
        isIsomorphic(s,b);
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        HashMap<Character,Character> map = new HashMap<>();

        for (int i = 0; i < ss.length; i++) {
            if(!map.containsKey(ss[i])){
                if(map.containsValue(tt[i]))
                    return false;
                map.put(ss[i],tt[i]);
            }

            else if(!map.get(ss[i]).equals(tt[i]))
                    return false;
        }
        return true;
     }
}
