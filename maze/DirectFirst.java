import java.io.*;
import java.util.*;

public class DirectFirst {
    private char[][] board;
    private int maxX;
    private int maxY;
    private char wall = ' ';
    private char exit = '$';
    public Stack q;
    private char path = '#';
    private char me = 'Z';
    private char visited = '.';
    private boolean solved = false;
    
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
    
    public DirectFirst() {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
	
	try {
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()) {
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++) {
		    board[i][j] = line.charAt(i);
		}
		j++;
	    }
	}
	catch (Exception e)
	    {
	    }
	
    }
    
    public String toString() {
	String s = "^[[2J\n";
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	
	return s;
    }
    
    public void solve(int x, int y) {
	q = new Stack();
	newNode p = new newNode(board[x][y],x,y);
        q.push(p);
        while (!q.empty()&&!solved){
	    newNode n = q.pop();
	    board[n.getX()][n.getY()] = me;
	    if (n.getData() == exit) {
		solved = true;
		
	        return;
	    }
	    try{
		if (board[n.getX()-1][n.getY()] == path) {
		q.push(new newNode (board[n.getX()-1][n.getY()],n.getX()-1, n.getY()));
		}
		if ( board[n.getX()+1][n.getY()] == path) {
	    q.push(new newNode(board[n.getX()+1][n.getY()],n.getX()+1, n.getY()));
		}
		if ( board[n.getX()][n.getY()-1] == path) {
	q.push(new newNode(board[n.getX()][n.getY()-1],n.getX(), n.getY()-1));
		}
		if ( board[n.getX()][n.getY()+1] == path) {
    q.push(new newNode(board[n.getX()][n.getY()+1],n.getX(), n.getY()+1));
		}
	    }catch(Exception e) {}
	    try {
		Thread.sleep(50);
	    } catch(Exception e) {}
	    System.out.println(this);
	}    
    }
    public static void main(String[] args) {
	DirectFirst m = new DirectFirst();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);

    }




}
