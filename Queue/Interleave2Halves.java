package apnaCollege;
import java.util.*;
public class Interleave2Halves 
{
	public static void interleave(Queue<Integer> q)
	{
		Queue <Integer> q1 = new LinkedList<>();
		Queue <Integer> q2 = new LinkedList<>();
		int size = q.size();
		int mid = size/2;
		
		for(int i=0; i<mid; i++) {
			q1.add(q.remove());
		}
		while(!q.isEmpty()) {
			q2.add(q.remove());
		}
		while(!q1.isEmpty() && !q2.isEmpty()) {
			q.add(q1.remove());
			q.add(q2.remove());
		}
	}
	public static void main(String[] args)
	{
		Queue <Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		interleave(q);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
	}
}
