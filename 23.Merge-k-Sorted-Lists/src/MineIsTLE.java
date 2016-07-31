
public class MineIsTLE {
	public static void main(String[] args){
		ListNode a = null; //new ListNode(1);
		ListNode b = new ListNode(1);
		ListNode[] lists = {a,b};
		mergeKLists(lists);
	}
	
	public static int minNode(ListNode[] lists){
		if(lists.length == 1) return 0;
		
		ListNode min = lists[0];
		int result = 0;
		
		for(int i = 0; i <= lists.length-1; i++){
			if(lists[i].val <= min.val) {
				min = lists[i];
				result = i;
			}
		}
		
		return result;
	}

    public static ListNode mergeKLists(ListNode[] lists) {
    	if(lists == null) return null;
    	
        int size = lists.length;
        if(size == 0) return null;
        
		ListNode dummy = new ListNode(-1);
		ListNode point = dummy;
		ListNode[] none = {};
		
		//���
		{int e = 0;
			for(ListNode node: lists){
				if(node == null) e++;
			}
			
			if(e > 0){
				if(lists.length-e > 0){
					ListNode[] newLists = new ListNode[lists.length-e];
					
					int i = 0;
					for(ListNode node: lists){
						if(node != null) {
							newLists[i] = node;
							i++;
						}
					}
					lists = newLists;
				}
				else lists = none;
			}
		}
		
		while(lists.length != 0){
			
			while(true){
				//ȡ����Сֵ�������Ƹ�����
				int min = minNode(lists);
				point.next = lists[min];
				point = point.next;
				lists[min] = lists[min].next;
			
				if(lists[min] == null) break;
			}
			
			//�������ʣ�������½������鲢���ԭ����
			if(lists.length-1 == 0) break;
			ListNode[] newLists = new ListNode[lists.length-1];
			int i = 0;
			for(ListNode node: lists){
				if(node != null) {
					newLists[i] = node;
					i++;
				}
			}
			lists = newLists;
		}
		
		return dummy.next;
    }
}
