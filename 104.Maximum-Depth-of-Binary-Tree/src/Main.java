
public class Main {
	public int maxDepth(TreeNode root) {
		int depth = 0;
		if(root == null) return 0;
			else depth++;
			return depth + Math.max( maxDepth(root.left), maxDepth(root.right) ) ;
	}
}
