import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeHelper {
	public static void main(String[] args){
		int[] a = {2,1,3,4,7,9,1,2,0,1,5,0,0,8,8,0,0,0,0,7};
		TreeNode b = treeBuilder(a);
		TreeNode c = new TreeNode(0);
		c.left = b;
	}
	
	public static TreeNode treeBuilder(int[] n){
    	if(n.length == 0)
			return null;
    	
    	TreeNode root = new TreeNode(n[0]);
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(root);
    	int num = 1;
    	
    	//levels traversal
    	while(num < n.length){
    		TreeNode currect = q.poll();
    		if(n[num] == 0) num++;
    		else currect.left = new TreeNode(n[num++]);
    		
    		if(num > n.length-1) break;
    		
    		if(n[num] == 0) num++;
    		else currect.right = new TreeNode(n[num++]);
    		
    		if(currect.left != null) q.add(currect.left);
    		if(currect.right != null) q.add(currect.right);
    	}
    	
    	return root;
	}
}
