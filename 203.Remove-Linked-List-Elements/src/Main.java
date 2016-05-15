
public class Main {
		public ListNode removeElements(ListNode head, int val) {
			if(head == null) return null;
			while(head.val == val){
				head = head.next;
				if(head == null) return null;
			}
			ListNode fast = head,slow = head;
			
			while(fast != null){
				while(fast.val != val) {
					fast = fast.next;
					if(fast == null)break;
				}
				while(slow.next !=null && slow.next != fast)
					slow = slow.next;
					if(slow.next != null)
						slow.next = slow.next.next;
					if(fast != null) fast = fast.next;
		}
			return head;
	}
}
