public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode empty = null;
        boolean carry = false;											//��λ����
        int trueadd; 															//��ǰλ��ʵ��
        	
        if(l1 == null && l2 == null){                                //������Ϊ��
        	return empty;
        			}
        
        else{
        	
    		ListNode re = new ListNode( (l1.val+l2.val) % 10 );
    		ListNode re1 = re ;
    		
			if(l1.val + l2.val >= 10){ 										 //�жϽ�λ
				carry = true;            
	}
    		
			l1 = l1.next;
			l2 = l2.next;
    		
        	while(l1 != null || l2 != null){                               //һ����ǰ�ڵ���ֵ
        		
        		if(l1 == null){l1 = new ListNode(0);}
        		if(l2 == null){l2 = new ListNode(0);}                                   //��λ��0
        		
        			if(carry){
        	    		re.next = new ListNode( (l1.val + l2.val + 1 ) % 10) ;
        				trueadd = l1.val + l2.val + 1;
        				carry = false;
        				}
        			else {
        	    		re.next = new ListNode((l1.val + l2.val ) % 10) ;
        				trueadd=l1.val + l2.val;
        			}																	 //����
        			
        			if(trueadd >= 10){ 										 //�жϽ�λ
        				carry = true;            
        	}
        			
        			re = re.next;
        			l1 = l1.next;
        			l2 = l2.next;
        	  }																			//����������
        	if(carry){
	    		re.next = new ListNode(1);
        	}
            return re1;
        }
    }
}