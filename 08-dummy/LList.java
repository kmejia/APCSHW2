public class LList {
    private Node l=null;//the start
    private Node dummy = new Node(0);
    
     private int len;
    public LList() {
	dummy.setNext(l);
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
		}
    
    
    public int find(int n) {

	int i = 0;
	while( i < n) {
	   l = l.getNext(); 
	    i++;
	}
	return l.getData();
    }

    public void insert(int n, int s) {
	Node ans = new Node(s);
	for (int i = 0;i + 1<n ; i ++) {
	    l = l.getNext();
	}
	if (n ==0) {	
	    add(s); 
	}
	else if (n>0){
	    ans.setNext(l.getNext()) ;
	    l.setNext(ans);
	}
    }


    ////Hw for 3/17
    public boolean add(int  s) {
	Node uno = new Node(s);
	dummy.setNext(uno);
	uno.setNext(l);
	l = uno;
	len ++;
	return true;
    }
    public int get(int n) {
	if (n<0 || n > len) {
	    throw new IndexOutOfBoundsException();
	}
	Node ans = dummy;
	int i = 0;
	while (i<n) {
	    if (ans.equals(null)) {
		throw new IndexOutOfBoundsException();
		
	    }
	    ans = ans.getNext();
	    i++;
	}
	return ans.getData();
    }

    /*    public boolean add(int n,int s) {

	if (n<0 || n > len) {
	    throw new IndexOutOfBoundsException();
	}
	Node ans = new Node(s);
	if (n==0) {
	    add(s);
	}
	else {
	    ans.setNext(get(n));
	    get(n-1).setNext(ans);

	}
	len--;
	return true;
    }
    */

    /*public Node remove(int n) {
	if (n<0 || n > len) {
	    throw new IndexOutOfBoundsException();
	}
	len--;
	Node ans = l;
	get(n-1).setNext(get(n-1).getNext().getNext());
	return ans;
    }
    */
}
