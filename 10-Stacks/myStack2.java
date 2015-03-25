public class myArrayStack {
    int[] array;
    int len=0;
    public myArrayStack() {
	array=new int[0];
    }

    public void push(int data) {
	len++;
	int[] ans=new int[len];
	for (int i=0;i<len-1;i++) {
	    ans[i]=array[i];
	}
	ans[len-1]=data;
	array=ans;
    }

    public int pop() {
	int popped=array[len-1];
	len--;
	int[] ans=new int[len];
	for (int i=0;i<len;i++) {
	    ans[i]=array[i];
	}
	array=ans;
	return popped;
    }

    public boolean empty() {
	return (len==0);
    }

    public int top() {
	return array[len-1];
    }

    public String toString() {
	String ans="";
	for (int i=len-1; i>=0;i--) {
	    ans+=array[i]+", ";
	}
	return ans;		  
    }
    
}