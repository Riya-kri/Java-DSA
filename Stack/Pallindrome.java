public class Pallindrome 
{
	static class Node
	{
		char ch;
		Node next;
		public Node(char ch)
		{
			this.ch = ch;
			this.next = null;
		}
	 }
		public static Node head;
		public static Node tail;

		public static void addLast(char ch)
		{
			if(head == null) {
				Node newNode = new Node(ch);
				head = tail = newNode;
				return;
			}
			Node newNode = new Node(ch);
			tail.next = newNode;
			tail = newNode;	
		}
		public static boolean ispallindrome() {
			Stack <Character> s = new Stack<>();
			Node temp = head;
			while(temp != null) {
				s.push(temp.ch);
				temp = temp.next;
			}
			temp = head;
			while(!s.isEmpty()) {
				char x = s.pop();
				if(x != temp.ch) 
					return false;
				temp = temp.next;
			}
			return true;
		} 
	public static void main(String[] args) {
		Pallindrome ll = new Pallindrome();
		ll.addLast('a');
		ll.addLast('b');
		ll.addLast('c');
		ll.addLast('b');
		ll.addLast('a');
		System.out.println(ispallindrome());
	}
}
