import java.io.*;
import java.util.*;
public class Merge {
    
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<Integer> B = new ArrayList<Integer>();
    Random r = new Random();
    public Merge() {
    A.add(6);
    A.add(4);
    A.add(8);
    A.add(8);
    A.add(1);
    B.add(1);
    B.add(1);
    B.add(3);
    B.add(5);
    B.add(7);
    B.add(9);
    B.add(11);
    }
    public ArrayList<Integer> combine( ArrayList<Integer> A, ArrayList<Integer> B){
	int i = 0;
	int j = 0;
	ArrayList<Integer> ans = new ArrayList<Integer>();
	
	while (i < A.size() && j < B.size() ) {
	   
	     if (A.get(i) < B.get(j) ){
		ans.add(A.get(i)) ;
		i ++;
	    }
	     else if (A.get(i) > B.get(j) ){
		ans.add(B.get(j));
		j ++;
	    }
	     else  if (A.get(i) == B.get(j) ){
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
    public ArrayList<Integer> Sub(ArrayList<Integer> base, int first, int last ) {
	ArrayList<Integer> ans = new ArrayList<Integer>();
	for (int i = first; i<last; i ++) {
	    ans.add(base.get(i));
	}
	return ans;
    } 
    
    public ArrayList<Integer> mergeSort(ArrayList<Integer> base ) {
	int half = base.size() / 2;
	if (base.size() == 1 ) {
	     return base;
	}
	else { combine (mergeSort ((base.Sub(0,half)) , mergeSort(base.Sub(half , base.size()))));
	}
	
    }
    
    
    public static void main (String[] args){
	Merge x = new Merge();
	System.out.println(x.A);
	System.out.println(x.B);
	System.out.println();
	//System.out.println(x.combine(A ,B));
	System.out.println(mergeSort(x.A));
    }
}
