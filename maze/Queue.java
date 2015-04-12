public class Queue {
    private newNode start;
    private newNode end;
    private int len;
    public Queue() {
	start = null;
	end = null;
	//start.setNext(end);
	len = 0;
    }
    public void enqueue(newNode n) {
	
	if(start ==null) {
	    start = n;
	    end = start;
	}
        else{ newNode temp = n;
	    end.setNext(temp);
	    end = temp;
 	}
	len++;
    }
    public newNode dequeue() {
	
	  if (len==0) {
	  return null;
	  }
	
	  else{	newNode ans;
	      len--;
	     ans = start;
	     start = start.getNext();
	     return ans;
	     }
    }
    public boolean empty() {
	return len == 0;
    }
    public newNode head() {
	return start;//.getNext().getData();
    }
    public String toString(){
	String s = "";
	newNode temp = start;
	//Node tmp = end.getNext();
	while (temp != null) {
	    s += "[" +  temp.getX() + ", " + temp.getY() + "]" +  " <-- ";
	    temp = temp.getNext();
	}
	return s+"NULL";
    }
    public static void main(String[] args) {
	 Queue q = new Queue();
	 // System.out.println(q);
	 newNode k = new newNode('k',1,1);
	 newNode e = new newNode('e',1,2);
	 newNode r = new newNode('r',1,3);
	q.enqueue(k);
	q.enqueue(e);
	q.enqueue(r);


	// q.enqueue(2);
	//q.enqueue(3);
	//q.enqueue(4);
	  System.out.println(q);
	System.out.println(q.dequeue());
	 // System.out.println(k.getData());
	// // System.out.println(q);
	// // System.out.println(q.empty());
	// // System.out.println(q.head());
    }
}
