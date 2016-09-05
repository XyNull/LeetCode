
public class Main {
	public static void main(String[] args){
		TreeNode a = new TreeNode(1);
		a.left = new TreeNode(-2);
		a.right = new TreeNode(3);
		boolean res = hasPathSum(a,-1);
	}
	
    public static boolean hasPathSum(TreeNode root, int t) {
        if(root == null) return false;
        return helper(root,0,t) == t;
    }
    
    public static int helper(TreeNode root,int i,int t){
    	if(root == null) return i;
    	
    	i += root.val;
    	int save = i;
    	
    	if(root.left != null && root.right == null){
    		i = helper(root.left,i,t);
    	}
    	
    	if(root.left == null && root.right != null){
    		i = helper(root.right,i,t);
    	}
    	
    	if(root.left != null && root.right != null){
    		i = helper(root.left,i,t);
        	
        	if(i != t) {
        		i = save;
        		i = helper(root.right,i,t);
        	}
    	}
    	
    	return i;
    }
}