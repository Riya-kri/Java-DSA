package apnaCollege;
import java.util.*;
public class queueUsing2Stack {
	//Pop O(n)
	    static Stack<Integer> s = new Stack<>();
		static Stack<Integer> t = new Stack<>();
		
		public static boolean isEmpty() {
		    return s.isEmpty() && t.isEmpty();
		}
		//Add element
		public static void add(int data) {
			s.push(data);
		}
		//Remove
		public static void remove() {
			if(s.isEmpty()) {
				System.out.println("The Queue is empty");
				return;
			}
			while(!s.isEmpty()) {
			   t.push(s.pop());
			}
			 t.pop();
			
			while (!t.isEmpty()) {
		      s.push(t.pop());
		    }
		}
		//Peek
		public static int peeks() {
			if(isEmpty()) {
				System.out.print("The Queue is empty");
				return -1;
			}
			  while (!s.isEmpty()) {
                  t.push(s.pop());
            }

            int front = t.peek();

            while (!t.isEmpty()) {
                 s.push(t.pop());
            }

            return front;
		}
	public static void main(String[] args) {
		queueUsing2Stack q = new queueUsing2Stack();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()) {
			System.out.println(q.peeks());
			q.remove();
		}
	}
}
