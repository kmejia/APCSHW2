import java.io.*;
import java.util.*;
public class Maze
{
    private char path='#';
    private char wall=' ';
    private char me='z';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
    
    private char[][] board;
    private int maxX;
    private int maxY;
    private Queue<Point> q = new Queue<Point>();
    public Maze()
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
	Point currentPoint = new Point(x,y);
	q.enqueue(currentPoint);
	while (! q.empty()) {
	    if (board[x][y] ==exit) {
		return; }
	    int currentX = currentPoint.getX();
	    int currentY = currentPoint.getY();
	    board[x][y] = visited;
	    q.dequeue();
	    while (path == board[currentX+1][currentY]) {
		currentPoint = new Point(currentX+1,currentY);
		board[currentX+1][currentY] = visited;
		q.enqueue(currentPoint) ;
	        currentX = currentPoint.getX();
	        currentY = currentPoint.getY();
		solve(currentX , currentY);
		//q.dequeue();
	    }
	    while (path == board[currentX][currentY+1]) {
		currentPoint = new Point(currentX,currentY+1);
		board[currentX][currentY+1] = visited;
		q.enqueue(currentPoint) ;
	        currentX = currentPoint.getX();
	        currentY = currentPoint.getY();
		solve(currentX , currentY);

		//q.dequeue();
	    }
	    while (path == board[currentX-1][currentY]) {
		currentPoint = new Point(currentX-1,currentY);
		board[currentX-1][currentY] = visited;
		q.enqueue(currentPoint) ;
	        currentX = currentPoint.getX();
	        currentY = currentPoint.getY();
		solve(currentX , currentY);
		//q.dequeue();
	    }
	    while (path == board[currentX][currentY-1]) {
		currentPoint = new Point(currentX,currentY-1);
		board[currentX][currentY-1] = visited;
		q.enqueue(currentPoint) ;
	        currentX = currentPoint.getX();
	        currentY = currentPoint.getY();
		solve(currentX , currentY);
		//q.dequeue();
	    }
	    
	}

    }
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}
