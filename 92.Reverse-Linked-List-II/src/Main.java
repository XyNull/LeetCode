
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

    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if(head==null||head.next==null) return head;
    	ListNode nodeM=head,nodeN=head;
    	
        for(int i=1;i<m-1;i++){
        	nodeM=nodeM.next;
        }
        
        for(int i=1;i<n;i++){
        	nodeN=nodeN.next;
        }
        
        ListNode tmpN=nodeN.next,tmpM=nodeM.next;
        nodeN.next=null;
        
        if(m!=1){
        	reverseList(nodeM.next);
        	nodeM.next=nodeN;
        	tmpM.next=tmpN;
        	return head;
        }
        else {
        	reverseList(head);
        	nodeM.next=tmpN;
        	return nodeN;
        }
    }
}
