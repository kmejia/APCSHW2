public class newNode{     
    private int xcor;
    private int ycor;
    private char data;
    private newNode next;
     
    public newNode(char d) {
	data = d;
	next = null;
    }

    public newNode(char d, int x, int y){
	data = d;
        xcor = x;
	ycor = y;
	next = null;
    }

    public void setData(int x, int y){
        xcor = x;
	ycor = y;
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

    public void setNext(newNode n){
	next = n;
    }

    public newNode getNext(){
	return next;
    }

    public String toString(){
	return "[" + xcor + ", " + ycor + "]";
    }
}
