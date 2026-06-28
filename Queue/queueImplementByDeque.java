package apnaCollege;

import java.util.*;
public class queueImplementByDeque 
{
	static class Stack{
		Deque <Integer> d = new LinkedList<>();
		
		public void push(int data) {
			d.addLast(data);
		}
		public int pop() {
			return d.removeFirst();
		}
		public int peek() {
			return d.getFirst();
		}
		public boolean isEmpty() {
			return d.isEmpty();
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(3);
		s.push(5);
		s.push(7);
		while(!s.isEmpty()) {
		System.out.println(s.pop());
		}
	}	
}
