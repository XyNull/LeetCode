
public class Main {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) 
        	return head;
        
        ListNode slow = head, fast = head.next, output = head.next;
        while(slow != null && fast!=null){
        	
        	if(fast.next != null)
        		if(fast.next.next != null)
        			slow.next = fast.next.next;
        		else slow.next = fast.next;
        	else slow.next = null;
        	
        	ListNode tmp = fast.next; 
        	fast.next = slow;
        	slow = tmp;
        	
        	if(slow != null)
        		fast = slow.next;
        }
        
        return output;
    }
}
