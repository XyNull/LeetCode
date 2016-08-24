import java.util.ArrayList;
import java.util.List;

public class Main {
	public List<Integer> Traversal(TreeNode root){
		List<Integer> re = new ArrayList<Integer>();
		
		if(root==null) return null;

		if(root.left != null) re.addAll(inorderTraversal(root.left));		
		re.add(root.val);
		if(root.right != null) re.addAll(inorderTraversal(root.right));
		
		return re;
	}
	
    public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> re = new ArrayList<Integer>();
		if(root==null) return re;
		re = Traversal(root);
		return re;
    }
}
