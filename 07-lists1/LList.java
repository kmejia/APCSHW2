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
	   l = l.getNext(); 
	    i++;
	}
	return l.getData();
    }

    public void insert(int n, String s) {
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
}

