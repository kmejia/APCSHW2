import java.io.*;
import java.util.*;
public class Heap {
    private int[] data;
    private int root = 0;
    public Heap(int n) {
	data = new int[n];
    }
     public int pushdown(int n) {
	int left = 2 * (n+ 1) - 1;
	int right = 2 * (n+ 1);
	int ans = data[n];

	if (right >= root || ans < data[left] && ans < data[right]) {
	    return -1;
	} else if (data[left] < data[right]) {
	    data[n] = data[left];
	    data[left] = ans;
	    return left;
	} else {
	    data[n] = data[right];
	    data[right] = ans;
	    return right;
	}
}    
	
 

 

    public int getMax(int n) {
	int left = 2 * (n+ 1) - 1;
	int right = 2 * (n+ 1);
	if (n>= root) {
	    return Integer.MIN_VALUE;
	} else {
	    return Math.max(data[n],Math.max(getMax(left), getMax(right)));
	}
    }
   public int getMin() {
	return data[0];
    }

    public int getMax() {
	return getMax(0);
    }
 
    public int find(int n,int index) {
	if (index >= root) {
	    return -1;
	} else if (data[index] ==n) {
	    return index;
	} else {
	   int left = (2 * (index + 1)) - 1;
	   int right = (2 * (index + 1));
	    return Math.max(find(n,left), find(n,right));
	}
    }

  public int find(int n) {
	return find(n, 0);
    }
   
    public int remove(int n) {
	int k = find(n);
	root -= 1;
	data[k] = data[root];
	while (k > 0) {
	    k = pushdown(k);
	}
	return n;
    }
   public String toString() {
	return Arrays.toString(data) + " " + root;
    }
    
}