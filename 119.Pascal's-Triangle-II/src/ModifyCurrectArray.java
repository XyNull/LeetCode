import java.util.ArrayList;
import java.util.List;

public class ModifyCurrectArray {
	
	public static List<Integer> getRow(int n) {
		List<Integer> cur = new ArrayList(n+1);
		for(int i = 0; i <= n; i++) 
			cur.add(1);
	
		if(n == 0) return cur;
    
		for(int i = 1; i <= n; i++)
			for(int j = i-1; j > 0; j--)
				cur.set(j,cur.get(j)+cur.get(j-1));
    
		return cur;
	}
}
