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
    public String Traverse(Node T) {
	if (T== null) {return "";}
	else{
	return Traverse(T.getLeft()) +
		T+
		Traverse(T.getRight());}
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
	return Traverse(root);
    }
    public void Remove(int d) {//assumes d is in tree
	Node parent =null;//new Node();
	Node ans = root;
	if(root==null){return;}
	while(ans.getData()!=d) {
	    parent = ans;
	    if (ans.getData() < d)
		ans=ans.getRight();
	    else if (ans.getData() > d)
		ans=ans.getLeft();
	}
	if (ans.getLeft()==null&&ans.getRight()==null){
	    if (ans.getData() > d){
		parent.setLeft(null);}
	    else{parent.setRight(null);}	
	}
	else if (ans.getLeft()==null){
	  
	    parent.setRight(ans.getRight());}	
	
	else if (ans.getRight()==null){
	  
	    parent.setRight(ans.getRight());}
	else{

	}
    }
    public  int Max(Node T){
	int max = T.getData();
	    
	if(T.getLeft() != null) {
	    max = Math.max(max, Max(T.getLeft()));
	    }
	if(T.getRight() != null) {
	    max = Math.max(max, Max(T.getRight()));
	    }
	    return max;
    }

    
    public static void main(String[] args) {
	Tree k = new Tree();
	System.out.println(k);
	System.out.println("----------------------------------------------");
	k.insert(2);
	k.insert(7);
        k.insert(12);
	k.insert(5);
	k.insert(9);
	k.insert(21);
	k.insert(100);
	k.insert(1);
	System.out.println(k);
	//k.Remove(100);
	//k.Remove(2);
	//k.Remove(7);
	System.out.println(k.Max(k.getRoot()));
    }
}

