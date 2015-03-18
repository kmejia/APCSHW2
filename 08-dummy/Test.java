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
	    a.add(r.nextInt(10));
			   
	}
	//	System.out.println(a);
	int ans = 0;
	start = System.currentTimeMillis();
	for (int i = 0;i<a.size(); i++) {
	    ans += a.get(i);
	}
	elapsed = System.currentTimeMillis();
	System.out.println("it takes "+elapsed + "to get " +ans);

	

    }
    
}
