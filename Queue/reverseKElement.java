package apnaCollege;
import java.util.*;
public class reverseKElement 
{
	public static void reverse(Queue<Integer> q1,int k) {
		Deque <Integer> q2 = new LinkedList<>();
		int size = q1.size();
		for(int i=0; i<k; i++) {
			q2.addFirst(q1.remove());
		}
		while(!q2.isEmpty()) {
			q1.add(q2.removeFirst());
		}
	        for (int i=0; i<size-k; i++) {
	            q1.add(q1.remove());
	        }
	}
	public static void main(String[] args) {
		Queue <Integer> q1 = new LinkedList<>();
		int k = 4;
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(60);
		q1.add(70);
		q1.add(80);
		q1.add(90);
		q1.add(100);
		reverse(q1,k);
		while(!q1.isEmpty()) {
			System.out.print(q1.peek()+" ");
			q1.remove();
		}
	}
}
