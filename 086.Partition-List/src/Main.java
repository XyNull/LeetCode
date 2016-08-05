
public class Main {
    public ListNode partition(ListNode head, int x) {
    	if(head==null) return null;
    	
        ListNode more = new ListNode(0);
        ListNode tmp = head;
        int i=0;
        
        while(tmp.val < x){
        	tmp = tmp.next;
        	if(tmp == null) return head;
        }

        while(head.val >= x){
        	head = head.next;
        	if(head == null) return tmp;
        	i++;
        }
        
        if(i>0){
        	more.next=tmp;
        	for(; more.next!=head; more=more.next){}
        }
        
        ListNode less = head, point = head;
        
        while(point.next != null){
        	if(point.next.val>=x){
        		more.next = point.next;
        		more = more.next;
        	}
        	else {
        		less.next = point.next;
        		less = less.next;
        	}
        	point = point.next;
        }
        
        less.next = tmp;
        more.next = null;
        
        return head;
    }
}
