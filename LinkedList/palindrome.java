package apnaCollege;

public class palindrome {
	static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	 }
		public static Node head;
		public static Node tail;

		public static void addLast(int data)
		{
			if(head == null) {
				Node newNode = new Node(data);
				head = tail = newNode;
				return;
			}
			Node newNode = new Node(data);
			tail.next = newNode;
			tail = newNode;	
		}
		//Slow Fast Concept  
		public static Node mid(Node head)
		{
			Node slow = head;
			Node fast = head;
			
			while(fast != null && fast.next != null)
			{
				slow = slow.next; //increases by +1
				fast = fast.next.next; //increases by +2
			}
			return slow;
		}
		public static boolean ispallindrome()
		{
			if(head == null || head.next == null)
				return true;
			//reversing
			Node mid = mid(head);
			Node prev = null;
			Node curr = mid;
			Node next;
			while(curr != null)
			{
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			Node right = prev; //Head of right Node
			Node left = head;
			//Checking
			while(right != null)
			{
				if(left.data != right.data) {
					return false;
				}
				left = left.next;
				right = right.next;
			}
			return true;
		}

	public static void main(String[] args) {
		palindrome ll = new palindrome();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(2);
		ll.addLast(1);
		System.out.println(ispallindrome());
	}
}
