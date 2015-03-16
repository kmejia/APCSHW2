public class LList {
    private Node l=null;
    
    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
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
    
    
    public String find(int n) {

	int i = 0;
	while( i < n) {
	   l = l.setNext(""+i); 
	    i++;
	}
	return l.getData();
    }

    public void insert(int n, String s) {
	for (int i = 0;i<n ; i ++) {
	    l = l.getNext();
	}
	add(s); 
	

    }
}
