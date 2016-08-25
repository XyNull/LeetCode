import java.util.LinkedList;
import java.util.Queue;

public class Recursion {
	public static TreeNode treeBuilder(int[] n){
    	if(n.length == 0)
			return null;
    	
    	TreeNode root = new TreeNode(n[0]);
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(root);
    	int num = 1;
    	
    	//levels traversal
    	while(num < n.length){
    		TreeNode currect = q.poll();
    		if(n[num] == 0) num++;
    		else currect.left = new TreeNode(n[num++]);
    		
    		if(num > n.length-1) break;
    		
    		if(n[num] == 0) num++;
    		else currect.right = new TreeNode(n[num++]);
    		
    		if(currect.left != null) q.add(currect.left);
    		if(currect.right != null) q.add(currect.right);
    	}
    	
    	return root;
	}
	
	public static void main(){
		
	}
	
	public void connect(TreeLinkNode root) {
    	if(root == null || (root.left == null && root.right == null))
			return;
    	TreeLinkNode existSon,existNext = root.next;

		if(root.left != null && root.right != null){
			root.left.next  = root.right;
			existSon = root.right;
		}
		else{
			if(root.left != null) existSon = root.left;
			else existSon = root.right;
		}

    	if(existNext != null){
    		while(existNext.left == null && existNext.right == null){
    			existNext = existNext.next;
    			if(existNext == null) break;
    		}
    		
    		if(existNext.left != null) 
    			existSon.next = existNext.left;
    		else existSon.next = existNext.right;
    	}
    	
    	connect(root.left);
    	connect(root.right);
    }
}
