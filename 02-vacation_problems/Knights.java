import java.util.*;
import java.io.*;
public class Knights{
    
    private char[][] board = new char[5][5];
   
    private boolean done = false;
    private int moves=0;
    public void fill() {
	for (int i =0;i<board.length;i++) {
	    for (int j =0;j<board.length;j++){
		board[i][j]= 'a';
	    }
	}   
    }
    
    //taken from maze code
    public void delay(){
	try {
	    Thread.sleep(100);
	} catch (Exception e) {}
    }
    

    public String toString() {
	String ans = "";
     	for (int i = 0; i < board.length; i++){
     	    for (int k = 0; k <board[0].length; k++){
     	        ans+=String.format("%3d", board[i][k]);
     	    }
     	    ans+="\n";
     	}
	return ans;
    }


    public void solve(int x, int y){
	if (board[x][y]<0 ||
	    board[x][y]=='a' ||
	    board[x][y]<moves|
	    done){
	    return;
	}
	
	if (board[x][y]=='0'||moves>25){
	    System.out.println(this);
	    done = true;
	}
	delay();
	System.out.println(this);
	board[x][y]='k';
	solve(x+1,y-2);
	solve(x-1,y+2);
	solve(x+1,y+2);
	solve(x+2,y-1);	
	solve(x+2,y+1);

	solve(x-2,y+1);
	solve(x-2,y-1);
	moves++;
	if (!done){
	    board[x][y]=moves;
	    moves--;
	}
    }
    public static void main(String[] args) {
	Knights k = new Knights();
	k.fill();
	System.out.println(k);
	k.solve(0,0);
    }
 
}
