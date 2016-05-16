
public class Main {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

		ListNode headTmp = new ListNode(-1);
		ListNode point = headTmp;
		
		//用point将两段链表排序连接
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				point.next = l1;
				l1 = l1.next;
			}
			else{
				point.next = l2;
				l2=l2.next;
			}
			point = point.next;
		}
		
		if(l1 == null) {
			if(l2!=null) point.next = l2;
			}
		if(l2 == null) {
			if(l1!=null)point.next=l1;
			}
		
		return headTmp.next;
    }
}
