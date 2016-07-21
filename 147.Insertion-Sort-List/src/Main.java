
public class Main {
    public ListNode insertionSortList(ListNode head) {
    	if(head==null)return null;
    	ListNode point = head.next;
    	ListNode compare = head;
    	
    	for(; point!=null; point = point.next){
    		for(; compare!=point; compare = compare.next) {
    			
    			if(point.val < compare.val){
    			point.val = point.val ^ compare.val;
    			compare.val = compare.val ^ point.val;
    			point.val = compare.val ^ point.val;
    			}
    			
    		}
    		compare = head;
    	}
    	
        return head;
    }
}
