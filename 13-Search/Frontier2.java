import java.util.*;

public class Frontier2 {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	l.add(n);
    }
     public boolean isEmpty(){
	return l.isEmpty();
    }   
    public Node highestPriority(){
	Node temp = l.get(0);
	Node ans = temp;
	int i = 0;
	while(i<l.size()){
	    temp = l.get(i);
	    i++; 
	    if(temp.getD() <= ans.getD()){
		ans = temp;
	    }
	}
	return ans;	
    }
    public Node remove() {
	int i = 0;
	Node temp = l.get(0);
	while(i<l.size()){
	    if(temp == highestPriority()){
		break;
	    }
	    i++;
	    temp = l.get(i);
	}
	return l.remove(i);
    }

}
