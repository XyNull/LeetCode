
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

    public void reorderList(ListNode head) {
    	if(head==null||head.next==null||head.next.next==null) return;
    	
    	ListNode half=head;
    	ListNode tail=head.next.next;
        while(tail.next!=null){
        	half=half.next;
        	if(tail.next.next==null){
        		tail=tail.next;
        		break;
        	}
        	tail=tail.next.next;
        }
        half=half.next;
        reverseList(half);
        
        while(true){
        	ListNode tmph=head.next;
        	if(tmph==null) break;
        	head.next=tail;
        	head=tmph;
        	
        	ListNode tmpt=tail.next;
        	if(tmpt==null) break;
        	tail.next=head;
        	tail=tmpt;
        }
    }
}
