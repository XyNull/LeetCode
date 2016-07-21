
public class Main {
	public class Solution {
		public boolean reach(TreeNode root, TreeNode point){
			if(root.val==point.val) return true;
			else 
				if(root.left!=null){
					if(reach(root.left,point))
						return true;
				}
				if(root.right!=null) {
					if(reach(root.right,point))
						return true;
				}
				return false;
		}
		
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(reach(root,p)&&reach(root,q)){
				if(root.left!=null)
					if(lowestCommonAncestor(root.left,p,q)!=null)
						return lowestCommonAncestor(root.left,p,q);
					else 
						if(root.right!=null)
							if(lowestCommonAncestor(root.right,p,q)!=null)
								return lowestCommonAncestor(root.right,p,q);
			return root;
	        }
	        return null;
	    }
	}
}
