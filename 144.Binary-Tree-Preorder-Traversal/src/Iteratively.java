import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iteratively {
	public static void main(String[] args){
		TreeNode a = new TreeNode(2);
		a.left = new TreeNode(3);
		a.left.left = new TreeNode(1);
		preorderTraversal(a);
	}
	
    public static List<Integer> preorderTraversal(TreeNode root) {
    	if(root == null) return new ArrayList<Integer>();
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> nodes = new Stack<TreeNode>();
    	nodes.add(root);
    	
    	while(!nodes.isEmpty()){
    		TreeNode pointer = nodes.pop();
    		res.add(pointer.val);
    		if(pointer.right != null)
    			nodes.push(pointer.right);
    		if(pointer.left != null)
    			nodes.push(pointer.left);
    	}
    	return res;
    }
}
