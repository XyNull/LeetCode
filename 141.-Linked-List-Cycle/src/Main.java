
public class Main {
    public boolean hasCycle(ListNode head) {
    	if(head==null) return false;
        for(ListNode p1=head,p2=head; p2.next!=null; p1=p1.next){
        	p2=p2.next.next;
        	if(p2==null) return false;
        	if(p2==p1) return true;
        }
        return false;
    }
}