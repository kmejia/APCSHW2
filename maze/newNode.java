public class newNode{     
    private int xcor;
    private int ycor;
    private char data;
    private Node next;
     
    public Node(char d) {
	data = d;
	next = null;
    }

    public Node(char d, int x, int yc){
	data = d;
        xcor = x;
	ycor = y;
	next = null;
    }

    public void setData(int xcor, int ycor){
        x = xcor;
	y = ycor;
    }

    public int getX(){
	return xcor;
    }

    public int getY() {
	return ycor;
    }
    
    public char getData() {
	return data;
    }

    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return "[" + x + ", " + y + "]";
    }
}
