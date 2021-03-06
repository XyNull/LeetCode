
public class Main {
	public ListNode merge(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

		ListNode headTmp = new ListNode(-1);
		ListNode point = headTmp;
		
		//用point将两段链表排序连接
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				point.next = list1;
				list1 = list1.next;
			}
			else{
				point.next = list2;
				list2=list2.next;
			}
			point = point.next;
		}
		
		if(list1 == null) {
			if(list2!=null) point.next = list2;
			}
		if(list2 == null) {
			if(list1!=null)point.next=list1;
			}
		
		return headTmp.next;
	}

	public ListNode sortList(ListNode head) {
		ListNode fast = head, slow = head;
		if(head == null || head.next == null) return head;
		
		//将slow移到中间节点
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		//将当前链表一分为二
		ListNode newList = slow.next;
		slow.next = null;
		
		head = sortList(head);
		newList = sortList(newList);
		
		return merge(head, newList);
	}
}
