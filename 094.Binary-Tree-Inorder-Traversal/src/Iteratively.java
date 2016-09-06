import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iteratively {
    public static List<Integer> inorderTraversal(TreeNode root) {
    	if(root == null) return new ArrayList<Integer>();
    	List<Integer> res = new ArrayList<Integer>();
    	Stack<TreeNode> nodes = new Stack<TreeNode>();

    	while(!nodes.isEmpty() || root != null){
    		if(root != null) {
				nodes.push(root);
				root = root.left;
    		}
    		else{
				root = nodes.pop();
				res.add(root.val);
				root = root.left;
        }
    	}
    	
    	return res;
    }
}
