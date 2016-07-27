
public class Main {
    public ListNode rotateRight(ListNode head, int k) {
    	if(head == null)return null;
    	
    	ListNode point = head, tail = head;
    	
        int legth=1;
        for(; tail.next!=null; tail=tail.next){
        	legth++;
        }
        
        k=k%legth;
        int rotate = legth-k;
        for(int tmp=1; tmp<rotate; tmp++){
        	point = point.next;
        }
        
        if(rotate > 0 && rotate < legth){
        	ListNode newHead = point.next;
        	point.next = null;
        	tail.next = head;
        	return newHead;
        }
        else return head;
    }
}
