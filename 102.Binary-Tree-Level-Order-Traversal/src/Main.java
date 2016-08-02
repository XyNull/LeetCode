import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null) return new ArrayList<List<Integer>>();
	
		List<List<Integer>> res = new ArrayList<List<Integer>>();     
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
    
		int currectLevel = 1;
		int nextLevel = 0;
    
		ArrayList<Integer> levelres = new ArrayList<Integer>();  
    
		while(!queue.isEmpty()){
			
			TreeNode currect = queue.poll();
			currectLevel--;
			levelres.add(currect.val);
        
			if(currect.left != null){
				queue.add(currect.left);
				nextLevel++;
			}
        
			if(currect.right != null){
				queue.add(currect.right);  
				nextLevel++;  
			}  
          
			if(currectLevel == 0){  
				currectLevel = nextLevel;  
				nextLevel = 0;  
				res.add(levelres);  
				levelres = new ArrayList<Integer>();  
			}
		}
		
    return res;  
	}
}
