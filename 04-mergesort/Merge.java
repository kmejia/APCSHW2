import java.io.*;
import java.util.*;
public class Merge {
    
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<Integer> B = new ArrayList<Integer>();
    Random r = new Random();
    A.add(r.nextInt(15));
    A.add(r.nextInt(15));
    A.add(r.nextInt(15));
    A.add(r.nextInt(15));
    A.add(r.nextInt(15));
    B.add(r.nextInt(15));
    B.add(r.nextInt(15));
    B.add(r.nextInt(15));
    B.add(r.nextInt(15));
    B.add(r.nextInt(15));
    B.add(r.nextInt(15));
    B.add(r.nextInt(15));
    public ArrayList<Integer> combine(){
	int i = 0;
	int j = 0;
	ArrayList<Integer> ans = new ArrayList<Integer>();
	
	while (i < A.size() && j < B.size() ) {
	   
	     if (A.get(i) < B.get(j) ){
		ans.add(A.get(i)) ;
		i ++;
	    }
	    if (A.get(i) > B.get(j) ){
		ans.add(B.get(j));
		j ++;
	    }
	     if (A.get(i) == B.get(j) ){
		ans.add(B.get(j));
		ans.add(A.get(i));
		i ++;
		j ++;
	     }
	}
	while (i < A.size()){ ans.add(A.get(i)) ;
	    i++;}
	while (j < B.size()){ ans.add(B.get(j)) ;
	    j++;}
	
	return ans;
    }
    
    
    public static void main (String[] args){
	Merge x = new Merge();
	System.out.println(x.combine());
    }
}
