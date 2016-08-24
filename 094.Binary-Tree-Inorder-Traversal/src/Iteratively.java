import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iteratively {
	public static void main(String[] args){
	TreeNode a = new TreeNode(2);
	a.left = new TreeNode(3);
	a.left.left = new TreeNode(1);
	inorderTraversal(a);
}
    public static List<Integer> inorderTraversal(TreeNode root) {
    	if(root == null) return new ArrayList<Integer>();
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> nodes = new Stack<TreeNode>();
    	nodes.push(root);
    	
    	while(!nodes.isEmpty()){
    		TreeNode pointer = nodes.pop();
    		if(pointer.left != null && pointer.left.val != 0){
    			nodes.push(pointer);
    			nodes.push(pointer.left);
    		}
    		else {
    			res.add(pointer.val);
    			pointer.val = 0;
    			if(pointer.right != null) nodes.push(pointer.right);
    		}
    	}
    	
    	return res;
    }
}
