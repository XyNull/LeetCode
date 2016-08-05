public class Solution {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode empty = null;
        boolean carry = false;											//进位变量
        int trueadd; 															//当前位真实和
        	
        if(l1 == null && l2 == null){                                //两链表为空
        	return empty;
        			}
        
        else{
        	
    		ListNode re = new ListNode( (l1.val+l2.val) % 10 );
    		ListNode re1 = re ;
    		
			if(l1.val + l2.val >= 10){ 										 //判断进位
				carry = true;            
	}
    		
			l1 = l1.next;
			l2 = l2.next;
    		
        	while(l1 != null || l2 != null){                               //一个当前节点有值
        		
        		if(l1 == null){l1 = new ListNode(0);}
        		if(l2 == null){l2 = new ListNode(0);}                                   //空位赋0
        		
        			if(carry){
        	    		re.next = new ListNode( (l1.val + l2.val + 1 ) % 10) ;
        				trueadd = l1.val + l2.val + 1;
        				carry = false;
        				}
        			else {
        	    		re.next = new ListNode((l1.val + l2.val ) % 10) ;
        				trueadd=l1.val + l2.val;
        			}																	 //计算
        			
        			if(trueadd >= 10){ 										 //判断进位
        				carry = true;            
        	}
        			
        			re = re.next;
        			l1 = l1.next;
        			l2 = l2.next;
        	  }																			//常规计算结束
        	if(carry){
	    		re.next = new ListNode(1);
        	}
            return re1;
        }
    }
}