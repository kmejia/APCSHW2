import java.io.*;
import java.util.*;
public class Stack {
public newNode start;
    
    public Stack() {
        start = null;
    }

    public void push(newNode n) {
        n.setNext(start);
	start = n;
    }


    public newNode pop() {
	newNode tmp = start;
	start = start.getNext();
	return tmp;
    }

    public boolean empty() {
        return start== null;
    }


    public String toString() {
	String s = "";
	newNode tmp;
	for (tmp = start; tmp != null; tmp = tmp.getNext()){
	    s = s + " <-- " + tmp;
	}
	return s;
    }
}
