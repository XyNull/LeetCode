
public class Main {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head, slow = head;
		if (head == null || head.next == null)
			return null;
		int legth = 0, point = 1;
		while (fast != null) {
			fast = fast.next;
			legth++;
		}
		if (legth - n != 0) {
			while (point != legth - n) {
				slow = slow.next;
				point++;
			}
			slow.next = slow.next.next;
		} else
			head = head.next;
		return head;
	}
}
