
public class Main {
	public static void main(String[] args){
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		ListNode c = new ListNode(1);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(2);
		ListNode f = new ListNode(2);
		ListNode g = new ListNode(3);
		ListNode h = new ListNode(3);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		deleteDuplicates(a);
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
        	if(head == null||head.next == null) return head;
        	
        	ListNode dummy = new ListNode(0);
        	dummy.next = head;
        	
        	ListNode fast = head.next, slow = head, stop = dummy;
        	
        	while(fast != null){

        			while(fast.val == slow.val){
        				fast = fast.next;
        				slow = slow.next;
        				if(fast == null) break;
        			}
        			
        			if(fast == null) {
        				stop.next =null;
        				break;
        			}
        			
        			if(fast.next != null){
        				if(fast.val != fast.next.val){
        					if(stop.next != slow)
        						stop.next = fast;
        						stop = stop.next;
        				}
        				
        				if(stop.next == slow)//1122 122 11122233
        					stop = stop.next;
        					
        			}
        			
        			else						//12
        				if(stop.next != slow) 
        					stop.next = fast;

        			
        			fast = fast.next;
    				slow = slow.next;
        	}
        	return dummy.next;
    }
}
