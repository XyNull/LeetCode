
public class Main {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       	if(headA == null || headB == null)
    		return null;
    	if(headA == headB)
    		return headA;
    	
    	ListNode A = headA ,B = headB;
    	int legthA=0,legthB=0,diff;
    	
    	//判断两链表长度与长度差
    	while(A != null){
    		A = A.next;
    		legthA++;
    	}
    	while(B != null){
    		B = B.next;
    		legthB++;
    	}
    	diff =Math.abs(legthA - legthB);
    	
    	//将较长的链表头移动 直到两链表长度相同
		if (legthA >= legthB) {
			int tmp = 0;
			A = headA;
			B = headB;
			while(tmp != diff){
				tmp++;
				A = A.next;
			}
		}
    	else{
			int tmp = 0;
			A = headA;
			B = headB;
			while(tmp != diff){
				tmp++;
				B = B.next;
			}
    	}
		//判断合并点
			while(A != B){
				A = A.next;
				B = B.next;
			}
		return A;
    }
}
