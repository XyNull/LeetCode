import java.util.Hashtable;

public class Main {
	
	public static void main(String[] args){
		RandomListNode a = new RandomListNode(-1);
		RandomListNode b = new RandomListNode(8);
		RandomListNode c = new RandomListNode(7);
		RandomListNode d = new RandomListNode(-3);
		RandomListNode e = new RandomListNode(4);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;
		
		a.random = e;
		b.random = d;
		c.random = null;
		d.random = null;
		e.random = a;
		
		copyRandomList(a);
	}
	
	public static RandomListNode copyNode(RandomListNode head){
		if(head == null) return null;
		
		RandomListNode copy = new  RandomListNode(head.label), 
				output = copy;
		head = head.next;
		
		while(head != null){
			copy.next = new RandomListNode(head.label);
			copy = copy.next;
			head = head.next;
		}
		
		return output;
	}
	
	public static RandomListNode copyRandomList(RandomListNode head) {
    	if(head == null) return null;
    	
    	RandomListNode copy = copyNode(head), point = head;
    	Hashtable<Integer, Integer> ways = new Hashtable<Integer, Integer>();
    	
    	//记录下每个节点ramdon的位置并存入hashtable
    	//key = 该节点到头的距离，value = 该节点ramdon到头的距离
    	for(int i = 0; point != null; point = point.next){
    		
    		//计算距离头的步数
    		int steps = 0;
    		RandomListNode step = head;
    		for(;step != point.random; step = step.next){
    			steps++;
    		}
    		
    		if(step == null) ways.put(i, -1);
    			else ways.put(i, steps);
    		
    		i++;
    	}
    	
    	point = copy;
    	//根据hashtable取值赋给copy链表相应位置
    	for(int i = 0; point != null; point = point.next){
    		int steps = 0, get = ways.get(i);
    		RandomListNode step = copy;
    		
    		if(get == -1) point.random = null;
    		
    		else {
    			for(;steps != get; steps++){
    				step = step.next;
    			}
    		
    			point.random = step;
    		}
    		i++;
    	}
    	
    	return copy;
    }
}
