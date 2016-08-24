import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
		return helper(root.left,root.right);
	}
	
	public boolean helper(TreeNode left, TreeNode right){
		if(left == null && right == null) return true;
		else if(left == null || right == null) return false;
		
		if(left.val == right.val){
			return helper(right.right,left.left)&&helper(left.right,right.left);
		}
		
		return false;
	}
}
