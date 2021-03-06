import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {
    public void connect(TreeLinkNode root) {
    	if(root == null || (root.left == null && root.right == null))
			return;
        Queue<TreeLinkNode> currect = new LinkedList<TreeLinkNode>();
        int cur = 0,next = 0;
        
        if(root.left != null){
        	currect.add(root.left);
        	cur++;
        }
        if(root.right != null){
        	currect.add(root.right);
        	cur++;
        }
        
        while(!currect.isEmpty()){
        	TreeLinkNode temp = currect.poll();
        	cur--;
        	if(cur > 0) temp.next = currect.peek();
        	if(temp.left != null){
        		currect.add(temp.left);
        		next++;
        	}
        	if(temp.right != null){
        		currect.add(temp.right);
        		next++;
        	}
        	if(cur == 0) {
        		cur = next;
        		next = 0;
        	}
        }
    }
}
