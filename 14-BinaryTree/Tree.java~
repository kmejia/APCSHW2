public class Tree{ 
    private Node root;
    public Tree(){
	root =new Node(20);
    }
    public Node Search(Node T, int i) {
	if(T==null) {return null;}
	while(T!=null){
	    int c = T.compareTo(new Node(i));
	    if(c>0){
		T=T.getRight();}
	    if(c<0) {
		T=T.getLeft();}
	    else{return T;}
	}
	
    }
    public void insert(Node n) {
	Node dummy = new Node(0);
	Node T = root;
	
	int c = T.compareTo(n);
	if(c>0){
	    //dummy.setRight(T);
	    while (dummy!=null) {
		T = T.getRight();
		dummy.setRight(T);
		
	    }
	    T=dummy.setRight(n);
	    return;
	}
	if(c<0) {
	    while (dummy!=null) {
		T=T.getLeft();
		dummy.setLeft(T);
	    }
	    T=dummy.setLeft(n);
	    return;
	}
        else{
	    return;
	}
    }
    
    public static void main(String[] args) {


    }
}

