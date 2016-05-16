
public class Main {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       	if(headA == null || headB == null)
    		return null;
    	if(headA == headB)
    		return headA;
    	
    	ListNode A = headA ,B = headB;
    	int legthA=0,legthB=0,diff;
    	
    	//�ж����������볤�Ȳ�
    	while(A != null){
    		A = A.next;
    		legthA++;
    	}
    	while(B != null){
    		B = B.next;
    		legthB++;
    	}
    	diff =Math.abs(legthA - legthB);
    	
    	//���ϳ�������ͷ�ƶ� ֱ������������ͬ
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
		//�жϺϲ���
			while(A != B){
				A = A.next;
				B = B.next;
			}
		return A;
    }
}
