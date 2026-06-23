package apnaCollege;

public class deleteNodes {
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
	
	public void addLast(int data)
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
	
	public static void skipdelete(Node head, int M, int N)
	{
		Node curr = head,temp;
		while(curr != null)
		{
			for(int i=1; i<M && curr != null; i++)
			{
				curr = curr.next;
				if(curr == null)
					return;
			}
			temp = curr.next;
			for(int i=1; i<=N && temp != null; i++)
			{
				temp = temp.next;
			}
			curr.next = temp;
			curr = temp;	
		}
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
		deleteNodes ll = new deleteNodes();
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(9);
		ll.addLast(10);
		ll.print();
		ll.skipdelete(head, 3 , 3);
		ll.print();
	}
}
