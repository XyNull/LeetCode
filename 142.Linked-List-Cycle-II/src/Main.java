
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
    
    public ListNode getCycleNode(ListNode head){
    	ListNode p1=head,p2=head;
    	
        for(;p2.next!=null; p1=p1.next){
        	p2=p2.next.next;
        	if(p2==p1) break;
        }
        
        return p1;
    }

    public ListNode detectCycle(ListNode head) {
        if(!hasCycle(head)) return null;
        
        ListNode cNode = getCycleNode(head);
        ListNode pointC = cNode.next;
        
        for(;true;head=head.next){
        	if(head==cNode) return cNode;
        	for(;pointC!=cNode;pointC=pointC.next){
        		if(head==pointC)
        			return pointC;
        	} 
        	pointC=cNode.next;
        }	
    }
}
