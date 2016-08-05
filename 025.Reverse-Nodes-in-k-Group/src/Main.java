
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
	
    public ListNode reverseKGroup(ListNode head, int k) {
    	if(head == null) return null;
    	
    	ListNode dummy = new ListNode(0);
    	dummy.next = head;
    	
    	ListNode pointA = head, pointB = head, pre = dummy;
    	
        while(true){
        	if(pointA == null) break;
        	
        	//按k分出一组
        	int i;
        	for(i = 1; i < k; i++){
        		pointB = pointB.next;
        		if(pointB == null) break;
        	}
        	if(i != k) break;
        	
        	//配置下组首，连接上组尾
        	ListNode next = pointB.next;
        	pointB.next = null;
        	pre.next = pointB;
        	
        	//翻转 连接下组首
        	reverseList(pointA);
        	pointA.next = next;
        	
        	//向下组移动
        	pre = pointA;
        	pointA = next;
        	pointB = next;
        }
        
        return dummy.next;
    }
}
