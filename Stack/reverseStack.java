package apnaCollege;
import java.util.*;
public class reverseStack {
	public static void pushBottom(Stack<Integer> s, int data)
	{
		if(s.isEmpty()) {
		    s.push(data);
			return;
		}
		int val = s.pop();
		pushBottom(s,data);
		s.push(val);
	} 
	public static void reverse(Stack<Integer> s)
	{	
		if(s.isEmpty()) {
			return;
		}
		int val = s.pop();
		reverse(s);
		pushBottom(s,val);
	}
	public static void main(String[] args) {
		Stack <Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		reverse(s);
		while(!s.isEmpty()) {
			System.out.println(s.pop()); 
		}
	}
}
