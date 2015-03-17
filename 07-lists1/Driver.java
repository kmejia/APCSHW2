import java.util.*;
public class  Driver{
    public static void main(String[] args) {
	Random r = new Random();
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);

		l.insert(1, "one");

	l.insert(2, "b");

	l.insert(0,"a");

	System.out.println(l);
    }
}
