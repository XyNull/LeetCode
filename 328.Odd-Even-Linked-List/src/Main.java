
public class Main {
    public ListNode oddEvenList(ListNode head) {
    	if(head==null) return null;
    	ListNode odd = head;
    	ListNode even = head.next;
    	ListNode firstEven = even;
    	
    	while(odd!=null&&even!=null){
    		odd.next = even.next;
    		
    		if(odd.next==null) break;
    		odd = odd.next;
    		
    		even.next = odd.next;
    		even = even.next;
    	}
    	
    	odd.next = firstEven;
    	return head;
    }

}
