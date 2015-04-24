public class Tree{ 
    private Node root;
    public Tree(){
	root =new Node(20);
    }
    public Node Search(Node T, int i) {
	if(T==null) {return null;}
	while(T!=null){
	    int c = T.getData.compareTo(i);
	    if(c>0){
		T=T.getRight();}
	    if(c<0) {
		T=T.getLeft();}
	    else{return T;}
	}
	
    }
    public void insert(node n) {
	if (T.getNext()==null){
	    T.setNext(n);
	    return;}
	else







    }
}
