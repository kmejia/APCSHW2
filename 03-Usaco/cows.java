import java.util.*;
import java.io.*;
//paired with Joseph Gelb
//working fully now
public class cows{
    int x = 7;
    int y = 5;
    Random r = new Random();
    
    private int[][] field = new int[x][y] ;
    public void fillboard(){
	for (int i = 0; i < field.length; i ++){
	    for (int k = 0; k <field[0].length; k ++){
		field[i][k] = r.nextInt(50);
	    }
	}
    }
    public void print(){
        
	for (int i = 0; i < field.length; i ++){
	    for (int k = 0; k <field[0].length; k ++){
	        System.out.printf("%3d", field[i][k]);
	    }
	    System.out.printf("\n");
	}
        
    }

    public String printArr(int[] L) {
	String ans = "{";
	for (int x=0 ;x< L.length;x++) { ans = ans +L[x] + ",";}
	return ans + "}";
    }
    
    public void calcNow(int x, int y, int red){
	int max = 0;
	int[] nums2 = {field[x][y], field[x+1][y],field[x+2][y],field[x][y+1],field[x][y+2],field[x+1][y+1],field[x+1][y+2],field[x+2][y+1],field[x+2][y+2]}  ;
	//System.out.println(printArr(nums2));



	for (int i = 0; i < nums2.length; i ++){//finds temporary max
	    if (nums2[i] > max) {
		max = nums2[i];
	    }
	}
	int target = max - red;
	for (int j =0;j<red;j++) {//should reduce by red number of times
	    for (int k = 0 ; k<nums2.length;k++) {//one instance of reducing
		if (nums2[k]==max){
		    nums2[k] = nums2[k] - 1;
		}
	    }

	    max--;
	}
	//System.out.println();
	//	System.out.println(printArr(nums2));
	    //putting changes on  the field
	    field[x][y] = nums2[0];
	    field[x+1][y] = nums2[1];
	    field[x+2][y] = nums2[2];
	    field[x][y+1] = nums2[3];
	    field[x][y+2] = nums2[4];
	    field[x+1][y+1] = nums2[5];
	    field[x+1][y+2] = nums2[6];
	    field[x+2][y+1] = nums2[7];
	    field[x+2][y+2] = nums2[8];

	    //  System.out.println("donesies");
	    
	
    
	
    }
    
    
    public static void main (String[] args){
	cows a = new cows();
	a.fillboard();
	
        a.print();
        a.calcNow(0,0,4);
	
	System.out.println();

	a.print();
	
    }

    
}
