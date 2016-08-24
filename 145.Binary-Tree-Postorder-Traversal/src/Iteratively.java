import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class Iteratively {
    public List<Integer> postorderTraversal(TreeNode root) {
    	if(root == null) return new ArrayList<Integer>();
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> nodes = new Stack<TreeNode>();
    	nodes.push(root);
    	
    	while(!nodes.isEmpty()){
    		TreeNode pointer = nodes.pop();
    		if((pointer.left != null && pointer.left.val != 0) 
    		|| (pointer.right != null && pointer.right.val != 0)){
    			nodes.push(pointer);
    			if(pointer.right != null) nodes.push(pointer.right);
    			if(pointer.left != null) nodes.push(pointer.left);
    		}
    		else {
    			res.add(pointer.val);
    			pointer.val = 0;
    		}
    	}
    	return res;
    }
}
