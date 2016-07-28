
public class Better {
	/*public static void main(String[] args){
		RandomListNode a = new RandomListNode(-1);
		RandomListNode b = new RandomListNode(8);
		RandomListNode c = new RandomListNode(7);
		//RandomListNode d = new RandomListNode(-3);
		//RandomListNode e = new RandomListNode(4);
		
		a.next = b;
		b.next = c;
		//c.next = d;
		//d.next = e;
		//e.next = null;
		
		a.random = c;
		b.random = b;
		c.random = null;
		//d.random = null;
		//e.random = a;
		
		doubleNode(a);
	}*/
	
	public RandomListNode doubleList(RandomListNode head){
	if(head == null) return null;
	RandomListNode output = head;
	
	while(head != null){
		RandomListNode tmp = new  RandomListNode(head.label);
		tmp.next = head.next;
		head.next = tmp;
		head = tmp.next;
	}
	
	return output;
}
	
	public RandomListNode copyRandomList(RandomListNode head){
		if(head == null) return null;
		doubleList(head);
		RandomListNode old = head , neo = head.next;
		
		while(true){
			if(old.random == null) 
				neo.random = null;
			else 
				neo.random = old.random.next;
			
			if(neo.next == null) break;
			neo = neo.next.next;
			old = old.next.next;
		}
		
		neo = head.next;
		RandomListNode output = neo;
		old = head;
		while(neo.next != null){
			old.next = old.next.next;
			neo.next = neo.next.next;
			old = old.next;
			neo = neo.next;
		}
		old.next = null;
		
		return output;
	}
}
