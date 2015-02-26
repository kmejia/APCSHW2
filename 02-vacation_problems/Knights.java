import java.util.*;
import java.io.*;
public class Knights{
    
    private char[][] board = new char[5][5];
    // public Knights() {
    // 	//	width = 5;
    // }   
    // public Knights(int w) {
    // 	width = w;
    // }
    private boolean done = false;
    private int moves;
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

 
    public static void main(String[] args) {
	Knights k = new Knights();
	k.fill();
	System.out.println(k);
    }
 
}
