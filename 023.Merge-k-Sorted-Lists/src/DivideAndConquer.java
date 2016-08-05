
public class DivideAndConquer {
	
		public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0) {
			return null;
    	}
    	return mergeHelper(lists, 0, lists.length - 1);
	}

private ListNode mergeHelper(ListNode[] lists, int start, int end) {
    	if (start == end) {
    		return lists[start];
    	}
    
    	int mid = start + (end - start) / 2;
    	ListNode left = mergeHelper(lists, start, mid);
    	ListNode right = mergeHelper(lists, mid + 1, end);
    	return mergeTwoLists(left, right);
	}

	private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				tail.next = list1;
				tail = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				tail = list2;
				list2 = list2.next;
			}
		}
		if (list1 != null) {
			tail.next = list1;
		} else {
			tail.next = list2;
		}
		
		return dummy.next;
	}
}
