public class Tree{ 
    private Node root;
    public Tree(){
	root =null;
    }
    public Tree(Node n){
	root = n; }
    public Node getRoot(){return root;}
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
	return null;
    }
    public void insert(Node n) {
	Node dummy = new Node(0);
	Node T = root;
	
	if (root == null) {
	    root = n;
	}
	else {
	    int c = T.compareTo(n);  
        
            while (T != null) {
		 c = T.compareTo(n);
		 
		 if (c<0){
		     if (T.getRight()==null){
			 T.setRight(n);
			 return;}
			 
                    T = T.getRight();
		 }
		 else{
		     if (T.getLeft()==null){
			 T.setLeft(n);
			 return;}
			 
		     T = T.getLeft();

		 }
            }
            if (c<0)
                T.setRight(n);
            else
                T.setLeft(n);
	    
        }
    }
    public String toString(Node T) {
	String s = "";
	if(T == null) {
	    s+="() ";
	    return s;
	}
	s += T;
	s += " (" + toString(T.getLeft()) + ") (" +toString(T.getRight()) + ")";
	return s;
    }
    
    
    public static void main(String[] args) {
	Tree k = new Tree();
	k.insert(new Node(2));
	k.insert(new Node(7));
        k.insert(new Node(1));
	System.out.println(k.toString(k.getRoot()));
    }
}

