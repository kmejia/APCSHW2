import java.util.*;
import java.io.*;
import java.lang.System;
public class Test{
    public static void main(String[] args) {
	Random r = new Random();
	long start,elapsed;
	start = System.currentTimeMillis();
	ArrayList<Integer> a = new ArrayList<Integer>();
	for (int i = 0; i < 1000; i++) {
	    a.add(r.nextInt(11));
			   
	}
	//	System.out.println(a);
	int ans = 0;
	start = System.currentTimeMillis();
	for (int i = 0;i<a.size(); i++) {
	    ans += a.get(i);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println("it takes "+elapsed + " for ArrayList to get " +ans);

	
	LList b = new LList();
	for(int i = 0; i<1000;i++){
	    b.add(r.nextInt(11));
	}
	ans = 0;
	start = System.currentTimeMillis();
	for(int i =0;i<1000; i++) {
	    ans+= b.get(i) ;
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println("it takes "+elapsed + " for LList to get " +ans);

	LinkedList c = new LinkedList();
	for(int i = 0; i<1000;i++){
	    c.add(r.nextInt(11));
	}
	ans = 0 ;
	start = System.currentTimeMillis();
	for(int i =0;i<1000; i++) {
	    ans+= (int)c.get(i) ;
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println("it takes "+elapsed + " for builtin LList to get " +ans);
    }
    
}
