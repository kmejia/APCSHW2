import java.io.*;
    import java.util.*;
public class Qsort{ 
    //taken from class code
    public int partition(int[] a, int l, int r) {
        int tmp;
        //int pivotIndex = l+rnd.nextInt(r-l);
        int pivotIndex=l;
        int pivot = a[pivotIndex];
        tmp = a[r];
        a[r] = a[pivotIndex];
        a[pivotIndex]=tmp;
	
        int wall=l;
        int pcount=1;
        for (int i=l;i<r;i++) {
            if (a[i]<pivot) {
                tmp = a[i];
                a[i]=a[wall];
                a[wall]=tmp;
                wall++;
            }
            if (a[i]==pivot)
                pcount++;
        }
        // now copy over all the pivots
        int rwall=wall;
        tmp = a[rwall];
        a[wall]=a[r];
        a[r]=tmp;
        rwall++;
        for (int i=rwall+1;i<=r;i++) {
            if (a[i]==pivot) {
                tmp = a[rwall];
                a[rwall]=a[i];
                a[i]=tmp;
                rwall++;
            }
        }
        return (wall+rwall)/2;
    }

    public void qsort(int[] a, int l, int h){
        int pi,pval;
        pi = partition(a,l,h);
        pval = a[pi];
	/*altered stuff
	  pval = a[pi];
	  if (k==pi)
	  return pval;
	  else if (k > pi)
	  return qselect(a,k,pi+1,h);
	  else
	  return qselect(a,k,l,pi-1);
	*/
	//breaking into smaller arrays
        if(1<h-pi) {
	    qsort(a, pi+1 , h);
	}
	if(1< pi - l ) {
	    qsort(a , l , pi - 1);
	}

    }


    public static void main(String[] args) {
	Qsort k = new Qsort();
	int[] list = {15,6,11,5,9,45,3,0,66,35,21,1};
	int[] list2 = {15,6,11,5,9,45,3,0,66,35,21,1};
	System.out.println(Arrays.toString(list));
	k.qsort(list, 0, list.length-1);
	System.out.println(Arrays.toString(list));
	//time
	long startT,endT;
	startT=System.nanoTime();
	k.qsort(list, 0, list.length-1);
	endT = System.nanoTime();
	System.out.println(endT - startT+" for qsort");
	
    }						 
}
