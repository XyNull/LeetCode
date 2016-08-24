import java.util.LinkedList;
import java.util.Queue;

public class LevelTraversal {
    public void connect(TreeLinkNode root) {
    	if(root == null || (root.left == null && root.right == null))
    			return;
    	
        Queue<TreeLinkNode> currect = new LinkedList<TreeLinkNode>();
        currect.add(root.left);
        currect.add(root.right);
        int cur = 2,next = 0;
        
        while(!currect.isEmpty()){
        	TreeLinkNode temp = currect.poll();
        	cur--;
        	if(cur > 0) temp.next = currect.peek();
        	if(temp.left != null){
        		currect.add(temp.left);
        		currect.add(temp.right);
        		next += 2;
        	}
        	if(cur == 0) {
        		cur = next;
        		next = 0;
        	}
        }
    }
}
