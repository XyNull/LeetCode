
public class Main {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode fast ,slow = head;
        if(head == null) return null;
        	if(head.next == null)return head;
        		else fast = head.next;

        	while(fast != null){
        		while(fast.val == slow.val) {
        			fast = fast.next;
        			if(fast == null) break;
        			}
        		
        		slow.next = fast;
        		slow = slow.next;
        	}
        	return head;
    }
}
