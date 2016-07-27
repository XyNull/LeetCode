
public class Main {
    public TreeNode sortedListToBST(ListNode head) {
        
        return buildTree(head,null);
    }
    
    public TreeNode buildTree(ListNode start, ListNode end){
    	if(start  == end) return null;
    	
    	ListNode slow = start;
    	ListNode fast = start;
    	
    	while(fast != end && fast.next != end){
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	
    	TreeNode root = new TreeNode(slow.val);
    	
    	root.left = buildTree(start,slow);
    	root.right = buildTree(slow.next,end);
    	
    	return root;
    }
}
