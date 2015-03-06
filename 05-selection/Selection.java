import java.util.*;
import java.io.*;

public class Selection{
    public int[] Partition(int[] L , int SI, int EI) {
	int[] ans = new int[L.length];
	for (int i = 0 ; i<SI; i++) {
	    ans[i] = L[i];
	}
	for (int i = EI;i<L.length;i++) {
	    ans[i] = L[i];}
	int element = L[SI];
	try{
	for(int i = SI ;i<EI ;i++) {
	    if (L[i] < element) {
		ans[SI] = L[i];
		SI++;
	    }
	    else if (element <L[i]){
		ans[EI] = L[i];
		EI--;
	    }
	} 
	}catch(Exception e ) {}
	ans[SI] = element;
	return ans;

    }
    public static void main(String[] args) {
	Selection k = new Selection() ;
	int[] list = {15,6,11,5,
		      6,45,3,0,66,35,21,1};
	System.out.println(Arrays.toString(list));
	System.out.println(Arrays.toString(k.Partition(list, 0 , list.length-1)));
    }
	    
}
