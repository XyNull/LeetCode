
public class Main {
	public int maxDepth(TreeNode root) {
		int depth = 0;
		if(root == null) return 0;
			else depth++;
			return depth + Math.max( maxDepth(root.left) , maxDepth(root.right) ) ;
	}
	
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        if( Math.abs( maxDepth(root.right) - maxDepth(root.left) ) <= 1 ){
        	if( isBalanced(root.left) && isBalanced(root.right) ) 
        		return true;
        	}
        
        return false;
        }
}
