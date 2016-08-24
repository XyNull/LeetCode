import java.util.LinkedList;
import java.util.Queue;

public class Cycling {
	public boolean isSymmetric(TreeNode root){
		if(root == null) 
			return true;
		
		Queue<TreeNode> x = new LinkedList<TreeNode>();
		Queue<TreeNode> y = new LinkedList<TreeNode>();
		
		if(root.left == null && root.right == null) 
			return true;
		else if(root.left == null || root.right == null)
			return false;
		
		x.offer(root.left);
		y.offer(root.right);
		
		while(!x.isEmpty() && !y.isEmpty()){
			TreeNode left = x.poll();
			TreeNode right = y.poll();
			if(left == null && right == null) continue;
			if(left == null ^ right == null) return false;
			
			if(left.val != right.val) return false;
			
			x.offer(left.left);
			x.offer(left.right);
			y.offer(right.right);
			y.offer(right.left);
		}
		return true;
	}
}
