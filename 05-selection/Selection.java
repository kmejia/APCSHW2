import java.util.*;
import java.io.*;

public class Selection{
    public int Partition(int[] L , int SI, int EI) {
	//	int[] ans = new int[L.length];
	int element = L[SI];
	System.out.println(Arrays.toString(L));
	while(SI<EI) {
	    if (L[SI] < element) { 
		SI++;
	    }
	    if(L[EI] > element) {
		EI--;
	    }
	    
	    int swap = L[SI];
	    L[SI] = L[EI];
	    L[EI] = swap;
	}
	//ans[SI] = element;
	System.out.println(Arrays.toString(L));
	return SI;

    }

    public int Select(int[] A ,int k, int l , int h) {
	/*That will return the kth smallest element in Array A.
 The first call will be Select(A,k,0,A.length-1) because you're
 looking in the full array.*/
	if (k ==l) {
	    return(Partition(A,l,h));
	}
	else{
	   return  Select(A,k,l+1,A.length-1);
	}
    }
	
    

    public static void main(String[] args) {
	Selection k = new Selection() ;
	int[] list = {15,6,11,5,
		      9,45,3,0,66,35,21,1};
	//	System.out.println(Arrays.toString(list));
		System.out.println((k.Partition(list, 0 , list.length-1)));
	System.out.println(k.Select(list,0,0,list.length-1));
    }
    
}
