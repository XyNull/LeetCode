
public class Main {

	public ListNode reverseList(ListNode head) {
		ListNode point;
		ListNode next;
		
		if(head == null) return null;
		point = head;
		head = head.next;
		point.next = null;
		
		while(head != null){
			next = head.next;
			head.next = point;
			point = head;
			head = next;
		}
		
        return point;
    }

    public boolean isPalindrome(ListNode head) {
    	ListNode tail = head , mid = head;
    	if(head == null) return false;
    	double legth = 1,tmp = 1;
    	
    	while(tail.next != null){
    		tail = tail.next;
    		legth++;
    	}
    	
    	while(tmp < legth/2){
    		mid = mid.next;
    		tmp++;
    	}
    	reverseList(mid);
    	while(head != null || tail != null){
    		if(head.val != tail.val) return false;
    		head = head.next;
    		tail = tail.next;
    	}
    	return true;
    }
}
