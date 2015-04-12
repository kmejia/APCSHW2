import java.io.*;
import java.util.*;
public class myStack<E>{
    Node<E> l;

    public myStack(){
	l = new Node<E>();
    }
    public void push(E data){
        Node<E> ans = new Node<E>(data);
	ans.setNext(l.getNext());
	l.setNext(ans);
    }

    public E pop(){
	E ans= l.getNext().getData();
	l.setNext(l.getNext().getNext());
        return ans;
    }

    public boolean empty(){
	return l.getNext() == null;
    }

    public E top() {
        return l.getNext().getData();
    }
    public String toString(){
	String result = "";
	Node<E> ans = l.getNext();
	while(ans != null){
	    result = result + ans.getData() + " | ";
	    ans = ans.getNext();
	}
	return result;
    }
    


}
