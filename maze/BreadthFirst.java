import java.io.*;
import java.util.*;
public class BreadthFirst{
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    
    private char[][] board;
    private int maxX;
    private int maxY;
    private Queue q = new Queue();
    public BreadthFirst()
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
    }
    public String toString()
    {
	String s = "[2J\n";
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    public void solve(int x , int y) {
	newNode currentPoint = new newNode(board[x][y] ,x,y);
	q.enqueue(currentPoint);


        while (!q.empty()){
	    newNode p = q.dequeue();//p stands for point
	    board[p.getX()][p.getY()] = me;

	    if (p.getData() == exit) {
		solved = true;
		return;
		
	    }
	    try{
		if ( board[p.getX()-1][p.getY()] == path) {
		      board[x][y] = visited;
		    q.enqueue(new newNode( board[p.getX()-1][p.getY()],p.getX()-1, p.getY()));
		    board[x][y] = visited;
 		}
		
		if (board[p.getX()+1][p.getY()] == path) {
		      board[x][y] = visited;
		    q.enqueue(new newNode (board[p.getX()+1][p.getY()],p.getX()+1, p.getY()));
		      board[x][y] = visited;
		}
		
		if(board[p.getX()][p.getY()-1] == path) {  board[x][y] = visited;
		    q.enqueue(new newNode(board[p.getX()][p.getY()-1],p.getX(), p.getY()-1));
		      board[x][y] = visited;
		}
		
		if(board[p.getX()][p.getY()+1] == path) {  board[x][y] = visited;
		    q.enqueue(new newNode(board[p.getX()][p.getY()+1],p.getX(), p.getY()+1));
		      board[x][y] = visited;
		}
		
		// if(    (board[p.getX()][p.getY()+1] == me)||(board[p.getX()-1][p.getY()] == me)|| (board[p.getX()][p.getY()-1] == me)||(board[p.getX()+1][p.getY()] == me) ) {board[x][y] = visited;
		//     solve(x,y);}
		
	    }catch(Exception e) {
		
	    }
	    
	    try {
		Thread.sleep(25);
	    } catch(Exception e) {}
	    System.out.println(this);
	}    
    }



    public static void main(String[] args){
	BreadthFirst m = new BreadthFirst();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}
