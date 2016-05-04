
public class Main {
	
	public static void main(String[] args) {
	}
	
		public int maxDepth(TreeNode root) {
			int depth = 0;
			if(root == null) return 0;
				else depth++;
				return depth + max( maxDepth(root.left) , maxDepth(root.right) ) ;
		}
		
		public int max(int a,int b){
			if(a>=b) return a;
			else return b;
		}
		
}
