
public class Better {
	public ListNode insertionSortList(ListNode head){
		ListNode dummy = new ListNode(0);
		
		while(head!=null){
			ListNode point = dummy;
			for(; point.next!=null && point.next.val<head.val; point=point.next){}
			
			ListNode tmp = head.next;
			head.next = point.next;
			point.next = head;
			head = tmp;
		}
		
		return dummy.next;
	}
}
