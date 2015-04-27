public class Tree{ 
    private Node root;
    public Tree(){
	root =null;
    }
    public Tree(Node n){
	root = n; }
    public Node getRoot(){return root;}
    public Node search(Node t, int i){
	if (t==null || t.getData()==i){
	    return t;
	}
	else if (i<t.getData()){
	    return search(t.getLeft(),i);
	} else {
	    return search(t.getRight(),i);
	}
    }
    public String search(int i){
	Node n = search(root,i);
	if (n==null){
	    return "NOT FOUND";
	}else{
	    return n.toString();
	}
    }

  
    public void insert(int i){
	Node n = new Node(i);
	Node t2=null;
	Node t = root;
	if (root==null){
	    root=n;
	    return;
	}
	while (t!=null){
	    t2 = t;
	    if (t.getData()==i)
		return;
	    else if (t.getData() < i)
		t=t.getRight();
	    else if (t.getData() > i)
		t=t.getLeft();
	    else
		return;
	}
	if (i>t2.getData())
	    t2.setRight(n);
	else
	    t2.setLeft(n);
    }
    
    public String toString(Node T) {
	String s = "";
	if(T == null) {
	    s+="<null>";
	    return s;
	}
	s += T+"\n";
	s += " (" + toString(T.getLeft()) + ")"+" (" +toString(T.getRight()) + ")" +"\n";
	return s;
    }
    public String toString(){
	return toString(root);
    }
    public String ascend() {


	return "";
    }
    public static void main(String[] args) {
	Tree k = new Tree();
	System.out.println(k);
	k.insert(2);
	k.insert(7);
        k.insert(12);
	k.insert(5);
	k.insert(9);
	k.insert(21);
	k.insert(100);
	System.out.println(k.toString(k.getRoot()));
	System.out.println(k.search(k.getRoot(), 100));
    }
}

