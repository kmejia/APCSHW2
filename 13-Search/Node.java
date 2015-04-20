import java.io.*;
import java.util.*;
public class Node {
    private int x,y;
    private Node prev;
    public double d;
    private int p;
    private int steps;
    public Node(int x, int y, int s){
	this.x = x;
	this.y = y;
        setM();
	setD();
	this.steps=s;
    }
        public Node(int x, int y){
	this.x = x;
	this.y = y;
        setM();
	setD();
	
    }
    public Node getPrev() {
	return prev;
    }
    public void setPrev(Node n){
	prev = n;
    }
    public void setM(){
	p = (26 -x) + (18- y); 
    }
    public void setD(){
	d= Math.sqrt((26-x) *(26-x) + (18-y) * (18-y));
    }
    public int getX() {
	return x;
    }
    public int getY() {
	return y;
    }
    public int getP(){
	return p;
    }
    
    public int getPriority(){
	return p + steps;
    }
    public double getD(){
	return d;}
    public int getM(){
	return p;}
    public int getS(){
	return steps;
    }
}

