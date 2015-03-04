import java.io.*;
import java.util.*;
public class Msort {
    Random r = new Random();
    int[] A = new int[r.nextInt(10)+5];    
    int[] B = new int[r.nextInt(10)+5];
    public void fill() {
	for (int i = 0; i<A.length;i++) {
	    A[i] = r.nextInt(25);
	}
	for (int i = 0; i<B.length; i++) {
	    B[i] = r.nextInt(25);
     }
    }
    public int[] combine(int[] A, int[] B){
	int i = 0;
	int j = 0;
	int a =0;
	int[] ans = new int[A.length+B.length];;
	
	while (i < A.length && j < B.length ) {
	   
	     if (A[i] < B[j] ){
		ans[a] = A[i] ;
		i ++;
		a++;
	    }
	     else if (A[i] > B[j] ){
		ans[a] = B[j];
		j ++;
		a++;
	    }
	     else if (A[i] == B[j] ){
		ans[a] = A[i];
		a++;
		i++;
		ans[a] = B[j];
		
		j ++;
	     }
	}
    while (i < A.length){ ans[a] = A[i] ;
	    i++;
	    a++;}
	while (j < B.length){ ans[a] = B[j] ;
	    j++;
	    a++;}
	
	return ans;
    }
   public int[] Sub(int[] base, int first, int last ) {
	int[] ans = new int[last - first];
	int j=0;
	for (int i = first; i<last; i ++) {
	    ans[j] = base[i];
	    j++;
	}
	return ans;
    } 


  public int[] mergeSort(int[] base ) {
	int half = base.length / 2;
	if (base.length <= 1 ) {
	    return base;
	}
	if (base.length == 2) {
	    return combine(Sub(base , 0,1) , Sub(base,1,2));
	}
	else { return  combine(    (mergeSort( Sub(base ,0,half))) , (mergeSort(Sub(base ,half , base.length ))) );
	}
	
    }
    
  public static void main (String[] args){
	Msort x = new Msort();
	x.fill();
	System.out.println( "A is ..."+Arrays.toString(x.A));
	System.out.println("B is ..."+ Arrays.toString(x.B));
	System.out.println();
	//	System.out.println(x.combine(x.A ,x.B));
	System.out.println();
	System.out.println();

	long startT = System.nanoTime();
	x.mergeSort(x.A) ;
	long endT = System.nanoTime();
	System.out.println("Mergesort of A takes "+ (endT - startT));
      


	startT = System.nanoTime();
	Arrays.sort(x.A);
	endT = System.nanoTime();
	
	System.out.println("Arrays.sort of A"+" Takes " +(endT - startT));
    }
    

















}
