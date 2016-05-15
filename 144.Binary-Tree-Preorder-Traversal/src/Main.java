import java.util.ArrayList;
import java.util.List;

public class Main {
	public List<Integer> Traversal(TreeNode root){
		List resu = new ArrayList();
		if(root==null) return null;
		
		resu.add(root.val);
		if(root.left != null)    resu.addAll(preorderTraversal(root.left));
		if(root.right != null)  resu.addAll(preorderTraversal(root.right));
		
		return resu;
	}
	
	public List<Integer> preorderTraversal(TreeNode root) {
		List resu = new ArrayList();
		if(root==null) return resu;
		resu = Traversal(root);
		return resu;
	}
	
}