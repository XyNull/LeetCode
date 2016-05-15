
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
}
