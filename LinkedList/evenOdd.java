package apnaCollege;

public class evenOdd 
{
	public static class Node
	{
		int data;
		Node next;
		
		public Node(int data) {
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
	
	public static void evenFirst()
	{
		
		Node eventemp = new Node(0);
		Node oddtemp = new Node(0);
		Node eventail = eventemp;
		Node oddtail = oddtemp;
		
		Node temp = head;
		while(temp != null)
		{
			Node newNode = new Node(temp.data);
			if(temp.data % 2 == 0)
			{
				eventail.next = newNode;
				eventail = eventail.next;
			}
			else {
				oddtail.next = newNode;
				oddtail = oddtail.next;
			}
			temp = temp.next;
		}
		eventail.next = oddtemp.next;
		head = eventemp.next;
	}

	public void print()
	{
		if(head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		evenOdd ll = new evenOdd();
		ll.addLast(8);
		ll.addLast(6);
		ll.addLast(5);
		ll.addLast(4);
		ll.addLast(1);
		ll.addLast(2);
		ll.print();
		ll.evenFirst();
		ll.print();
	}
}
