import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<List<Integer>> generate(int n) {
        if(n == 0)return new ArrayList();
        
        List<List<Integer>> res = new ArrayList();
        List<Integer> first = new ArrayList(),up;
        
        first.add(0,1);
        res.add(0,first);
        up = first;
        if(n == 1) return res;
        
        for(int i = 1; i <= n-1; i++){
        	List<Integer> cur = new ArrayList();
        	cur.add(0,1);
        	for(int j = 1;j < i;j++){
        		cur.add(up.get(j)+up.get(j-1));
        	}
        	cur.add(1);
        	res.add(cur);
        	up = cur;
        }
        
        return res;
    }
}
