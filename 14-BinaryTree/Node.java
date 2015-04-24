public class Node {
    private int data;
    private Node left,right;
    	public Node(int s){
	    data = s;
	    left = null;
	    right = null;
	}
    public void setData(int s){
	data = s;
    }
    public int getData(){
	return data;
    }
    public void setRight(Node n){
	right = n;
    }
    public Node getRight(){
	return right;
    }
    public int compareTo(Node  n) {
	return n.getData() -data ;
     }		
    public void setLeft(Node n){
	left = n;
    }
    public Node getLeft(){
	return left;
    }
    public String toString(){
	return ""+data+"...."+left+right;
    }
}

    
   